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
// source: google/analytics/admin/v1beta/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.analytics.admin.v1beta;

/**
 *
 *
 * <pre>
 * Settings values for data retention. This is a singleton resource.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1beta.DataRetentionSettings}
 */
public final class DataRetentionSettings extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1beta.DataRetentionSettings)
    DataRetentionSettingsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DataRetentionSettings.newBuilder() to construct.
  private DataRetentionSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DataRetentionSettings() {
    name_ = "";
    eventDataRetention_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DataRetentionSettings();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1beta.ResourcesProto
        .internal_static_google_analytics_admin_v1beta_DataRetentionSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1beta.ResourcesProto
        .internal_static_google_analytics_admin_v1beta_DataRetentionSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1beta.DataRetentionSettings.class,
            com.google.analytics.admin.v1beta.DataRetentionSettings.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Valid values for the data retention duration.
   * </pre>
   *
   * Protobuf enum {@code google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration}
   */
  public enum RetentionDuration implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Data retention time duration is not specified.
     * </pre>
     *
     * <code>RETENTION_DURATION_UNSPECIFIED = 0;</code>
     */
    RETENTION_DURATION_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The data retention time duration is 2 months.
     * </pre>
     *
     * <code>TWO_MONTHS = 1;</code>
     */
    TWO_MONTHS(1),
    /**
     *
     *
     * <pre>
     * The data retention time duration is 14 months.
     * </pre>
     *
     * <code>FOURTEEN_MONTHS = 3;</code>
     */
    FOURTEEN_MONTHS(3),
    /**
     *
     *
     * <pre>
     * The data retention time duration is 26 months.
     * Available to 360 properties only.
     * </pre>
     *
     * <code>TWENTY_SIX_MONTHS = 4;</code>
     */
    TWENTY_SIX_MONTHS(4),
    /**
     *
     *
     * <pre>
     * The data retention time duration is 38 months.
     * Available to 360 properties only.
     * </pre>
     *
     * <code>THIRTY_EIGHT_MONTHS = 5;</code>
     */
    THIRTY_EIGHT_MONTHS(5),
    /**
     *
     *
     * <pre>
     * The data retention time duration is 50 months.
     * Available to 360 properties only.
     * </pre>
     *
     * <code>FIFTY_MONTHS = 6;</code>
     */
    FIFTY_MONTHS(6),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Data retention time duration is not specified.
     * </pre>
     *
     * <code>RETENTION_DURATION_UNSPECIFIED = 0;</code>
     */
    public static final int RETENTION_DURATION_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The data retention time duration is 2 months.
     * </pre>
     *
     * <code>TWO_MONTHS = 1;</code>
     */
    public static final int TWO_MONTHS_VALUE = 1;
    /**
     *
     *
     * <pre>
     * The data retention time duration is 14 months.
     * </pre>
     *
     * <code>FOURTEEN_MONTHS = 3;</code>
     */
    public static final int FOURTEEN_MONTHS_VALUE = 3;
    /**
     *
     *
     * <pre>
     * The data retention time duration is 26 months.
     * Available to 360 properties only.
     * </pre>
     *
     * <code>TWENTY_SIX_MONTHS = 4;</code>
     */
    public static final int TWENTY_SIX_MONTHS_VALUE = 4;
    /**
     *
     *
     * <pre>
     * The data retention time duration is 38 months.
     * Available to 360 properties only.
     * </pre>
     *
     * <code>THIRTY_EIGHT_MONTHS = 5;</code>
     */
    public static final int THIRTY_EIGHT_MONTHS_VALUE = 5;
    /**
     *
     *
     * <pre>
     * The data retention time duration is 50 months.
     * Available to 360 properties only.
     * </pre>
     *
     * <code>FIFTY_MONTHS = 6;</code>
     */
    public static final int FIFTY_MONTHS_VALUE = 6;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RetentionDuration valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static RetentionDuration forNumber(int value) {
      switch (value) {
        case 0:
          return RETENTION_DURATION_UNSPECIFIED;
        case 1:
          return TWO_MONTHS;
        case 3:
          return FOURTEEN_MONTHS;
        case 4:
          return TWENTY_SIX_MONTHS;
        case 5:
          return THIRTY_EIGHT_MONTHS;
        case 6:
          return FIFTY_MONTHS;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RetentionDuration>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<RetentionDuration>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<RetentionDuration>() {
              public RetentionDuration findValueByNumber(int number) {
                return RetentionDuration.forNumber(number);
              }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.analytics.admin.v1beta.DataRetentionSettings.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final RetentionDuration[] VALUES = values();

    public static RetentionDuration valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private RetentionDuration(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration)
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Output only. Resource name for this DataRetentionSetting resource.
   * Format: properties/{property}/dataRetentionSettings
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. Resource name for this DataRetentionSetting resource.
   * Format: properties/{property}/dataRetentionSettings
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENT_DATA_RETENTION_FIELD_NUMBER = 2;
  private int eventDataRetention_ = 0;
  /**
   *
   *
   * <pre>
   * The length of time that event-level data is retained.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration event_data_retention = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for eventDataRetention.
   */
  @java.lang.Override
  public int getEventDataRetentionValue() {
    return eventDataRetention_;
  }
  /**
   *
   *
   * <pre>
   * The length of time that event-level data is retained.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration event_data_retention = 2;
   * </code>
   *
   * @return The eventDataRetention.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration
      getEventDataRetention() {
    com.google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration result =
        com.google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration.forNumber(
            eventDataRetention_);
    return result == null
        ? com.google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration.UNRECOGNIZED
        : result;
  }

  public static final int RESET_USER_DATA_ON_NEW_ACTIVITY_FIELD_NUMBER = 3;
  private boolean resetUserDataOnNewActivity_ = false;
  /**
   *
   *
   * <pre>
   * If true, reset the retention period for the user identifier with every
   * event from that user.
   * </pre>
   *
   * <code>bool reset_user_data_on_new_activity = 3;</code>
   *
   * @return The resetUserDataOnNewActivity.
   */
  @java.lang.Override
  public boolean getResetUserDataOnNewActivity() {
    return resetUserDataOnNewActivity_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (eventDataRetention_
        != com.google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration
            .RETENTION_DURATION_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, eventDataRetention_);
    }
    if (resetUserDataOnNewActivity_ != false) {
      output.writeBool(3, resetUserDataOnNewActivity_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (eventDataRetention_
        != com.google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration
            .RETENTION_DURATION_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, eventDataRetention_);
    }
    if (resetUserDataOnNewActivity_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, resetUserDataOnNewActivity_);
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
    if (!(obj instanceof com.google.analytics.admin.v1beta.DataRetentionSettings)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1beta.DataRetentionSettings other =
        (com.google.analytics.admin.v1beta.DataRetentionSettings) obj;

    if (!getName().equals(other.getName())) return false;
    if (eventDataRetention_ != other.eventDataRetention_) return false;
    if (getResetUserDataOnNewActivity() != other.getResetUserDataOnNewActivity()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + EVENT_DATA_RETENTION_FIELD_NUMBER;
    hash = (53 * hash) + eventDataRetention_;
    hash = (37 * hash) + RESET_USER_DATA_ON_NEW_ACTIVITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getResetUserDataOnNewActivity());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1beta.DataRetentionSettings parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.DataRetentionSettings parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.DataRetentionSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.DataRetentionSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.DataRetentionSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1beta.DataRetentionSettings parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.DataRetentionSettings parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.DataRetentionSettings parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.DataRetentionSettings parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.DataRetentionSettings parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1beta.DataRetentionSettings parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1beta.DataRetentionSettings parseFrom(
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
      com.google.analytics.admin.v1beta.DataRetentionSettings prototype) {
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
   * Settings values for data retention. This is a singleton resource.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1beta.DataRetentionSettings}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1beta.DataRetentionSettings)
      com.google.analytics.admin.v1beta.DataRetentionSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1beta.ResourcesProto
          .internal_static_google_analytics_admin_v1beta_DataRetentionSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1beta.ResourcesProto
          .internal_static_google_analytics_admin_v1beta_DataRetentionSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1beta.DataRetentionSettings.class,
              com.google.analytics.admin.v1beta.DataRetentionSettings.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1beta.DataRetentionSettings.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      eventDataRetention_ = 0;
      resetUserDataOnNewActivity_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1beta.ResourcesProto
          .internal_static_google_analytics_admin_v1beta_DataRetentionSettings_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.DataRetentionSettings getDefaultInstanceForType() {
      return com.google.analytics.admin.v1beta.DataRetentionSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.DataRetentionSettings build() {
      com.google.analytics.admin.v1beta.DataRetentionSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1beta.DataRetentionSettings buildPartial() {
      com.google.analytics.admin.v1beta.DataRetentionSettings result =
          new com.google.analytics.admin.v1beta.DataRetentionSettings(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.admin.v1beta.DataRetentionSettings result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.eventDataRetention_ = eventDataRetention_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.resetUserDataOnNewActivity_ = resetUserDataOnNewActivity_;
      }
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
      if (other instanceof com.google.analytics.admin.v1beta.DataRetentionSettings) {
        return mergeFrom((com.google.analytics.admin.v1beta.DataRetentionSettings) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1beta.DataRetentionSettings other) {
      if (other == com.google.analytics.admin.v1beta.DataRetentionSettings.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.eventDataRetention_ != 0) {
        setEventDataRetentionValue(other.getEventDataRetentionValue());
      }
      if (other.getResetUserDataOnNewActivity() != false) {
        setResetUserDataOnNewActivity(other.getResetUserDataOnNewActivity());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                eventDataRetention_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                resetUserDataOnNewActivity_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Output only. Resource name for this DataRetentionSetting resource.
     * Format: properties/{property}/dataRetentionSettings
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Resource name for this DataRetentionSetting resource.
     * Format: properties/{property}/dataRetentionSettings
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Resource name for this DataRetentionSetting resource.
     * Format: properties/{property}/dataRetentionSettings
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Resource name for this DataRetentionSetting resource.
     * Format: properties/{property}/dataRetentionSettings
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Resource name for this DataRetentionSetting resource.
     * Format: properties/{property}/dataRetentionSettings
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int eventDataRetention_ = 0;
    /**
     *
     *
     * <pre>
     * The length of time that event-level data is retained.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration event_data_retention = 2;
     * </code>
     *
     * @return The enum numeric value on the wire for eventDataRetention.
     */
    @java.lang.Override
    public int getEventDataRetentionValue() {
      return eventDataRetention_;
    }
    /**
     *
     *
     * <pre>
     * The length of time that event-level data is retained.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration event_data_retention = 2;
     * </code>
     *
     * @param value The enum numeric value on the wire for eventDataRetention to set.
     * @return This builder for chaining.
     */
    public Builder setEventDataRetentionValue(int value) {
      eventDataRetention_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The length of time that event-level data is retained.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration event_data_retention = 2;
     * </code>
     *
     * @return The eventDataRetention.
     */
    @java.lang.Override
    public com.google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration
        getEventDataRetention() {
      com.google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration result =
          com.google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration.forNumber(
              eventDataRetention_);
      return result == null
          ? com.google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The length of time that event-level data is retained.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration event_data_retention = 2;
     * </code>
     *
     * @param value The eventDataRetention to set.
     * @return This builder for chaining.
     */
    public Builder setEventDataRetention(
        com.google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      eventDataRetention_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The length of time that event-level data is retained.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1beta.DataRetentionSettings.RetentionDuration event_data_retention = 2;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEventDataRetention() {
      bitField0_ = (bitField0_ & ~0x00000002);
      eventDataRetention_ = 0;
      onChanged();
      return this;
    }

    private boolean resetUserDataOnNewActivity_;
    /**
     *
     *
     * <pre>
     * If true, reset the retention period for the user identifier with every
     * event from that user.
     * </pre>
     *
     * <code>bool reset_user_data_on_new_activity = 3;</code>
     *
     * @return The resetUserDataOnNewActivity.
     */
    @java.lang.Override
    public boolean getResetUserDataOnNewActivity() {
      return resetUserDataOnNewActivity_;
    }
    /**
     *
     *
     * <pre>
     * If true, reset the retention period for the user identifier with every
     * event from that user.
     * </pre>
     *
     * <code>bool reset_user_data_on_new_activity = 3;</code>
     *
     * @param value The resetUserDataOnNewActivity to set.
     * @return This builder for chaining.
     */
    public Builder setResetUserDataOnNewActivity(boolean value) {

      resetUserDataOnNewActivity_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If true, reset the retention period for the user identifier with every
     * event from that user.
     * </pre>
     *
     * <code>bool reset_user_data_on_new_activity = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResetUserDataOnNewActivity() {
      bitField0_ = (bitField0_ & ~0x00000004);
      resetUserDataOnNewActivity_ = false;
      onChanged();
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1beta.DataRetentionSettings)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1beta.DataRetentionSettings)
  private static final com.google.analytics.admin.v1beta.DataRetentionSettings DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1beta.DataRetentionSettings();
  }

  public static com.google.analytics.admin.v1beta.DataRetentionSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataRetentionSettings> PARSER =
      new com.google.protobuf.AbstractParser<DataRetentionSettings>() {
        @java.lang.Override
        public DataRetentionSettings parsePartialFrom(
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

  public static com.google.protobuf.Parser<DataRetentionSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataRetentionSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1beta.DataRetentionSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
