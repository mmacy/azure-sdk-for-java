/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.compute.v2017_03_30.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2017_03_30.LocationPublishersOperations;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.compute.v2017_03_30.VirtualMachineImageResource;
import com.microsoft.azure.management.compute.v2017_03_30.PublisherLocationArtifacttypesOperations;

class LocationPublishersOperationsImpl extends WrapperImpl<VirtualMachineImagesInner> implements LocationPublishersOperations {
    private final ComputeManager manager;

    LocationPublishersOperationsImpl(ComputeManager manager) {
        super(manager.inner().virtualMachineImages());
        this.manager = manager;
    }

    @Override
    public PublisherLocationArtifacttypesOperations artifacttypes() {
        PublisherLocationArtifacttypesOperations accessor = this.manager().publisherLocationArtifacttypesOperations();
        return accessor;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    private VirtualMachineImageResourceImpl wrapModel(VirtualMachineImageResourceInner inner) {
        return  new VirtualMachineImageResourceImpl(inner, manager());
    }

    @Override
    public Observable<VirtualMachineImageResource> listByLocationAsync(String location) {
        VirtualMachineImagesInner client = this.inner();
        return client.listPublishersAsync(location)
        .flatMap(new Func1<List<VirtualMachineImageResourceInner>, Observable<VirtualMachineImageResourceInner>>() {
            @Override
            public Observable<VirtualMachineImageResourceInner> call(List<VirtualMachineImageResourceInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<VirtualMachineImageResourceInner, VirtualMachineImageResource>() {
            @Override
            public VirtualMachineImageResource call(VirtualMachineImageResourceInner inner) {
                return wrapModel(inner);
            }
        });
    }

}