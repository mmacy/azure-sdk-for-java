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
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.datafactoryv2.v2017_09_01_preview.implementation.LinkedServiceInner;

/**
 * Azure Key Vault linked service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureKeyVault")
@JsonFlatten
public class AzureKeyVaultLinkedService extends LinkedServiceInner {
    /**
     * The base URL of the Azure Key Vault. e.g. https://myakv.vault.azure.net
     * Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.baseUrl", required = true)
    private Object baseUrl;

    /**
     * Get the base URL of the Azure Key Vault. e.g. https://myakv.vault.azure.net Type: string (or Expression with resultType string).
     *
     * @return the baseUrl value
     */
    public Object baseUrl() {
        return this.baseUrl;
    }

    /**
     * Set the base URL of the Azure Key Vault. e.g. https://myakv.vault.azure.net Type: string (or Expression with resultType string).
     *
     * @param baseUrl the baseUrl value to set
     * @return the AzureKeyVaultLinkedService object itself.
     */
    public AzureKeyVaultLinkedService withBaseUrl(Object baseUrl) {
        this.baseUrl = baseUrl;
        return this;
    }

}
