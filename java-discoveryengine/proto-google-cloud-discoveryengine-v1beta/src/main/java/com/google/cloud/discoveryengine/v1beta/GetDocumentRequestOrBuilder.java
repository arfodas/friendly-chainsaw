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
// source: google/cloud/discoveryengine/v1beta/document_service.proto

package com.google.cloud.discoveryengine.v1beta;

public interface GetDocumentRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.GetDocumentRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Full resource name of
   * [Document][google.cloud.discoveryengine.v1beta.Document], such as
   * `projects/{project}/locations/{location}/dataStores/{data_store}/branches/{branch}/documents/{document}`.
   * If the caller does not have permission to access the
   * [Document][google.cloud.discoveryengine.v1beta.Document], regardless of
   * whether or not it exists, a PERMISSION_DENIED error is returned.
   * If the requested [Document][google.cloud.discoveryengine.v1beta.Document]
   * does not exist, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Full resource name of
   * [Document][google.cloud.discoveryengine.v1beta.Document], such as
   * `projects/{project}/locations/{location}/dataStores/{data_store}/branches/{branch}/documents/{document}`.
   * If the caller does not have permission to access the
   * [Document][google.cloud.discoveryengine.v1beta.Document], regardless of
   * whether or not it exists, a PERMISSION_DENIED error is returned.
   * If the requested [Document][google.cloud.discoveryengine.v1beta.Document]
   * does not exist, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
