/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/recommender/v1beta1/recommendation.proto

package com.google.cloud.recommender.v1beta1;

/**
 *
 *
 * <pre>
 * Contains various ways of describing the impact on Security.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recommender.v1beta1.SecurityProjection}
 */
public final class SecurityProjection extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recommender.v1beta1.SecurityProjection)
    SecurityProjectionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SecurityProjection.newBuilder() to construct.
  private SecurityProjection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SecurityProjection() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SecurityProjection();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.recommender.v1beta1.RecommendationOuterClass
        .internal_static_google_cloud_recommender_v1beta1_SecurityProjection_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.recommender.v1beta1.RecommendationOuterClass
        .internal_static_google_cloud_recommender_v1beta1_SecurityProjection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.recommender.v1beta1.SecurityProjection.class,
            com.google.cloud.recommender.v1beta1.SecurityProjection.Builder.class);
  }

  public static final int DETAILS_FIELD_NUMBER = 2;
  private com.google.protobuf.Struct details_;
  /**
   *
   *
   * <pre>
   * This field can be used by the recommender to define details specific to
   * security impact.
   * </pre>
   *
   * <code>.google.protobuf.Struct details = 2;</code>
   *
   * @return Whether the details field is set.
   */
  @java.lang.Override
  public boolean hasDetails() {
    return details_ != null;
  }
  /**
   *
   *
   * <pre>
   * This field can be used by the recommender to define details specific to
   * security impact.
   * </pre>
   *
   * <code>.google.protobuf.Struct details = 2;</code>
   *
   * @return The details.
   */
  @java.lang.Override
  public com.google.protobuf.Struct getDetails() {
    return details_ == null ? com.google.protobuf.Struct.getDefaultInstance() : details_;
  }
  /**
   *
   *
   * <pre>
   * This field can be used by the recommender to define details specific to
   * security impact.
   * </pre>
   *
   * <code>.google.protobuf.Struct details = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.StructOrBuilder getDetailsOrBuilder() {
    return details_ == null ? com.google.protobuf.Struct.getDefaultInstance() : details_;
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
    if (details_ != null) {
      output.writeMessage(2, getDetails());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (details_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getDetails());
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
    if (!(obj instanceof com.google.cloud.recommender.v1beta1.SecurityProjection)) {
      return super.equals(obj);
    }
    com.google.cloud.recommender.v1beta1.SecurityProjection other =
        (com.google.cloud.recommender.v1beta1.SecurityProjection) obj;

    if (hasDetails() != other.hasDetails()) return false;
    if (hasDetails()) {
      if (!getDetails().equals(other.getDetails())) return false;
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
    if (hasDetails()) {
      hash = (37 * hash) + DETAILS_FIELD_NUMBER;
      hash = (53 * hash) + getDetails().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.recommender.v1beta1.SecurityProjection parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.SecurityProjection parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.SecurityProjection parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.SecurityProjection parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.SecurityProjection parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.recommender.v1beta1.SecurityProjection parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.SecurityProjection parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.SecurityProjection parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.SecurityProjection parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.SecurityProjection parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.recommender.v1beta1.SecurityProjection parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.recommender.v1beta1.SecurityProjection parseFrom(
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
      com.google.cloud.recommender.v1beta1.SecurityProjection prototype) {
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
   * Contains various ways of describing the impact on Security.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recommender.v1beta1.SecurityProjection}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recommender.v1beta1.SecurityProjection)
      com.google.cloud.recommender.v1beta1.SecurityProjectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.recommender.v1beta1.RecommendationOuterClass
          .internal_static_google_cloud_recommender_v1beta1_SecurityProjection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.recommender.v1beta1.RecommendationOuterClass
          .internal_static_google_cloud_recommender_v1beta1_SecurityProjection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.recommender.v1beta1.SecurityProjection.class,
              com.google.cloud.recommender.v1beta1.SecurityProjection.Builder.class);
    }

    // Construct using com.google.cloud.recommender.v1beta1.SecurityProjection.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      details_ = null;
      if (detailsBuilder_ != null) {
        detailsBuilder_.dispose();
        detailsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.recommender.v1beta1.RecommendationOuterClass
          .internal_static_google_cloud_recommender_v1beta1_SecurityProjection_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.SecurityProjection getDefaultInstanceForType() {
      return com.google.cloud.recommender.v1beta1.SecurityProjection.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.SecurityProjection build() {
      com.google.cloud.recommender.v1beta1.SecurityProjection result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.recommender.v1beta1.SecurityProjection buildPartial() {
      com.google.cloud.recommender.v1beta1.SecurityProjection result =
          new com.google.cloud.recommender.v1beta1.SecurityProjection(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.recommender.v1beta1.SecurityProjection result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.details_ = detailsBuilder_ == null ? details_ : detailsBuilder_.build();
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
      if (other instanceof com.google.cloud.recommender.v1beta1.SecurityProjection) {
        return mergeFrom((com.google.cloud.recommender.v1beta1.SecurityProjection) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.recommender.v1beta1.SecurityProjection other) {
      if (other == com.google.cloud.recommender.v1beta1.SecurityProjection.getDefaultInstance())
        return this;
      if (other.hasDetails()) {
        mergeDetails(other.getDetails());
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
            case 18:
              {
                input.readMessage(getDetailsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
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

    private com.google.protobuf.Struct details_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        detailsBuilder_;
    /**
     *
     *
     * <pre>
     * This field can be used by the recommender to define details specific to
     * security impact.
     * </pre>
     *
     * <code>.google.protobuf.Struct details = 2;</code>
     *
     * @return Whether the details field is set.
     */
    public boolean hasDetails() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * This field can be used by the recommender to define details specific to
     * security impact.
     * </pre>
     *
     * <code>.google.protobuf.Struct details = 2;</code>
     *
     * @return The details.
     */
    public com.google.protobuf.Struct getDetails() {
      if (detailsBuilder_ == null) {
        return details_ == null ? com.google.protobuf.Struct.getDefaultInstance() : details_;
      } else {
        return detailsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * This field can be used by the recommender to define details specific to
     * security impact.
     * </pre>
     *
     * <code>.google.protobuf.Struct details = 2;</code>
     */
    public Builder setDetails(com.google.protobuf.Struct value) {
      if (detailsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        details_ = value;
      } else {
        detailsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * This field can be used by the recommender to define details specific to
     * security impact.
     * </pre>
     *
     * <code>.google.protobuf.Struct details = 2;</code>
     */
    public Builder setDetails(com.google.protobuf.Struct.Builder builderForValue) {
      if (detailsBuilder_ == null) {
        details_ = builderForValue.build();
      } else {
        detailsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * This field can be used by the recommender to define details specific to
     * security impact.
     * </pre>
     *
     * <code>.google.protobuf.Struct details = 2;</code>
     */
    public Builder mergeDetails(com.google.protobuf.Struct value) {
      if (detailsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && details_ != null
            && details_ != com.google.protobuf.Struct.getDefaultInstance()) {
          getDetailsBuilder().mergeFrom(value);
        } else {
          details_ = value;
        }
      } else {
        detailsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * This field can be used by the recommender to define details specific to
     * security impact.
     * </pre>
     *
     * <code>.google.protobuf.Struct details = 2;</code>
     */
    public Builder clearDetails() {
      bitField0_ = (bitField0_ & ~0x00000001);
      details_ = null;
      if (detailsBuilder_ != null) {
        detailsBuilder_.dispose();
        detailsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * This field can be used by the recommender to define details specific to
     * security impact.
     * </pre>
     *
     * <code>.google.protobuf.Struct details = 2;</code>
     */
    public com.google.protobuf.Struct.Builder getDetailsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDetailsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * This field can be used by the recommender to define details specific to
     * security impact.
     * </pre>
     *
     * <code>.google.protobuf.Struct details = 2;</code>
     */
    public com.google.protobuf.StructOrBuilder getDetailsOrBuilder() {
      if (detailsBuilder_ != null) {
        return detailsBuilder_.getMessageOrBuilder();
      } else {
        return details_ == null ? com.google.protobuf.Struct.getDefaultInstance() : details_;
      }
    }
    /**
     *
     *
     * <pre>
     * This field can be used by the recommender to define details specific to
     * security impact.
     * </pre>
     *
     * <code>.google.protobuf.Struct details = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Struct,
            com.google.protobuf.Struct.Builder,
            com.google.protobuf.StructOrBuilder>
        getDetailsFieldBuilder() {
      if (detailsBuilder_ == null) {
        detailsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Struct,
                com.google.protobuf.Struct.Builder,
                com.google.protobuf.StructOrBuilder>(
                getDetails(), getParentForChildren(), isClean());
        details_ = null;
      }
      return detailsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recommender.v1beta1.SecurityProjection)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recommender.v1beta1.SecurityProjection)
  private static final com.google.cloud.recommender.v1beta1.SecurityProjection DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.recommender.v1beta1.SecurityProjection();
  }

  public static com.google.cloud.recommender.v1beta1.SecurityProjection getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecurityProjection> PARSER =
      new com.google.protobuf.AbstractParser<SecurityProjection>() {
        @java.lang.Override
        public SecurityProjection parsePartialFrom(
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

  public static com.google.protobuf.Parser<SecurityProjection> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecurityProjection> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.recommender.v1beta1.SecurityProjection getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
