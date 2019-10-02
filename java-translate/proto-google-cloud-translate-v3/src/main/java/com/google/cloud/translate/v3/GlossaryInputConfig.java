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
 * Input configuration for glossaries.
 * </pre>
 *
 * Protobuf type {@code google.cloud.translation.v3.GlossaryInputConfig}
 */
public final class GlossaryInputConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.translation.v3.GlossaryInputConfig)
    GlossaryInputConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GlossaryInputConfig.newBuilder() to construct.
  private GlossaryInputConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GlossaryInputConfig() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private GlossaryInputConfig(
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
              com.google.cloud.translate.v3.GcsSource.Builder subBuilder = null;
              if (sourceCase_ == 1) {
                subBuilder = ((com.google.cloud.translate.v3.GcsSource) source_).toBuilder();
              }
              source_ =
                  input.readMessage(
                      com.google.cloud.translate.v3.GcsSource.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((com.google.cloud.translate.v3.GcsSource) source_);
                source_ = subBuilder.buildPartial();
              }
              sourceCase_ = 1;
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
        .internal_static_google_cloud_translation_v3_GlossaryInputConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.translate.v3.TranslationServiceProto
        .internal_static_google_cloud_translation_v3_GlossaryInputConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.translate.v3.GlossaryInputConfig.class,
            com.google.cloud.translate.v3.GlossaryInputConfig.Builder.class);
  }

  private int sourceCase_ = 0;
  private java.lang.Object source_;

  public enum SourceCase implements com.google.protobuf.Internal.EnumLite {
    GCS_SOURCE(1),
    SOURCE_NOT_SET(0);
    private final int value;

    private SourceCase(int value) {
      this.value = value;
    }
    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static SourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceCase forNumber(int value) {
      switch (value) {
        case 1:
          return GCS_SOURCE;
        case 0:
          return SOURCE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public SourceCase getSourceCase() {
    return SourceCase.forNumber(sourceCase_);
  }

  public static final int GCS_SOURCE_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage location of glossary data.
   * File format is determined based on the filename extension. API returns
   * [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file
   * formats. Wildcards are not allowed. This must be a single file in one of
   * the following formats:
   * For unidirectional glossaries:
   * - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated.
   *   The first column is source text. The second column is target text.
   *   The file must not contain headers. That is, the first row is data, not
   *   column names.
   * - TMX (`.tmx`): TMX file with parallel data defining source/target term
   * pairs.
   * For equivalent term sets glossaries:
   * - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms
   *   in multiple languages. The format is defined for Google Translation
   *   Toolkit and documented in [Use a
   *   glossary](https://support.google.com/translatortoolkit/answer/6306379?hl=en).
   * </pre>
   *
   * <code>.google.cloud.translation.v3.GcsSource gcs_source = 1;</code>
   */
  public boolean hasGcsSource() {
    return sourceCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage location of glossary data.
   * File format is determined based on the filename extension. API returns
   * [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file
   * formats. Wildcards are not allowed. This must be a single file in one of
   * the following formats:
   * For unidirectional glossaries:
   * - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated.
   *   The first column is source text. The second column is target text.
   *   The file must not contain headers. That is, the first row is data, not
   *   column names.
   * - TMX (`.tmx`): TMX file with parallel data defining source/target term
   * pairs.
   * For equivalent term sets glossaries:
   * - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms
   *   in multiple languages. The format is defined for Google Translation
   *   Toolkit and documented in [Use a
   *   glossary](https://support.google.com/translatortoolkit/answer/6306379?hl=en).
   * </pre>
   *
   * <code>.google.cloud.translation.v3.GcsSource gcs_source = 1;</code>
   */
  public com.google.cloud.translate.v3.GcsSource getGcsSource() {
    if (sourceCase_ == 1) {
      return (com.google.cloud.translate.v3.GcsSource) source_;
    }
    return com.google.cloud.translate.v3.GcsSource.getDefaultInstance();
  }
  /**
   *
   *
   * <pre>
   * Required. Google Cloud Storage location of glossary data.
   * File format is determined based on the filename extension. API returns
   * [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file
   * formats. Wildcards are not allowed. This must be a single file in one of
   * the following formats:
   * For unidirectional glossaries:
   * - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated.
   *   The first column is source text. The second column is target text.
   *   The file must not contain headers. That is, the first row is data, not
   *   column names.
   * - TMX (`.tmx`): TMX file with parallel data defining source/target term
   * pairs.
   * For equivalent term sets glossaries:
   * - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms
   *   in multiple languages. The format is defined for Google Translation
   *   Toolkit and documented in [Use a
   *   glossary](https://support.google.com/translatortoolkit/answer/6306379?hl=en).
   * </pre>
   *
   * <code>.google.cloud.translation.v3.GcsSource gcs_source = 1;</code>
   */
  public com.google.cloud.translate.v3.GcsSourceOrBuilder getGcsSourceOrBuilder() {
    if (sourceCase_ == 1) {
      return (com.google.cloud.translate.v3.GcsSource) source_;
    }
    return com.google.cloud.translate.v3.GcsSource.getDefaultInstance();
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
    if (sourceCase_ == 1) {
      output.writeMessage(1, (com.google.cloud.translate.v3.GcsSource) source_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.cloud.translate.v3.GcsSource) source_);
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
    if (!(obj instanceof com.google.cloud.translate.v3.GlossaryInputConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.translate.v3.GlossaryInputConfig other =
        (com.google.cloud.translate.v3.GlossaryInputConfig) obj;

    if (!getSourceCase().equals(other.getSourceCase())) return false;
    switch (sourceCase_) {
      case 1:
        if (!getGcsSource().equals(other.getGcsSource())) return false;
        break;
      case 0:
      default:
    }
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
    switch (sourceCase_) {
      case 1:
        hash = (37 * hash) + GCS_SOURCE_FIELD_NUMBER;
        hash = (53 * hash) + getGcsSource().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.translate.v3.GlossaryInputConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3.GlossaryInputConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.GlossaryInputConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3.GlossaryInputConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.GlossaryInputConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.translate.v3.GlossaryInputConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.GlossaryInputConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3.GlossaryInputConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.GlossaryInputConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3.GlossaryInputConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.translate.v3.GlossaryInputConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.translate.v3.GlossaryInputConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.translate.v3.GlossaryInputConfig prototype) {
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
   * Input configuration for glossaries.
   * </pre>
   *
   * Protobuf type {@code google.cloud.translation.v3.GlossaryInputConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.translation.v3.GlossaryInputConfig)
      com.google.cloud.translate.v3.GlossaryInputConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.translate.v3.TranslationServiceProto
          .internal_static_google_cloud_translation_v3_GlossaryInputConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.translate.v3.TranslationServiceProto
          .internal_static_google_cloud_translation_v3_GlossaryInputConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.translate.v3.GlossaryInputConfig.class,
              com.google.cloud.translate.v3.GlossaryInputConfig.Builder.class);
    }

    // Construct using com.google.cloud.translate.v3.GlossaryInputConfig.newBuilder()
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
      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.translate.v3.TranslationServiceProto
          .internal_static_google_cloud_translation_v3_GlossaryInputConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.GlossaryInputConfig getDefaultInstanceForType() {
      return com.google.cloud.translate.v3.GlossaryInputConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.GlossaryInputConfig build() {
      com.google.cloud.translate.v3.GlossaryInputConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.translate.v3.GlossaryInputConfig buildPartial() {
      com.google.cloud.translate.v3.GlossaryInputConfig result =
          new com.google.cloud.translate.v3.GlossaryInputConfig(this);
      if (sourceCase_ == 1) {
        if (gcsSourceBuilder_ == null) {
          result.source_ = source_;
        } else {
          result.source_ = gcsSourceBuilder_.build();
        }
      }
      result.sourceCase_ = sourceCase_;
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
      if (other instanceof com.google.cloud.translate.v3.GlossaryInputConfig) {
        return mergeFrom((com.google.cloud.translate.v3.GlossaryInputConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.translate.v3.GlossaryInputConfig other) {
      if (other == com.google.cloud.translate.v3.GlossaryInputConfig.getDefaultInstance())
        return this;
      switch (other.getSourceCase()) {
        case GCS_SOURCE:
          {
            mergeGcsSource(other.getGcsSource());
            break;
          }
        case SOURCE_NOT_SET:
          {
            break;
          }
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
      com.google.cloud.translate.v3.GlossaryInputConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.translate.v3.GlossaryInputConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int sourceCase_ = 0;
    private java.lang.Object source_;

    public SourceCase getSourceCase() {
      return SourceCase.forNumber(sourceCase_);
    }

    public Builder clearSource() {
      sourceCase_ = 0;
      source_ = null;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.translate.v3.GcsSource,
            com.google.cloud.translate.v3.GcsSource.Builder,
            com.google.cloud.translate.v3.GcsSourceOrBuilder>
        gcsSourceBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Google Cloud Storage location of glossary data.
     * File format is determined based on the filename extension. API returns
     * [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file
     * formats. Wildcards are not allowed. This must be a single file in one of
     * the following formats:
     * For unidirectional glossaries:
     * - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated.
     *   The first column is source text. The second column is target text.
     *   The file must not contain headers. That is, the first row is data, not
     *   column names.
     * - TMX (`.tmx`): TMX file with parallel data defining source/target term
     * pairs.
     * For equivalent term sets glossaries:
     * - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms
     *   in multiple languages. The format is defined for Google Translation
     *   Toolkit and documented in [Use a
     *   glossary](https://support.google.com/translatortoolkit/answer/6306379?hl=en).
     * </pre>
     *
     * <code>.google.cloud.translation.v3.GcsSource gcs_source = 1;</code>
     */
    public boolean hasGcsSource() {
      return sourceCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * Required. Google Cloud Storage location of glossary data.
     * File format is determined based on the filename extension. API returns
     * [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file
     * formats. Wildcards are not allowed. This must be a single file in one of
     * the following formats:
     * For unidirectional glossaries:
     * - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated.
     *   The first column is source text. The second column is target text.
     *   The file must not contain headers. That is, the first row is data, not
     *   column names.
     * - TMX (`.tmx`): TMX file with parallel data defining source/target term
     * pairs.
     * For equivalent term sets glossaries:
     * - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms
     *   in multiple languages. The format is defined for Google Translation
     *   Toolkit and documented in [Use a
     *   glossary](https://support.google.com/translatortoolkit/answer/6306379?hl=en).
     * </pre>
     *
     * <code>.google.cloud.translation.v3.GcsSource gcs_source = 1;</code>
     */
    public com.google.cloud.translate.v3.GcsSource getGcsSource() {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 1) {
          return (com.google.cloud.translate.v3.GcsSource) source_;
        }
        return com.google.cloud.translate.v3.GcsSource.getDefaultInstance();
      } else {
        if (sourceCase_ == 1) {
          return gcsSourceBuilder_.getMessage();
        }
        return com.google.cloud.translate.v3.GcsSource.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Google Cloud Storage location of glossary data.
     * File format is determined based on the filename extension. API returns
     * [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file
     * formats. Wildcards are not allowed. This must be a single file in one of
     * the following formats:
     * For unidirectional glossaries:
     * - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated.
     *   The first column is source text. The second column is target text.
     *   The file must not contain headers. That is, the first row is data, not
     *   column names.
     * - TMX (`.tmx`): TMX file with parallel data defining source/target term
     * pairs.
     * For equivalent term sets glossaries:
     * - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms
     *   in multiple languages. The format is defined for Google Translation
     *   Toolkit and documented in [Use a
     *   glossary](https://support.google.com/translatortoolkit/answer/6306379?hl=en).
     * </pre>
     *
     * <code>.google.cloud.translation.v3.GcsSource gcs_source = 1;</code>
     */
    public Builder setGcsSource(com.google.cloud.translate.v3.GcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        source_ = value;
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(value);
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Google Cloud Storage location of glossary data.
     * File format is determined based on the filename extension. API returns
     * [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file
     * formats. Wildcards are not allowed. This must be a single file in one of
     * the following formats:
     * For unidirectional glossaries:
     * - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated.
     *   The first column is source text. The second column is target text.
     *   The file must not contain headers. That is, the first row is data, not
     *   column names.
     * - TMX (`.tmx`): TMX file with parallel data defining source/target term
     * pairs.
     * For equivalent term sets glossaries:
     * - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms
     *   in multiple languages. The format is defined for Google Translation
     *   Toolkit and documented in [Use a
     *   glossary](https://support.google.com/translatortoolkit/answer/6306379?hl=en).
     * </pre>
     *
     * <code>.google.cloud.translation.v3.GcsSource gcs_source = 1;</code>
     */
    public Builder setGcsSource(com.google.cloud.translate.v3.GcsSource.Builder builderForValue) {
      if (gcsSourceBuilder_ == null) {
        source_ = builderForValue.build();
        onChanged();
      } else {
        gcsSourceBuilder_.setMessage(builderForValue.build());
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Google Cloud Storage location of glossary data.
     * File format is determined based on the filename extension. API returns
     * [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file
     * formats. Wildcards are not allowed. This must be a single file in one of
     * the following formats:
     * For unidirectional glossaries:
     * - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated.
     *   The first column is source text. The second column is target text.
     *   The file must not contain headers. That is, the first row is data, not
     *   column names.
     * - TMX (`.tmx`): TMX file with parallel data defining source/target term
     * pairs.
     * For equivalent term sets glossaries:
     * - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms
     *   in multiple languages. The format is defined for Google Translation
     *   Toolkit and documented in [Use a
     *   glossary](https://support.google.com/translatortoolkit/answer/6306379?hl=en).
     * </pre>
     *
     * <code>.google.cloud.translation.v3.GcsSource gcs_source = 1;</code>
     */
    public Builder mergeGcsSource(com.google.cloud.translate.v3.GcsSource value) {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 1
            && source_ != com.google.cloud.translate.v3.GcsSource.getDefaultInstance()) {
          source_ =
              com.google.cloud.translate.v3.GcsSource.newBuilder(
                      (com.google.cloud.translate.v3.GcsSource) source_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          source_ = value;
        }
        onChanged();
      } else {
        if (sourceCase_ == 1) {
          gcsSourceBuilder_.mergeFrom(value);
        }
        gcsSourceBuilder_.setMessage(value);
      }
      sourceCase_ = 1;
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Google Cloud Storage location of glossary data.
     * File format is determined based on the filename extension. API returns
     * [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file
     * formats. Wildcards are not allowed. This must be a single file in one of
     * the following formats:
     * For unidirectional glossaries:
     * - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated.
     *   The first column is source text. The second column is target text.
     *   The file must not contain headers. That is, the first row is data, not
     *   column names.
     * - TMX (`.tmx`): TMX file with parallel data defining source/target term
     * pairs.
     * For equivalent term sets glossaries:
     * - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms
     *   in multiple languages. The format is defined for Google Translation
     *   Toolkit and documented in [Use a
     *   glossary](https://support.google.com/translatortoolkit/answer/6306379?hl=en).
     * </pre>
     *
     * <code>.google.cloud.translation.v3.GcsSource gcs_source = 1;</code>
     */
    public Builder clearGcsSource() {
      if (gcsSourceBuilder_ == null) {
        if (sourceCase_ == 1) {
          sourceCase_ = 0;
          source_ = null;
          onChanged();
        }
      } else {
        if (sourceCase_ == 1) {
          sourceCase_ = 0;
          source_ = null;
        }
        gcsSourceBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Google Cloud Storage location of glossary data.
     * File format is determined based on the filename extension. API returns
     * [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file
     * formats. Wildcards are not allowed. This must be a single file in one of
     * the following formats:
     * For unidirectional glossaries:
     * - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated.
     *   The first column is source text. The second column is target text.
     *   The file must not contain headers. That is, the first row is data, not
     *   column names.
     * - TMX (`.tmx`): TMX file with parallel data defining source/target term
     * pairs.
     * For equivalent term sets glossaries:
     * - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms
     *   in multiple languages. The format is defined for Google Translation
     *   Toolkit and documented in [Use a
     *   glossary](https://support.google.com/translatortoolkit/answer/6306379?hl=en).
     * </pre>
     *
     * <code>.google.cloud.translation.v3.GcsSource gcs_source = 1;</code>
     */
    public com.google.cloud.translate.v3.GcsSource.Builder getGcsSourceBuilder() {
      return getGcsSourceFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Google Cloud Storage location of glossary data.
     * File format is determined based on the filename extension. API returns
     * [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file
     * formats. Wildcards are not allowed. This must be a single file in one of
     * the following formats:
     * For unidirectional glossaries:
     * - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated.
     *   The first column is source text. The second column is target text.
     *   The file must not contain headers. That is, the first row is data, not
     *   column names.
     * - TMX (`.tmx`): TMX file with parallel data defining source/target term
     * pairs.
     * For equivalent term sets glossaries:
     * - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms
     *   in multiple languages. The format is defined for Google Translation
     *   Toolkit and documented in [Use a
     *   glossary](https://support.google.com/translatortoolkit/answer/6306379?hl=en).
     * </pre>
     *
     * <code>.google.cloud.translation.v3.GcsSource gcs_source = 1;</code>
     */
    public com.google.cloud.translate.v3.GcsSourceOrBuilder getGcsSourceOrBuilder() {
      if ((sourceCase_ == 1) && (gcsSourceBuilder_ != null)) {
        return gcsSourceBuilder_.getMessageOrBuilder();
      } else {
        if (sourceCase_ == 1) {
          return (com.google.cloud.translate.v3.GcsSource) source_;
        }
        return com.google.cloud.translate.v3.GcsSource.getDefaultInstance();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Google Cloud Storage location of glossary data.
     * File format is determined based on the filename extension. API returns
     * [google.rpc.Code.INVALID_ARGUMENT] for unsupported URI-s and file
     * formats. Wildcards are not allowed. This must be a single file in one of
     * the following formats:
     * For unidirectional glossaries:
     * - TSV/CSV (`.tsv`/`.csv`): 2 column file, tab- or comma-separated.
     *   The first column is source text. The second column is target text.
     *   The file must not contain headers. That is, the first row is data, not
     *   column names.
     * - TMX (`.tmx`): TMX file with parallel data defining source/target term
     * pairs.
     * For equivalent term sets glossaries:
     * - CSV (`.csv`): Multi-column CSV file defining equivalent glossary terms
     *   in multiple languages. The format is defined for Google Translation
     *   Toolkit and documented in [Use a
     *   glossary](https://support.google.com/translatortoolkit/answer/6306379?hl=en).
     * </pre>
     *
     * <code>.google.cloud.translation.v3.GcsSource gcs_source = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.translate.v3.GcsSource,
            com.google.cloud.translate.v3.GcsSource.Builder,
            com.google.cloud.translate.v3.GcsSourceOrBuilder>
        getGcsSourceFieldBuilder() {
      if (gcsSourceBuilder_ == null) {
        if (!(sourceCase_ == 1)) {
          source_ = com.google.cloud.translate.v3.GcsSource.getDefaultInstance();
        }
        gcsSourceBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.translate.v3.GcsSource,
                com.google.cloud.translate.v3.GcsSource.Builder,
                com.google.cloud.translate.v3.GcsSourceOrBuilder>(
                (com.google.cloud.translate.v3.GcsSource) source_,
                getParentForChildren(),
                isClean());
        source_ = null;
      }
      sourceCase_ = 1;
      onChanged();
      ;
      return gcsSourceBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.translation.v3.GlossaryInputConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.translation.v3.GlossaryInputConfig)
  private static final com.google.cloud.translate.v3.GlossaryInputConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.translate.v3.GlossaryInputConfig();
  }

  public static com.google.cloud.translate.v3.GlossaryInputConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GlossaryInputConfig> PARSER =
      new com.google.protobuf.AbstractParser<GlossaryInputConfig>() {
        @java.lang.Override
        public GlossaryInputConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new GlossaryInputConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<GlossaryInputConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GlossaryInputConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.translate.v3.GlossaryInputConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
