/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datalakeanalytics.v2016_11_01.implementation;

import com.microsoft.azure.management.datalakeanalytics.v2016_11_01.ComputePolicy;
import com.microsoft.azure.arm.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.datalakeanalytics.v2016_11_01.UpdateComputePolicyParameters;
import java.util.UUID;
import com.microsoft.azure.management.datalakeanalytics.v2016_11_01.CreateOrUpdateComputePolicyParameters;
import com.microsoft.azure.management.datalakeanalytics.v2016_11_01.AADObjectType;
import rx.functions.Func1;

class ComputePolicyImpl extends CreatableUpdatableImpl<ComputePolicy, ComputePolicyInner, ComputePolicyImpl> implements ComputePolicy, ComputePolicy.Definition, ComputePolicy.Update {
    private final DataLakeAnalyticsManager manager;
    private String resourceGroupName;
    private String accountName;
    private String computePolicyName;
    private CreateOrUpdateComputePolicyParameters createParameter;
    private UpdateComputePolicyParameters updateParameter;

    ComputePolicyImpl(String name, DataLakeAnalyticsManager manager) {
        super(name, new ComputePolicyInner());
        this.manager = manager;
        // Set resource name
        this.computePolicyName = name;
        //
        this.createParameter = new CreateOrUpdateComputePolicyParameters();
        this.updateParameter = new UpdateComputePolicyParameters();
    }

    ComputePolicyImpl(ComputePolicyInner inner, DataLakeAnalyticsManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.computePolicyName = inner.name();
        // set resource ancestor and positional variables
        this.resourceGroupName = IdParsingUtils.getValueFromIdByName(inner.id(), "resourceGroups");
        this.accountName = IdParsingUtils.getValueFromIdByName(inner.id(), "accounts");
        this.computePolicyName = IdParsingUtils.getValueFromIdByName(inner.id(), "computePolicies");
        //
        this.createParameter = new CreateOrUpdateComputePolicyParameters();
        this.updateParameter = new UpdateComputePolicyParameters();
    }

    @Override
    public DataLakeAnalyticsManager manager() {
        return this.manager;
    }

    @Override
    public Observable<ComputePolicy> createResourceAsync() {
        ComputePoliciesInner client = this.manager().inner().computePolicies();
        return client.createOrUpdateAsync(this.resourceGroupName, this.accountName, this.computePolicyName, this.createParameter)
            .map(new Func1<ComputePolicyInner, ComputePolicyInner>() {
               @Override
               public ComputePolicyInner call(ComputePolicyInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ComputePolicy> updateResourceAsync() {
        ComputePoliciesInner client = this.manager().inner().computePolicies();
        return client.updateAsync(this.resourceGroupName, this.accountName, this.computePolicyName, this.updateParameter)
            .map(new Func1<ComputePolicyInner, ComputePolicyInner>() {
               @Override
               public ComputePolicyInner call(ComputePolicyInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ComputePolicyInner> getInnerAsync() {
        ComputePoliciesInner client = this.manager().inner().computePolicies();
        return client.getAsync(this.resourceGroupName, this.accountName, this.computePolicyName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.createParameter = new CreateOrUpdateComputePolicyParameters();
        this.updateParameter = new UpdateComputePolicyParameters();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public Integer maxDegreeOfParallelismPerJob() {
        return this.inner().maxDegreeOfParallelismPerJob();
    }

    @Override
    public Integer minPriorityPerJob() {
        return this.inner().minPriorityPerJob();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public UUID objectId() {
        return this.inner().objectId();
    }

    @Override
    public AADObjectType objectType() {
        return this.inner().objectType();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public ComputePolicyImpl withExistingAccount(String resourceGroupName, String accountName) {
        this.resourceGroupName = resourceGroupName;
        this.accountName = accountName;
        return this;
    }

    @Override
    public ComputePolicyImpl withObjectId(UUID objectId) {
        if (isInCreateMode()) {
            this.createParameter.withObjectId(objectId);
        } else {
            this.updateParameter.withObjectId(objectId);
        }
        return this;
    }

    @Override
    public ComputePolicyImpl withObjectType(AADObjectType objectType) {
        if (isInCreateMode()) {
            this.createParameter.withObjectType(objectType);
        } else {
            this.updateParameter.withObjectType(objectType);
        }
        return this;
    }

    @Override
    public ComputePolicyImpl withMaxDegreeOfParallelismPerJob(Integer maxDegreeOfParallelismPerJob) {
        if (isInCreateMode()) {
            this.createParameter.withMaxDegreeOfParallelismPerJob(maxDegreeOfParallelismPerJob);
        } else {
            this.updateParameter.withMaxDegreeOfParallelismPerJob(maxDegreeOfParallelismPerJob);
        }
        return this;
    }

    @Override
    public ComputePolicyImpl withMinPriorityPerJob(Integer minPriorityPerJob) {
        if (isInCreateMode()) {
            this.createParameter.withMinPriorityPerJob(minPriorityPerJob);
        } else {
            this.updateParameter.withMinPriorityPerJob(minPriorityPerJob);
        }
        return this;
    }

}