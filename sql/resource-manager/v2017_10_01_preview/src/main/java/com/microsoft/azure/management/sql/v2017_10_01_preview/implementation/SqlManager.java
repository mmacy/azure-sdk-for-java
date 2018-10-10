/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_10_01_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.sql.v2017_10_01_preview.DatabaseOperations;
import com.microsoft.azure.management.sql.v2017_10_01_preview.ElasticPoolOperations;
import com.microsoft.azure.management.sql.v2017_10_01_preview.DatabaseVulnerabilityAssessmentScans;
import com.microsoft.azure.management.sql.v2017_10_01_preview.ManagedDatabaseVulnerabilityAssessmentRuleBaselines;
import com.microsoft.azure.management.sql.v2017_10_01_preview.ManagedDatabaseVulnerabilityAssessmentScans;
import com.microsoft.azure.management.sql.v2017_10_01_preview.ManagedDatabaseVulnerabilityAssessments;
import com.microsoft.azure.management.sql.v2017_10_01_preview.Capabilities;
import com.microsoft.azure.management.sql.v2017_10_01_preview.Databases;
import com.microsoft.azure.management.sql.v2017_10_01_preview.ElasticPools;
import com.microsoft.azure.management.sql.v2017_10_01_preview.InstanceFailoverGroups;
import com.microsoft.azure.management.sql.v2017_10_01_preview.BackupShortTermRetentionPolicies;
import com.microsoft.azure.management.sql.v2017_10_01_preview.TdeCertificates;
import com.microsoft.azure.management.sql.v2017_10_01_preview.ManagedInstanceTdeCertificates;
import com.microsoft.azure.management.sql.v2017_10_01_preview.ManagedInstanceKeys;
import com.microsoft.azure.management.sql.v2017_10_01_preview.ManagedInstanceEncryptionProtectors;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Sql resource management.
 */
