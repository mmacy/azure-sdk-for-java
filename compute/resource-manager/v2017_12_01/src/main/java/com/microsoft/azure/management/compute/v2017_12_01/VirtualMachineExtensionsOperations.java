/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2017_12_01;

import rx.Observable;
import com.microsoft.azure.management.compute.v2017_12_01.implementation.VirtualMachinesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing VirtualMachineExtensionsOperations.
 */
public interface VirtualMachineExtensionsOperations extends HasInner<VirtualMachinesInner> {
    /**
     * The operation to get all extensions of a Virtual Machine.
     *
     * @param resourceGroupName The name of the resource group.
     * @param vmName The name of the virtual machine containing the extension.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineExtensionsListResult> getExtensionsAsync(String resourceGroupName, String vmName);

}