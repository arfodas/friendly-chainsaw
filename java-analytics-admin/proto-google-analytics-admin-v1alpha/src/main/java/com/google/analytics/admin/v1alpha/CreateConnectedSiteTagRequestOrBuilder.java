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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

// Protobuf Java Version: 3.25.2
package com.google.analytics.admin.v1alpha;

public interface CreateConnectedSiteTagRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.CreateConnectedSiteTagRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Universal Analytics property to create connected site tags for.
   * This API does not support GA4 properties.
   * Format: properties/{universalAnalyticsPropertyId}
   * Example: properties/1234
   * </pre>
   *
   * <code>string property = 1;</code>
   *
   * @return The property.
   */
  java.lang.String getProperty();
  /**
   *
   *
   * <pre>
   * The Universal Analytics property to create connected site tags for.
   * This API does not support GA4 properties.
   * Format: properties/{universalAnalyticsPropertyId}
   * Example: properties/1234
   * </pre>
   *
   * <code>string property = 1;</code>
   *
   * @return The bytes for property.
   */
  com.google.protobuf.ByteString getPropertyBytes();

  /**
   *
   *
   * <pre>
   * Required. The tag to add to the Universal Analytics property
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tag = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the connectedSiteTag field is set.
   */
  boolean hasConnectedSiteTag();
  /**
   *
   *
   * <pre>
   * Required. The tag to add to the Universal Analytics property
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tag = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The connectedSiteTag.
   */
  com.google.analytics.admin.v1alpha.ConnectedSiteTag getConnectedSiteTag();
  /**
   *
   *
   * <pre>
   * Required. The tag to add to the Universal Analytics property
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.ConnectedSiteTag connected_site_tag = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.analytics.admin.v1alpha.ConnectedSiteTagOrBuilder getConnectedSiteTagOrBuilder();
}