public final class SqlManager extends ManagerCore<SqlManager, SqlManagementClientImpl> {
    private DatabaseOperations databaseOperations;
    private ElasticPoolOperations elasticPoolOperations;
    private DatabaseVulnerabilityAssessmentScans databaseVulnerabilityAssessmentScans;
    private ManagedDatabaseVulnerabilityAssessmentRuleBaselines managedDatabaseVulnerabilityAssessmentRuleBaselines;
    private ManagedDatabaseVulnerabilityAssessmentScans managedDatabaseVulnerabilityAssessmentScans;
    private ManagedDatabaseVulnerabilityAssessments managedDatabaseVulnerabilityAssessments;
    private Capabilities capabilities;
    private Databases databases;
    private ElasticPools elasticPools;
    private InstanceFailoverGroups instanceFailoverGroups;
    private BackupShortTermRetentionPolicies backupShortTermRetentionPolicies;
    private TdeCertificates tdeCertificates;
    private ManagedInstanceTdeCertificates managedInstanceTdeCertificates;
    private ManagedInstanceKeys managedInstanceKeys;
    private ManagedInstanceEncryptionProtectors managedInstanceEncryptionProtectors;
    /**
    * Get a Configurable instance that can be used to create SqlManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new SqlManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of SqlManager that exposes Sql resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the SqlManager
    */
    public static SqlManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new SqlManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of SqlManager that exposes Sql resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the SqlManager
    */
    public static SqlManager authenticate(RestClient restClient, String subscriptionId) {
        return new SqlManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of SqlManager that exposes Sql management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Sql management API entry points that work across subscriptions
        */
        SqlManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage DatabaseOperations.
     */
    public DatabaseOperations databaseOperations() {
        if (this.databaseOperations == null) {
            this.databaseOperations = new DatabaseOperationsImpl(this);
        }
        return this.databaseOperations;
    }

    /**
     * @return Entry point to manage ElasticPoolOperations.
     */
    public ElasticPoolOperations elasticPoolOperations() {
        if (this.elasticPoolOperations == null) {
            this.elasticPoolOperations = new ElasticPoolOperationsImpl(this);
        }
        return this.elasticPoolOperations;
    }

    /**
     * @return Entry point to manage DatabaseVulnerabilityAssessmentScans.
     */
    public DatabaseVulnerabilityAssessmentScans databaseVulnerabilityAssessmentScans() {
        if (this.databaseVulnerabilityAssessmentScans == null) {
            this.databaseVulnerabilityAssessmentScans = new DatabaseVulnerabilityAssessmentScansImpl(this);
        }
        return this.databaseVulnerabilityAssessmentScans;
    }

    /**
     * @return Entry point to manage ManagedDatabaseVulnerabilityAssessmentRuleBaselines.
     */
    public ManagedDatabaseVulnerabilityAssessmentRuleBaselines managedDatabaseVulnerabilityAssessmentRuleBaselines() {
        if (this.managedDatabaseVulnerabilityAssessmentRuleBaselines == null) {
            this.managedDatabaseVulnerabilityAssessmentRuleBaselines = new ManagedDatabaseVulnerabilityAssessmentRuleBaselinesImpl(this);
        }
        return this.managedDatabaseVulnerabilityAssessmentRuleBaselines;
    }

    /**
     * @return Entry point to manage ManagedDatabaseVulnerabilityAssessmentScans.
     */
    public ManagedDatabaseVulnerabilityAssessmentScans managedDatabaseVulnerabilityAssessmentScans() {
        if (this.managedDatabaseVulnerabilityAssessmentScans == null) {
            this.managedDatabaseVulnerabilityAssessmentScans = new ManagedDatabaseVulnerabilityAssessmentScansImpl(this);
        }
        return this.managedDatabaseVulnerabilityAssessmentScans;
    }

    /**
     * @return Entry point to manage ManagedDatabaseVulnerabilityAssessments.
     */
    public ManagedDatabaseVulnerabilityAssessments managedDatabaseVulnerabilityAssessments() {
        if (this.managedDatabaseVulnerabilityAssessments == null) {
            this.managedDatabaseVulnerabilityAssessments = new ManagedDatabaseVulnerabilityAssessmentsImpl(this);
        }
        return this.managedDatabaseVulnerabilityAssessments;
    }

    /**
     * @return Entry point to manage Capabilities.
     */
    public Capabilities capabilities() {
        if (this.capabilities == null) {
            this.capabilities = new CapabilitiesImpl(this);
        }
        return this.capabilities;
    }

    /**
     * @return Entry point to manage Databases.
     */
    public Databases databases() {
        if (this.databases == null) {
            this.databases = new DatabasesImpl(this);
        }
        return this.databases;
    }

    /**
     * @return Entry point to manage ElasticPools.
     */
    public ElasticPools elasticPools() {
        if (this.elasticPools == null) {
            this.elasticPools = new ElasticPoolsImpl(this);
        }
        return this.elasticPools;
    }

    /**
     * @return Entry point to manage InstanceFailoverGroups.
     */
    public InstanceFailoverGroups instanceFailoverGroups() {
        if (this.instanceFailoverGroups == null) {
            this.instanceFailoverGroups = new InstanceFailoverGroupsImpl(this);
        }
        return this.instanceFailoverGroups;
    }

    /**
     * @return Entry point to manage BackupShortTermRetentionPolicies.
     */
    public BackupShortTermRetentionPolicies backupShortTermRetentionPolicies() {
        if (this.backupShortTermRetentionPolicies == null) {
            this.backupShortTermRetentionPolicies = new BackupShortTermRetentionPoliciesImpl(this);
        }
        return this.backupShortTermRetentionPolicies;
    }

    /**
     * @return Entry point to manage TdeCertificates.
     */
    public TdeCertificates tdeCertificates() {
        if (this.tdeCertificates == null) {
            this.tdeCertificates = new TdeCertificatesImpl(this);
        }
        return this.tdeCertificates;
    }

    /**
     * @return Entry point to manage ManagedInstanceTdeCertificates.
     */
    public ManagedInstanceTdeCertificates managedInstanceTdeCertificates() {
        if (this.managedInstanceTdeCertificates == null) {
            this.managedInstanceTdeCertificates = new ManagedInstanceTdeCertificatesImpl(this);
        }
        return this.managedInstanceTdeCertificates;
    }

    /**
     * @return Entry point to manage ManagedInstanceKeys.
     */
    public ManagedInstanceKeys managedInstanceKeys() {
        if (this.managedInstanceKeys == null) {
            this.managedInstanceKeys = new ManagedInstanceKeysImpl(this);
        }
        return this.managedInstanceKeys;
    }

    /**
     * @return Entry point to manage ManagedInstanceEncryptionProtectors.
     */
    public ManagedInstanceEncryptionProtectors managedInstanceEncryptionProtectors() {
        if (this.managedInstanceEncryptionProtectors == null) {
            this.managedInstanceEncryptionProtectors = new ManagedInstanceEncryptionProtectorsImpl(this);
        }
        return this.managedInstanceEncryptionProtectors;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public SqlManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return SqlManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private SqlManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new SqlManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
