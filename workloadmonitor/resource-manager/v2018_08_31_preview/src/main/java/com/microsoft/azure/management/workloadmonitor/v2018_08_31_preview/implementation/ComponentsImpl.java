/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.Components;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.workloadmonitor.v2018_08_31_preview.Component;
import java.util.UUID;

class ComponentsImpl extends WrapperImpl<ComponentsInner> implements Components {
    private final WorkloadMonitorManager manager;

    ComponentsImpl(WorkloadMonitorManager manager) {
        super(manager.inner().components());
        this.manager = manager;
    }

    public WorkloadMonitorManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Component> listByResourceAsync(final String resourceGroupName, final String resourceNamespace, final String resourceType, final String resourceName) {
        ComponentsInner client = this.inner();
        return client.listByResourceAsync(resourceGroupName, resourceNamespace, resourceType, resourceName)
        .flatMapIterable(new Func1<Page<ComponentInner>, Iterable<ComponentInner>>() {
            @Override
            public Iterable<ComponentInner> call(Page<ComponentInner> page) {
                return page.items();
            }
        })
        .map(new Func1<ComponentInner, Component>() {
            @Override
            public Component call(ComponentInner inner) {
                return new ComponentImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<Component> getAsync(String resourceGroupName, String resourceNamespace, String resourceType, String resourceName, UUID componentId) {
        ComponentsInner client = this.inner();
        return client.getAsync(resourceGroupName, resourceNamespace, resourceType, resourceName, componentId)
        .map(new Func1<ComponentInner, Component>() {
            @Override
            public Component call(ComponentInner inner) {
                return new ComponentImpl(inner, manager());
            }
        });
    }

}