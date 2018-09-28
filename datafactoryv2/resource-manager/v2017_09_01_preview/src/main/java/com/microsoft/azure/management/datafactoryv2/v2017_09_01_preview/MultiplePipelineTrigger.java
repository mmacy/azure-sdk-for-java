/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation.TriggerInner;

/**
 * Base class for all triggers that support one to many model for trigger to
 * pipeline.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("MultiplePipelineTrigger")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "BlobEventsTrigger", value = BlobEventsTrigger.class),
    @JsonSubTypes.Type(name = "BlobTrigger", value = BlobTrigger.class),
    @JsonSubTypes.Type(name = "ScheduleTrigger", value = ScheduleTrigger.class)
})
public class MultiplePipelineTrigger extends TriggerInner {
    /**
     * Pipelines that need to be started.
     */
    @JsonProperty(value = "pipelines")
    private List<TriggerPipelineReference> pipelines;

    /**
     * Get pipelines that need to be started.
     *
     * @return the pipelines value
     */
    public List<TriggerPipelineReference> pipelines() {
        return this.pipelines;
    }

    /**
     * Set pipelines that need to be started.
     *
     * @param pipelines the pipelines value to set
     * @return the MultiplePipelineTrigger object itself.
     */
    public MultiplePipelineTrigger withPipelines(List<TriggerPipelineReference> pipelines) {
        this.pipelines = pipelines;
        return this;
    }

}
