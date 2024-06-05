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
// source: google/cloud/discoveryengine/v1beta/document_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1beta;

public interface CreateDocumentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.CreateDocumentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource name, such as
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/branches/{branch}`.
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
   * Required. The parent resource name, such as
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/branches/{branch}`.
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
   * Required. The [Document][google.cloud.discoveryengine.v1beta.Document] to
   * create.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.Document document = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the document field is set.
   */
  boolean hasDocument();
  /**
   *
   *
   * <pre>
   * Required. The [Document][google.cloud.discoveryengine.v1beta.Document] to
   * create.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.Document document = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The document.
   */
  com.google.cloud.discoveryengine.v1beta.Document getDocument();
  /**
   *
   *
   * <pre>
   * Required. The [Document][google.cloud.discoveryengine.v1beta.Document] to
   * create.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.Document document = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.DocumentOrBuilder getDocumentOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the
   * [Document][google.cloud.discoveryengine.v1beta.Document], which becomes the
   * final component of the
   * [Document.name][google.cloud.discoveryengine.v1beta.Document.name].
   *
   * If the caller does not have permission to create the
   * [Document][google.cloud.discoveryengine.v1beta.Document], regardless of
   * whether or not it exists, a `PERMISSION_DENIED` error is returned.
   *
   * This field must be unique among all
   * [Document][google.cloud.discoveryengine.v1beta.Document]s with the same
   * [parent][google.cloud.discoveryengine.v1beta.CreateDocumentRequest.parent].
   * Otherwise, an `ALREADY_EXISTS` error is returned.
   *
   * This field must conform to [RFC-1034](https://tools.ietf.org/html/rfc1034)
   * standard with a length limit of 63 characters. Otherwise, an
   * `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>string document_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The documentId.
   */
  java.lang.String getDocumentId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the
   * [Document][google.cloud.discoveryengine.v1beta.Document], which becomes the
   * final component of the
   * [Document.name][google.cloud.discoveryengine.v1beta.Document.name].
   *
   * If the caller does not have permission to create the
   * [Document][google.cloud.discoveryengine.v1beta.Document], regardless of
   * whether or not it exists, a `PERMISSION_DENIED` error is returned.
   *
   * This field must be unique among all
   * [Document][google.cloud.discoveryengine.v1beta.Document]s with the same
   * [parent][google.cloud.discoveryengine.v1beta.CreateDocumentRequest.parent].
   * Otherwise, an `ALREADY_EXISTS` error is returned.
   *
   * This field must conform to [RFC-1034](https://tools.ietf.org/html/rfc1034)
   * standard with a length limit of 63 characters. Otherwise, an
   * `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>string document_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for documentId.
   */
  com.google.protobuf.ByteString getDocumentIdBytes();
}
