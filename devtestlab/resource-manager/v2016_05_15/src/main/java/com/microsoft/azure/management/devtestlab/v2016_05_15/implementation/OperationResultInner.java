/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15.implementation;

import com.microsoft.azure.management.devtestlab.v2016_05_15.HttpStatusCode;
import com.microsoft.azure.management.devtestlab.v2016_05_15.OperationError;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An Operation Result.
 */
public class OperationResultInner {
    /**
     * The operation status.
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * The status code for the operation. Possible values include: 'Continue',
     * 'SwitchingProtocols', 'OK', 'Created', 'Accepted',
     * 'NonAuthoritativeInformation', 'NoContent', 'ResetContent',
     * 'PartialContent', 'MultipleChoices', 'MovedPermanently', 'Redirect',
     * 'SeeOther', 'NotModified', 'UseProxy', 'Unused', 'TemporaryRedirect',
     * 'BadRequest', 'Unauthorized', 'PaymentRequired', 'Forbidden',
     * 'NotFound', 'MethodNotAllowed', 'NotAcceptable',
     * 'ProxyAuthenticationRequired', 'RequestTimeout', 'Conflict', 'Gone',
     * 'LengthRequired', 'PreconditionFailed', 'RequestEntityTooLarge',
     * 'RequestUriTooLong', 'UnsupportedMediaType',
     * 'RequestedRangeNotSatisfiable', 'ExpectationFailed', 'UpgradeRequired',
     * 'InternalServerError', 'NotImplemented', 'BadGateway',
     * 'ServiceUnavailable', 'GatewayTimeout', 'HttpVersionNotSupported'.
     */
    @JsonProperty(value = "statusCode")
    private HttpStatusCode statusCode;

    /**
     * Error details for the operation in case of a failure.
     */
    @JsonProperty(value = "error")
    private OperationError error;

    /**
     * Get the operation status.
     *
     * @return the status value
     */
    public String status() {
        return this.status;
    }

    /**
     * Set the operation status.
     *
     * @param status the status value to set
     * @return the OperationResultInner object itself.
     */
    public OperationResultInner withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the status code for the operation. Possible values include: 'Continue', 'SwitchingProtocols', 'OK', 'Created', 'Accepted', 'NonAuthoritativeInformation', 'NoContent', 'ResetContent', 'PartialContent', 'MultipleChoices', 'MovedPermanently', 'Redirect', 'SeeOther', 'NotModified', 'UseProxy', 'Unused', 'TemporaryRedirect', 'BadRequest', 'Unauthorized', 'PaymentRequired', 'Forbidden', 'NotFound', 'MethodNotAllowed', 'NotAcceptable', 'ProxyAuthenticationRequired', 'RequestTimeout', 'Conflict', 'Gone', 'LengthRequired', 'PreconditionFailed', 'RequestEntityTooLarge', 'RequestUriTooLong', 'UnsupportedMediaType', 'RequestedRangeNotSatisfiable', 'ExpectationFailed', 'UpgradeRequired', 'InternalServerError', 'NotImplemented', 'BadGateway', 'ServiceUnavailable', 'GatewayTimeout', 'HttpVersionNotSupported'.
     *
     * @return the statusCode value
     */
    public HttpStatusCode statusCode() {
        return this.statusCode;
    }

    /**
     * Set the status code for the operation. Possible values include: 'Continue', 'SwitchingProtocols', 'OK', 'Created', 'Accepted', 'NonAuthoritativeInformation', 'NoContent', 'ResetContent', 'PartialContent', 'MultipleChoices', 'MovedPermanently', 'Redirect', 'SeeOther', 'NotModified', 'UseProxy', 'Unused', 'TemporaryRedirect', 'BadRequest', 'Unauthorized', 'PaymentRequired', 'Forbidden', 'NotFound', 'MethodNotAllowed', 'NotAcceptable', 'ProxyAuthenticationRequired', 'RequestTimeout', 'Conflict', 'Gone', 'LengthRequired', 'PreconditionFailed', 'RequestEntityTooLarge', 'RequestUriTooLong', 'UnsupportedMediaType', 'RequestedRangeNotSatisfiable', 'ExpectationFailed', 'UpgradeRequired', 'InternalServerError', 'NotImplemented', 'BadGateway', 'ServiceUnavailable', 'GatewayTimeout', 'HttpVersionNotSupported'.
     *
     * @param statusCode the statusCode value to set
     * @return the OperationResultInner object itself.
     */
    public OperationResultInner withStatusCode(HttpStatusCode statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * Get error details for the operation in case of a failure.
     *
     * @return the error value
     */
    public OperationError error() {
        return this.error;
    }

    /**
     * Set error details for the operation in case of a failure.
     *
     * @param error the error value to set
     * @return the OperationResultInner object itself.
     */
    public OperationResultInner withError(OperationError error) {
        this.error = error;
        return this;
    }

}
