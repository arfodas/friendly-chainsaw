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
// source: google/analytics/admin/v1alpha/channel_group.proto

// Protobuf Java Version: 3.25.2
package com.google.analytics.admin.v1alpha;

public interface ChannelGroupFilterExpressionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.ChannelGroupFilterExpression)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of expressions to be AND’ed together. It can only contain
   * ChannelGroupFilterExpressions with or_group. This must be set for the
   * top level ChannelGroupFilterExpression.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.ChannelGroupFilterExpressionList and_group = 1;</code>
   *
   * @return Whether the andGroup field is set.
   */
  boolean hasAndGroup();
  /**
   *
   *
   * <pre>
   * A list of expressions to be AND’ed together. It can only contain
   * ChannelGroupFilterExpressions with or_group. This must be set for the
   * top level ChannelGroupFilterExpression.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.ChannelGroupFilterExpressionList and_group = 1;</code>
   *
   * @return The andGroup.
   */
  com.google.analytics.admin.v1alpha.ChannelGroupFilterExpressionList getAndGroup();
  /**
   *
   *
   * <pre>
   * A list of expressions to be AND’ed together. It can only contain
   * ChannelGroupFilterExpressions with or_group. This must be set for the
   * top level ChannelGroupFilterExpression.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.ChannelGroupFilterExpressionList and_group = 1;</code>
   */
  com.google.analytics.admin.v1alpha.ChannelGroupFilterExpressionListOrBuilder
      getAndGroupOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of expressions to OR’ed together. It cannot contain
   * ChannelGroupFilterExpressions with and_group or or_group.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.ChannelGroupFilterExpressionList or_group = 2;</code>
   *
   * @return Whether the orGroup field is set.
   */
  boolean hasOrGroup();
  /**
   *
   *
   * <pre>
   * A list of expressions to OR’ed together. It cannot contain
   * ChannelGroupFilterExpressions with and_group or or_group.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.ChannelGroupFilterExpressionList or_group = 2;</code>
   *
   * @return The orGroup.
   */
  com.google.analytics.admin.v1alpha.ChannelGroupFilterExpressionList getOrGroup();
  /**
   *
   *
   * <pre>
   * A list of expressions to OR’ed together. It cannot contain
   * ChannelGroupFilterExpressions with and_group or or_group.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.ChannelGroupFilterExpressionList or_group = 2;</code>
   */
  com.google.analytics.admin.v1alpha.ChannelGroupFilterExpressionListOrBuilder
      getOrGroupOrBuilder();

  /**
   *
   *
   * <pre>
   * A filter expression to be NOT'ed (that is inverted, complemented). It
   * can only include a dimension_or_metric_filter. This cannot be set on the
   * top level ChannelGroupFilterExpression.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.ChannelGroupFilterExpression not_expression = 3;</code>
   *
   * @return Whether the notExpression field is set.
   */
  boolean hasNotExpression();
  /**
   *
   *
   * <pre>
   * A filter expression to be NOT'ed (that is inverted, complemented). It
   * can only include a dimension_or_metric_filter. This cannot be set on the
   * top level ChannelGroupFilterExpression.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.ChannelGroupFilterExpression not_expression = 3;</code>
   *
   * @return The notExpression.
   */
  com.google.analytics.admin.v1alpha.ChannelGroupFilterExpression getNotExpression();
  /**
   *
   *
   * <pre>
   * A filter expression to be NOT'ed (that is inverted, complemented). It
   * can only include a dimension_or_metric_filter. This cannot be set on the
   * top level ChannelGroupFilterExpression.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.ChannelGroupFilterExpression not_expression = 3;</code>
   */
  com.google.analytics.admin.v1alpha.ChannelGroupFilterExpressionOrBuilder
      getNotExpressionOrBuilder();

  /**
   *
   *
   * <pre>
   * A filter on a single dimension. This cannot be set on the top
   * level ChannelGroupFilterExpression.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.ChannelGroupFilter filter = 4;</code>
   *
   * @return Whether the filter field is set.
   */
  boolean hasFilter();
  /**
   *
   *
   * <pre>
   * A filter on a single dimension. This cannot be set on the top
   * level ChannelGroupFilterExpression.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.ChannelGroupFilter filter = 4;</code>
   *
   * @return The filter.
   */
  com.google.analytics.admin.v1alpha.ChannelGroupFilter getFilter();
  /**
   *
   *
   * <pre>
   * A filter on a single dimension. This cannot be set on the top
   * level ChannelGroupFilterExpression.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.ChannelGroupFilter filter = 4;</code>
   */
  com.google.analytics.admin.v1alpha.ChannelGroupFilterOrBuilder getFilterOrBuilder();

  com.google.analytics.admin.v1alpha.ChannelGroupFilterExpression.ExprCase getExprCase();
}
