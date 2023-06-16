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
// source: google/cloud/rapidmigrationassessment/v1/rapidmigrationassessment.proto

package com.google.cloud.rapidmigrationassessment.v1;

public interface CreateAnnotationRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.rapidmigrationassessment.v1.CreateAnnotationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the parent (project+location).
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Name of the parent (project+location).
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The resource being created.
   * </pre>
   *
   * <code>
   * .google.cloud.rapidmigrationassessment.v1.Annotation annotation = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the annotation field is set.
   */
  boolean hasAnnotation();
  /**
   *
   *
   * <pre>
   * Required. The resource being created.
   * </pre>
   *
   * <code>
   * .google.cloud.rapidmigrationassessment.v1.Annotation annotation = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The annotation.
   */
  com.google.cloud.rapidmigrationassessment.v1.Annotation getAnnotation();
  /**
   *
   *
   * <pre>
   * Required. The resource being created.
   * </pre>
   *
   * <code>
   * .google.cloud.rapidmigrationassessment.v1.Annotation annotation = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.rapidmigrationassessment.v1.AnnotationOrBuilder getAnnotationOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. An optional request ID to identify requests.
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. An optional request ID to identify requests.
   * </pre>
   *
   * <code>string request_id = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
