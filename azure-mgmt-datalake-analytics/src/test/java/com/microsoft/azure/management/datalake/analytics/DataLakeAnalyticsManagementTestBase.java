package com.microsoft.azure.management.datalake.analytics;

import com.microsoft.azure.credentials.AzureEnvironment;
import com.microsoft.azure.credentials.UserTokenCredentials;
import com.microsoft.azure.management.datalake.analytics.models.JobInformation;
import com.microsoft.azure.management.datalake.analytics.models.JobResult;
import com.microsoft.azure.management.datalake.analytics.models.JobState;
import com.microsoft.azure.management.datalake.analytics.models.JobType;
import com.microsoft.azure.management.datalake.analytics.models.USqlJobProperties;
import com.microsoft.azure.management.datalake.store.DataLakeStoreAccountManagementClient;
import com.microsoft.azure.management.datalake.store.DataLakeStoreAccountManagementClientImpl;
import com.microsoft.azure.management.resources.ResourceManagementClient;
import com.microsoft.azure.management.resources.ResourceManagementClientImpl;
import com.microsoft.azure.management.storage.StorageManagementClient;
import com.microsoft.azure.management.storage.StorageManagementClientImpl;

import org.junit.Assert;

import java.text.MessageFormat;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

public abstract class DataLakeAnalyticsManagementTestBase {
    protected static DataLakeAnalyticsAccountManagementClient dataLakeAnalyticsAccountManagementClient;
    protected static DataLakeAnalyticsJobManagementClient dataLakeAnalyticsJobManagementClient;
    protected static DataLakeAnalyticsCatalogManagementClient dataLakeAnalyticsCatalogManagementClient;
    protected static ResourceManagementClient resourceManagementClient;
    protected static DataLakeStoreAccountManagementClient dataLakeStoreAccountManagementClient;
    protected static StorageManagementClient storageManagementClient;
    protected static String environmentLocation;
    public static void createClients() {
        String environment = System.getenv("arm.environmentType");
        String armUri = "";
        String adlaSuffix = "";
        environmentLocation = "eastus2";
        AzureEnvironment authEnv;
        switch (environment.toLowerCase()) {
            case "production":
                armUri = "https://management.azure.com";
                adlaSuffix = "azuredatalakeanalytics.net";
                authEnv = AzureEnvironment.AZURE;
                break;
            case "ppe":
                armUri = "https://api-dogfood.resources.windows-int.net";
                adlaSuffix = "konaaccountdogfood.net";
                authEnv = new AzureEnvironment("https://login.windows-ppe.net/", "https://management.core.windows.net/", true);
                break;
            case "test":
                armUri = "https://api-dogfood.resources.windows-int.net";
                adlaSuffix = "konaaccountdogfood.net";
                environmentLocation = "westus";
                authEnv = new AzureEnvironment("https://login.windows-ppe.net/", "https://management.core.windows.net/", true);
                break;
            default: // default to production
                armUri = "https://management.azure.com";
                adlaSuffix = "azuredatalakeanalytics.net";
                authEnv = AzureEnvironment.AZURE;
                break;
        }

        UserTokenCredentials credentials = new UserTokenCredentials(
                System.getenv("arm.clientid"),
                System.getenv("arm.domain"),
                System.getenv("arm.username"),
                System.getenv("arm.password"),
                null,
                authEnv);

        dataLakeAnalyticsAccountManagementClient = new DataLakeAnalyticsAccountManagementClientImpl(armUri, credentials);
        dataLakeAnalyticsAccountManagementClient.setLogLevel(HttpLoggingInterceptor.Level.BODY);
        dataLakeAnalyticsAccountManagementClient.setSubscriptionId(System.getenv("arm.subscriptionid"));
        dataLakeAnalyticsJobManagementClient = new DataLakeAnalyticsJobManagementClientImpl(credentials, new OkHttpClient.Builder().readTimeout(5, TimeUnit.MINUTES), new Retrofit.Builder());
        dataLakeAnalyticsJobManagementClient.setLogLevel(HttpLoggingInterceptor.Level.BODY);
        dataLakeAnalyticsJobManagementClient.setAdlaJobDnsSuffix(adlaSuffix);

        dataLakeAnalyticsCatalogManagementClient = new DataLakeAnalyticsCatalogManagementClientImpl(credentials);
        dataLakeAnalyticsCatalogManagementClient.setLogLevel(HttpLoggingInterceptor.Level.BODY);
        dataLakeAnalyticsCatalogManagementClient.setAdlaCatalogDnsSuffix(adlaSuffix);

        resourceManagementClient = new ResourceManagementClientImpl(armUri, credentials);
        resourceManagementClient.setSubscriptionId(System.getenv("arm.subscriptionid"));
        resourceManagementClient.setLogLevel(HttpLoggingInterceptor.Level.BODY);

        dataLakeStoreAccountManagementClient = new DataLakeStoreAccountManagementClientImpl(armUri, credentials);
        dataLakeStoreAccountManagementClient.setLogLevel(HttpLoggingInterceptor.Level.BODY);
        dataLakeStoreAccountManagementClient.setSubscriptionId(System.getenv("arm.subscriptionid"));

        storageManagementClient = new StorageManagementClientImpl(armUri, credentials);
        storageManagementClient.setLogLevel(HttpLoggingInterceptor.Level.BODY);
        storageManagementClient.setSubscriptionId(System.getenv("arm.subscriptionid"));
    }

    public static void runJobToCompletion(DataLakeAnalyticsJobManagementClient jobClient, String adlaAcct, UUID jobId, String scriptToRun) throws Exception {
        // submit a job
        JobInformation jobToSubmit = new JobInformation();
        USqlJobProperties jobProperties = new USqlJobProperties();
        jobProperties.setScript(scriptToRun);
        jobToSubmit.setName("java azure sdk data lake analytics job");
        jobToSubmit.setDegreeOfParallelism(2);
        jobToSubmit.setType(JobType.USQL);
        jobToSubmit.setProperties(jobProperties);

        JobInformation jobCreateResponse = jobClient.getJobOperations().create(adlaAcct, jobId, jobToSubmit).getBody();
        Assert.assertNotNull(jobCreateResponse);

        JobInformation getJobResponse = jobClient.getJobOperations().get(adlaAcct, jobCreateResponse.getJobId()).getBody();
        Assert.assertNotNull(getJobResponse);

        int maxWaitInSeconds = 2700; // giving it 45 minutes for now.
        int curWaitInSeconds = 0;

        while (getJobResponse.getState() != JobState.ENDED && curWaitInSeconds < maxWaitInSeconds)
        {
            // wait 5 seconds before polling again
            Thread.sleep(5000);
            curWaitInSeconds += 5;
            getJobResponse = jobClient.getJobOperations().get(adlaAcct, jobCreateResponse.getJobId()).getBody();
            Assert.assertNotNull(getJobResponse);
        }

        Assert.assertTrue(curWaitInSeconds <= maxWaitInSeconds);

        // Verify the job completes successfully
        Assert.assertTrue(
                MessageFormat.format("Job: {0} did not return success. Current job state: {1}. Actual result: {2}. Error (if any): {3}",
                        getJobResponse.getJobId(), getJobResponse.getState(), getJobResponse.getResult(), getJobResponse.getErrorMessage()),
                getJobResponse.getState() == JobState.ENDED && getJobResponse.getResult() == JobResult.SUCCEEDED);
    }

    public static String generateName(String prefix) {
        int randomSuffix = (int)(Math.random() * 1000);
        return prefix + randomSuffix;
    }
}