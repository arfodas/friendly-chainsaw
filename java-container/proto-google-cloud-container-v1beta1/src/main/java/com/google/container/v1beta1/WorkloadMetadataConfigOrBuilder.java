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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.3
package com.google.container.v1beta1;

public interface WorkloadMetadataConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.WorkloadMetadataConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * NodeMetadata is the configuration for how to expose metadata to the
   * workloads running on the node.
   * </pre>
   *
   * <code>
   * .google.container.v1beta1.WorkloadMetadataConfig.NodeMetadata node_metadata = 1 [deprecated = true];
   * </code>
   *
   * @deprecated google.container.v1beta1.WorkloadMetadataConfig.node_metadata is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=4927
   * @return The enum numeric value on the wire for nodeMetadata.
   */
  @java.lang.Deprecated
  int getNodeMetadataValue();
  /**
   *
   *
   * <pre>
   * NodeMetadata is the configuration for how to expose metadata to the
   * workloads running on the node.
   * </pre>
   *
   * <code>
   * .google.container.v1beta1.WorkloadMetadataConfig.NodeMetadata node_metadata = 1 [deprecated = true];
   * </code>
   *
   * @deprecated google.container.v1beta1.WorkloadMetadataConfig.node_metadata is deprecated. See
   *     google/container/v1beta1/cluster_service.proto;l=4927
   * @return The nodeMetadata.
   */
  @java.lang.Deprecated
  com.google.container.v1beta1.WorkloadMetadataConfig.NodeMetadata getNodeMetadata();

  /**
   *
   *
   * <pre>
   * Mode is the configuration for how to expose metadata to workloads running
   * on the node pool.
   * </pre>
   *
   * <code>.google.container.v1beta1.WorkloadMetadataConfig.Mode mode = 2;</code>
   *
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();
  /**
   *
   *
   * <pre>
   * Mode is the configuration for how to expose metadata to workloads running
   * on the node pool.
   * </pre>
   *
   * <code>.google.container.v1beta1.WorkloadMetadataConfig.Mode mode = 2;</code>
   *
   * @return The mode.
   */
  com.google.container.v1beta1.WorkloadMetadataConfig.Mode getMode();
}
