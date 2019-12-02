/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/ListInfrastructureConfigurations"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInfrastructureConfigurationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     */
    private String requestId;
    /**
     * <p>
     * The list of infrastructure configurations.
     * </p>
     */
    private java.util.List<InfrastructureConfigurationSummary> infrastructureConfigurationSummaryList;
    /**
     * <p>
     * The next token used for paginated responses. When this is not empty then there are additional elements that the
     * service that not include in this request. Use this token with the next request to retrieve additional object.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @param requestId
     *        The request ID that uniquely identifies this request.
     */

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @return The request ID that uniquely identifies this request.
     */

    public String getRequestId() {
        return this.requestId;
    }

    /**
     * <p>
     * The request ID that uniquely identifies this request.
     * </p>
     * 
     * @param requestId
     *        The request ID that uniquely identifies this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInfrastructureConfigurationsResult withRequestId(String requestId) {
        setRequestId(requestId);
        return this;
    }

    /**
     * <p>
     * The list of infrastructure configurations.
     * </p>
     * 
     * @return The list of infrastructure configurations.
     */

    public java.util.List<InfrastructureConfigurationSummary> getInfrastructureConfigurationSummaryList() {
        return infrastructureConfigurationSummaryList;
    }

    /**
     * <p>
     * The list of infrastructure configurations.
     * </p>
     * 
     * @param infrastructureConfigurationSummaryList
     *        The list of infrastructure configurations.
     */

    public void setInfrastructureConfigurationSummaryList(java.util.Collection<InfrastructureConfigurationSummary> infrastructureConfigurationSummaryList) {
        if (infrastructureConfigurationSummaryList == null) {
            this.infrastructureConfigurationSummaryList = null;
            return;
        }

        this.infrastructureConfigurationSummaryList = new java.util.ArrayList<InfrastructureConfigurationSummary>(infrastructureConfigurationSummaryList);
    }

    /**
     * <p>
     * The list of infrastructure configurations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInfrastructureConfigurationSummaryList(java.util.Collection)} or
     * {@link #withInfrastructureConfigurationSummaryList(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param infrastructureConfigurationSummaryList
     *        The list of infrastructure configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInfrastructureConfigurationsResult withInfrastructureConfigurationSummaryList(
            InfrastructureConfigurationSummary... infrastructureConfigurationSummaryList) {
        if (this.infrastructureConfigurationSummaryList == null) {
            setInfrastructureConfigurationSummaryList(new java.util.ArrayList<InfrastructureConfigurationSummary>(infrastructureConfigurationSummaryList.length));
        }
        for (InfrastructureConfigurationSummary ele : infrastructureConfigurationSummaryList) {
            this.infrastructureConfigurationSummaryList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of infrastructure configurations.
     * </p>
     * 
     * @param infrastructureConfigurationSummaryList
     *        The list of infrastructure configurations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInfrastructureConfigurationsResult withInfrastructureConfigurationSummaryList(
            java.util.Collection<InfrastructureConfigurationSummary> infrastructureConfigurationSummaryList) {
        setInfrastructureConfigurationSummaryList(infrastructureConfigurationSummaryList);
        return this;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this is not empty then there are additional elements that the
     * service that not include in this request. Use this token with the next request to retrieve additional object.
     * </p>
     * 
     * @param nextToken
     *        The next token used for paginated responses. When this is not empty then there are additional elements
     *        that the service that not include in this request. Use this token with the next request to retrieve
     *        additional object.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this is not empty then there are additional elements that the
     * service that not include in this request. Use this token with the next request to retrieve additional object.
     * </p>
     * 
     * @return The next token used for paginated responses. When this is not empty then there are additional elements
     *         that the service that not include in this request. Use this token with the next request to retrieve
     *         additional object.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The next token used for paginated responses. When this is not empty then there are additional elements that the
     * service that not include in this request. Use this token with the next request to retrieve additional object.
     * </p>
     * 
     * @param nextToken
     *        The next token used for paginated responses. When this is not empty then there are additional elements
     *        that the service that not include in this request. Use this token with the next request to retrieve
     *        additional object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInfrastructureConfigurationsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRequestId() != null)
            sb.append("RequestId: ").append(getRequestId()).append(",");
        if (getInfrastructureConfigurationSummaryList() != null)
            sb.append("InfrastructureConfigurationSummaryList: ").append(getInfrastructureConfigurationSummaryList()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInfrastructureConfigurationsResult == false)
            return false;
        ListInfrastructureConfigurationsResult other = (ListInfrastructureConfigurationsResult) obj;
        if (other.getRequestId() == null ^ this.getRequestId() == null)
            return false;
        if (other.getRequestId() != null && other.getRequestId().equals(this.getRequestId()) == false)
            return false;
        if (other.getInfrastructureConfigurationSummaryList() == null ^ this.getInfrastructureConfigurationSummaryList() == null)
            return false;
        if (other.getInfrastructureConfigurationSummaryList() != null
                && other.getInfrastructureConfigurationSummaryList().equals(this.getInfrastructureConfigurationSummaryList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRequestId() == null) ? 0 : getRequestId().hashCode());
        hashCode = prime * hashCode + ((getInfrastructureConfigurationSummaryList() == null) ? 0 : getInfrastructureConfigurationSummaryList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListInfrastructureConfigurationsResult clone() {
        try {
            return (ListInfrastructureConfigurationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
