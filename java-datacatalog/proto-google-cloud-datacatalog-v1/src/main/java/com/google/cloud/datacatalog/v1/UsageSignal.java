/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/datacatalog/v1/usage.proto

package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * The set of all usage signals that Data Catalog stores.
 * Note: Usually, these signals are updated daily. In rare cases, an update may
 * fail but will be performed again on the next day.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.UsageSignal}
 */
public final class UsageSignal extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.UsageSignal)
    UsageSignalOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UsageSignal.newBuilder() to construct.
  private UsageSignal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UsageSignal() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UsageSignal();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.Usage
        .internal_static_google_cloud_datacatalog_v1_UsageSignal_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 2:
        return internalGetUsageWithinTimeRange();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.Usage
        .internal_static_google_cloud_datacatalog_v1_UsageSignal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.UsageSignal.class,
            com.google.cloud.datacatalog.v1.UsageSignal.Builder.class);
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 1;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   *
   *
   * <pre>
   * The end timestamp of the duration of usage statistics.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   *
   * @return Whether the updateTime field is set.
   */
  @java.lang.Override
  public boolean hasUpdateTime() {
    return updateTime_ != null;
  }
  /**
   *
   *
   * <pre>
   * The end timestamp of the duration of usage statistics.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   *
   * @return The updateTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpdateTime() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }
  /**
   *
   *
   * <pre>
   * The end timestamp of the duration of usage statistics.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    return getUpdateTime();
  }

  public static final int USAGE_WITHIN_TIME_RANGE_FIELD_NUMBER = 2;

  private static final class UsageWithinTimeRangeDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
            java.lang.String, com.google.cloud.datacatalog.v1.UsageStats>
        defaultEntry =
            com.google.protobuf.MapEntry
                .<java.lang.String, com.google.cloud.datacatalog.v1.UsageStats>newDefaultInstance(
                    com.google.cloud.datacatalog.v1.Usage
                        .internal_static_google_cloud_datacatalog_v1_UsageSignal_UsageWithinTimeRangeEntry_descriptor,
                    com.google.protobuf.WireFormat.FieldType.STRING,
                    "",
                    com.google.protobuf.WireFormat.FieldType.MESSAGE,
                    com.google.cloud.datacatalog.v1.UsageStats.getDefaultInstance());
  }

  private com.google.protobuf.MapField<java.lang.String, com.google.cloud.datacatalog.v1.UsageStats>
      usageWithinTimeRange_;

  private com.google.protobuf.MapField<java.lang.String, com.google.cloud.datacatalog.v1.UsageStats>
      internalGetUsageWithinTimeRange() {
    if (usageWithinTimeRange_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          UsageWithinTimeRangeDefaultEntryHolder.defaultEntry);
    }
    return usageWithinTimeRange_;
  }

  public int getUsageWithinTimeRangeCount() {
    return internalGetUsageWithinTimeRange().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Output only. BigQuery usage statistics over each of the predefined time ranges.
   * Supported time ranges are `{"24H", "7D", "30D"}`.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datacatalog.v1.UsageStats&gt; usage_within_time_range = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public boolean containsUsageWithinTimeRange(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetUsageWithinTimeRange().getMap().containsKey(key);
  }
  /** Use {@link #getUsageWithinTimeRangeMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1.UsageStats>
      getUsageWithinTimeRange() {
    return getUsageWithinTimeRangeMap();
  }
  /**
   *
   *
   * <pre>
   * Output only. BigQuery usage statistics over each of the predefined time ranges.
   * Supported time ranges are `{"24H", "7D", "30D"}`.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datacatalog.v1.UsageStats&gt; usage_within_time_range = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1.UsageStats>
      getUsageWithinTimeRangeMap() {
    return internalGetUsageWithinTimeRange().getMap();
  }
  /**
   *
   *
   * <pre>
   * Output only. BigQuery usage statistics over each of the predefined time ranges.
   * Supported time ranges are `{"24H", "7D", "30D"}`.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datacatalog.v1.UsageStats&gt; usage_within_time_range = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.UsageStats getUsageWithinTimeRangeOrDefault(
      java.lang.String key, com.google.cloud.datacatalog.v1.UsageStats defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1.UsageStats> map =
        internalGetUsageWithinTimeRange().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Output only. BigQuery usage statistics over each of the predefined time ranges.
   * Supported time ranges are `{"24H", "7D", "30D"}`.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.datacatalog.v1.UsageStats&gt; usage_within_time_range = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.UsageStats getUsageWithinTimeRangeOrThrow(
      java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1.UsageStats> map =
        internalGetUsageWithinTimeRange().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (updateTime_ != null) {
      output.writeMessage(1, getUpdateTime());
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output,
        internalGetUsageWithinTimeRange(),
        UsageWithinTimeRangeDefaultEntryHolder.defaultEntry,
        2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (updateTime_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getUpdateTime());
    }
    for (java.util.Map.Entry<java.lang.String, com.google.cloud.datacatalog.v1.UsageStats> entry :
        internalGetUsageWithinTimeRange().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.google.cloud.datacatalog.v1.UsageStats>
          usageWithinTimeRange__ =
              UsageWithinTimeRangeDefaultEntryHolder.defaultEntry
                  .newBuilderForType()
                  .setKey(entry.getKey())
                  .setValue(entry.getValue())
                  .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, usageWithinTimeRange__);
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.UsageSignal)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.UsageSignal other =
        (com.google.cloud.datacatalog.v1.UsageSignal) obj;

    if (hasUpdateTime() != other.hasUpdateTime()) return false;
    if (hasUpdateTime()) {
      if (!getUpdateTime().equals(other.getUpdateTime())) return false;
    }
    if (!internalGetUsageWithinTimeRange().equals(other.internalGetUsageWithinTimeRange()))
      return false;
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
    if (hasUpdateTime()) {
      hash = (37 * hash) + UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateTime().hashCode();
    }
    if (!internalGetUsageWithinTimeRange().getMap().isEmpty()) {
      hash = (37 * hash) + USAGE_WITHIN_TIME_RANGE_FIELD_NUMBER;
      hash = (53 * hash) + internalGetUsageWithinTimeRange().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.UsageSignal parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.UsageSignal parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.UsageSignal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.UsageSignal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.UsageSignal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.UsageSignal parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.UsageSignal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.UsageSignal parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.UsageSignal parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.UsageSignal parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.UsageSignal parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.UsageSignal parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datacatalog.v1.UsageSignal prototype) {
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
   * The set of all usage signals that Data Catalog stores.
   * Note: Usually, these signals are updated daily. In rare cases, an update may
   * fail but will be performed again on the next day.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.UsageSignal}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.UsageSignal)
      com.google.cloud.datacatalog.v1.UsageSignalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.Usage
          .internal_static_google_cloud_datacatalog_v1_UsageSignal_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 2:
          return internalGetUsageWithinTimeRange();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 2:
          return internalGetMutableUsageWithinTimeRange();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.Usage
          .internal_static_google_cloud_datacatalog_v1_UsageSignal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.UsageSignal.class,
              com.google.cloud.datacatalog.v1.UsageSignal.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.UsageSignal.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (updateTimeBuilder_ == null) {
        updateTime_ = null;
      } else {
        updateTime_ = null;
        updateTimeBuilder_ = null;
      }
      internalGetMutableUsageWithinTimeRange().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.Usage
          .internal_static_google_cloud_datacatalog_v1_UsageSignal_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.UsageSignal getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.UsageSignal.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.UsageSignal build() {
      com.google.cloud.datacatalog.v1.UsageSignal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.UsageSignal buildPartial() {
      com.google.cloud.datacatalog.v1.UsageSignal result =
          new com.google.cloud.datacatalog.v1.UsageSignal(this);
      int from_bitField0_ = bitField0_;
      if (updateTimeBuilder_ == null) {
        result.updateTime_ = updateTime_;
      } else {
        result.updateTime_ = updateTimeBuilder_.build();
      }
      result.usageWithinTimeRange_ = internalGetUsageWithinTimeRange();
      result.usageWithinTimeRange_.makeImmutable();
      onBuilt();
      return result;
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
      if (other instanceof com.google.cloud.datacatalog.v1.UsageSignal) {
        return mergeFrom((com.google.cloud.datacatalog.v1.UsageSignal) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.UsageSignal other) {
      if (other == com.google.cloud.datacatalog.v1.UsageSignal.getDefaultInstance()) return this;
      if (other.hasUpdateTime()) {
        mergeUpdateTime(other.getUpdateTime());
      }
      internalGetMutableUsageWithinTimeRange().mergeFrom(other.internalGetUsageWithinTimeRange());
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
                input.readMessage(getUpdateTimeFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                com.google.protobuf.MapEntry<
                        java.lang.String, com.google.cloud.datacatalog.v1.UsageStats>
                    usageWithinTimeRange__ =
                        input.readMessage(
                            UsageWithinTimeRangeDefaultEntryHolder.defaultEntry.getParserForType(),
                            extensionRegistry);
                internalGetMutableUsageWithinTimeRange()
                    .getMutableMap()
                    .put(usageWithinTimeRange__.getKey(), usageWithinTimeRange__.getValue());
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

    private com.google.protobuf.Timestamp updateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        updateTimeBuilder_;
    /**
     *
     *
     * <pre>
     * The end timestamp of the duration of usage statistics.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     *
     * @return Whether the updateTime field is set.
     */
    public boolean hasUpdateTime() {
      return updateTimeBuilder_ != null || updateTime_ != null;
    }
    /**
     *
     *
     * <pre>
     * The end timestamp of the duration of usage statistics.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     *
     * @return The updateTime.
     */
    public com.google.protobuf.Timestamp getUpdateTime() {
      if (updateTimeBuilder_ == null) {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      } else {
        return updateTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The end timestamp of the duration of usage statistics.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateTime_ = value;
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The end timestamp of the duration of usage statistics.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updateTimeBuilder_ == null) {
        updateTime_ = builderForValue.build();
        onChanged();
      } else {
        updateTimeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The end timestamp of the duration of usage statistics.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public Builder mergeUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (updateTime_ != null) {
          updateTime_ =
              com.google.protobuf.Timestamp.newBuilder(updateTime_).mergeFrom(value).buildPartial();
        } else {
          updateTime_ = value;
        }
        onChanged();
      } else {
        updateTimeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The end timestamp of the duration of usage statistics.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public Builder clearUpdateTime() {
      if (updateTimeBuilder_ == null) {
        updateTime_ = null;
        onChanged();
      } else {
        updateTime_ = null;
        updateTimeBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The end timestamp of the duration of usage statistics.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdateTimeBuilder() {

      onChanged();
      return getUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The end timestamp of the duration of usage statistics.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
      if (updateTimeBuilder_ != null) {
        return updateTimeBuilder_.getMessageOrBuilder();
      } else {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * The end timestamp of the duration of usage statistics.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getUpdateTimeFieldBuilder() {
      if (updateTimeBuilder_ == null) {
        updateTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getUpdateTime(), getParentForChildren(), isClean());
        updateTime_ = null;
      }
      return updateTimeBuilder_;
    }

    private com.google.protobuf.MapField<
            java.lang.String, com.google.cloud.datacatalog.v1.UsageStats>
        usageWithinTimeRange_;

    private com.google.protobuf.MapField<
            java.lang.String, com.google.cloud.datacatalog.v1.UsageStats>
        internalGetUsageWithinTimeRange() {
      if (usageWithinTimeRange_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            UsageWithinTimeRangeDefaultEntryHolder.defaultEntry);
      }
      return usageWithinTimeRange_;
    }

    private com.google.protobuf.MapField<
            java.lang.String, com.google.cloud.datacatalog.v1.UsageStats>
        internalGetMutableUsageWithinTimeRange() {
      onChanged();
      ;
      if (usageWithinTimeRange_ == null) {
        usageWithinTimeRange_ =
            com.google.protobuf.MapField.newMapField(
                UsageWithinTimeRangeDefaultEntryHolder.defaultEntry);
      }
      if (!usageWithinTimeRange_.isMutable()) {
        usageWithinTimeRange_ = usageWithinTimeRange_.copy();
      }
      return usageWithinTimeRange_;
    }

    public int getUsageWithinTimeRangeCount() {
      return internalGetUsageWithinTimeRange().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Output only. BigQuery usage statistics over each of the predefined time ranges.
     * Supported time ranges are `{"24H", "7D", "30D"}`.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.datacatalog.v1.UsageStats&gt; usage_within_time_range = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    @java.lang.Override
    public boolean containsUsageWithinTimeRange(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetUsageWithinTimeRange().getMap().containsKey(key);
    }
    /** Use {@link #getUsageWithinTimeRangeMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1.UsageStats>
        getUsageWithinTimeRange() {
      return getUsageWithinTimeRangeMap();
    }
    /**
     *
     *
     * <pre>
     * Output only. BigQuery usage statistics over each of the predefined time ranges.
     * Supported time ranges are `{"24H", "7D", "30D"}`.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.datacatalog.v1.UsageStats&gt; usage_within_time_range = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1.UsageStats>
        getUsageWithinTimeRangeMap() {
      return internalGetUsageWithinTimeRange().getMap();
    }
    /**
     *
     *
     * <pre>
     * Output only. BigQuery usage statistics over each of the predefined time ranges.
     * Supported time ranges are `{"24H", "7D", "30D"}`.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.datacatalog.v1.UsageStats&gt; usage_within_time_range = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    @java.lang.Override
    public com.google.cloud.datacatalog.v1.UsageStats getUsageWithinTimeRangeOrDefault(
        java.lang.String key, com.google.cloud.datacatalog.v1.UsageStats defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1.UsageStats> map =
          internalGetUsageWithinTimeRange().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Output only. BigQuery usage statistics over each of the predefined time ranges.
     * Supported time ranges are `{"24H", "7D", "30D"}`.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.datacatalog.v1.UsageStats&gt; usage_within_time_range = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    @java.lang.Override
    public com.google.cloud.datacatalog.v1.UsageStats getUsageWithinTimeRangeOrThrow(
        java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1.UsageStats> map =
          internalGetUsageWithinTimeRange().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearUsageWithinTimeRange() {
      internalGetMutableUsageWithinTimeRange().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. BigQuery usage statistics over each of the predefined time ranges.
     * Supported time ranges are `{"24H", "7D", "30D"}`.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.datacatalog.v1.UsageStats&gt; usage_within_time_range = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder removeUsageWithinTimeRange(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableUsageWithinTimeRange().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1.UsageStats>
        getMutableUsageWithinTimeRange() {
      return internalGetMutableUsageWithinTimeRange().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Output only. BigQuery usage statistics over each of the predefined time ranges.
     * Supported time ranges are `{"24H", "7D", "30D"}`.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.datacatalog.v1.UsageStats&gt; usage_within_time_range = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder putUsageWithinTimeRange(
        java.lang.String key, com.google.cloud.datacatalog.v1.UsageStats value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }

      internalGetMutableUsageWithinTimeRange().getMutableMap().put(key, value);
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. BigQuery usage statistics over each of the predefined time ranges.
     * Supported time ranges are `{"24H", "7D", "30D"}`.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.datacatalog.v1.UsageStats&gt; usage_within_time_range = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     */
    public Builder putAllUsageWithinTimeRange(
        java.util.Map<java.lang.String, com.google.cloud.datacatalog.v1.UsageStats> values) {
      internalGetMutableUsageWithinTimeRange().getMutableMap().putAll(values);
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.UsageSignal)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.UsageSignal)
  private static final com.google.cloud.datacatalog.v1.UsageSignal DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.UsageSignal();
  }

  public static com.google.cloud.datacatalog.v1.UsageSignal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UsageSignal> PARSER =
      new com.google.protobuf.AbstractParser<UsageSignal>() {
        @java.lang.Override
        public UsageSignal parsePartialFrom(
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

  public static com.google.protobuf.Parser<UsageSignal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UsageSignal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.UsageSignal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
