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
// source: google/cloud/aiplatform/v1/featurestore_online_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public interface StructValueOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.StructValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of field values.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.StructFieldValue values = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.StructFieldValue> getValuesList();
  /**
   *
   *
   * <pre>
   * A list of field values.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.StructFieldValue values = 1;</code>
   */
  com.google.cloud.aiplatform.v1.StructFieldValue getValues(int index);
  /**
   *
   *
   * <pre>
   * A list of field values.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.StructFieldValue values = 1;</code>
   */
  int getValuesCount();
  /**
   *
   *
   * <pre>
   * A list of field values.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.StructFieldValue values = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.StructFieldValueOrBuilder>
      getValuesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of field values.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.StructFieldValue values = 1;</code>
   */
  com.google.cloud.aiplatform.v1.StructFieldValueOrBuilder getValuesOrBuilder(int index);
}
