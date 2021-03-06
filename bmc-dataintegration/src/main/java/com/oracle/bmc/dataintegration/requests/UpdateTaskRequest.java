/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.requests;

import com.oracle.bmc.dataintegration.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class UpdateTaskRequest extends com.oracle.bmc.requests.BmcRequest<UpdateTaskDetails> {

    /**
     * DIS workspace id
     */
    private String workspaceId;

    /**
     * DIS Task key
     */
    private String taskKey;

    /**
     * The details needed to update a task.
     */
    private UpdateTaskDetails updateTaskDetails;

    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Update and Delete operations should accept an optional If-Match header,
     * in which clients can send a previously-received ETag. When If-Match is
     * provided and its value does not exactly match the ETag of the resource
     * on the server, the request should fail with HTTP response status code 412
     *
     */
    private String ifMatch;

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public UpdateTaskDetails getBody$() {
        return updateTaskDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateTaskRequest, UpdateTaskDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateTaskRequest o) {
            workspaceId(o.getWorkspaceId());
            taskKey(o.getTaskKey());
            updateTaskDetails(o.getUpdateTaskDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateTaskRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateTaskRequest
         */
        public UpdateTaskRequest build() {
            UpdateTaskRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(UpdateTaskDetails body) {
            updateTaskDetails(body);
            return this;
        }
    }
}
