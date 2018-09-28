/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.datafactoryv2.v2018_06_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for IntegrationRuntimeType.
 */
public final class IntegrationRuntimeType extends ExpandableStringEnum<IntegrationRuntimeType> {
    /** Static value Managed for IntegrationRuntimeType. */
    public static final IntegrationRuntimeType MANAGED = fromString("Managed");

    /** Static value SelfHosted for IntegrationRuntimeType. */
    public static final IntegrationRuntimeType SELF_HOSTED = fromString("SelfHosted");

    /**
     * Creates or finds a IntegrationRuntimeType from its string representation.
     * @param name a name to look for
     * @return the corresponding IntegrationRuntimeType
     */
    @JsonCreator
    public static IntegrationRuntimeType fromString(String name) {
        return fromString(name, IntegrationRuntimeType.class);
    }

    /**
     * @return known IntegrationRuntimeType values
     */
    public static Collection<IntegrationRuntimeType> values() {
        return values(IntegrationRuntimeType.class);
    }
}
