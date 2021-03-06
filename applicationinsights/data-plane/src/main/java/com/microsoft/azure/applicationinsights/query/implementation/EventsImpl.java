/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.applicationinsights.query.implementation;

import retrofit2.Retrofit;
import com.microsoft.azure.applicationinsights.query.Events;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.applicationinsights.query.models.ErrorResponseException;
import com.microsoft.azure.applicationinsights.query.models.EventsResults;
import com.microsoft.azure.applicationinsights.query.models.EventType;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Events.
 */
public class EventsImpl implements Events {
    /** The Retrofit service to perform REST calls. */
    private EventsService service;
    /** The service client containing this operation class. */
    private ApplicationInsightsDataClientImpl client;

    /**
     * Initializes an instance of EventsImpl.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public EventsImpl(Retrofit retrofit, ApplicationInsightsDataClientImpl client) {
        this.service = retrofit.create(EventsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Events to be
     * used by Retrofit to perform actually REST calls.
     */
    interface EventsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.applicationinsights.query.Events getByType" })
        @GET("apps/{appId}/events/{eventType}")
        Observable<Response<ResponseBody>> getByType(@Path("appId") String appId, @Path("eventType") EventType eventType1, @Query("timespan") String timespan, @Query("$filter") String filter1, @Query("$search") String search, @Query("$orderby") String orderby1, @Query("$select") String select, @Query("$skip") Integer skip, @Query("$top") Integer top1, @Query("$format") String format, @Query("$count") Boolean count, @Query("$apply") String apply, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.applicationinsights.query.Events get" })
        @GET("apps/{appId}/events/{eventType}/{eventId}")
        Observable<Response<ResponseBody>> get(@Path("appId") String appId, @Path("eventType") EventType eventType1, @Path("eventId") String eventId, @Query("timespan") String timespan, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Execute OData query.
     * Executes an OData query for events.
     *
     * @param appId ID of the application. This is Application ID from the API Access settings blade in the Azure portal.
     * @param eventType The type of events to query; either a standard event type (`traces`, `customEvents`, `pageViews`, `requests`, `dependencies`, `exceptions`, `availabilityResults`) or `$all` to query across all event types. Possible values include: '$all', 'traces', 'customEvents', 'pageViews', 'browserTimings', 'requests', 'dependencies', 'exceptions', 'availabilityResults', 'performanceCounters', 'customMetrics'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EventsResults object if successful.
     */
    public EventsResults getByType(String appId, EventType eventType) {
        return getByTypeWithServiceResponseAsync(appId, eventType).toBlocking().single().body();
    }

    /**
     * Execute OData query.
     * Executes an OData query for events.
     *
     * @param appId ID of the application. This is Application ID from the API Access settings blade in the Azure portal.
     * @param eventType The type of events to query; either a standard event type (`traces`, `customEvents`, `pageViews`, `requests`, `dependencies`, `exceptions`, `availabilityResults`) or `$all` to query across all event types. Possible values include: '$all', 'traces', 'customEvents', 'pageViews', 'browserTimings', 'requests', 'dependencies', 'exceptions', 'availabilityResults', 'performanceCounters', 'customMetrics'
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<EventsResults> getByTypeAsync(String appId, EventType eventType, final ServiceCallback<EventsResults> serviceCallback) {
        return ServiceFuture.fromResponse(getByTypeWithServiceResponseAsync(appId, eventType), serviceCallback);
    }

    /**
     * Execute OData query.
     * Executes an OData query for events.
     *
     * @param appId ID of the application. This is Application ID from the API Access settings blade in the Azure portal.
     * @param eventType The type of events to query; either a standard event type (`traces`, `customEvents`, `pageViews`, `requests`, `dependencies`, `exceptions`, `availabilityResults`) or `$all` to query across all event types. Possible values include: '$all', 'traces', 'customEvents', 'pageViews', 'browserTimings', 'requests', 'dependencies', 'exceptions', 'availabilityResults', 'performanceCounters', 'customMetrics'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventsResults object
     */
    public Observable<EventsResults> getByTypeAsync(String appId, EventType eventType) {
        return getByTypeWithServiceResponseAsync(appId, eventType).map(new Func1<ServiceResponse<EventsResults>, EventsResults>() {
            @Override
            public EventsResults call(ServiceResponse<EventsResults> response) {
                return response.body();
            }
        });
    }

    /**
     * Execute OData query.
     * Executes an OData query for events.
     *
     * @param appId ID of the application. This is Application ID from the API Access settings blade in the Azure portal.
     * @param eventType The type of events to query; either a standard event type (`traces`, `customEvents`, `pageViews`, `requests`, `dependencies`, `exceptions`, `availabilityResults`) or `$all` to query across all event types. Possible values include: '$all', 'traces', 'customEvents', 'pageViews', 'browserTimings', 'requests', 'dependencies', 'exceptions', 'availabilityResults', 'performanceCounters', 'customMetrics'
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventsResults object
     */
    public Observable<ServiceResponse<EventsResults>> getByTypeWithServiceResponseAsync(String appId, EventType eventType) {
        if (appId == null) {
            throw new IllegalArgumentException("Parameter appId is required and cannot be null.");
        }
        if (eventType == null) {
            throw new IllegalArgumentException("Parameter eventType is required and cannot be null.");
        }
        final String timespan = null;
        final String filter = null;
        final String search = null;
        final String orderby = null;
        final String select = null;
        final Integer skip = null;
        final Integer top = null;
        final String format = null;
        final Boolean count = null;
        final String apply = null;
        return service.getByType(appId, eventType, timespan, filter, search, orderby, select, skip, top, format, count, apply, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<EventsResults>>>() {
                @Override
                public Observable<ServiceResponse<EventsResults>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<EventsResults> clientResponse = getByTypeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Execute OData query.
     * Executes an OData query for events.
     *
     * @param appId ID of the application. This is Application ID from the API Access settings blade in the Azure portal.
     * @param eventType The type of events to query; either a standard event type (`traces`, `customEvents`, `pageViews`, `requests`, `dependencies`, `exceptions`, `availabilityResults`) or `$all` to query across all event types. Possible values include: '$all', 'traces', 'customEvents', 'pageViews', 'browserTimings', 'requests', 'dependencies', 'exceptions', 'availabilityResults', 'performanceCounters', 'customMetrics'
     * @param timespan Optional. The timespan over which to retrieve events. This is an ISO8601 time period value.  This timespan is applied in addition to any that are specified in the Odata expression.
     * @param filter An expression used to filter the returned events
     * @param search A free-text search expression to match for whether a particular event should be returned
     * @param orderby A comma-separated list of properties with \"asc\" (the default) or \"desc\" to control the order of returned events
     * @param select Limits the properties to just those requested on each returned event
     * @param skip The number of items to skip over before returning events
     * @param top The number of events to return
     * @param format Format for the returned events
     * @param count Request a count of matching items included with the returned events
     * @param apply An expression used for aggregation over returned events
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EventsResults object if successful.
     */
    public EventsResults getByType(String appId, EventType eventType, String timespan, String filter, String search, String orderby, String select, Integer skip, Integer top, String format, Boolean count, String apply) {
        return getByTypeWithServiceResponseAsync(appId, eventType, timespan, filter, search, orderby, select, skip, top, format, count, apply).toBlocking().single().body();
    }

    /**
     * Execute OData query.
     * Executes an OData query for events.
     *
     * @param appId ID of the application. This is Application ID from the API Access settings blade in the Azure portal.
     * @param eventType The type of events to query; either a standard event type (`traces`, `customEvents`, `pageViews`, `requests`, `dependencies`, `exceptions`, `availabilityResults`) or `$all` to query across all event types. Possible values include: '$all', 'traces', 'customEvents', 'pageViews', 'browserTimings', 'requests', 'dependencies', 'exceptions', 'availabilityResults', 'performanceCounters', 'customMetrics'
     * @param timespan Optional. The timespan over which to retrieve events. This is an ISO8601 time period value.  This timespan is applied in addition to any that are specified in the Odata expression.
     * @param filter An expression used to filter the returned events
     * @param search A free-text search expression to match for whether a particular event should be returned
     * @param orderby A comma-separated list of properties with \"asc\" (the default) or \"desc\" to control the order of returned events
     * @param select Limits the properties to just those requested on each returned event
     * @param skip The number of items to skip over before returning events
     * @param top The number of events to return
     * @param format Format for the returned events
     * @param count Request a count of matching items included with the returned events
     * @param apply An expression used for aggregation over returned events
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<EventsResults> getByTypeAsync(String appId, EventType eventType, String timespan, String filter, String search, String orderby, String select, Integer skip, Integer top, String format, Boolean count, String apply, final ServiceCallback<EventsResults> serviceCallback) {
        return ServiceFuture.fromResponse(getByTypeWithServiceResponseAsync(appId, eventType, timespan, filter, search, orderby, select, skip, top, format, count, apply), serviceCallback);
    }

    /**
     * Execute OData query.
     * Executes an OData query for events.
     *
     * @param appId ID of the application. This is Application ID from the API Access settings blade in the Azure portal.
     * @param eventType The type of events to query; either a standard event type (`traces`, `customEvents`, `pageViews`, `requests`, `dependencies`, `exceptions`, `availabilityResults`) or `$all` to query across all event types. Possible values include: '$all', 'traces', 'customEvents', 'pageViews', 'browserTimings', 'requests', 'dependencies', 'exceptions', 'availabilityResults', 'performanceCounters', 'customMetrics'
     * @param timespan Optional. The timespan over which to retrieve events. This is an ISO8601 time period value.  This timespan is applied in addition to any that are specified in the Odata expression.
     * @param filter An expression used to filter the returned events
     * @param search A free-text search expression to match for whether a particular event should be returned
     * @param orderby A comma-separated list of properties with \"asc\" (the default) or \"desc\" to control the order of returned events
     * @param select Limits the properties to just those requested on each returned event
     * @param skip The number of items to skip over before returning events
     * @param top The number of events to return
     * @param format Format for the returned events
     * @param count Request a count of matching items included with the returned events
     * @param apply An expression used for aggregation over returned events
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventsResults object
     */
    public Observable<EventsResults> getByTypeAsync(String appId, EventType eventType, String timespan, String filter, String search, String orderby, String select, Integer skip, Integer top, String format, Boolean count, String apply) {
        return getByTypeWithServiceResponseAsync(appId, eventType, timespan, filter, search, orderby, select, skip, top, format, count, apply).map(new Func1<ServiceResponse<EventsResults>, EventsResults>() {
            @Override
            public EventsResults call(ServiceResponse<EventsResults> response) {
                return response.body();
            }
        });
    }

    /**
     * Execute OData query.
     * Executes an OData query for events.
     *
     * @param appId ID of the application. This is Application ID from the API Access settings blade in the Azure portal.
     * @param eventType The type of events to query; either a standard event type (`traces`, `customEvents`, `pageViews`, `requests`, `dependencies`, `exceptions`, `availabilityResults`) or `$all` to query across all event types. Possible values include: '$all', 'traces', 'customEvents', 'pageViews', 'browserTimings', 'requests', 'dependencies', 'exceptions', 'availabilityResults', 'performanceCounters', 'customMetrics'
     * @param timespan Optional. The timespan over which to retrieve events. This is an ISO8601 time period value.  This timespan is applied in addition to any that are specified in the Odata expression.
     * @param filter An expression used to filter the returned events
     * @param search A free-text search expression to match for whether a particular event should be returned
     * @param orderby A comma-separated list of properties with \"asc\" (the default) or \"desc\" to control the order of returned events
     * @param select Limits the properties to just those requested on each returned event
     * @param skip The number of items to skip over before returning events
     * @param top The number of events to return
     * @param format Format for the returned events
     * @param count Request a count of matching items included with the returned events
     * @param apply An expression used for aggregation over returned events
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventsResults object
     */
    public Observable<ServiceResponse<EventsResults>> getByTypeWithServiceResponseAsync(String appId, EventType eventType, String timespan, String filter, String search, String orderby, String select, Integer skip, Integer top, String format, Boolean count, String apply) {
        if (appId == null) {
            throw new IllegalArgumentException("Parameter appId is required and cannot be null.");
        }
        if (eventType == null) {
            throw new IllegalArgumentException("Parameter eventType is required and cannot be null.");
        }
        return service.getByType(appId, eventType, timespan, filter, search, orderby, select, skip, top, format, count, apply, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<EventsResults>>>() {
                @Override
                public Observable<ServiceResponse<EventsResults>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<EventsResults> clientResponse = getByTypeDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<EventsResults> getByTypeDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<EventsResults, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<EventsResults>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Get an event.
     * Gets the data for a single event.
     *
     * @param appId ID of the application. This is Application ID from the API Access settings blade in the Azure portal.
     * @param eventType The type of events to query; either a standard event type (`traces`, `customEvents`, `pageViews`, `requests`, `dependencies`, `exceptions`, `availabilityResults`) or `$all` to query across all event types. Possible values include: '$all', 'traces', 'customEvents', 'pageViews', 'browserTimings', 'requests', 'dependencies', 'exceptions', 'availabilityResults', 'performanceCounters', 'customMetrics'
     * @param eventId ID of event.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EventsResults object if successful.
     */
    public EventsResults get(String appId, EventType eventType, String eventId) {
        return getWithServiceResponseAsync(appId, eventType, eventId).toBlocking().single().body();
    }

    /**
     * Get an event.
     * Gets the data for a single event.
     *
     * @param appId ID of the application. This is Application ID from the API Access settings blade in the Azure portal.
     * @param eventType The type of events to query; either a standard event type (`traces`, `customEvents`, `pageViews`, `requests`, `dependencies`, `exceptions`, `availabilityResults`) or `$all` to query across all event types. Possible values include: '$all', 'traces', 'customEvents', 'pageViews', 'browserTimings', 'requests', 'dependencies', 'exceptions', 'availabilityResults', 'performanceCounters', 'customMetrics'
     * @param eventId ID of event.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<EventsResults> getAsync(String appId, EventType eventType, String eventId, final ServiceCallback<EventsResults> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(appId, eventType, eventId), serviceCallback);
    }

    /**
     * Get an event.
     * Gets the data for a single event.
     *
     * @param appId ID of the application. This is Application ID from the API Access settings blade in the Azure portal.
     * @param eventType The type of events to query; either a standard event type (`traces`, `customEvents`, `pageViews`, `requests`, `dependencies`, `exceptions`, `availabilityResults`) or `$all` to query across all event types. Possible values include: '$all', 'traces', 'customEvents', 'pageViews', 'browserTimings', 'requests', 'dependencies', 'exceptions', 'availabilityResults', 'performanceCounters', 'customMetrics'
     * @param eventId ID of event.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventsResults object
     */
    public Observable<EventsResults> getAsync(String appId, EventType eventType, String eventId) {
        return getWithServiceResponseAsync(appId, eventType, eventId).map(new Func1<ServiceResponse<EventsResults>, EventsResults>() {
            @Override
            public EventsResults call(ServiceResponse<EventsResults> response) {
                return response.body();
            }
        });
    }

    /**
     * Get an event.
     * Gets the data for a single event.
     *
     * @param appId ID of the application. This is Application ID from the API Access settings blade in the Azure portal.
     * @param eventType The type of events to query; either a standard event type (`traces`, `customEvents`, `pageViews`, `requests`, `dependencies`, `exceptions`, `availabilityResults`) or `$all` to query across all event types. Possible values include: '$all', 'traces', 'customEvents', 'pageViews', 'browserTimings', 'requests', 'dependencies', 'exceptions', 'availabilityResults', 'performanceCounters', 'customMetrics'
     * @param eventId ID of event.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventsResults object
     */
    public Observable<ServiceResponse<EventsResults>> getWithServiceResponseAsync(String appId, EventType eventType, String eventId) {
        if (appId == null) {
            throw new IllegalArgumentException("Parameter appId is required and cannot be null.");
        }
        if (eventType == null) {
            throw new IllegalArgumentException("Parameter eventType is required and cannot be null.");
        }
        if (eventId == null) {
            throw new IllegalArgumentException("Parameter eventId is required and cannot be null.");
        }
        final String timespan = null;
        return service.get(appId, eventType, eventId, timespan, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<EventsResults>>>() {
                @Override
                public Observable<ServiceResponse<EventsResults>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<EventsResults> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    /**
     * Get an event.
     * Gets the data for a single event.
     *
     * @param appId ID of the application. This is Application ID from the API Access settings blade in the Azure portal.
     * @param eventType The type of events to query; either a standard event type (`traces`, `customEvents`, `pageViews`, `requests`, `dependencies`, `exceptions`, `availabilityResults`) or `$all` to query across all event types. Possible values include: '$all', 'traces', 'customEvents', 'pageViews', 'browserTimings', 'requests', 'dependencies', 'exceptions', 'availabilityResults', 'performanceCounters', 'customMetrics'
     * @param eventId ID of event.
     * @param timespan Optional. The timespan over which to retrieve events. This is an ISO8601 time period value.  This timespan is applied in addition to any that are specified in the Odata expression.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the EventsResults object if successful.
     */
    public EventsResults get(String appId, EventType eventType, String eventId, String timespan) {
        return getWithServiceResponseAsync(appId, eventType, eventId, timespan).toBlocking().single().body();
    }

    /**
     * Get an event.
     * Gets the data for a single event.
     *
     * @param appId ID of the application. This is Application ID from the API Access settings blade in the Azure portal.
     * @param eventType The type of events to query; either a standard event type (`traces`, `customEvents`, `pageViews`, `requests`, `dependencies`, `exceptions`, `availabilityResults`) or `$all` to query across all event types. Possible values include: '$all', 'traces', 'customEvents', 'pageViews', 'browserTimings', 'requests', 'dependencies', 'exceptions', 'availabilityResults', 'performanceCounters', 'customMetrics'
     * @param eventId ID of event.
     * @param timespan Optional. The timespan over which to retrieve events. This is an ISO8601 time period value.  This timespan is applied in addition to any that are specified in the Odata expression.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<EventsResults> getAsync(String appId, EventType eventType, String eventId, String timespan, final ServiceCallback<EventsResults> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(appId, eventType, eventId, timespan), serviceCallback);
    }

    /**
     * Get an event.
     * Gets the data for a single event.
     *
     * @param appId ID of the application. This is Application ID from the API Access settings blade in the Azure portal.
     * @param eventType The type of events to query; either a standard event type (`traces`, `customEvents`, `pageViews`, `requests`, `dependencies`, `exceptions`, `availabilityResults`) or `$all` to query across all event types. Possible values include: '$all', 'traces', 'customEvents', 'pageViews', 'browserTimings', 'requests', 'dependencies', 'exceptions', 'availabilityResults', 'performanceCounters', 'customMetrics'
     * @param eventId ID of event.
     * @param timespan Optional. The timespan over which to retrieve events. This is an ISO8601 time period value.  This timespan is applied in addition to any that are specified in the Odata expression.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventsResults object
     */
    public Observable<EventsResults> getAsync(String appId, EventType eventType, String eventId, String timespan) {
        return getWithServiceResponseAsync(appId, eventType, eventId, timespan).map(new Func1<ServiceResponse<EventsResults>, EventsResults>() {
            @Override
            public EventsResults call(ServiceResponse<EventsResults> response) {
                return response.body();
            }
        });
    }

    /**
     * Get an event.
     * Gets the data for a single event.
     *
     * @param appId ID of the application. This is Application ID from the API Access settings blade in the Azure portal.
     * @param eventType The type of events to query; either a standard event type (`traces`, `customEvents`, `pageViews`, `requests`, `dependencies`, `exceptions`, `availabilityResults`) or `$all` to query across all event types. Possible values include: '$all', 'traces', 'customEvents', 'pageViews', 'browserTimings', 'requests', 'dependencies', 'exceptions', 'availabilityResults', 'performanceCounters', 'customMetrics'
     * @param eventId ID of event.
     * @param timespan Optional. The timespan over which to retrieve events. This is an ISO8601 time period value.  This timespan is applied in addition to any that are specified in the Odata expression.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the EventsResults object
     */
    public Observable<ServiceResponse<EventsResults>> getWithServiceResponseAsync(String appId, EventType eventType, String eventId, String timespan) {
        if (appId == null) {
            throw new IllegalArgumentException("Parameter appId is required and cannot be null.");
        }
        if (eventType == null) {
            throw new IllegalArgumentException("Parameter eventType is required and cannot be null.");
        }
        if (eventId == null) {
            throw new IllegalArgumentException("Parameter eventId is required and cannot be null.");
        }
        return service.get(appId, eventType, eventId, timespan, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<EventsResults>>>() {
                @Override
                public Observable<ServiceResponse<EventsResults>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<EventsResults> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<EventsResults> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<EventsResults, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<EventsResults>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
