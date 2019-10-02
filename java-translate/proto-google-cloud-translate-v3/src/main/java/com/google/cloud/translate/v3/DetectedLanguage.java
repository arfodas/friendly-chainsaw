/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/translate/v3/translation_service.proto

package com.google.cloud.translate.v3;

/**
 *
 *
 * <pre>
 * The response message for language detection.
 * </pre>
 *
 * Protobuf type {@code google.cloud.translation.v3.DetectedLanguage}
 */
public final class DetectedLanguage extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.translation.v3.DetectedLanguage)
    DetectedLanguageOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DetectedLanguage.newBuilder() to construct.
  private DetectedLanguage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DetectedLanguage() {
    languageCode_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DetectedLanguage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              java.lang.String s = input.readStringRequireUtf8();

              languageCode_ = s;
              break;
            }
          case 21:
            {
              confidence_ = input.readFloat();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.translate.v3.TranslationServiceProto
        .internal_static_google_cloud_translation_v3_DetectedLanguage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.translate.v3.TranslationServiceProto
        .internal_static_google_cloud_translation_v3_DetectedLanguage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.translate.v3.DetectedLanguage.class,
            com.google.cloud.translate.v3.DetectedLanguage.Builder.class);
  }

  public static final int LANGUAGE_CODE_FIELD_NUMBER = 1;
  private volatile java.lang.Object languageCode_;
  /**
   *
   *
   * <pre>
   * The BCP-47 language code of source content in the request, detected
   * automatically.
   * </pre>
   *
   * <code>string language_code = 1;</code>
   */
  public java.lang.String getLanguageCode() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      languageCode_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The BCP-47 language code of source content in the request, detected
   * automatically.
   * </pre>
   *
   * <code>string language_code = 1;</code>
   */
  public com.google.protobuf.ByteString getLanguageCodeBytes() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      languageCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONFIDENCE_FIELD_NUMBER = 2;
  private float confidence_;
  /**
   *
   *
   * <pre>
   * The confidence of the detection result for this language.
   * </pre>
   *
   * <code>float confidence = 2;</code>
   */
  public float getConfidence() {
    return confidence_;
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
    if (!getLanguageCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, languageCode_);
    }
    if (confidence_ != 0F) {
      output.writeFloat(2, confidence_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getLanguageCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, languageCode_);
    }
    if (confidence_ != 0F) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(2, confidence_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.translate.v3.DetectedLanguage)) {
      return super.equals(obj);
    }
    com.google.cloud.translate.v3.DetectedLanguage other =
        (com.google.cloud.translate.v3.DetectedLanguage) obj;

    if (!getLanguageCode().equals(other.getLanguageCode())) return false;
    if (java.lang.Float.floatToIntBits(getConfidence())
        != java.lang.Float.floatToIntBits(other.getConfidence())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LANGUAGE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguageCode().hashCode();
    hash = (37 * hash) + CONFIDENCE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getConfidence());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.translate.v3.DetectedLanguage parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3.DetectedLanguage parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.DetectedLanguage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3.DetectedLanguage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.DetectedLanguage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3.DetectedLanguage parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.DetectedLanguage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3.DetectedLanguage parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.DetectedLanguage parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3.DetectedLanguage parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.DetectedLanguage parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3.DetectedLanguage parseFrom(
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

  public static Builder newBuilder(com.google.cloud.translate.v3.DetectedLanguage prototype) {
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
   * The response message for language detection.
   * </pre>
   *
   * Protobuf type {@code google.cloud.translation.v3.DetectedLanguage}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.translation.v3.DetectedLanguage)
      com.google.cloud.translate.v3.DetectedLanguageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.translate.v3.TranslationServiceProto
          .internal_static_google_cloud_translation_v3_DetectedLanguage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.translate.v3.TranslationServiceProto
          .internal_static_google_cloud_translation_v3_DetectedLanguage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.translate.v3.DetectedLanguage.class,
              com.google.cloud.translate.v3.DetectedLanguage.Builder.class);
    }

    // Construct using com.google.cloud.translate.v3.DetectedLanguage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      languageCode_ = "";

      confidence_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.translate.v3.TranslationServiceProto
          .internal_static_google_cloud_translation_v3_DetectedLanguage_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.DetectedLanguage getDefaultInstanceForType() {
      return com.google.cloud.translate.v3.DetectedLanguage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.DetectedLanguage build() {
      com.google.cloud.translate.v3.DetectedLanguage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.DetectedLanguage buildPartial() {
      com.google.cloud.translate.v3.DetectedLanguage result =
          new com.google.cloud.translate.v3.DetectedLanguage(this);
      result.languageCode_ = languageCode_;
      result.confidence_ = confidence_;
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
      if (other instanceof com.google.cloud.translate.v3.DetectedLanguage) {
        return mergeFrom((com.google.cloud.translate.v3.DetectedLanguage) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.translate.v3.DetectedLanguage other) {
      if (other == com.google.cloud.translate.v3.DetectedLanguage.getDefaultInstance()) return this;
      if (!other.getLanguageCode().isEmpty()) {
        languageCode_ = other.languageCode_;
        onChanged();
      }
      if (other.getConfidence() != 0F) {
        setConfidence(other.getConfidence());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.translate.v3.DetectedLanguage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.translate.v3.DetectedLanguage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object languageCode_ = "";
    /**
     *
     *
     * <pre>
     * The BCP-47 language code of source content in the request, detected
     * automatically.
     * </pre>
     *
     * <code>string language_code = 1;</code>
     */
    public java.lang.String getLanguageCode() {
      java.lang.Object ref = languageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        languageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The BCP-47 language code of source content in the request, detected
     * automatically.
     * </pre>
     *
     * <code>string language_code = 1;</code>
     */
    public com.google.protobuf.ByteString getLanguageCodeBytes() {
      java.lang.Object ref = languageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        languageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The BCP-47 language code of source content in the request, detected
     * automatically.
     * </pre>
     *
     * <code>string language_code = 1;</code>
     */
    public Builder setLanguageCode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      languageCode_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The BCP-47 language code of source content in the request, detected
     * automatically.
     * </pre>
     *
     * <code>string language_code = 1;</code>
     */
    public Builder clearLanguageCode() {

      languageCode_ = getDefaultInstance().getLanguageCode();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The BCP-47 language code of source content in the request, detected
     * automatically.
     * </pre>
     *
     * <code>string language_code = 1;</code>
     */
    public Builder setLanguageCodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      languageCode_ = value;
      onChanged();
      return this;
    }

    private float confidence_;
    /**
     *
     *
     * <pre>
     * The confidence of the detection result for this language.
     * </pre>
     *
     * <code>float confidence = 2;</code>
     */
    public float getConfidence() {
      return confidence_;
    }
    /**
     *
     *
     * <pre>
     * The confidence of the detection result for this language.
     * </pre>
     *
     * <code>float confidence = 2;</code>
     */
    public Builder setConfidence(float value) {

      confidence_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The confidence of the detection result for this language.
     * </pre>
     *
     * <code>float confidence = 2;</code>
     */
    public Builder clearConfidence() {

      confidence_ = 0F;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.translation.v3.DetectedLanguage)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.translation.v3.DetectedLanguage)
  private static final com.google.cloud.translate.v3.DetectedLanguage DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.translate.v3.DetectedLanguage();
  }

  public static com.google.cloud.translate.v3.DetectedLanguage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DetectedLanguage> PARSER =
      new com.google.protobuf.AbstractParser<DetectedLanguage>() {
        @java.lang.Override
        public DetectedLanguage parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DetectedLanguage(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DetectedLanguage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DetectedLanguage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.translate.v3.DetectedLanguage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
