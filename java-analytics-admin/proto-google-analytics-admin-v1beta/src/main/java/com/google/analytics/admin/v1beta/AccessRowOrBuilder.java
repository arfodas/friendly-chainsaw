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
// source: google/analytics/admin/v1beta/access_report.proto

// Protobuf Java Version: 3.25.2
package com.google.analytics.admin.v1beta;

public interface AccessRowOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1beta.AccessRow)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of dimension values. These values are in the same order as specified
   * in the request.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessDimensionValue dimension_values = 1;</code>
   */
  java.util.List<com.google.analytics.admin.v1beta.AccessDimensionValue> getDimensionValuesList();
  /**
   *
   *
   * <pre>
   * List of dimension values. These values are in the same order as specified
   * in the request.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessDimensionValue dimension_values = 1;</code>
   */
  com.google.analytics.admin.v1beta.AccessDimensionValue getDimensionValues(int index);
  /**
   *
   *
   * <pre>
   * List of dimension values. These values are in the same order as specified
   * in the request.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessDimensionValue dimension_values = 1;</code>
   */
  int getDimensionValuesCount();
  /**
   *
   *
   * <pre>
   * List of dimension values. These values are in the same order as specified
   * in the request.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessDimensionValue dimension_values = 1;</code>
   */
  java.util.List<? extends com.google.analytics.admin.v1beta.AccessDimensionValueOrBuilder>
      getDimensionValuesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of dimension values. These values are in the same order as specified
   * in the request.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessDimensionValue dimension_values = 1;</code>
   */
  com.google.analytics.admin.v1beta.AccessDimensionValueOrBuilder getDimensionValuesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * List of metric values. These values are in the same order as specified
   * in the request.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessMetricValue metric_values = 2;</code>
   */
  java.util.List<com.google.analytics.admin.v1beta.AccessMetricValue> getMetricValuesList();
  /**
   *
   *
   * <pre>
   * List of metric values. These values are in the same order as specified
   * in the request.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessMetricValue metric_values = 2;</code>
   */
  com.google.analytics.admin.v1beta.AccessMetricValue getMetricValues(int index);
  /**
   *
   *
   * <pre>
   * List of metric values. These values are in the same order as specified
   * in the request.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessMetricValue metric_values = 2;</code>
   */
  int getMetricValuesCount();
  /**
   *
   *
   * <pre>
   * List of metric values. These values are in the same order as specified
   * in the request.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessMetricValue metric_values = 2;</code>
   */
  java.util.List<? extends com.google.analytics.admin.v1beta.AccessMetricValueOrBuilder>
      getMetricValuesOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of metric values. These values are in the same order as specified
   * in the request.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.AccessMetricValue metric_values = 2;</code>
   */
  com.google.analytics.admin.v1beta.AccessMetricValueOrBuilder getMetricValuesOrBuilder(int index);
}
