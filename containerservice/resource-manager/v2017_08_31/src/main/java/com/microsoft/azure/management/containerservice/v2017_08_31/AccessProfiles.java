/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerservice.v2017_08_31;

import rx.Observable;
import com.microsoft.azure.management.containerservice.v2017_08_31.implementation.ManagedClustersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing AccessProfiles.
 */
public interface AccessProfiles extends HasInner<ManagedClustersInner> {

    /**
     * Gets access profile of a managed cluster.
     * Gets the accessProfile for the specified role name of the managed cluster with a specified resource group and name.
    *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the managed cluster resource.
     * @param roleName The name of the role for managed cluster accessProfile resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ManagedClusterAccessProfile> getByManagedClusterAsync(String resourceGroupName, String resourceName, String roleName);
}