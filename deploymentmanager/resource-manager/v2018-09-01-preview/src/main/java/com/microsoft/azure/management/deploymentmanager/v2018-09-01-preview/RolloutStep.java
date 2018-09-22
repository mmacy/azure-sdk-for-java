/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2018-09-01-preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Defines a specific step on a target service unit.
 */
public class RolloutStep {
    /**
     * Name of the step as specified in the rollout specification input
     * artifact.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * Current state of the step.
     */
    @JsonProperty(value = "status", access = JsonProperty.Access.WRITE_ONLY)
    private String status;

    /**
     * The step group the current step is part of.
     */
    @JsonProperty(value = "stepGroup")
    private String stepGroup;

    /**
     * Detailed information of specific action execution.
     */
    @JsonProperty(value = "operationInfo", access = JsonProperty.Access.WRITE_ONLY)
    private StepOperationInfo operationInfo;

    /**
     * Set of resource operations that were performed on the Azure resource
     * that the action acted upon.
     */
    @JsonProperty(value = "resourceOperations", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceOperation> resourceOperations;

    /**
     * Supplementary informative messages during rollout.
     */
    @JsonProperty(value = "messages", access = JsonProperty.Access.WRITE_ONLY)
    private List<Message> messages;

    /**
     * Get name of the step as specified in the rollout specification input artifact.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set name of the step as specified in the rollout specification input artifact.
     *
     * @param name the name value to set
     * @return the RolloutStep object itself.
     */
    public RolloutStep withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get current state of the step.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Get the step group the current step is part of.
     *
     * @return the stepGroup value
     */
    public String stepGroup() {
        return this.stepGroup;
    }

    /**
     * Set the step group the current step is part of.
     *
     * @param stepGroup the stepGroup value to set
     * @return the RolloutStep object itself.
     */
    public RolloutStep withStepGroup(String stepGroup) {
        this.stepGroup = stepGroup;
        return this;
    }

    /**
     * Get detailed information of specific action execution.
     *
     * @return the operationInfo value
     */
    public StepOperationInfo operationInfo() {
        return this.operationInfo;
    }

    /**
     * Get set of resource operations that were performed on the Azure resource that the action acted upon.
     *
     * @return the resourceOperations value
     */
    public List<ResourceOperation> resourceOperations() {
        return this.resourceOperations;
    }

    /**
     * Get supplementary informative messages during rollout.
     *
     * @return the messages value
     */
    public List<Message> messages() {
        return this.messages;
    }

}
