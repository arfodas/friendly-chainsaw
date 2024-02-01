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

public interface CreateCalculatedMetricRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.CreateCalculatedMetricRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Format: properties/{property_id}
   * Example: properties/1234
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
   * Required. Format: properties/{property_id}
   * Example: properties/1234
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
   * Required. The ID to use for the calculated metric which will become the
   * final component of the calculated metric's resource name.
   *
   * This value should be 1-80 characters and valid characters are
   * /[a-zA-Z0-9_]/, no spaces allowed. calculated_metric_id must be unique
   * between all calculated metrics under a property. The calculated_metric_id
   * is used when referencing this calculated metric from external APIs, for
   * example, "calcMetric:{calculated_metric_id}".
   * </pre>
   *
   * <code>string calculated_metric_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The calculatedMetricId.
   */
  java.lang.String getCalculatedMetricId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the calculated metric which will become the
   * final component of the calculated metric's resource name.
   *
   * This value should be 1-80 characters and valid characters are
   * /[a-zA-Z0-9_]/, no spaces allowed. calculated_metric_id must be unique
   * between all calculated metrics under a property. The calculated_metric_id
   * is used when referencing this calculated metric from external APIs, for
   * example, "calcMetric:{calculated_metric_id}".
   * </pre>
   *
   * <code>string calculated_metric_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for calculatedMetricId.
   */
  com.google.protobuf.ByteString getCalculatedMetricIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The CalculatedMetric to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.CalculatedMetric calculated_metric = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the calculatedMetric field is set.
   */
  boolean hasCalculatedMetric();
  /**
   *
   *
   * <pre>
   * Required. The CalculatedMetric to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.CalculatedMetric calculated_metric = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The calculatedMetric.
   */
  com.google.analytics.admin.v1alpha.CalculatedMetric getCalculatedMetric();
  /**
   *
   *
   * <pre>
   * Required. The CalculatedMetric to create.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.CalculatedMetric calculated_metric = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.analytics.admin.v1alpha.CalculatedMetricOrBuilder getCalculatedMetricOrBuilder();
}
