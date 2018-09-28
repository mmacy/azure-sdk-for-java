/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Factory's VSTS repo information.
 */
public class FactoryRepoUpdate {
    /**
     * The factory resource id.
     */
    @JsonProperty(value = "factoryResourceId")
    private String factoryResourceId;

    /**
     * The resource group name.
     */
    @JsonProperty(value = "resourceGroupName")
    private String resourceGroupName;

    /**
     * VSTS repo information of the factory.
     */
    @JsonProperty(value = "vstsConfiguration")
    private FactoryVSTSConfiguration vstsConfiguration;

    /**
     * Get the factory resource id.
     *
     * @return the factoryResourceId value
     */
    public String factoryResourceId() {
        return this.factoryResourceId;
    }

    /**
     * Set the factory resource id.
     *
     * @param factoryResourceId the factoryResourceId value to set
     * @return the FactoryRepoUpdate object itself.
     */
    public FactoryRepoUpdate withFactoryResourceId(String factoryResourceId) {
        this.factoryResourceId = factoryResourceId;
        return this;
    }

    /**
     * Get the resource group name.
     *
     * @return the resourceGroupName value
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Set the resource group name.
     *
     * @param resourceGroupName the resourceGroupName value to set
     * @return the FactoryRepoUpdate object itself.
     */
    public FactoryRepoUpdate withResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }

    /**
     * Get vSTS repo information of the factory.
     *
     * @return the vstsConfiguration value
     */
    public FactoryVSTSConfiguration vstsConfiguration() {
        return this.vstsConfiguration;
    }

    /**
     * Set vSTS repo information of the factory.
     *
     * @param vstsConfiguration the vstsConfiguration value to set
     * @return the FactoryRepoUpdate object itself.
     */
    public FactoryRepoUpdate withVstsConfiguration(FactoryVSTSConfiguration vstsConfiguration) {
        this.vstsConfiguration = vstsConfiguration;
        return this;
    }

}
