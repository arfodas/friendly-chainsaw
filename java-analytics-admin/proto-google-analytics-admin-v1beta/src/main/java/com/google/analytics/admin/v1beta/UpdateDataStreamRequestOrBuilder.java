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
// source: google/analytics/admin/v1beta/analytics_admin.proto

// Protobuf Java Version: 3.25.2
package com.google.analytics.admin.v1beta;

public interface UpdateDataStreamRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1beta.UpdateDataStreamRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The DataStream to update
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.DataStream data_stream = 1;</code>
   *
   * @return Whether the dataStream field is set.
   */
  boolean hasDataStream();
  /**
   *
   *
   * <pre>
   * The DataStream to update
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.DataStream data_stream = 1;</code>
   *
   * @return The dataStream.
   */
  com.google.analytics.admin.v1beta.DataStream getDataStream();
  /**
   *
   *
   * <pre>
   * The DataStream to update
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.DataStream data_stream = 1;</code>
   */
  com.google.analytics.admin.v1beta.DataStreamOrBuilder getDataStreamOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The list of fields to be updated. Omitted fields will not be
   * updated. To replace the entire entity, use one path with the string "*" to
   * match all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The list of fields to be updated. Omitted fields will not be
   * updated. To replace the entire entity, use one path with the string "*" to
   * match all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The list of fields to be updated. Omitted fields will not be
   * updated. To replace the entire entity, use one path with the string "*" to
   * match all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
