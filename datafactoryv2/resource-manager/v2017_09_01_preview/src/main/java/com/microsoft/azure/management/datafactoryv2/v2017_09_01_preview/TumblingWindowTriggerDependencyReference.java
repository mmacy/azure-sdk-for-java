/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Referenced tumbling window trigger dependency.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("TumblingWindowTriggerDependencyReference")
public class TumblingWindowTriggerDependencyReference extends TriggerDependencyReference {
    /**
     * Timespan applied to the start time of a tumbling window when evaluating
     * dependency, .Net timespan format.
     */
    @JsonProperty(value = "offset")
    private String offset;

    /**
     * The size of the window when evaluating the dependency. If undefined the
     * frequency of the tumbling window will be used, .Net timespan format.
     */
    @JsonProperty(value = "size")
    private String size;

    /**
     * Get timespan applied to the start time of a tumbling window when evaluating dependency, .Net timespan format.
     *
     * @return the offset value
     */
    public String offset() {
        return this.offset;
    }

    /**
     * Set timespan applied to the start time of a tumbling window when evaluating dependency, .Net timespan format.
     *
     * @param offset the offset value to set
     * @return the TumblingWindowTriggerDependencyReference object itself.
     */
    public TumblingWindowTriggerDependencyReference withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * Get the size of the window when evaluating the dependency. If undefined the frequency of the tumbling window will be used, .Net timespan format.
     *
     * @return the size value
     */
    public String size() {
        return this.size;
    }

    /**
     * Set the size of the window when evaluating the dependency. If undefined the frequency of the tumbling window will be used, .Net timespan format.
     *
     * @param size the size value to set
     * @return the TumblingWindowTriggerDependencyReference object itself.
     */
    public TumblingWindowTriggerDependencyReference withSize(String size) {
        this.size = size;
        return this;
    }

}