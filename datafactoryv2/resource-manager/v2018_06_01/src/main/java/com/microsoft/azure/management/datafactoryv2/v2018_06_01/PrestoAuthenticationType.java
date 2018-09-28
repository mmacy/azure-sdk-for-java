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
 * Defines values for PrestoAuthenticationType.
 */
public final class PrestoAuthenticationType extends ExpandableStringEnum<PrestoAuthenticationType> {
    /** Static value Anonymous for PrestoAuthenticationType. */
    public static final PrestoAuthenticationType ANONYMOUS = fromString("Anonymous");

    /** Static value LDAP for PrestoAuthenticationType. */
    public static final PrestoAuthenticationType LDAP = fromString("LDAP");

    /**
     * Creates or finds a PrestoAuthenticationType from its string representation.
     * @param name a name to look for
     * @return the corresponding PrestoAuthenticationType
     */
    @JsonCreator
    public static PrestoAuthenticationType fromString(String name) {
        return fromString(name, PrestoAuthenticationType.class);
    }

    /**
     * @return known PrestoAuthenticationType values
     */
    public static Collection<PrestoAuthenticationType> values() {
        return values(PrestoAuthenticationType.class);
    }
}
