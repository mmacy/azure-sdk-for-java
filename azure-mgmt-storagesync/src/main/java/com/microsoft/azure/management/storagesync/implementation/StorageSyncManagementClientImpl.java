/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the StorageSyncManagementClientImpl class.
 */
public class StorageSyncManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The API version to use for this operation. */
    private String apiVersion;

    /**
     * Gets The API version to use for this operation.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** The ID of the target subscription. */
    private String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The ID of the target subscription.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public StorageSyncManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
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
    public StorageSyncManagementClientImpl withAcceptLanguage(String acceptLanguage) {
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
    public StorageSyncManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
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
    public StorageSyncManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
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
     * The StorageSyncServicesInner object to access its operations.
     */
    private StorageSyncServicesInner storageSyncServices;

    /**
     * Gets the StorageSyncServicesInner object to access its operations.
     * @return the StorageSyncServicesInner object.
     */
    public StorageSyncServicesInner storageSyncServices() {
        return this.storageSyncServices;
    }

    /**
     * The SyncGroupsInner object to access its operations.
     */
    private SyncGroupsInner syncGroups;

    /**
     * Gets the SyncGroupsInner object to access its operations.
     * @return the SyncGroupsInner object.
     */
    public SyncGroupsInner syncGroups() {
        return this.syncGroups;
    }

    /**
     * The CloudEndpointsInner object to access its operations.
     */
    private CloudEndpointsInner cloudEndpoints;

    /**
     * Gets the CloudEndpointsInner object to access its operations.
     * @return the CloudEndpointsInner object.
     */
    public CloudEndpointsInner cloudEndpoints() {
        return this.cloudEndpoints;
    }

    /**
     * The ServerEndpointsInner object to access its operations.
     */
    private ServerEndpointsInner serverEndpoints;

    /**
     * Gets the ServerEndpointsInner object to access its operations.
     * @return the ServerEndpointsInner object.
     */
    public ServerEndpointsInner serverEndpoints() {
        return this.serverEndpoints;
    }

    /**
     * The RegisteredServersInner object to access its operations.
     */
    private RegisteredServersInner registeredServers;

    /**
     * Gets the RegisteredServersInner object to access its operations.
     * @return the RegisteredServersInner object.
     */
    public RegisteredServersInner registeredServers() {
        return this.registeredServers;
    }

    /**
     * The WorkflowsInner object to access its operations.
     */
    private WorkflowsInner workflows;

    /**
     * Gets the WorkflowsInner object to access its operations.
     * @return the WorkflowsInner object.
     */
    public WorkflowsInner workflows() {
        return this.workflows;
    }

    /**
     * Initializes an instance of StorageSyncManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public StorageSyncManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://azure.microsoft.com", credentials);
    }

    /**
     * Initializes an instance of StorageSyncManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public StorageSyncManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of StorageSyncManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public StorageSyncManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2018-07-01";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.operations = new OperationsInner(restClient().retrofit(), this);
        this.storageSyncServices = new StorageSyncServicesInner(restClient().retrofit(), this);
        this.syncGroups = new SyncGroupsInner(restClient().retrofit(), this);
        this.cloudEndpoints = new CloudEndpointsInner(restClient().retrofit(), this);
        this.serverEndpoints = new ServerEndpointsInner(restClient().retrofit(), this);
        this.registeredServers = new RegisteredServersInner(restClient().retrofit(), this);
        this.workflows = new WorkflowsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "StorageSyncManagementClient", "2018-07-01");
    }
}
