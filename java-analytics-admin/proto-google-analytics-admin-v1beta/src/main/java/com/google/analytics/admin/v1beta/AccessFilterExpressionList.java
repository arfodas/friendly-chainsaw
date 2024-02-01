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
// source: google/analytics/admin/v1beta/access_report.proto

// Protobuf Java Version: 3.25.2
package com.google.analytics.admin.v1beta;

/**
 *
 *
 * <pre>
 * A list of filter expressions.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1beta.AccessFilterExpressionList}
 */
public final class AccessFilterExpressionList extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1beta.AccessFilterExpressionList)
    AccessFilterExpressionListOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AccessFilterExpressionList.newBuilder() to construct.
  private AccessFilterExpressionList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AccessFilterExpressionList() {
    expressions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AccessFilterExpressionList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1beta.AccessReportProto
        .internal_static_google_analytics_admin_v1beta_AccessFilterExpressionList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1beta.AccessReportProto
        .internal_static_google_analytics_admin_v1beta_AccessFilterExpressionList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1beta.AccessFilterExpressionList.class,
            com.google.analytics.admin.v1beta.AccessFilterExpressionList.Builder.class);
  }

  public static final int EXPRESSIONS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.analytics.admin.v1beta.AccessFilterExpression> expressions_;
  /**
   *
   *
   * <pre>
   * A list of filter expressions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessFilterExpression expressions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.admin.v1beta.AccessFilterExpression>
      getExpressionsList() {
    return expressions_;
  }
  /**
   *
   *
   * <pre>
   * A list of filter expressions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessFilterExpression expressions = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.analytics.admin.v1beta.AccessFilterExpressionOrBuilder>
      getExpressionsOrBuilderList() {
    return expressions_;
  }
  /**
   *
   *
   * <pre>
   * A list of filter expressions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessFilterExpression expressions = 1;</code>
   */
  @java.lang.Override
  public int getExpressionsCount() {
    return expressions_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of filter expressions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessFilterExpression expressions = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1beta.AccessFilterExpression getExpressions(int index) {
    return expressions_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of filter expressions.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessFilterExpression expressions = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1beta.AccessFilterExpressionOrBuilder getExpressionsOrBuilder(
      int index) {
    return expressions_.get(index);
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
    for (int i = 0; i < expressions_.size(); i++) {
      output.writeMessage(1, expressions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < expressions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, expressions_.get(i));
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
    if (!(obj instanceof com.google.analytics.admin.v1beta.AccessFilterExpressionList)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1beta.AccessFilterExpressionList other =
        (com.google.analytics.admin.v1beta.AccessFilterExpressionList) obj;

    if (!getExpressionsList().equals(other.getExpressionsList())) return false;
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
    if (getExpressionsCount() > 0) {
      hash = (37 * hash) + EXPRESSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getExpressionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1beta.AccessFilterExpressionList parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.AccessFilterExpressionList parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.AccessFilterExpressionList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.AccessFilterExpressionList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.AccessFilterExpressionList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.AccessFilterExpressionList parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.AccessFilterExpressionList parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.AccessFilterExpressionList parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.AccessFilterExpressionList parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.AccessFilterExpressionList parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.AccessFilterExpressionList parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.AccessFilterExpressionList parseFrom(
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
      com.google.analytics.admin.v1beta.AccessFilterExpressionList prototype) {
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
   * A list of filter expressions.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1beta.AccessFilterExpressionList}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1beta.AccessFilterExpressionList)
      com.google.analytics.admin.v1beta.AccessFilterExpressionListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1beta.AccessReportProto
          .internal_static_google_analytics_admin_v1beta_AccessFilterExpressionList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1beta.AccessReportProto
          .internal_static_google_analytics_admin_v1beta_AccessFilterExpressionList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1beta.AccessFilterExpressionList.class,
              com.google.analytics.admin.v1beta.AccessFilterExpressionList.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1beta.AccessFilterExpressionList.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (expressionsBuilder_ == null) {
        expressions_ = java.util.Collections.emptyList();
      } else {
        expressions_ = null;
        expressionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1beta.AccessReportProto
          .internal_static_google_analytics_admin_v1beta_AccessFilterExpressionList_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.AccessFilterExpressionList
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1beta.AccessFilterExpressionList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.AccessFilterExpressionList build() {
      com.google.analytics.admin.v1beta.AccessFilterExpressionList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.AccessFilterExpressionList buildPartial() {
      com.google.analytics.admin.v1beta.AccessFilterExpressionList result =
          new com.google.analytics.admin.v1beta.AccessFilterExpressionList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.analytics.admin.v1beta.AccessFilterExpressionList result) {
      if (expressionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          expressions_ = java.util.Collections.unmodifiableList(expressions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.expressions_ = expressions_;
      } else {
        result.expressions_ = expressionsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.analytics.admin.v1beta.AccessFilterExpressionList result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.analytics.admin.v1beta.AccessFilterExpressionList) {
        return mergeFrom((com.google.analytics.admin.v1beta.AccessFilterExpressionList) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1beta.AccessFilterExpressionList other) {
      if (other
          == com.google.analytics.admin.v1beta.AccessFilterExpressionList.getDefaultInstance())
        return this;
      if (expressionsBuilder_ == null) {
        if (!other.expressions_.isEmpty()) {
          if (expressions_.isEmpty()) {
            expressions_ = other.expressions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureExpressionsIsMutable();
            expressions_.addAll(other.expressions_);
          }
          onChanged();
        }
      } else {
        if (!other.expressions_.isEmpty()) {
          if (expressionsBuilder_.isEmpty()) {
            expressionsBuilder_.dispose();
            expressionsBuilder_ = null;
            expressions_ = other.expressions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            expressionsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getExpressionsFieldBuilder()
                    : null;
          } else {
            expressionsBuilder_.addAllMessages(other.expressions_);
          }
        }
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
                com.google.analytics.admin.v1beta.AccessFilterExpression m =
                    input.readMessage(
                        com.google.analytics.admin.v1beta.AccessFilterExpression.parser(),
                        extensionRegistry);
                if (expressionsBuilder_ == null) {
                  ensureExpressionsIsMutable();
                  expressions_.add(m);
                } else {
                  expressionsBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

    private java.util.List<com.google.analytics.admin.v1beta.AccessFilterExpression> expressions_ =
        java.util.Collections.emptyList();

    private void ensureExpressionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        expressions_ =
            new java.util.ArrayList<com.google.analytics.admin.v1beta.AccessFilterExpression>(
                expressions_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1beta.AccessFilterExpression,
            com.google.analytics.admin.v1beta.AccessFilterExpression.Builder,
            com.google.analytics.admin.v1beta.AccessFilterExpressionOrBuilder>
        expressionsBuilder_;

    /**
     *
     *
     * <pre>
     * A list of filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.AccessFilterExpression expressions = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1beta.AccessFilterExpression>
        getExpressionsList() {
      if (expressionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(expressions_);
      } else {
        return expressionsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.AccessFilterExpression expressions = 1;</code>
     */
    public int getExpressionsCount() {
      if (expressionsBuilder_ == null) {
        return expressions_.size();
      } else {
        return expressionsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.AccessFilterExpression expressions = 1;</code>
     */
    public com.google.analytics.admin.v1beta.AccessFilterExpression getExpressions(int index) {
      if (expressionsBuilder_ == null) {
        return expressions_.get(index);
      } else {
        return expressionsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.AccessFilterExpression expressions = 1;</code>
     */
    public Builder setExpressions(
        int index, com.google.analytics.admin.v1beta.AccessFilterExpression value) {
      if (expressionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExpressionsIsMutable();
        expressions_.set(index, value);
        onChanged();
      } else {
        expressionsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.AccessFilterExpression expressions = 1;</code>
     */
    public Builder setExpressions(
        int index,
        com.google.analytics.admin.v1beta.AccessFilterExpression.Builder builderForValue) {
      if (expressionsBuilder_ == null) {
        ensureExpressionsIsMutable();
        expressions_.set(index, builderForValue.build());
        onChanged();
      } else {
        expressionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.AccessFilterExpression expressions = 1;</code>
     */
    public Builder addExpressions(com.google.analytics.admin.v1beta.AccessFilterExpression value) {
      if (expressionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExpressionsIsMutable();
        expressions_.add(value);
        onChanged();
      } else {
        expressionsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.AccessFilterExpression expressions = 1;</code>
     */
    public Builder addExpressions(
        int index, com.google.analytics.admin.v1beta.AccessFilterExpression value) {
      if (expressionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExpressionsIsMutable();
        expressions_.add(index, value);
        onChanged();
      } else {
        expressionsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.AccessFilterExpression expressions = 1;</code>
     */
    public Builder addExpressions(
        com.google.analytics.admin.v1beta.AccessFilterExpression.Builder builderForValue) {
      if (expressionsBuilder_ == null) {
        ensureExpressionsIsMutable();
        expressions_.add(builderForValue.build());
        onChanged();
      } else {
        expressionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.AccessFilterExpression expressions = 1;</code>
     */
    public Builder addExpressions(
        int index,
        com.google.analytics.admin.v1beta.AccessFilterExpression.Builder builderForValue) {
      if (expressionsBuilder_ == null) {
        ensureExpressionsIsMutable();
        expressions_.add(index, builderForValue.build());
        onChanged();
      } else {
        expressionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.AccessFilterExpression expressions = 1;</code>
     */
    public Builder addAllExpressions(
        java.lang.Iterable<? extends com.google.analytics.admin.v1beta.AccessFilterExpression>
            values) {
      if (expressionsBuilder_ == null) {
        ensureExpressionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, expressions_);
        onChanged();
      } else {
        expressionsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.AccessFilterExpression expressions = 1;</code>
     */
    public Builder clearExpressions() {
      if (expressionsBuilder_ == null) {
        expressions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        expressionsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.AccessFilterExpression expressions = 1;</code>
     */
    public Builder removeExpressions(int index) {
      if (expressionsBuilder_ == null) {
        ensureExpressionsIsMutable();
        expressions_.remove(index);
        onChanged();
      } else {
        expressionsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.AccessFilterExpression expressions = 1;</code>
     */
    public com.google.analytics.admin.v1beta.AccessFilterExpression.Builder getExpressionsBuilder(
        int index) {
      return getExpressionsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.AccessFilterExpression expressions = 1;</code>
     */
    public com.google.analytics.admin.v1beta.AccessFilterExpressionOrBuilder
        getExpressionsOrBuilder(int index) {
      if (expressionsBuilder_ == null) {
        return expressions_.get(index);
      } else {
        return expressionsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.AccessFilterExpression expressions = 1;</code>
     */
    public java.util.List<
            ? extends com.google.analytics.admin.v1beta.AccessFilterExpressionOrBuilder>
        getExpressionsOrBuilderList() {
      if (expressionsBuilder_ != null) {
        return expressionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(expressions_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.AccessFilterExpression expressions = 1;</code>
     */
    public com.google.analytics.admin.v1beta.AccessFilterExpression.Builder
        addExpressionsBuilder() {
      return getExpressionsFieldBuilder()
          .addBuilder(
              com.google.analytics.admin.v1beta.AccessFilterExpression.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.AccessFilterExpression expressions = 1;</code>
     */
    public com.google.analytics.admin.v1beta.AccessFilterExpression.Builder addExpressionsBuilder(
        int index) {
      return getExpressionsFieldBuilder()
          .addBuilder(
              index, com.google.analytics.admin.v1beta.AccessFilterExpression.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of filter expressions.
     * </pre>
     *
     * <code>repeated .google.analytics.admin.v1beta.AccessFilterExpression expressions = 1;</code>
     */
    public java.util.List<com.google.analytics.admin.v1beta.AccessFilterExpression.Builder>
        getExpressionsBuilderList() {
      return getExpressionsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1beta.AccessFilterExpression,
            com.google.analytics.admin.v1beta.AccessFilterExpression.Builder,
            com.google.analytics.admin.v1beta.AccessFilterExpressionOrBuilder>
        getExpressionsFieldBuilder() {
      if (expressionsBuilder_ == null) {
        expressionsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.admin.v1beta.AccessFilterExpression,
                com.google.analytics.admin.v1beta.AccessFilterExpression.Builder,
                com.google.analytics.admin.v1beta.AccessFilterExpressionOrBuilder>(
                expressions_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        expressions_ = null;
      }
      return expressionsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1beta.AccessFilterExpressionList)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1beta.AccessFilterExpressionList)
  private static final com.google.analytics.admin.v1beta.AccessFilterExpressionList
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1beta.AccessFilterExpressionList();
  }

  public static com.google.analytics.admin.v1beta.AccessFilterExpressionList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AccessFilterExpressionList> PARSER =
      new com.google.protobuf.AbstractParser<AccessFilterExpressionList>() {
        @java.lang.Override
        public AccessFilterExpressionList parsePartialFrom(
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

  public static com.google.protobuf.Parser<AccessFilterExpressionList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AccessFilterExpressionList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1beta.AccessFilterExpressionList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
