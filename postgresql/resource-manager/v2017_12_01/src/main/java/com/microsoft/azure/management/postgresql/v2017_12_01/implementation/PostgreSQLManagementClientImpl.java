/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.postgresql.v2017_12_01.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the PostgreSQLManagementClientImpl class.
 */
public class PostgreSQLManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The subscription ID that identifies an Azure subscription. */
    private String subscriptionId;

    /**
     * Gets The subscription ID that identifies an Azure subscription.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The subscription ID that identifies an Azure subscription.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public PostgreSQLManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The API version to use for the request. */
    private String apiVersion;

    /**
     * Gets The API version to use for the request.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public PostgreSQLManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public PostgreSQLManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public PostgreSQLManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The ServersInner object to access its operations.
     */
    private ServersInner servers;

    /**
     * Gets the ServersInner object to access its operations.
     * @return the ServersInner object.
     */
    public ServersInner servers() {
        return this.servers;
    }

    /**
     * The FirewallRulesInner object to access its operations.
     */
    private FirewallRulesInner firewallRules;

    /**
     * Gets the FirewallRulesInner object to access its operations.
     * @return the FirewallRulesInner object.
     */
    public FirewallRulesInner firewallRules() {
        return this.firewallRules;
    }

    /**
     * The VirtualNetworkRulesInner object to access its operations.
     */
    private VirtualNetworkRulesInner virtualNetworkRules;

    /**
     * Gets the VirtualNetworkRulesInner object to access its operations.
     * @return the VirtualNetworkRulesInner object.
     */
    public VirtualNetworkRulesInner virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * The DatabasesInner object to access its operations.
     */
    private DatabasesInner databases;

    /**
     * Gets the DatabasesInner object to access its operations.
     * @return the DatabasesInner object.
     */
    public DatabasesInner databases() {
        return this.databases;
    }

    /**
     * The ConfigurationsInner object to access its operations.
     */
    private ConfigurationsInner configurations;

    /**
     * Gets the ConfigurationsInner object to access its operations.
     * @return the ConfigurationsInner object.
     */
    public ConfigurationsInner configurations() {
        return this.configurations;
    }

    /**
     * The LogFilesInner object to access its operations.
     */
    private LogFilesInner logFiles;

    /**
     * Gets the LogFilesInner object to access its operations.
     * @return the LogFilesInner object.
     */
    public LogFilesInner logFiles() {
        return this.logFiles;
    }

    /**
     * The LocationBasedPerformanceTiersInner object to access its operations.
     */
    private LocationBasedPerformanceTiersInner locationBasedPerformanceTiers;

    /**
     * Gets the LocationBasedPerformanceTiersInner object to access its operations.
     * @return the LocationBasedPerformanceTiersInner object.
     */
    public LocationBasedPerformanceTiersInner locationBasedPerformanceTiers() {
        return this.locationBasedPerformanceTiers;
    }

    /**
     * The CheckNameAvailabilitysInner object to access its operations.
     */
    private CheckNameAvailabilitysInner checkNameAvailabilitys;

    /**
     * Gets the CheckNameAvailabilitysInner object to access its operations.
     * @return the CheckNameAvailabilitysInner object.
     */
    public CheckNameAvailabilitysInner checkNameAvailabilitys() {
        return this.checkNameAvailabilitys;
    }

    /**
     * The ServerSecurityAlertPoliciesInner object to access its operations.
     */
    private ServerSecurityAlertPoliciesInner serverSecurityAlertPolicies;

    /**
     * Gets the ServerSecurityAlertPoliciesInner object to access its operations.
     * @return the ServerSecurityAlertPoliciesInner object.
     */
    public ServerSecurityAlertPoliciesInner serverSecurityAlertPolicies() {
        return this.serverSecurityAlertPolicies;
    }

    /**
     * The OperationsInner object to access its operations.
     */
    private OperationsInner operations;

    /**
     * Gets the OperationsInner object to access its operations.
     * @return the OperationsInner object.
     */
    public OperationsInner operations() {
        return this.operations;
    }

    /**
     * Initializes an instance of PostgreSQLManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public PostgreSQLManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of PostgreSQLManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public PostgreSQLManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of PostgreSQLManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public PostgreSQLManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2017-12-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.servers = new ServersInner(restClient().retrofit(), this);
        this.firewallRules = new FirewallRulesInner(restClient().retrofit(), this);
        this.virtualNetworkRules = new VirtualNetworkRulesInner(restClient().retrofit(), this);
        this.databases = new DatabasesInner(restClient().retrofit(), this);
        this.configurations = new ConfigurationsInner(restClient().retrofit(), this);
        this.logFiles = new LogFilesInner(restClient().retrofit(), this);
        this.locationBasedPerformanceTiers = new LocationBasedPerformanceTiersInner(restClient().retrofit(), this);
        this.checkNameAvailabilitys = new CheckNameAvailabilitysInner(restClient().retrofit(), this);
        this.serverSecurityAlertPolicies = new ServerSecurityAlertPoliciesInner(restClient().retrofit(), this);
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "PostgreSQLManagementClient", "2017-12-01");
    }
}
