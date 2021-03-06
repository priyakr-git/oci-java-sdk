/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                ChangeLogAnalyticsObjectCollectionRuleCompartmentDetails> {

    /**
     * The Log Analytics namespace used for the request.
     *
     */
    private String namespaceName;

    /**
     * The log analytics os collection rule [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
     */
    private String logAnalyticsObjectCollectionRuleId;

    /**
     * Log Analytics Object Storage based collection rule compartment to be updated to.
     */
    private ChangeLogAnalyticsObjectCollectionRuleCompartmentDetails
            changeLogAnalyticsObjectCollectionRuleCompartmentDetails;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the `if-match` parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public ChangeLogAnalyticsObjectCollectionRuleCompartmentDetails getBody$() {
        return changeLogAnalyticsObjectCollectionRuleCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest,
                    ChangeLogAnalyticsObjectCollectionRuleCompartmentDetails> {
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
        public Builder copy(ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest o) {
            namespaceName(o.getNamespaceName());
            logAnalyticsObjectCollectionRuleId(o.getLogAnalyticsObjectCollectionRuleId());
            changeLogAnalyticsObjectCollectionRuleCompartmentDetails(
                    o.getChangeLogAnalyticsObjectCollectionRuleCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest
         */
        public ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest build() {
            ChangeLogAnalyticsObjectCollectionRuleCompartmentRequest request =
                    buildWithoutInvocationCallback();
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
        public Builder body$(ChangeLogAnalyticsObjectCollectionRuleCompartmentDetails body) {
            changeLogAnalyticsObjectCollectionRuleCompartmentDetails(body);
            return this;
        }
    }
}
