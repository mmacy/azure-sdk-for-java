/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.iothub.v2018_04_01;

import rx.Observable;
import com.microsoft.azure.management.iothub.v2018_04_01.implementation.IotHubResourcesInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Routes.
 */
public interface Routes extends HasInner<IotHubResourcesInner> {
    /**
     * Test all routes.
     * Test all routes configured in this Iot Hub.
     *
     * @param iotHubName IotHub to be tested
     * @param resourceGroupName resource group which Iot Hub belongs to
     * @param input Input for testing all routes
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TestAllRoutesResult> testAllRoutesAsync(String iotHubName, String resourceGroupName, TestAllRoutesInput input);

    /**
     * Test the new route.
     * Test the new route for this Iot Hub.
     *
     * @param iotHubName IotHub to be tested
     * @param resourceGroupName resource group which Iot Hub belongs to
     * @param input Route that needs to be tested
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TestRouteResult> testRouteAsync(String iotHubName, String resourceGroupName, TestRouteInput input);

}