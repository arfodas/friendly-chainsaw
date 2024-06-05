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
// source: google/cloud/discoveryengine/v1beta/user_event.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1beta;

public interface DocumentInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.DocumentInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The [Document][google.cloud.discoveryengine.v1beta.Document] resource ID.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   *
   *
   * <pre>
   * The [Document][google.cloud.discoveryengine.v1beta.Document] resource ID.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * The [Document][google.cloud.discoveryengine.v1beta.Document] resource ID.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * The [Document][google.cloud.discoveryengine.v1beta.Document] resource
   * full name, of the form:
   * `projects/{project_id}/locations/{location}/collections/{collection_id}/dataStores/{data_store_id}/branches/{branch_id}/documents/{document_id}`
   * </pre>
   *
   * <code>string name = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   *
   *
   * <pre>
   * The [Document][google.cloud.discoveryengine.v1beta.Document] resource
   * full name, of the form:
   * `projects/{project_id}/locations/{location}/collections/{collection_id}/dataStores/{data_store_id}/branches/{branch_id}/documents/{document_id}`
   * </pre>
   *
   * <code>string name = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The [Document][google.cloud.discoveryengine.v1beta.Document] resource
   * full name, of the form:
   * `projects/{project_id}/locations/{location}/collections/{collection_id}/dataStores/{data_store_id}/branches/{branch_id}/documents/{document_id}`
   * </pre>
   *
   * <code>string name = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The [Document][google.cloud.discoveryengine.v1beta.Document] URI - only
   * allowed for website data stores.
   * </pre>
   *
   * <code>string uri = 6;</code>
   *
   * @return Whether the uri field is set.
   */
  boolean hasUri();
  /**
   *
   *
   * <pre>
   * The [Document][google.cloud.discoveryengine.v1beta.Document] URI - only
   * allowed for website data stores.
   * </pre>
   *
   * <code>string uri = 6;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * The [Document][google.cloud.discoveryengine.v1beta.Document] URI - only
   * allowed for website data stores.
   * </pre>
   *
   * <code>string uri = 6;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * Quantity of the Document associated with the user event. Defaults to 1.
   *
   * For example, this field is 2 if two quantities of the same Document
   * are involved in a `add-to-cart` event.
   *
   * Required for events of the following event types:
   *
   * * `add-to-cart`
   * * `purchase`
   * </pre>
   *
   * <code>optional int32 quantity = 3;</code>
   *
   * @return Whether the quantity field is set.
   */
  boolean hasQuantity();
  /**
   *
   *
   * <pre>
   * Quantity of the Document associated with the user event. Defaults to 1.
   *
   * For example, this field is 2 if two quantities of the same Document
   * are involved in a `add-to-cart` event.
   *
   * Required for events of the following event types:
   *
   * * `add-to-cart`
   * * `purchase`
   * </pre>
   *
   * <code>optional int32 quantity = 3;</code>
   *
   * @return The quantity.
   */
  int getQuantity();

  /**
   *
   *
   * <pre>
   * The promotion IDs associated with this Document.
   * Currently, this field is restricted to at most one ID.
   * </pre>
   *
   * <code>repeated string promotion_ids = 4;</code>
   *
   * @return A list containing the promotionIds.
   */
  java.util.List<java.lang.String> getPromotionIdsList();
  /**
   *
   *
   * <pre>
   * The promotion IDs associated with this Document.
   * Currently, this field is restricted to at most one ID.
   * </pre>
   *
   * <code>repeated string promotion_ids = 4;</code>
   *
   * @return The count of promotionIds.
   */
  int getPromotionIdsCount();
  /**
   *
   *
   * <pre>
   * The promotion IDs associated with this Document.
   * Currently, this field is restricted to at most one ID.
   * </pre>
   *
   * <code>repeated string promotion_ids = 4;</code>
   *
   * @param index The index of the element to return.
   * @return The promotionIds at the given index.
   */
  java.lang.String getPromotionIds(int index);
  /**
   *
   *
   * <pre>
   * The promotion IDs associated with this Document.
   * Currently, this field is restricted to at most one ID.
   * </pre>
   *
   * <code>repeated string promotion_ids = 4;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the promotionIds at the given index.
   */
  com.google.protobuf.ByteString getPromotionIdsBytes(int index);

  com.google.cloud.discoveryengine.v1beta.DocumentInfo.DocumentDescriptorCase
      getDocumentDescriptorCase();
}
