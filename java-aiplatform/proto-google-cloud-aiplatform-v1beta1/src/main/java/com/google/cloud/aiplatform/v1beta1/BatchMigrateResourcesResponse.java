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
// source: google/cloud/aiplatform/v1beta1/migration_service.proto

package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for
 * [MigrationService.BatchMigrateResources][google.cloud.aiplatform.v1beta1.MigrationService.BatchMigrateResources].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse}
 */
public final class BatchMigrateResourcesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse)
    BatchMigrateResourcesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchMigrateResourcesResponse.newBuilder() to construct.
  private BatchMigrateResourcesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchMigrateResourcesResponse() {
    migrateResourceResponses_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchMigrateResourcesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.MigrationServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.MigrationServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse.class,
            com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse.Builder.class);
  }

  public static final int MIGRATE_RESOURCE_RESPONSES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse>
      migrateResourceResponses_;
  /**
   *
   *
   * <pre>
   * Successfully migrated resources.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.MigrateResourceResponse migrate_resource_responses = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse>
      getMigrateResourceResponsesList() {
    return migrateResourceResponses_;
  }
  /**
   *
   *
   * <pre>
   * Successfully migrated resources.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.MigrateResourceResponse migrate_resource_responses = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<
          ? extends com.google.cloud.aiplatform.v1beta1.MigrateResourceResponseOrBuilder>
      getMigrateResourceResponsesOrBuilderList() {
    return migrateResourceResponses_;
  }
  /**
   *
   *
   * <pre>
   * Successfully migrated resources.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.MigrateResourceResponse migrate_resource_responses = 1;
   * </code>
   */
  @java.lang.Override
  public int getMigrateResourceResponsesCount() {
    return migrateResourceResponses_.size();
  }
  /**
   *
   *
   * <pre>
   * Successfully migrated resources.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.MigrateResourceResponse migrate_resource_responses = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse getMigrateResourceResponses(
      int index) {
    return migrateResourceResponses_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Successfully migrated resources.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1beta1.MigrateResourceResponse migrate_resource_responses = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.MigrateResourceResponseOrBuilder
      getMigrateResourceResponsesOrBuilder(int index) {
    return migrateResourceResponses_.get(index);
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
    for (int i = 0; i < migrateResourceResponses_.size(); i++) {
      output.writeMessage(1, migrateResourceResponses_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < migrateResourceResponses_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, migrateResourceResponses_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse other =
        (com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse) obj;

    if (!getMigrateResourceResponsesList().equals(other.getMigrateResourceResponsesList()))
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
    if (getMigrateResourceResponsesCount() > 0) {
      hash = (37 * hash) + MIGRATE_RESOURCE_RESPONSES_FIELD_NUMBER;
      hash = (53 * hash) + getMigrateResourceResponsesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse prototype) {
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
   * Response message for
   * [MigrationService.BatchMigrateResources][google.cloud.aiplatform.v1beta1.MigrationService.BatchMigrateResources].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse)
      com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.MigrationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.MigrationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse.class,
              com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (migrateResourceResponsesBuilder_ == null) {
        migrateResourceResponses_ = java.util.Collections.emptyList();
      } else {
        migrateResourceResponses_ = null;
        migrateResourceResponsesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.MigrationServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_BatchMigrateResourcesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse build() {
      com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse result =
          new com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse(this);
      int from_bitField0_ = bitField0_;
      if (migrateResourceResponsesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          migrateResourceResponses_ =
              java.util.Collections.unmodifiableList(migrateResourceResponses_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.migrateResourceResponses_ = migrateResourceResponses_;
      } else {
        result.migrateResourceResponses_ = migrateResourceResponsesBuilder_.build();
      }
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse.getDefaultInstance())
        return this;
      if (migrateResourceResponsesBuilder_ == null) {
        if (!other.migrateResourceResponses_.isEmpty()) {
          if (migrateResourceResponses_.isEmpty()) {
            migrateResourceResponses_ = other.migrateResourceResponses_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMigrateResourceResponsesIsMutable();
            migrateResourceResponses_.addAll(other.migrateResourceResponses_);
          }
          onChanged();
        }
      } else {
        if (!other.migrateResourceResponses_.isEmpty()) {
          if (migrateResourceResponsesBuilder_.isEmpty()) {
            migrateResourceResponsesBuilder_.dispose();
            migrateResourceResponsesBuilder_ = null;
            migrateResourceResponses_ = other.migrateResourceResponses_;
            bitField0_ = (bitField0_ & ~0x00000001);
            migrateResourceResponsesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getMigrateResourceResponsesFieldBuilder()
                    : null;
          } else {
            migrateResourceResponsesBuilder_.addAllMessages(other.migrateResourceResponses_);
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
                com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse.parser(),
                        extensionRegistry);
                if (migrateResourceResponsesBuilder_ == null) {
                  ensureMigrateResourceResponsesIsMutable();
                  migrateResourceResponses_.add(m);
                } else {
                  migrateResourceResponsesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse>
        migrateResourceResponses_ = java.util.Collections.emptyList();

    private void ensureMigrateResourceResponsesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        migrateResourceResponses_ =
            new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse>(
                migrateResourceResponses_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse,
            com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse.Builder,
            com.google.cloud.aiplatform.v1beta1.MigrateResourceResponseOrBuilder>
        migrateResourceResponsesBuilder_;

    /**
     *
     *
     * <pre>
     * Successfully migrated resources.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.MigrateResourceResponse migrate_resource_responses = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse>
        getMigrateResourceResponsesList() {
      if (migrateResourceResponsesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(migrateResourceResponses_);
      } else {
        return migrateResourceResponsesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Successfully migrated resources.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.MigrateResourceResponse migrate_resource_responses = 1;
     * </code>
     */
    public int getMigrateResourceResponsesCount() {
      if (migrateResourceResponsesBuilder_ == null) {
        return migrateResourceResponses_.size();
      } else {
        return migrateResourceResponsesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Successfully migrated resources.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.MigrateResourceResponse migrate_resource_responses = 1;
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse getMigrateResourceResponses(
        int index) {
      if (migrateResourceResponsesBuilder_ == null) {
        return migrateResourceResponses_.get(index);
      } else {
        return migrateResourceResponsesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Successfully migrated resources.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.MigrateResourceResponse migrate_resource_responses = 1;
     * </code>
     */
    public Builder setMigrateResourceResponses(
        int index, com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse value) {
      if (migrateResourceResponsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMigrateResourceResponsesIsMutable();
        migrateResourceResponses_.set(index, value);
        onChanged();
      } else {
        migrateResourceResponsesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Successfully migrated resources.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.MigrateResourceResponse migrate_resource_responses = 1;
     * </code>
     */
    public Builder setMigrateResourceResponses(
        int index,
        com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse.Builder builderForValue) {
      if (migrateResourceResponsesBuilder_ == null) {
        ensureMigrateResourceResponsesIsMutable();
        migrateResourceResponses_.set(index, builderForValue.build());
        onChanged();
      } else {
        migrateResourceResponsesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Successfully migrated resources.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.MigrateResourceResponse migrate_resource_responses = 1;
     * </code>
     */
    public Builder addMigrateResourceResponses(
        com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse value) {
      if (migrateResourceResponsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMigrateResourceResponsesIsMutable();
        migrateResourceResponses_.add(value);
        onChanged();
      } else {
        migrateResourceResponsesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Successfully migrated resources.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.MigrateResourceResponse migrate_resource_responses = 1;
     * </code>
     */
    public Builder addMigrateResourceResponses(
        int index, com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse value) {
      if (migrateResourceResponsesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMigrateResourceResponsesIsMutable();
        migrateResourceResponses_.add(index, value);
        onChanged();
      } else {
        migrateResourceResponsesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Successfully migrated resources.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.MigrateResourceResponse migrate_resource_responses = 1;
     * </code>
     */
    public Builder addMigrateResourceResponses(
        com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse.Builder builderForValue) {
      if (migrateResourceResponsesBuilder_ == null) {
        ensureMigrateResourceResponsesIsMutable();
        migrateResourceResponses_.add(builderForValue.build());
        onChanged();
      } else {
        migrateResourceResponsesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Successfully migrated resources.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.MigrateResourceResponse migrate_resource_responses = 1;
     * </code>
     */
    public Builder addMigrateResourceResponses(
        int index,
        com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse.Builder builderForValue) {
      if (migrateResourceResponsesBuilder_ == null) {
        ensureMigrateResourceResponsesIsMutable();
        migrateResourceResponses_.add(index, builderForValue.build());
        onChanged();
      } else {
        migrateResourceResponsesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Successfully migrated resources.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.MigrateResourceResponse migrate_resource_responses = 1;
     * </code>
     */
    public Builder addAllMigrateResourceResponses(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse>
            values) {
      if (migrateResourceResponsesBuilder_ == null) {
        ensureMigrateResourceResponsesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, migrateResourceResponses_);
        onChanged();
      } else {
        migrateResourceResponsesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Successfully migrated resources.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.MigrateResourceResponse migrate_resource_responses = 1;
     * </code>
     */
    public Builder clearMigrateResourceResponses() {
      if (migrateResourceResponsesBuilder_ == null) {
        migrateResourceResponses_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        migrateResourceResponsesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Successfully migrated resources.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.MigrateResourceResponse migrate_resource_responses = 1;
     * </code>
     */
    public Builder removeMigrateResourceResponses(int index) {
      if (migrateResourceResponsesBuilder_ == null) {
        ensureMigrateResourceResponsesIsMutable();
        migrateResourceResponses_.remove(index);
        onChanged();
      } else {
        migrateResourceResponsesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Successfully migrated resources.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.MigrateResourceResponse migrate_resource_responses = 1;
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse.Builder
        getMigrateResourceResponsesBuilder(int index) {
      return getMigrateResourceResponsesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Successfully migrated resources.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.MigrateResourceResponse migrate_resource_responses = 1;
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.MigrateResourceResponseOrBuilder
        getMigrateResourceResponsesOrBuilder(int index) {
      if (migrateResourceResponsesBuilder_ == null) {
        return migrateResourceResponses_.get(index);
      } else {
        return migrateResourceResponsesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Successfully migrated resources.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.MigrateResourceResponse migrate_resource_responses = 1;
     * </code>
     */
    public java.util.List<
            ? extends com.google.cloud.aiplatform.v1beta1.MigrateResourceResponseOrBuilder>
        getMigrateResourceResponsesOrBuilderList() {
      if (migrateResourceResponsesBuilder_ != null) {
        return migrateResourceResponsesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(migrateResourceResponses_);
      }
    }
    /**
     *
     *
     * <pre>
     * Successfully migrated resources.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.MigrateResourceResponse migrate_resource_responses = 1;
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse.Builder
        addMigrateResourceResponsesBuilder() {
      return getMigrateResourceResponsesFieldBuilder()
          .addBuilder(
              com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Successfully migrated resources.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.MigrateResourceResponse migrate_resource_responses = 1;
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse.Builder
        addMigrateResourceResponsesBuilder(int index) {
      return getMigrateResourceResponsesFieldBuilder()
          .addBuilder(
              index,
              com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Successfully migrated resources.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.aiplatform.v1beta1.MigrateResourceResponse migrate_resource_responses = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse.Builder>
        getMigrateResourceResponsesBuilderList() {
      return getMigrateResourceResponsesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse,
            com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse.Builder,
            com.google.cloud.aiplatform.v1beta1.MigrateResourceResponseOrBuilder>
        getMigrateResourceResponsesFieldBuilder() {
      if (migrateResourceResponsesBuilder_ == null) {
        migrateResourceResponsesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse,
                com.google.cloud.aiplatform.v1beta1.MigrateResourceResponse.Builder,
                com.google.cloud.aiplatform.v1beta1.MigrateResourceResponseOrBuilder>(
                migrateResourceResponses_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        migrateResourceResponses_ = null;
      }
      return migrateResourceResponsesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse)
  private static final com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchMigrateResourcesResponse> PARSER =
      new com.google.protobuf.AbstractParser<BatchMigrateResourcesResponse>() {
        @java.lang.Override
        public BatchMigrateResourcesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchMigrateResourcesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchMigrateResourcesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.BatchMigrateResourcesResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
