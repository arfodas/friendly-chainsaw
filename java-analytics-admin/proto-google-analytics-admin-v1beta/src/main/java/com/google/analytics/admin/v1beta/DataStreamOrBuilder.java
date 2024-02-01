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

public interface DataStreamOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1beta.DataStream)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Data specific to web streams. Must be populated if type is
   * WEB_DATA_STREAM.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.DataStream.WebStreamData web_stream_data = 6;</code>
   *
   * @return Whether the webStreamData field is set.
   */
  boolean hasWebStreamData();
  /**
   *
   *
   * <pre>
   * Data specific to web streams. Must be populated if type is
   * WEB_DATA_STREAM.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.DataStream.WebStreamData web_stream_data = 6;</code>
   *
   * @return The webStreamData.
   */
  com.google.analytics.admin.v1beta.DataStream.WebStreamData getWebStreamData();
  /**
   *
   *
   * <pre>
   * Data specific to web streams. Must be populated if type is
   * WEB_DATA_STREAM.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.DataStream.WebStreamData web_stream_data = 6;</code>
   */
  com.google.analytics.admin.v1beta.DataStream.WebStreamDataOrBuilder getWebStreamDataOrBuilder();

  /**
   *
   *
   * <pre>
   * Data specific to Android app streams. Must be populated if type is
   * ANDROID_APP_DATA_STREAM.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.DataStream.AndroidAppStreamData android_app_stream_data = 7;
   * </code>
   *
   * @return Whether the androidAppStreamData field is set.
   */
  boolean hasAndroidAppStreamData();
  /**
   *
   *
   * <pre>
   * Data specific to Android app streams. Must be populated if type is
   * ANDROID_APP_DATA_STREAM.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.DataStream.AndroidAppStreamData android_app_stream_data = 7;
   * </code>
   *
   * @return The androidAppStreamData.
   */
  com.google.analytics.admin.v1beta.DataStream.AndroidAppStreamData getAndroidAppStreamData();
  /**
   *
   *
   * <pre>
   * Data specific to Android app streams. Must be populated if type is
   * ANDROID_APP_DATA_STREAM.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.DataStream.AndroidAppStreamData android_app_stream_data = 7;
   * </code>
   */
  com.google.analytics.admin.v1beta.DataStream.AndroidAppStreamDataOrBuilder
      getAndroidAppStreamDataOrBuilder();

  /**
   *
   *
   * <pre>
   * Data specific to iOS app streams. Must be populated if type is
   * IOS_APP_DATA_STREAM.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.DataStream.IosAppStreamData ios_app_stream_data = 8;
   * </code>
   *
   * @return Whether the iosAppStreamData field is set.
   */
  boolean hasIosAppStreamData();
  /**
   *
   *
   * <pre>
   * Data specific to iOS app streams. Must be populated if type is
   * IOS_APP_DATA_STREAM.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.DataStream.IosAppStreamData ios_app_stream_data = 8;
   * </code>
   *
   * @return The iosAppStreamData.
   */
  com.google.analytics.admin.v1beta.DataStream.IosAppStreamData getIosAppStreamData();
  /**
   *
   *
   * <pre>
   * Data specific to iOS app streams. Must be populated if type is
   * IOS_APP_DATA_STREAM.
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.DataStream.IosAppStreamData ios_app_stream_data = 8;
   * </code>
   */
  com.google.analytics.admin.v1beta.DataStream.IosAppStreamDataOrBuilder
      getIosAppStreamDataOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Resource name of this Data Stream.
   * Format: properties/{property_id}/dataStreams/{stream_id}
   * Example: "properties/1000/dataStreams/2000"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Resource name of this Data Stream.
   * Format: properties/{property_id}/dataStreams/{stream_id}
   * Example: "properties/1000/dataStreams/2000"
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The type of this DataStream resource.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.DataStream.DataStreamType type = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The type of this DataStream resource.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.DataStream.DataStreamType type = 2 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The type.
   */
  com.google.analytics.admin.v1beta.DataStream.DataStreamType getType();

  /**
   *
   *
   * <pre>
   * Human-readable display name for the Data Stream.
   *
   * Required for web data streams.
   *
   * The max allowed display name length is 255 UTF-16 code units.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Human-readable display name for the Data Stream.
   *
   * Required for web data streams.
   *
   * The max allowed display name length is 255 UTF-16 code units.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Time when this stream was originally created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this stream was originally created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when this stream was originally created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when stream payload fields were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when stream payload fields were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when stream payload fields were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  com.google.analytics.admin.v1beta.DataStream.StreamDataCase getStreamDataCase();
}
