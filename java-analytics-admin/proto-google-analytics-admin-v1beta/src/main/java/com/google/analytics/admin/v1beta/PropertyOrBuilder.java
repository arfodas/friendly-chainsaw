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

public interface PropertyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1beta.Property)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Resource name of this property.
   * Format: properties/{property_id}
   * Example: "properties/1000"
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
   * Output only. Resource name of this property.
   * Format: properties/{property_id}
   * Example: "properties/1000"
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
   * Immutable. The property type for this Property resource. When creating a
   * property, if the type is "PROPERTY_TYPE_UNSPECIFIED", then
   * "ORDINARY_PROPERTY" will be implied. "SUBPROPERTY" and "ROLLUP_PROPERTY"
   * types cannot yet be created with the Google Analytics Admin API.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.PropertyType property_type = 14 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The enum numeric value on the wire for propertyType.
   */
  int getPropertyTypeValue();
  /**
   *
   *
   * <pre>
   * Immutable. The property type for this Property resource. When creating a
   * property, if the type is "PROPERTY_TYPE_UNSPECIFIED", then
   * "ORDINARY_PROPERTY" will be implied. "SUBPROPERTY" and "ROLLUP_PROPERTY"
   * types cannot yet be created with the Google Analytics Admin API.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.PropertyType property_type = 14 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The propertyType.
   */
  com.google.analytics.admin.v1beta.PropertyType getPropertyType();

  /**
   *
   *
   * <pre>
   * Output only. Time when the entity was originally created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the entity was originally created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the entity was originally created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when entity payload fields were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when entity payload fields were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when entity payload fields were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Immutable. Resource name of this property's logical parent.
   *
   * Note: The Property-Moving UI can be used to change the parent.
   * Format: accounts/{account}, properties/{property}
   * Example: "accounts/100", "properties/101"
   * </pre>
   *
   * <code>string parent = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Immutable. Resource name of this property's logical parent.
   *
   * Note: The Property-Moving UI can be used to change the parent.
   * Format: accounts/{account}, properties/{property}
   * Example: "accounts/100", "properties/101"
   * </pre>
   *
   * <code>string parent = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. Human-readable display name for this property.
   *
   * The max allowed display name length is 100 UTF-16 code units.
   * </pre>
   *
   * <code>string display_name = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. Human-readable display name for this property.
   *
   * The max allowed display name length is 100 UTF-16 code units.
   * </pre>
   *
   * <code>string display_name = 5 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Industry associated with this property
   * Example: AUTOMOTIVE, FOOD_AND_DRINK
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.IndustryCategory industry_category = 6;</code>
   *
   * @return The enum numeric value on the wire for industryCategory.
   */
  int getIndustryCategoryValue();
  /**
   *
   *
   * <pre>
   * Industry associated with this property
   * Example: AUTOMOTIVE, FOOD_AND_DRINK
   * </pre>
   *
   * <code>.google.analytics.admin.v1beta.IndustryCategory industry_category = 6;</code>
   *
   * @return The industryCategory.
   */
  com.google.analytics.admin.v1beta.IndustryCategory getIndustryCategory();

  /**
   *
   *
   * <pre>
   * Required. Reporting Time Zone, used as the day boundary for reports,
   * regardless of where the data originates. If the time zone honors DST,
   * Analytics will automatically adjust for the changes.
   *
   * NOTE: Changing the time zone only affects data going forward, and is not
   * applied retroactively.
   *
   * Format: https://www.iana.org/time-zones
   * Example: "America/Los_Angeles"
   * </pre>
   *
   * <code>string time_zone = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The timeZone.
   */
  java.lang.String getTimeZone();
  /**
   *
   *
   * <pre>
   * Required. Reporting Time Zone, used as the day boundary for reports,
   * regardless of where the data originates. If the time zone honors DST,
   * Analytics will automatically adjust for the changes.
   *
   * NOTE: Changing the time zone only affects data going forward, and is not
   * applied retroactively.
   *
   * Format: https://www.iana.org/time-zones
   * Example: "America/Los_Angeles"
   * </pre>
   *
   * <code>string time_zone = 7 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for timeZone.
   */
  com.google.protobuf.ByteString getTimeZoneBytes();

  /**
   *
   *
   * <pre>
   * The currency type used in reports involving monetary values.
   *
   *
   * Format: https://en.wikipedia.org/wiki/ISO_4217
   * Examples: "USD", "EUR", "JPY"
   * </pre>
   *
   * <code>string currency_code = 8;</code>
   *
   * @return The currencyCode.
   */
  java.lang.String getCurrencyCode();
  /**
   *
   *
   * <pre>
   * The currency type used in reports involving monetary values.
   *
   *
   * Format: https://en.wikipedia.org/wiki/ISO_4217
   * Examples: "USD", "EUR", "JPY"
   * </pre>
   *
   * <code>string currency_code = 8;</code>
   *
   * @return The bytes for currencyCode.
   */
  com.google.protobuf.ByteString getCurrencyCodeBytes();

  /**
   *
   *
   * <pre>
   * Output only. The Google Analytics service level that applies to this
   * property.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.ServiceLevel service_level = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for serviceLevel.
   */
  int getServiceLevelValue();
  /**
   *
   *
   * <pre>
   * Output only. The Google Analytics service level that applies to this
   * property.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1beta.ServiceLevel service_level = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The serviceLevel.
   */
  com.google.analytics.admin.v1beta.ServiceLevel getServiceLevel();

  /**
   *
   *
   * <pre>
   * Output only. If set, the time at which this property was trashed. If not
   * set, then this property is not currently in the trash can.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the deleteTime field is set.
   */
  boolean hasDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. If set, the time at which this property was trashed. If not
   * set, then this property is not currently in the trash can.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The deleteTime.
   */
  com.google.protobuf.Timestamp getDeleteTime();
  /**
   *
   *
   * <pre>
   * Output only. If set, the time at which this property was trashed. If not
   * set, then this property is not currently in the trash can.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp delete_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getDeleteTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. If set, the time at which this trashed property will be
   * permanently deleted. If not set, then this property is not currently in the
   * trash can and is not slated to be deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the expireTime field is set.
   */
  boolean hasExpireTime();
  /**
   *
   *
   * <pre>
   * Output only. If set, the time at which this trashed property will be
   * permanently deleted. If not set, then this property is not currently in the
   * trash can and is not slated to be deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The expireTime.
   */
  com.google.protobuf.Timestamp getExpireTime();
  /**
   *
   *
   * <pre>
   * Output only. If set, the time at which this trashed property will be
   * permanently deleted. If not set, then this property is not currently in the
   * trash can and is not slated to be deleted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp expire_time = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getExpireTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Immutable. The resource name of the parent account
   * Format: accounts/{account_id}
   * Example: "accounts/123"
   * </pre>
   *
   * <code>
   * string account = 13 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The account.
   */
  java.lang.String getAccount();
  /**
   *
   *
   * <pre>
   * Immutable. The resource name of the parent account
   * Format: accounts/{account_id}
   * Example: "accounts/123"
   * </pre>
   *
   * <code>
   * string account = 13 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for account.
   */
  com.google.protobuf.ByteString getAccountBytes();
}
