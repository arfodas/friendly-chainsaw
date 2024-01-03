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
// source: google/analytics/data/v1beta/analytics_data_api.proto

package com.google.analytics.data.v1beta;

public interface AudienceDimensionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1beta.AudienceDimension)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The API name of the dimension. See the [API
   * Dimensions](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-api-schema#dimensions)
   * for the list of dimension names.
   * </pre>
   *
   * <code>string dimension_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The dimensionName.
   */
  java.lang.String getDimensionName();
  /**
   *
   *
   * <pre>
   * Optional. The API name of the dimension. See the [API
   * Dimensions](https://developers.google.com/analytics/devguides/reporting/data/v1/audience-list-api-schema#dimensions)
   * for the list of dimension names.
   * </pre>
   *
   * <code>string dimension_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for dimensionName.
   */
  com.google.protobuf.ByteString getDimensionNameBytes();
}
