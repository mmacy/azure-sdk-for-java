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

/**
 * The data stored in JSON format.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("JsonFormat")
public class JsonFormat extends DatasetStorageFormat {
    /**
     * File pattern of JSON. To be more specific, the way of separating a
     * collection of JSON objects. The default value is 'setOfObjects'. It is
     * case-sensitive. Possible values include: 'setOfObjects',
     * 'arrayOfObjects'.
     */
    @JsonProperty(value = "filePattern")
    private JsonFormatFilePattern filePattern;

    /**
     * The character used to separate nesting levels. Default value is '.'
     * (dot). Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "nestingSeparator")
    private Object nestingSeparator;

    /**
     * The code page name of the preferred encoding. If not provided, the
     * default value is 'utf-8', unless the byte order mark (BOM) denotes
     * another Unicode encoding. The full list of supported values can be found
     * in the 'Name' column of the table of encodings in the following
     * reference: https://go.microsoft.com/fwlink/?linkid=861078. Type: string
     * (or Expression with resultType string).
     */
    @JsonProperty(value = "encodingName")
    private Object encodingName;

    /**
     * The JSONPath of the JSON array element to be flattened. Example:
     * "$.ArrayPath". Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "jsonNodeReference")
    private Object jsonNodeReference;

    /**
     * The JSONPath definition for each column mapping with a customized column
     * name to extract data from JSON file. For fields under root object, start
     * with "$"; for fields inside the array chosen by jsonNodeReference
     * property, start from the array element. Example: {"Column1":
     * "$.Column1Path", "Column2": "Column2PathInArray"}. Type: object (or
     * Expression with resultType object).
     */
    @JsonProperty(value = "jsonPathDefinition")
    private Object jsonPathDefinition;

    /**
     * Get file pattern of JSON. To be more specific, the way of separating a collection of JSON objects. The default value is 'setOfObjects'. It is case-sensitive. Possible values include: 'setOfObjects', 'arrayOfObjects'.
     *
     * @return the filePattern value
     */
    public JsonFormatFilePattern filePattern() {
        return this.filePattern;
    }

    /**
     * Set file pattern of JSON. To be more specific, the way of separating a collection of JSON objects. The default value is 'setOfObjects'. It is case-sensitive. Possible values include: 'setOfObjects', 'arrayOfObjects'.
     *
     * @param filePattern the filePattern value to set
     * @return the JsonFormat object itself.
     */
    public JsonFormat withFilePattern(JsonFormatFilePattern filePattern) {
        this.filePattern = filePattern;
        return this;
    }

    /**
     * Get the character used to separate nesting levels. Default value is '.' (dot). Type: string (or Expression with resultType string).
     *
     * @return the nestingSeparator value
     */
    public Object nestingSeparator() {
        return this.nestingSeparator;
    }

    /**
     * Set the character used to separate nesting levels. Default value is '.' (dot). Type: string (or Expression with resultType string).
     *
     * @param nestingSeparator the nestingSeparator value to set
     * @return the JsonFormat object itself.
     */
    public JsonFormat withNestingSeparator(Object nestingSeparator) {
        this.nestingSeparator = nestingSeparator;
        return this;
    }

    /**
     * Get the code page name of the preferred encoding. If not provided, the default value is 'utf-8', unless the byte order mark (BOM) denotes another Unicode encoding. The full list of supported values can be found in the 'Name' column of the table of encodings in the following reference: https://go.microsoft.com/fwlink/?linkid=861078. Type: string (or Expression with resultType string).
     *
     * @return the encodingName value
     */
    public Object encodingName() {
        return this.encodingName;
    }

    /**
     * Set the code page name of the preferred encoding. If not provided, the default value is 'utf-8', unless the byte order mark (BOM) denotes another Unicode encoding. The full list of supported values can be found in the 'Name' column of the table of encodings in the following reference: https://go.microsoft.com/fwlink/?linkid=861078. Type: string (or Expression with resultType string).
     *
     * @param encodingName the encodingName value to set
     * @return the JsonFormat object itself.
     */
    public JsonFormat withEncodingName(Object encodingName) {
        this.encodingName = encodingName;
        return this;
    }

    /**
     * Get the JSONPath of the JSON array element to be flattened. Example: "$.ArrayPath". Type: string (or Expression with resultType string).
     *
     * @return the jsonNodeReference value
     */
    public Object jsonNodeReference() {
        return this.jsonNodeReference;
    }

    /**
     * Set the JSONPath of the JSON array element to be flattened. Example: "$.ArrayPath". Type: string (or Expression with resultType string).
     *
     * @param jsonNodeReference the jsonNodeReference value to set
     * @return the JsonFormat object itself.
     */
    public JsonFormat withJsonNodeReference(Object jsonNodeReference) {
        this.jsonNodeReference = jsonNodeReference;
        return this;
    }

    /**
     * Get the JSONPath definition for each column mapping with a customized column name to extract data from JSON file. For fields under root object, start with "$"; for fields inside the array chosen by jsonNodeReference property, start from the array element. Example: {"Column1": "$.Column1Path", "Column2": "Column2PathInArray"}. Type: object (or Expression with resultType object).
     *
     * @return the jsonPathDefinition value
     */
    public Object jsonPathDefinition() {
        return this.jsonPathDefinition;
    }

    /**
     * Set the JSONPath definition for each column mapping with a customized column name to extract data from JSON file. For fields under root object, start with "$"; for fields inside the array chosen by jsonNodeReference property, start from the array element. Example: {"Column1": "$.Column1Path", "Column2": "Column2PathInArray"}. Type: object (or Expression with resultType object).
     *
     * @param jsonPathDefinition the jsonPathDefinition value to set
     * @return the JsonFormat object itself.
     */
    public JsonFormat withJsonPathDefinition(Object jsonPathDefinition) {
        this.jsonPathDefinition = jsonPathDefinition;
        return this;
    }

}
