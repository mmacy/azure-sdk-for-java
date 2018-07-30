/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2018_06_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.network.v2018_06_01.implementation.InboundNatRuleInner;
import com.microsoft.azure.arm.model.Indexable;
import com.microsoft.azure.arm.model.Refreshable;
import com.microsoft.azure.arm.model.Updatable;
import com.microsoft.azure.arm.model.Appliable;
import com.microsoft.azure.arm.model.Creatable;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.network.v2018_06_01.implementation.NetworkManager;
import com.microsoft.azure.SubResource;

/**
 * Type representing InboundNatRule.
 */
public interface InboundNatRule extends HasInner<InboundNatRuleInner>, Indexable, Refreshable<InboundNatRule>, Updatable<InboundNatRule.Update>, HasManager<NetworkManager> {
    /**
     * @return the backendIPConfiguration value.
     */
    VirtualMachineScaleSetNetworkInterfaceIPConfiguration backendIPConfiguration();

    /**
     * @return the backendPort value.
     */
    Integer backendPort();

    /**
     * @return the enableFloatingIP value.
     */
    Boolean enableFloatingIP();

    /**
     * @return the etag value.
     */
    String etag();

    /**
     * @return the frontendIPConfiguration value.
     */
    SubResource frontendIPConfiguration();

    /**
     * @return the frontendPort value.
     */
    Integer frontendPort();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the idleTimeoutInMinutes value.
     */
    Integer idleTimeoutInMinutes();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the protocol value.
     */
    TransportProtocol protocol();

    /**
     * @return the provisioningState value.
     */
    String provisioningState();

    /**
     * The entirety of the InboundNatRule definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLoadBalancer, DefinitionStages.WithCreate {
    }

    /**
     * Grouping of InboundNatRule definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of a InboundNatRule definition.
         */
        interface Blank extends WithLoadBalancer {
        }

        /**
         * The stage of the inboundnatrule definition allowing to specify LoadBalancer.
         */
        interface WithLoadBalancer {
           /**
            * Specifies resourceGroupName, loadBalancerName.
            */
            WithCreate withExistingLoadBalancer(String resourceGroupName, String loadBalancerName);
        }

        /**
         * The stage of the inboundnatrule definition allowing to specify BackendPort.
         */
        interface WithBackendPort {
            /**
             * Specifies backendPort.
             */
            WithCreate withBackendPort(Integer backendPort);
        }

        /**
         * The stage of the inboundnatrule definition allowing to specify EnableFloatingIP.
         */
        interface WithEnableFloatingIP {
            /**
             * Specifies enableFloatingIP.
             */
            WithCreate withEnableFloatingIP(Boolean enableFloatingIP);
        }

        /**
         * The stage of the inboundnatrule definition allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             */
            WithCreate withEtag(String etag);
        }

        /**
         * The stage of the inboundnatrule definition allowing to specify FrontendIPConfiguration.
         */
        interface WithFrontendIPConfiguration {
            /**
             * Specifies frontendIPConfiguration.
             */
            WithCreate withFrontendIPConfiguration(SubResource frontendIPConfiguration);
        }

        /**
         * The stage of the inboundnatrule definition allowing to specify FrontendPort.
         */
        interface WithFrontendPort {
            /**
             * Specifies frontendPort.
             */
            WithCreate withFrontendPort(Integer frontendPort);
        }

        /**
         * The stage of the inboundnatrule definition allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             */
            WithCreate withId(String id);
        }

        /**
         * The stage of the inboundnatrule definition allowing to specify IdleTimeoutInMinutes.
         */
        interface WithIdleTimeoutInMinutes {
            /**
             * Specifies idleTimeoutInMinutes.
             */
            WithCreate withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes);
        }

        /**
         * The stage of the inboundnatrule definition allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             */
            WithCreate withName(String name);
        }

        /**
         * The stage of the inboundnatrule definition allowing to specify Protocol.
         */
        interface WithProtocol {
            /**
             * Specifies protocol.
             */
            WithCreate withProtocol(TransportProtocol protocol);
        }

        /**
         * The stage of the inboundnatrule definition allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            WithCreate withProvisioningState(String provisioningState);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        interface WithCreate extends Creatable<InboundNatRule>, DefinitionStages.WithBackendPort, DefinitionStages.WithEnableFloatingIP, DefinitionStages.WithEtag, DefinitionStages.WithFrontendIPConfiguration, DefinitionStages.WithFrontendPort, DefinitionStages.WithId, DefinitionStages.WithIdleTimeoutInMinutes, DefinitionStages.WithName, DefinitionStages.WithProtocol, DefinitionStages.WithProvisioningState {
        }
    }
    /**
     * The template for a InboundNatRule update operation, containing all the settings that can be modified.
     */
    interface Update extends Appliable<InboundNatRule>, UpdateStages.WithBackendPort, UpdateStages.WithEnableFloatingIP, UpdateStages.WithEtag, UpdateStages.WithFrontendIPConfiguration, UpdateStages.WithFrontendPort, UpdateStages.WithId, UpdateStages.WithIdleTimeoutInMinutes, UpdateStages.WithName, UpdateStages.WithProtocol, UpdateStages.WithProvisioningState {
    }

    /**
     * Grouping of InboundNatRule update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the inboundnatrule update allowing to specify BackendPort.
         */
        interface WithBackendPort {
            /**
             * Specifies backendPort.
             */
            Update withBackendPort(Integer backendPort);
        }

        /**
         * The stage of the inboundnatrule update allowing to specify EnableFloatingIP.
         */
        interface WithEnableFloatingIP {
            /**
             * Specifies enableFloatingIP.
             */
            Update withEnableFloatingIP(Boolean enableFloatingIP);
        }

        /**
         * The stage of the inboundnatrule update allowing to specify Etag.
         */
        interface WithEtag {
            /**
             * Specifies etag.
             */
            Update withEtag(String etag);
        }

        /**
         * The stage of the inboundnatrule update allowing to specify FrontendIPConfiguration.
         */
        interface WithFrontendIPConfiguration {
            /**
             * Specifies frontendIPConfiguration.
             */
            Update withFrontendIPConfiguration(SubResource frontendIPConfiguration);
        }

        /**
         * The stage of the inboundnatrule update allowing to specify FrontendPort.
         */
        interface WithFrontendPort {
            /**
             * Specifies frontendPort.
             */
            Update withFrontendPort(Integer frontendPort);
        }

        /**
         * The stage of the inboundnatrule update allowing to specify Id.
         */
        interface WithId {
            /**
             * Specifies id.
             */
            Update withId(String id);
        }

        /**
         * The stage of the inboundnatrule update allowing to specify IdleTimeoutInMinutes.
         */
        interface WithIdleTimeoutInMinutes {
            /**
             * Specifies idleTimeoutInMinutes.
             */
            Update withIdleTimeoutInMinutes(Integer idleTimeoutInMinutes);
        }

        /**
         * The stage of the inboundnatrule update allowing to specify Name.
         */
        interface WithName {
            /**
             * Specifies name.
             */
            Update withName(String name);
        }

        /**
         * The stage of the inboundnatrule update allowing to specify Protocol.
         */
        interface WithProtocol {
            /**
             * Specifies protocol.
             */
            Update withProtocol(TransportProtocol protocol);
        }

        /**
         * The stage of the inboundnatrule update allowing to specify ProvisioningState.
         */
        interface WithProvisioningState {
            /**
             * Specifies provisioningState.
             */
            Update withProvisioningState(String provisioningState);
        }

    }
}
