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

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Filters the list of backup copies based on the property.
 */
public class BMSRPQueryObject {
    /**
     * Use backup copies created after this time.
     */
    @JsonProperty(value = "startDate")
    private DateTime startDate;

    /**
     * Use backup copies created before this time.
     */
    @JsonProperty(value = "endDate")
    private DateTime endDate;

    /**
     * Get use backup copies created after this time.
     *
     * @return the startDate value
     */
    public DateTime startDate() {
        return this.startDate;
    }

    /**
     * Set use backup copies created after this time.
     *
     * @param startDate the startDate value to set
     * @return the BMSRPQueryObject object itself.
     */
    public BMSRPQueryObject withStartDate(DateTime startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * Get use backup copies created before this time.
     *
     * @return the endDate value
     */
    public DateTime endDate() {
        return this.endDate;
    }

    /**
     * Set use backup copies created before this time.
     *
     * @param endDate the endDate value to set
     * @return the BMSRPQueryObject object itself.
     */
    public BMSRPQueryObject withEndDate(DateTime endDate) {
        this.endDate = endDate;
        return this;
    }

}
