/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 2.3.31.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2016_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BEK is Bitlocker Encrpytion Key.
 */
public class BEKDetails {
    /**
     * Secret refers to Bitlocker Encryption Key (BEK). The Secret can be
     * unlocked by the key (or KEK).
     */
    @JsonProperty(value = "secretUrl")
    private String secretUrl;

    /**
     * ID of the Key Vault where this Secret is stored.
     */
    @JsonProperty(value = "secretVaultId")
    private String secretVaultId;

    /**
     * Bitlocker Encryption Key (BEK) data.
     */
    @JsonProperty(value = "secretData")
    private String secretData;

    /**
     * Get secret refers to Bitlocker Encryption Key (BEK). The Secret can be unlocked by the key (or KEK).
     *
     * @return the secretUrl value
     */
    public String secretUrl() {
        return this.secretUrl;
    }

    /**
     * Set secret refers to Bitlocker Encryption Key (BEK). The Secret can be unlocked by the key (or KEK).
     *
     * @param secretUrl the secretUrl value to set
     * @return the BEKDetails object itself.
     */
    public BEKDetails withSecretUrl(String secretUrl) {
        this.secretUrl = secretUrl;
        return this;
    }

    /**
     * Get iD of the Key Vault where this Secret is stored.
     *
     * @return the secretVaultId value
     */
    public String secretVaultId() {
        return this.secretVaultId;
    }

    /**
     * Set iD of the Key Vault where this Secret is stored.
     *
     * @param secretVaultId the secretVaultId value to set
     * @return the BEKDetails object itself.
     */
    public BEKDetails withSecretVaultId(String secretVaultId) {
        this.secretVaultId = secretVaultId;
        return this;
    }

    /**
     * Get bitlocker Encryption Key (BEK) data.
     *
     * @return the secretData value
     */
    public String secretData() {
        return this.secretData;
    }

    /**
     * Set bitlocker Encryption Key (BEK) data.
     *
     * @param secretData the secretData value to set
     * @return the BEKDetails object itself.
     */
    public BEKDetails withSecretData(String secretData) {
        this.secretData = secretData;
        return this;
    }

}
