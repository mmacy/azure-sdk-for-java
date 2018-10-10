/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2014_04_01.implementation;

import com.microsoft.azure.management.sql.v2014_04_01.DatabaseSecurityAlertPolicy;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.sql.v2014_04_01.SecurityAlertPolicyState;
import com.microsoft.azure.management.sql.v2014_04_01.SecurityAlertPolicyEmailAccountAdmins;
import com.microsoft.azure.management.sql.v2014_04_01.SecurityAlertPolicyUseServerDefault;

class DatabaseSecurityAlertPolicyImpl extends CreatableUpdatableImpl<DatabaseSecurityAlertPolicy, DatabaseSecurityAlertPolicyInner, DatabaseSecurityAlertPolicyImpl> implements DatabaseSecurityAlertPolicy, DatabaseSecurityAlertPolicy.Definition, DatabaseSecurityAlertPolicy.Update {
    private final SqlManager manager;
    private String resourceGroupName;
    private String serverName;
    private String databaseName;

    DatabaseSecurityAlertPolicyImpl(String name, SqlManager manager) {
        super(name, new DatabaseSecurityAlertPolicyInner());
        this.manager = manager;
        // Set resource name
        this.databaseName = name;
        //
    }

    DatabaseSecurityAlertPolicyImpl(DatabaseSecurityAlertPolicyInner inner, SqlManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.databaseName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.serverName = IdParsingUtils.getValueFromIdByName(inner.id(), "servers");
        this.databaseName = IdParsingUtils.getValueFromIdByName(inner.id(), "databases");
        //
    }

    @Override
    public SqlManager manager() {
        return this.manager;
    }

    @Override
    public Observable<DatabaseSecurityAlertPolicy> createResourceAsync() {
        DatabaseThreatDetectionPoliciesInner client = this.manager().inner().databaseThreatDetectionPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.databaseName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<DatabaseSecurityAlertPolicy> updateResourceAsync() {
        DatabaseThreatDetectionPoliciesInner client = this.manager().inner().databaseThreatDetectionPolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.serverName, this.databaseName, this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<DatabaseSecurityAlertPolicyInner> getInnerAsync() {
        DatabaseThreatDetectionPoliciesInner client = this.manager().inner().databaseThreatDetectionPolicies();
        return client.getAsync(this.resourceGroupName, this.serverName, this.databaseName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String disabledAlerts() {
        return this.inner().disabledAlerts();
    }

    @Override
    public SecurityAlertPolicyEmailAccountAdmins emailAccountAdmins() {
        return this.inner().emailAccountAdmins();
    }

    @Override
    public String emailAddresses() {
        return this.inner().emailAddresses();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public String kind() {
        return this.inner().kind();
    }

    @Override
    public String location() {
        return this.inner().location();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public Integer retentionDays() {
        return this.inner().retentionDays();
    }

    @Override
    public SecurityAlertPolicyState state() {
        return this.inner().state();
    }

    @Override
    public String storageAccountAccessKey() {
        return this.inner().storageAccountAccessKey();
    }

    @Override
    public String storageEndpoint() {
        return this.inner().storageEndpoint();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public SecurityAlertPolicyUseServerDefault useServerDefault() {
        return this.inner().useServerDefault();
    }

    @Override
    public DatabaseSecurityAlertPolicyImpl withExistingDatabasis(String resourceGroupName, String serverName, String databaseName) {
        this.resourceGroupName = resourceGroupName;
        this.serverName = serverName;
        this.databaseName = databaseName;
        return this;
    }

    @Override
    public DatabaseSecurityAlertPolicyImpl withState(SecurityAlertPolicyState state) {
        this.inner().withState(state);
        return this;
    }

    @Override
    public DatabaseSecurityAlertPolicyImpl withDisabledAlerts(String disabledAlerts) {
        this.inner().withDisabledAlerts(disabledAlerts);
        return this;
    }

    @Override
    public DatabaseSecurityAlertPolicyImpl withEmailAccountAdmins(SecurityAlertPolicyEmailAccountAdmins emailAccountAdmins) {
        this.inner().withEmailAccountAdmins(emailAccountAdmins);
        return this;
    }

    @Override
    public DatabaseSecurityAlertPolicyImpl withEmailAddresses(String emailAddresses) {
        this.inner().withEmailAddresses(emailAddresses);
        return this;
    }

    @Override
    public DatabaseSecurityAlertPolicyImpl withLocation(String location) {
        this.inner().withLocation(location);
        return this;
    }

    @Override
    public DatabaseSecurityAlertPolicyImpl withRetentionDays(Integer retentionDays) {
        this.inner().withRetentionDays(retentionDays);
        return this;
    }

    @Override
    public DatabaseSecurityAlertPolicyImpl withStorageAccountAccessKey(String storageAccountAccessKey) {
        this.inner().withStorageAccountAccessKey(storageAccountAccessKey);
        return this;
    }

    @Override
    public DatabaseSecurityAlertPolicyImpl withStorageEndpoint(String storageEndpoint) {
        this.inner().withStorageEndpoint(storageEndpoint);
        return this;
    }

    @Override
    public DatabaseSecurityAlertPolicyImpl withUseServerDefault(SecurityAlertPolicyUseServerDefault useServerDefault) {
        this.inner().withUseServerDefault(useServerDefault);
        return this;
    }

}
