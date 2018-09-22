/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2018-09-01-preview.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * The resource representation of a service topology.
 */
@JsonFlatten
public class ServiceTopologyResourceInner extends Resource {
    /**
     * The artifact source that contains the artifacts that can be referenced
     * in the service units.
     */
    @JsonProperty(value = "properties.artifactSourceId")
    private String artifactSourceId;

    /**
     * Get the artifact source that contains the artifacts that can be referenced in the service units.
     *
     * @return the artifactSourceId value
     */
    public String artifactSourceId() {
        return this.artifactSourceId;
    }

    /**
     * Set the artifact source that contains the artifacts that can be referenced in the service units.
     *
     * @param artifactSourceId the artifactSourceId value to set
     * @return the ServiceTopologyResourceInner object itself.
     */
    public ServiceTopologyResourceInner withArtifactSourceId(String artifactSourceId) {
        this.artifactSourceId = artifactSourceId;
        return this;
    }

}
