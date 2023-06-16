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
// source: google/cloud/retail/v2/product_service.proto

package com.google.cloud.retail.v2;

public interface RemoveLocalInventoriesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2.RemoveLocalInventoriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Full resource name of [Product][google.cloud.retail.v2.Product],
   * such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/branches/default_branch/products/some_product_id`.
   *
   * If the caller does not have permission to access the
   * [Product][google.cloud.retail.v2.Product], regardless of whether or not it
   * exists, a PERMISSION_DENIED error is returned.
   * </pre>
   *
   * <code>
   * string product = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The product.
   */
  java.lang.String getProduct();
  /**
   *
   *
   * <pre>
   * Required. Full resource name of [Product][google.cloud.retail.v2.Product],
   * such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/branches/default_branch/products/some_product_id`.
   *
   * If the caller does not have permission to access the
   * [Product][google.cloud.retail.v2.Product], regardless of whether or not it
   * exists, a PERMISSION_DENIED error is returned.
   * </pre>
   *
   * <code>
   * string product = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for product.
   */
  com.google.protobuf.ByteString getProductBytes();

  /**
   *
   *
   * <pre>
   * Required. A list of place IDs to have their inventory deleted.
   * At most 3000 place IDs are allowed per request.
   * </pre>
   *
   * <code>repeated string place_ids = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the placeIds.
   */
  java.util.List<java.lang.String> getPlaceIdsList();
  /**
   *
   *
   * <pre>
   * Required. A list of place IDs to have their inventory deleted.
   * At most 3000 place IDs are allowed per request.
   * </pre>
   *
   * <code>repeated string place_ids = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of placeIds.
   */
  int getPlaceIdsCount();
  /**
   *
   *
   * <pre>
   * Required. A list of place IDs to have their inventory deleted.
   * At most 3000 place IDs are allowed per request.
   * </pre>
   *
   * <code>repeated string place_ids = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The placeIds at the given index.
   */
  java.lang.String getPlaceIds(int index);
  /**
   *
   *
   * <pre>
   * Required. A list of place IDs to have their inventory deleted.
   * At most 3000 place IDs are allowed per request.
   * </pre>
   *
   * <code>repeated string place_ids = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the placeIds at the given index.
   */
  com.google.protobuf.ByteString getPlaceIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * The time when the inventory deletions are issued. Used to prevent
   * out-of-order updates and deletions on local inventory fields. If not
   * provided, the internal system time will be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp remove_time = 5;</code>
   *
   * @return Whether the removeTime field is set.
   */
  boolean hasRemoveTime();
  /**
   *
   *
   * <pre>
   * The time when the inventory deletions are issued. Used to prevent
   * out-of-order updates and deletions on local inventory fields. If not
   * provided, the internal system time will be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp remove_time = 5;</code>
   *
   * @return The removeTime.
   */
  com.google.protobuf.Timestamp getRemoveTime();
  /**
   *
   *
   * <pre>
   * The time when the inventory deletions are issued. Used to prevent
   * out-of-order updates and deletions on local inventory fields. If not
   * provided, the internal system time will be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp remove_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getRemoveTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * If set to true, and the [Product][google.cloud.retail.v2.Product] is not
   * found, the local inventory removal request will still be processed and
   * retained for at most 1 day and processed once the
   * [Product][google.cloud.retail.v2.Product] is created. If set to false, a
   * NOT_FOUND error is returned if the
   * [Product][google.cloud.retail.v2.Product] is not found.
   * </pre>
   *
   * <code>bool allow_missing = 3;</code>
   *
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}
