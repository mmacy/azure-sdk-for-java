/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2016_01_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The encryption settings on the storage account.
 */
public class Encryption {
    /**
     * List of services which support encryption.
     */
    @JsonProperty(value = "services")
    private EncryptionServices services;

    /**
     * The encryption keySource (provider). Possible values (case-insensitive):
     * Microsoft.Storage.
     */
    @JsonProperty(value = "keySource", required = true)
    private String keySource;

    /**
     * Creates an instance of Encryption class.
     */
    public Encryption() {
        keySource = "Microsoft.Storage";
    }

    /**
     * Get list of services which support encryption.
     *
     * @return the services value
     */
    public EncryptionServices services() {
        return this.services;
    }

    /**
     * Set list of services which support encryption.
     *
     * @param services the services value to set
     * @return the Encryption object itself.
     */
    public Encryption withServices(EncryptionServices services) {
        this.services = services;
        return this;
    }

    /**
     * Get the encryption keySource (provider). Possible values (case-insensitive):  Microsoft.Storage.
     *
     * @return the keySource value
     */
    public String keySource() {
        return this.keySource;
    }

    /**
     * Set the encryption keySource (provider). Possible values (case-insensitive):  Microsoft.Storage.
     *
     * @param keySource the keySource value to set
     * @return the Encryption object itself.
     */
    public Encryption withKeySource(String keySource) {
        this.keySource = keySource;
        return this;
    }

}
