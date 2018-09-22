/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2018-09-01-preview;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.deploymentmanager.v2018-09-01-preview.implementation.ServicesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Services.
 */
public interface Services extends SupportsCreating<ServiceResource.DefinitionStages.Blank>, HasInner<ServicesInner> {
    /**
     * Gets a service resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceName The name of the service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServiceResource> getAsync(String resourceGroupName, String serviceTopologyName, String serviceName);

    /**
     * Deletes a service resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param serviceTopologyName The name of the service topology .
     * @param serviceName The name of the service resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String resourceGroupName, String serviceTopologyName, String serviceName);

}
