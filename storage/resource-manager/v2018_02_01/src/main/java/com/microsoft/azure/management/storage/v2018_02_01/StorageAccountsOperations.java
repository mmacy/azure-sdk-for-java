/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2018_02_01;

import com.microsoft.azure.management.storage.v2018_02_01.implementation.BlobContainersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing StorageAccountsOperations.
 */
public interface StorageAccountsOperations extends HasInner<BlobContainersInner> {

    /**
     * @return Entry point to manage StorageAccount BlobService.
     */
    BlobServices blobServices();
}