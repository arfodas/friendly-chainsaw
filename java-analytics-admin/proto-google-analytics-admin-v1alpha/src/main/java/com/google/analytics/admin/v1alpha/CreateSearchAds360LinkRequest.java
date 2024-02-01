/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/analytics/admin/v1alpha/analytics_admin.proto

// Protobuf Java Version: 3.25.2
package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Request message for CreateSearchAds360Link RPC.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest}
 */
public final class CreateSearchAds360LinkRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest)
    CreateSearchAds360LinkRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateSearchAds360LinkRequest.newBuilder() to construct.
  private CreateSearchAds360LinkRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateSearchAds360LinkRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateSearchAds360LinkRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_CreateSearchAds360LinkRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_CreateSearchAds360LinkRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest.class,
            com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. Example format: properties/1234
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Example format: properties/1234
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEARCH_ADS_360_LINK_FIELD_NUMBER = 2;
  private com.google.analytics.admin.v1alpha.SearchAds360Link searchAds360Link_;
  /**
   *
   *
   * <pre>
   * Required. The SearchAds360Link to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.SearchAds360Link search_ads_360_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the searchAds360Link field is set.
   */
  @java.lang.Override
  public boolean hasSearchAds360Link() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The SearchAds360Link to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.SearchAds360Link search_ads_360_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The searchAds360Link.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.SearchAds360Link getSearchAds360Link() {
    return searchAds360Link_ == null
        ? com.google.analytics.admin.v1alpha.SearchAds360Link.getDefaultInstance()
        : searchAds360Link_;
  }
  /**
   *
   *
   * <pre>
   * Required. The SearchAds360Link to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.SearchAds360Link search_ads_360_link = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.SearchAds360LinkOrBuilder
      getSearchAds360LinkOrBuilder() {
    return searchAds360Link_ == null
        ? com.google.analytics.admin.v1alpha.SearchAds360Link.getDefaultInstance()
        : searchAds360Link_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getSearchAds360Link());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSearchAds360Link());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest other =
        (com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasSearchAds360Link() != other.hasSearchAds360Link()) return false;
    if (hasSearchAds360Link()) {
      if (!getSearchAds360Link().equals(other.getSearchAds360Link())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasSearchAds360Link()) {
      hash = (37 * hash) + SEARCH_ADS_360_LINK_FIELD_NUMBER;
      hash = (53 * hash) + getSearchAds360Link().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request message for CreateSearchAds360Link RPC.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest)
      com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateSearchAds360LinkRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateSearchAds360LinkRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest.class,
              com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSearchAds360LinkFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      searchAds360Link_ = null;
      if (searchAds360LinkBuilder_ != null) {
        searchAds360LinkBuilder_.dispose();
        searchAds360LinkBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_CreateSearchAds360LinkRequest_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest build() {
      com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest buildPartial() {
      com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest result =
          new com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.searchAds360Link_ =
            searchAds360LinkBuilder_ == null ? searchAds360Link_ : searchAds360LinkBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest) {
        return mergeFrom((com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest other) {
      if (other
          == com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasSearchAds360Link()) {
        mergeSearchAds360Link(other.getSearchAds360Link());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getSearchAds360LinkFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Example format: properties/1234
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.analytics.admin.v1alpha.SearchAds360Link searchAds360Link_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.SearchAds360Link,
            com.google.analytics.admin.v1alpha.SearchAds360Link.Builder,
            com.google.analytics.admin.v1alpha.SearchAds360LinkOrBuilder>
        searchAds360LinkBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The SearchAds360Link to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SearchAds360Link search_ads_360_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the searchAds360Link field is set.
     */
    public boolean hasSearchAds360Link() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The SearchAds360Link to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SearchAds360Link search_ads_360_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The searchAds360Link.
     */
    public com.google.analytics.admin.v1alpha.SearchAds360Link getSearchAds360Link() {
      if (searchAds360LinkBuilder_ == null) {
        return searchAds360Link_ == null
            ? com.google.analytics.admin.v1alpha.SearchAds360Link.getDefaultInstance()
            : searchAds360Link_;
      } else {
        return searchAds360LinkBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The SearchAds360Link to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SearchAds360Link search_ads_360_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSearchAds360Link(com.google.analytics.admin.v1alpha.SearchAds360Link value) {
      if (searchAds360LinkBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        searchAds360Link_ = value;
      } else {
        searchAds360LinkBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The SearchAds360Link to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SearchAds360Link search_ads_360_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setSearchAds360Link(
        com.google.analytics.admin.v1alpha.SearchAds360Link.Builder builderForValue) {
      if (searchAds360LinkBuilder_ == null) {
        searchAds360Link_ = builderForValue.build();
      } else {
        searchAds360LinkBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The SearchAds360Link to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SearchAds360Link search_ads_360_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeSearchAds360Link(
        com.google.analytics.admin.v1alpha.SearchAds360Link value) {
      if (searchAds360LinkBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && searchAds360Link_ != null
            && searchAds360Link_
                != com.google.analytics.admin.v1alpha.SearchAds360Link.getDefaultInstance()) {
          getSearchAds360LinkBuilder().mergeFrom(value);
        } else {
          searchAds360Link_ = value;
        }
      } else {
        searchAds360LinkBuilder_.mergeFrom(value);
      }
      if (searchAds360Link_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The SearchAds360Link to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SearchAds360Link search_ads_360_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearSearchAds360Link() {
      bitField0_ = (bitField0_ & ~0x00000002);
      searchAds360Link_ = null;
      if (searchAds360LinkBuilder_ != null) {
        searchAds360LinkBuilder_.dispose();
        searchAds360LinkBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The SearchAds360Link to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SearchAds360Link search_ads_360_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.SearchAds360Link.Builder
        getSearchAds360LinkBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSearchAds360LinkFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The SearchAds360Link to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SearchAds360Link search_ads_360_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.SearchAds360LinkOrBuilder
        getSearchAds360LinkOrBuilder() {
      if (searchAds360LinkBuilder_ != null) {
        return searchAds360LinkBuilder_.getMessageOrBuilder();
      } else {
        return searchAds360Link_ == null
            ? com.google.analytics.admin.v1alpha.SearchAds360Link.getDefaultInstance()
            : searchAds360Link_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The SearchAds360Link to create.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.SearchAds360Link search_ads_360_link = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.SearchAds360Link,
            com.google.analytics.admin.v1alpha.SearchAds360Link.Builder,
            com.google.analytics.admin.v1alpha.SearchAds360LinkOrBuilder>
        getSearchAds360LinkFieldBuilder() {
      if (searchAds360LinkBuilder_ == null) {
        searchAds360LinkBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.admin.v1alpha.SearchAds360Link,
                com.google.analytics.admin.v1alpha.SearchAds360Link.Builder,
                com.google.analytics.admin.v1alpha.SearchAds360LinkOrBuilder>(
                getSearchAds360Link(), getParentForChildren(), isClean());
        searchAds360Link_ = null;
      }
      return searchAds360LinkBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest)
  private static final com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest();
  }

  public static com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSearchAds360LinkRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateSearchAds360LinkRequest>() {
        @java.lang.Override
        public CreateSearchAds360LinkRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<CreateSearchAds360LinkRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSearchAds360LinkRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.CreateSearchAds360LinkRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
