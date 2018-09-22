/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.deploymentmanager.v2018-09-01-preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.deploymentmanager.v2018-09-01-preview.Services;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.deploymentmanager.v2018-09-01-preview.ServiceResource;

class ServicesImpl extends WrapperImpl<ServicesInner> implements Services {
    private final DeploymentManagerManager manager;

    ServicesImpl(DeploymentManagerManager manager) {
        super(manager.inner().services());
        this.manager = manager;
    }

    public DeploymentManagerManager manager() {
        return this.manager;
    }

    @Override
    public ServiceResourceImpl define(String name) {
        return wrapModel(name);
    }

    private ServiceResourceImpl wrapModel(ServiceResourceInner inner) {
        return  new ServiceResourceImpl(inner, manager());
    }

    private ServiceResourceImpl wrapModel(String name) {
        return new ServiceResourceImpl(name, this.manager());
    }

    @Override
    public Observable<ServiceResource> getAsync(String resourceGroupName, String serviceTopologyName, String serviceName) {
        ServicesInner client = this.inner();
        return client.getAsync(resourceGroupName, serviceTopologyName, serviceName)
        .map(new Func1<ServiceResourceInner, ServiceResource>() {
            @Override
            public ServiceResource call(ServiceResourceInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String resourceGroupName, String serviceTopologyName, String serviceName) {
        ServicesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, serviceTopologyName, serviceName).toCompletable();
    }

}
