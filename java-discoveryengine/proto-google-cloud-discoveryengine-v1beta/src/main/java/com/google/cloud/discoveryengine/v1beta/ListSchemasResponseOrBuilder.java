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
// source: google/cloud/discoveryengine/v1beta/schema_service.proto

package com.google.cloud.discoveryengine.v1beta;

public interface ListSchemasResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.ListSchemasResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The [Schema][google.cloud.discoveryengine.v1beta.Schema]s.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.Schema schemas = 1;</code>
   */
  java.util.List<com.google.cloud.discoveryengine.v1beta.Schema> getSchemasList();
  /**
   *
   *
   * <pre>
   * The [Schema][google.cloud.discoveryengine.v1beta.Schema]s.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.Schema schemas = 1;</code>
   */
  com.google.cloud.discoveryengine.v1beta.Schema getSchemas(int index);
  /**
   *
   *
   * <pre>
   * The [Schema][google.cloud.discoveryengine.v1beta.Schema]s.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.Schema schemas = 1;</code>
   */
  int getSchemasCount();
  /**
   *
   *
   * <pre>
   * The [Schema][google.cloud.discoveryengine.v1beta.Schema]s.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.Schema schemas = 1;</code>
   */
  java.util.List<? extends com.google.cloud.discoveryengine.v1beta.SchemaOrBuilder>
      getSchemasOrBuilderList();
  /**
   *
   *
   * <pre>
   * The [Schema][google.cloud.discoveryengine.v1beta.Schema]s.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1beta.Schema schemas = 1;</code>
   */
  com.google.cloud.discoveryengine.v1beta.SchemaOrBuilder getSchemasOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token that can be sent as
   * [ListSchemasRequest.page_token][google.cloud.discoveryengine.v1beta.ListSchemasRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token that can be sent as
   * [ListSchemasRequest.page_token][google.cloud.discoveryengine.v1beta.ListSchemasRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
