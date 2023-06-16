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
// source: google/cloud/retail/v2alpha/catalog_service.proto

package com.google.cloud.retail.v2alpha;

public interface BatchRemoveCatalogAttributesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.BatchRemoveCatalogAttributesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The attributes config resource shared by all catalog attributes
   * being deleted. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/attributesConfig`
   * </pre>
   *
   * <code>
   * string attributes_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The attributesConfig.
   */
  java.lang.String getAttributesConfig();
  /**
   *
   *
   * <pre>
   * Required. The attributes config resource shared by all catalog attributes
   * being deleted. Format:
   * `projects/{project_number}/locations/{location_id}/catalogs/{catalog_id}/attributesConfig`
   * </pre>
   *
   * <code>
   * string attributes_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for attributesConfig.
   */
  com.google.protobuf.ByteString getAttributesConfigBytes();

  /**
   *
   *
   * <pre>
   * Required. The attribute name keys of the
   * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute]s to
   * delete. A maximum of 1000 catalog attributes can be deleted in a batch.
   * </pre>
   *
   * <code>repeated string attribute_keys = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the attributeKeys.
   */
  java.util.List<java.lang.String> getAttributeKeysList();
  /**
   *
   *
   * <pre>
   * Required. The attribute name keys of the
   * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute]s to
   * delete. A maximum of 1000 catalog attributes can be deleted in a batch.
   * </pre>
   *
   * <code>repeated string attribute_keys = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of attributeKeys.
   */
  int getAttributeKeysCount();
  /**
   *
   *
   * <pre>
   * Required. The attribute name keys of the
   * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute]s to
   * delete. A maximum of 1000 catalog attributes can be deleted in a batch.
   * </pre>
   *
   * <code>repeated string attribute_keys = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The attributeKeys at the given index.
   */
  java.lang.String getAttributeKeys(int index);
  /**
   *
   *
   * <pre>
   * Required. The attribute name keys of the
   * [CatalogAttribute][google.cloud.retail.v2alpha.CatalogAttribute]s to
   * delete. A maximum of 1000 catalog attributes can be deleted in a batch.
   * </pre>
   *
   * <code>repeated string attribute_keys = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the attributeKeys at the given index.
   */
  com.google.protobuf.ByteString getAttributeKeysBytes(int index);
}
