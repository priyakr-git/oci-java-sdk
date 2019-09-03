/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core;

import com.oracle.bmc.core.requests.*;
import com.oracle.bmc.core.responses.*;

/**
 * Collection of helper methods that can be used to provide an {@link java.lang.Iterable} interface
 * to any list operations of ComputeManagement where multiple pages of data may be fetched.
 * Two styles of iteration are supported:
 *
 * <ul>
 *   <li>Iterating over the Response objects returned by the list operation. These are referred to as ResponseIterators, and the methods are suffixed with ResponseIterator. For example: <i>listUsersResponseIterator</i></li>
 *   <li>Iterating over the resources/records being listed. These are referred to as RecordIterators, and the methods are suffixed with RecordIterator. For example: <i>listUsersRecordIterator</i></li>
 * </ul>
 *
 * These iterables abstract away the need to write code to manually handle pagination via looping and using the page tokens.
 * They will automatically fetch more data from the service when required.
 *
 * As an example, if we were using the ListUsers operation in IdentityService, then the {@link java.lang.Iterable} returned by calling a
 * ResponseIterator method would iterate over the ListUsersResponse objects returned by each ListUsers call, whereas the {@link java.lang.Iterable}
 * returned by calling a RecordIterator method would iterate over the User records and we don't have to deal with ListUsersResponse objects at all.
 * In either case, pagination will be automatically handled so we can iterate until there are no more responses or no more resources/records available.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.RequiredArgsConstructor
public class ComputeManagementPaginators {
    private final ComputeManagement client;

    /**
     * Creates a new iterable which will iterate over the responses received from the listClusterNetworkInstances operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListClusterNetworkInstancesResponse>
            listClusterNetworkInstancesResponseIterator(
                    final ListClusterNetworkInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListClusterNetworkInstancesRequest.Builder, ListClusterNetworkInstancesRequest,
                ListClusterNetworkInstancesResponse>(
                new com.google.common.base.Supplier<ListClusterNetworkInstancesRequest.Builder>() {
                    @Override
                    public ListClusterNetworkInstancesRequest.Builder get() {
                        return ListClusterNetworkInstancesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListClusterNetworkInstancesResponse, String>() {
                    @Override
                    public String apply(ListClusterNetworkInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListClusterNetworkInstancesRequest.Builder>,
                        ListClusterNetworkInstancesRequest>() {
                    @Override
                    public ListClusterNetworkInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListClusterNetworkInstancesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListClusterNetworkInstancesRequest, ListClusterNetworkInstancesResponse>() {
                    @Override
                    public ListClusterNetworkInstancesResponse apply(
                            ListClusterNetworkInstancesRequest request) {
                        return client.listClusterNetworkInstances(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.InstanceSummary} objects
     * contained in responses from the listClusterNetworkInstances operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.InstanceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.InstanceSummary>
            listClusterNetworkInstancesRecordIterator(
                    final ListClusterNetworkInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListClusterNetworkInstancesRequest.Builder, ListClusterNetworkInstancesRequest,
                ListClusterNetworkInstancesResponse, com.oracle.bmc.core.model.InstanceSummary>(
                new com.google.common.base.Supplier<ListClusterNetworkInstancesRequest.Builder>() {
                    @Override
                    public ListClusterNetworkInstancesRequest.Builder get() {
                        return ListClusterNetworkInstancesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListClusterNetworkInstancesResponse, String>() {
                    @Override
                    public String apply(ListClusterNetworkInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListClusterNetworkInstancesRequest.Builder>,
                        ListClusterNetworkInstancesRequest>() {
                    @Override
                    public ListClusterNetworkInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListClusterNetworkInstancesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListClusterNetworkInstancesRequest, ListClusterNetworkInstancesResponse>() {
                    @Override
                    public ListClusterNetworkInstancesResponse apply(
                            ListClusterNetworkInstancesRequest request) {
                        return client.listClusterNetworkInstances(request);
                    }
                },
                new com.google.common.base.Function<
                        ListClusterNetworkInstancesResponse,
                        java.util.List<com.oracle.bmc.core.model.InstanceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.InstanceSummary> apply(
                            ListClusterNetworkInstancesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listClusterNetworks operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListClusterNetworksResponse> listClusterNetworksResponseIterator(
            final ListClusterNetworksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListClusterNetworksRequest.Builder, ListClusterNetworksRequest,
                ListClusterNetworksResponse>(
                new com.google.common.base.Supplier<ListClusterNetworksRequest.Builder>() {
                    @Override
                    public ListClusterNetworksRequest.Builder get() {
                        return ListClusterNetworksRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListClusterNetworksResponse, String>() {
                    @Override
                    public String apply(ListClusterNetworksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListClusterNetworksRequest.Builder>,
                        ListClusterNetworksRequest>() {
                    @Override
                    public ListClusterNetworksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListClusterNetworksRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListClusterNetworksRequest, ListClusterNetworksResponse>() {
                    @Override
                    public ListClusterNetworksResponse apply(ListClusterNetworksRequest request) {
                        return client.listClusterNetworks(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.ClusterNetworkSummary} objects
     * contained in responses from the listClusterNetworks operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.ClusterNetworkSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.ClusterNetworkSummary>
            listClusterNetworksRecordIterator(final ListClusterNetworksRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListClusterNetworksRequest.Builder, ListClusterNetworksRequest,
                ListClusterNetworksResponse, com.oracle.bmc.core.model.ClusterNetworkSummary>(
                new com.google.common.base.Supplier<ListClusterNetworksRequest.Builder>() {
                    @Override
                    public ListClusterNetworksRequest.Builder get() {
                        return ListClusterNetworksRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListClusterNetworksResponse, String>() {
                    @Override
                    public String apply(ListClusterNetworksResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListClusterNetworksRequest.Builder>,
                        ListClusterNetworksRequest>() {
                    @Override
                    public ListClusterNetworksRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListClusterNetworksRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListClusterNetworksRequest, ListClusterNetworksResponse>() {
                    @Override
                    public ListClusterNetworksResponse apply(ListClusterNetworksRequest request) {
                        return client.listClusterNetworks(request);
                    }
                },
                new com.google.common.base.Function<
                        ListClusterNetworksResponse,
                        java.util.List<com.oracle.bmc.core.model.ClusterNetworkSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.ClusterNetworkSummary> apply(
                            ListClusterNetworksResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listInstanceConfigurations operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListInstanceConfigurationsResponse> listInstanceConfigurationsResponseIterator(
            final ListInstanceConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInstanceConfigurationsRequest.Builder, ListInstanceConfigurationsRequest,
                ListInstanceConfigurationsResponse>(
                new com.google.common.base.Supplier<ListInstanceConfigurationsRequest.Builder>() {
                    @Override
                    public ListInstanceConfigurationsRequest.Builder get() {
                        return ListInstanceConfigurationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListInstanceConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListInstanceConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstanceConfigurationsRequest.Builder>,
                        ListInstanceConfigurationsRequest>() {
                    @Override
                    public ListInstanceConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstanceConfigurationsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListInstanceConfigurationsRequest, ListInstanceConfigurationsResponse>() {
                    @Override
                    public ListInstanceConfigurationsResponse apply(
                            ListInstanceConfigurationsRequest request) {
                        return client.listInstanceConfigurations(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.InstanceConfigurationSummary} objects
     * contained in responses from the listInstanceConfigurations operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.InstanceConfigurationSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.InstanceConfigurationSummary>
            listInstanceConfigurationsRecordIterator(
                    final ListInstanceConfigurationsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInstanceConfigurationsRequest.Builder, ListInstanceConfigurationsRequest,
                ListInstanceConfigurationsResponse,
                com.oracle.bmc.core.model.InstanceConfigurationSummary>(
                new com.google.common.base.Supplier<ListInstanceConfigurationsRequest.Builder>() {
                    @Override
                    public ListInstanceConfigurationsRequest.Builder get() {
                        return ListInstanceConfigurationsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListInstanceConfigurationsResponse, String>() {
                    @Override
                    public String apply(ListInstanceConfigurationsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstanceConfigurationsRequest.Builder>,
                        ListInstanceConfigurationsRequest>() {
                    @Override
                    public ListInstanceConfigurationsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstanceConfigurationsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListInstanceConfigurationsRequest, ListInstanceConfigurationsResponse>() {
                    @Override
                    public ListInstanceConfigurationsResponse apply(
                            ListInstanceConfigurationsRequest request) {
                        return client.listInstanceConfigurations(request);
                    }
                },
                new com.google.common.base.Function<
                        ListInstanceConfigurationsResponse,
                        java.util.List<com.oracle.bmc.core.model.InstanceConfigurationSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.InstanceConfigurationSummary>
                            apply(ListInstanceConfigurationsResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listInstancePoolInstances operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListInstancePoolInstancesResponse> listInstancePoolInstancesResponseIterator(
            final ListInstancePoolInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInstancePoolInstancesRequest.Builder, ListInstancePoolInstancesRequest,
                ListInstancePoolInstancesResponse>(
                new com.google.common.base.Supplier<ListInstancePoolInstancesRequest.Builder>() {
                    @Override
                    public ListInstancePoolInstancesRequest.Builder get() {
                        return ListInstancePoolInstancesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListInstancePoolInstancesResponse, String>() {
                    @Override
                    public String apply(ListInstancePoolInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstancePoolInstancesRequest.Builder>,
                        ListInstancePoolInstancesRequest>() {
                    @Override
                    public ListInstancePoolInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstancePoolInstancesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListInstancePoolInstancesRequest, ListInstancePoolInstancesResponse>() {
                    @Override
                    public ListInstancePoolInstancesResponse apply(
                            ListInstancePoolInstancesRequest request) {
                        return client.listInstancePoolInstances(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.InstanceSummary} objects
     * contained in responses from the listInstancePoolInstances operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.InstanceSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.InstanceSummary>
            listInstancePoolInstancesRecordIterator(
                    final ListInstancePoolInstancesRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInstancePoolInstancesRequest.Builder, ListInstancePoolInstancesRequest,
                ListInstancePoolInstancesResponse, com.oracle.bmc.core.model.InstanceSummary>(
                new com.google.common.base.Supplier<ListInstancePoolInstancesRequest.Builder>() {
                    @Override
                    public ListInstancePoolInstancesRequest.Builder get() {
                        return ListInstancePoolInstancesRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListInstancePoolInstancesResponse, String>() {
                    @Override
                    public String apply(ListInstancePoolInstancesResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstancePoolInstancesRequest.Builder>,
                        ListInstancePoolInstancesRequest>() {
                    @Override
                    public ListInstancePoolInstancesRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstancePoolInstancesRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListInstancePoolInstancesRequest, ListInstancePoolInstancesResponse>() {
                    @Override
                    public ListInstancePoolInstancesResponse apply(
                            ListInstancePoolInstancesRequest request) {
                        return client.listInstancePoolInstances(request);
                    }
                },
                new com.google.common.base.Function<
                        ListInstancePoolInstancesResponse,
                        java.util.List<com.oracle.bmc.core.model.InstanceSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.InstanceSummary> apply(
                            ListInstancePoolInstancesResponse response) {
                        return response.getItems();
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the responses received from the listInstancePools operation. This iterable
     * will fetch more data from the server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the responses received from the service.
     */
    public Iterable<ListInstancePoolsResponse> listInstancePoolsResponseIterator(
            final ListInstancePoolsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseIterable<
                ListInstancePoolsRequest.Builder, ListInstancePoolsRequest,
                ListInstancePoolsResponse>(
                new com.google.common.base.Supplier<ListInstancePoolsRequest.Builder>() {
                    @Override
                    public ListInstancePoolsRequest.Builder get() {
                        return ListInstancePoolsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListInstancePoolsResponse, String>() {
                    @Override
                    public String apply(ListInstancePoolsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstancePoolsRequest.Builder>,
                        ListInstancePoolsRequest>() {
                    @Override
                    public ListInstancePoolsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstancePoolsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListInstancePoolsRequest, ListInstancePoolsResponse>() {
                    @Override
                    public ListInstancePoolsResponse apply(ListInstancePoolsRequest request) {
                        return client.listInstancePools(request);
                    }
                });
    }

    /**
     * Creates a new iterable which will iterate over the {@link com.oracle.bmc.core.model.InstancePoolSummary} objects
     * contained in responses from the listInstancePools operation. This iterable will fetch more data from the
     * server as needed.
     *
     * @param request a request which can be sent to the service operation
     * @return an {@link java.lang.Iterable} which can be used to iterate over the {@link com.oracle.bmc.core.model.InstancePoolSummary} objects
     * contained in responses received from the service.
     */
    public Iterable<com.oracle.bmc.core.model.InstancePoolSummary> listInstancePoolsRecordIterator(
            final ListInstancePoolsRequest request) {
        return new com.oracle.bmc.paginator.internal.ResponseRecordIterable<
                ListInstancePoolsRequest.Builder, ListInstancePoolsRequest,
                ListInstancePoolsResponse, com.oracle.bmc.core.model.InstancePoolSummary>(
                new com.google.common.base.Supplier<ListInstancePoolsRequest.Builder>() {
                    @Override
                    public ListInstancePoolsRequest.Builder get() {
                        return ListInstancePoolsRequest.builder().copy(request);
                    }
                },
                new com.google.common.base.Function<ListInstancePoolsResponse, String>() {
                    @Override
                    public String apply(ListInstancePoolsResponse response) {
                        return response.getOpcNextPage();
                    }
                },
                new com.google.common.base.Function<
                        com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                ListInstancePoolsRequest.Builder>,
                        ListInstancePoolsRequest>() {
                    @Override
                    public ListInstancePoolsRequest apply(
                            com.oracle.bmc.paginator.internal.RequestBuilderAndToken<
                                            ListInstancePoolsRequest.Builder>
                                    input) {
                        if (input.getToken() == null) {
                            return input.getRequestBuilder().build();
                        } else {
                            return input.getRequestBuilder()
                                    .page(input.getToken().orNull())
                                    .build();
                        }
                    }
                },
                new com.google.common.base.Function<
                        ListInstancePoolsRequest, ListInstancePoolsResponse>() {
                    @Override
                    public ListInstancePoolsResponse apply(ListInstancePoolsRequest request) {
                        return client.listInstancePools(request);
                    }
                },
                new com.google.common.base.Function<
                        ListInstancePoolsResponse,
                        java.util.List<com.oracle.bmc.core.model.InstancePoolSummary>>() {
                    @Override
                    public java.util.List<com.oracle.bmc.core.model.InstancePoolSummary> apply(
                            ListInstancePoolsResponse response) {
                        return response.getItems();
                    }
                });
    }
}
