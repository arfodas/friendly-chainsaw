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
// source: google/analytics/admin/v1alpha/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.analytics.admin.v1alpha;

public interface AdSenseLinkOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.AdSenseLink)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name for this AdSense Link resource.
   * Format: properties/{propertyId}/adSenseLinks/{linkId}
   * Example: properties/1234/adSenseLinks/6789
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
   * Output only. The resource name for this AdSense Link resource.
   * Format: properties/{propertyId}/adSenseLinks/{linkId}
   * Example: properties/1234/adSenseLinks/6789
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
   * Immutable. The AdSense ad client code that the GA4 property is linked to.
   * Example format: "ca-pub-1234567890"
   * </pre>
   *
   * <code>string ad_client_code = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The adClientCode.
   */
  java.lang.String getAdClientCode();
  /**
   *
   *
   * <pre>
   * Immutable. The AdSense ad client code that the GA4 property is linked to.
   * Example format: "ca-pub-1234567890"
   * </pre>
   *
   * <code>string ad_client_code = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for adClientCode.
   */
  com.google.protobuf.ByteString getAdClientCodeBytes();
}
