/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.compute.v2017_12_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.compute.v2017_12_01.AvailabilitySetVmSizes;
import rx.Observable;
import rx.functions.Func1;
import java.util.List;
import com.microsoft.azure.management.compute.v2017_12_01.AvailabilitySetVirtualMachineSize;

class AvailabilitySetVmSizesImpl extends WrapperImpl<AvailabilitySetsInner> implements AvailabilitySetVmSizes {
    private final ComputeManager manager;

    AvailabilitySetVmSizesImpl(ComputeManager manager) {
        super(manager.inner().availabilitySets());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    private AvailabilitySetVirtualMachineSizeImpl wrapModel(VirtualMachineSizeInner inner) {
        return  new AvailabilitySetVirtualMachineSizeImpl(inner, manager());
    }

    @Override
    public Observable<AvailabilitySetVirtualMachineSize> listByAvailabilitySetAsync(String resourceGroupName, String availabilitySetName) {
        AvailabilitySetsInner client = this.inner();
        return client.listAvailableSizesAsync(resourceGroupName, availabilitySetName)
        .flatMap(new Func1<List<VirtualMachineSizeInner>, Observable<VirtualMachineSizeInner>>() {
            @Override
            public Observable<VirtualMachineSizeInner> call(List<VirtualMachineSizeInner> innerList) {
                return Observable.from(innerList);
            }
        })
        .map(new Func1<VirtualMachineSizeInner, AvailabilitySetVirtualMachineSize>() {
            @Override
            public AvailabilitySetVirtualMachineSize call(VirtualMachineSizeInner inner) {
                return wrapModel(inner);
            }
        });
    }

}