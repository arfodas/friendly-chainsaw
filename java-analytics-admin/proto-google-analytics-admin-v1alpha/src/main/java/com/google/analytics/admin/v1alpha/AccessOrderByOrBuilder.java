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
// source: google/analytics/admin/v1alpha/access_report.proto

// Protobuf Java Version: 3.25.2
package com.google.analytics.admin.v1alpha;

public interface AccessOrderByOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.AccessOrderBy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Sorts results by a metric's values.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessOrderBy.MetricOrderBy metric = 1;</code>
   *
   * @return Whether the metric field is set.
   */
  boolean hasMetric();
  /**
   *
   *
   * <pre>
   * Sorts results by a metric's values.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessOrderBy.MetricOrderBy metric = 1;</code>
   *
   * @return The metric.
   */
  com.google.analytics.admin.v1alpha.AccessOrderBy.MetricOrderBy getMetric();
  /**
   *
   *
   * <pre>
   * Sorts results by a metric's values.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessOrderBy.MetricOrderBy metric = 1;</code>
   */
  com.google.analytics.admin.v1alpha.AccessOrderBy.MetricOrderByOrBuilder getMetricOrBuilder();

  /**
   *
   *
   * <pre>
   * Sorts results by a dimension's values.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessOrderBy.DimensionOrderBy dimension = 2;</code>
   *
   * @return Whether the dimension field is set.
   */
  boolean hasDimension();
  /**
   *
   *
   * <pre>
   * Sorts results by a dimension's values.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessOrderBy.DimensionOrderBy dimension = 2;</code>
   *
   * @return The dimension.
   */
  com.google.analytics.admin.v1alpha.AccessOrderBy.DimensionOrderBy getDimension();
  /**
   *
   *
   * <pre>
   * Sorts results by a dimension's values.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AccessOrderBy.DimensionOrderBy dimension = 2;</code>
   */
  com.google.analytics.admin.v1alpha.AccessOrderBy.DimensionOrderByOrBuilder
      getDimensionOrBuilder();

  /**
   *
   *
   * <pre>
   * If true, sorts by descending order. If false or unspecified, sorts in
   * ascending order.
   * </pre>
   *
   * <code>bool desc = 3;</code>
   *
   * @return The desc.
   */
  boolean getDesc();

  com.google.analytics.admin.v1alpha.AccessOrderBy.OneOrderByCase getOneOrderByCase();
}
