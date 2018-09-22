/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2018-09-01-preview.implementation;

import com.microsoft.azure.management.deploymentmanager.v2018-09-01-preview.StepProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.Resource;

/**
 * The resource representation of a deployment step.
 */
public class StepResourceInner extends Resource {
    /**
     * The properties for the resource.
     */
    @JsonProperty(value = "properties", required = true)
    private StepProperties properties;

    /**
     * Get the properties for the resource.
     *
     * @return the properties value
     */
    public StepProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties for the resource.
     *
     * @param properties the properties value to set
     * @return the StepResourceInner object itself.
     */
    public StepResourceInner withProperties(StepProperties properties) {
        this.properties = properties;
        return this;
    }

}
