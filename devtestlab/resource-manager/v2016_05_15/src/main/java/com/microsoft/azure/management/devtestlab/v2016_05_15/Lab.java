/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.devtestlab.v2016_05_15;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.Resource;
import com.microsoft.azure.arm.resources.models.GroupableResourceCore;
import com.microsoft.azure.arm.resources.models.HasResourceGroup;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.devtestlab.v2016_05_15.implementation.DevTestLabManager;
import org.joda.time.DateTime;
import com.microsoft.azure.management.devtestlab.v2016_05_15.implementation.LabInner;

/**
 * Type representing Lab.
 */
public interface Lab extends HasInner<LabInner>, Resource, GroupableResourceCore<DevTestLabManager, LabInner>, HasResourceGroup, Refreshable<Lab>, Updatable<Lab.Update>, HasManager<DevTestLabManager> {
    /**
     * @return the artifactsStorageAccount value.
     */
    String artifactsStorageAccount();

    /**
     * @return the createdDate value.
     */
    DateTime createdDate();

    /**
     * @return the defaultPremiumStorageAccount value.
     */
    String defaultPremiumStorageAccount();

    /**
     * @return the defaultStorageAccount value.
     */
    String defaultStorageAccount();

    /**
     * @return the labStorageType value.
     */
    StorageType labStorageType();

    /**
     * @return the premiumDataDisks value.
     */
    PremiumDataDisk premiumDataDisks();

    /**
     * @return the premiumDataDiskStorageAccount value.
     */
    String premiumDataDiskStorageAccount();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * @return the uniqueIdentifier value.
     */
    String uniqueIdentifier();

    /**
     * @return the vaultName value.
     */
    String vaultName();

    /**
     * The entirety of the Lab definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithGroup, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of Lab definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a Lab definition.
         */
        interface Blank extends GroupableResourceCore.DefinitionWithRegion<WithGroup> {
        }

        /**
         * The stage of the Lab definition allowing to specify the resource group.
         */
        interface WithGroup extends GroupableResourceCore.DefinitionStages.WithGroup<WithCreate> {
        }

        /**
         * The stage of the lab definition allowing to specify LabStorageType.
         */
        interface WithLabStorageType {
            /**
             * Specifies labStorageType.
             * @param labStorageType Type of storage used by the lab. It can be either Premium or Standard. Default is Premium. Possible values include: 'Standard', 'Premium'
             * @return the next definition stage
             */
            WithCreate withLabStorageType(StorageType labStorageType);
        }

        /**
         * The stage of the lab definition allowing to specify PremiumDataDisks.
         */
        interface WithPremiumDataDisks {
            /**
             * Specifies premiumDataDisks.
             * @param premiumDataDisks The setting to enable usage of premium data disks.
 When its value is 'Enabled', creation of standard or premium data disks is allowed.
 When its value is 'Disabled', only creation of standard data disks is allowed. Possible values include: 'Disabled', 'Enabled'
             * @return the next definition stage
             */
            WithCreate withPremiumDataDisks(PremiumDataDisk premiumDataDisks);
        }

        /**
         * The stage of the lab definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning status of the resource
             * @return the next definition stage
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the lab definition allowing to specify UniqueIdentifier.
         */
        interface WithUniqueIdentifier {
            /**
             * Specifies uniqueIdentifier.
             * @param uniqueIdentifier The unique immutable identifier of a resource (Guid)
             * @return the next definition stage
             */
            WithCreate withUniqueIdentifier(String uniqueIdentifier);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<Lab>, Resource.DefinitionWithTags<WithCreate>, DefinitionStages.WithLabStorageType, DefinitionStages.WithPremiumDataDisks, DefinitionStages.WithProvisioningState, DefinitionStages.WithUniqueIdentifier {
        }
    }
    /**
     * The template for a Lab update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<Lab>, Resource.UpdateWithTags<Update>, UpdateStages.WithLabStorageType, UpdateStages.WithPremiumDataDisks, UpdateStages.WithProvisioningState, UpdateStages.WithUniqueIdentifier {
    }

    /**
     * Grouping of Lab update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the lab update allowing to specify LabStorageType.
         */
        interface WithLabStorageType {
            /**
             * Specifies labStorageType.
             * @param labStorageType Type of storage used by the lab. It can be either Premium or Standard. Default is Premium. Possible values include: 'Standard', 'Premium'
             * @return the next update stage
             */
            Update withLabStorageType(StorageType labStorageType);
        }

        /**
         * The stage of the lab update allowing to specify PremiumDataDisks.
         */
        interface WithPremiumDataDisks {
            /**
             * Specifies premiumDataDisks.
             * @param premiumDataDisks The setting to enable usage of premium data disks.
 When its value is 'Enabled', creation of standard or premium data disks is allowed.
 When its value is 'Disabled', only creation of standard data disks is allowed. Possible values include: 'Disabled', 'Enabled'
             * @return the next update stage
             */
            Update withPremiumDataDisks(PremiumDataDisk premiumDataDisks);
        }

        /**
         * The stage of the lab update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             * @param provisioningState The provisioning status of the resource
             * @return the next update stage
             */
            Update withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the lab update allowing to specify UniqueIdentifier.
         */
        interface WithUniqueIdentifier {
            /**
             * Specifies uniqueIdentifier.
             * @param uniqueIdentifier The unique immutable identifier of a resource (Guid)
             * @return the next update stage
             */
            Update withUniqueIdentifier(String uniqueIdentifier);
        }

    }
}
