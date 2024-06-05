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

public interface AdvancedMachineFeaturesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1beta1.AdvancedMachineFeatures)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The number of threads per physical core. To disable simultaneous
   * multithreading (SMT) set this to 1. If unset, the maximum number of threads
   * supported per core by the underlying processor is assumed.
   * </pre>
   *
   * <code>optional int64 threads_per_core = 1;</code>
   *
   * @return Whether the threadsPerCore field is set.
   */
  boolean hasThreadsPerCore();
  /**
   *
   *
   * <pre>
   * The number of threads per physical core. To disable simultaneous
   * multithreading (SMT) set this to 1. If unset, the maximum number of threads
   * supported per core by the underlying processor is assumed.
   * </pre>
   *
   * <code>optional int64 threads_per_core = 1;</code>
   *
   * @return The threadsPerCore.
   */
  long getThreadsPerCore();

  /**
   *
   *
   * <pre>
   * Whether or not to enable nested virtualization (defaults to false).
   * </pre>
   *
   * <code>optional bool enable_nested_virtualization = 2;</code>
   *
   * @return Whether the enableNestedVirtualization field is set.
   */
  boolean hasEnableNestedVirtualization();
  /**
   *
   *
   * <pre>
   * Whether or not to enable nested virtualization (defaults to false).
   * </pre>
   *
   * <code>optional bool enable_nested_virtualization = 2;</code>
   *
   * @return The enableNestedVirtualization.
   */
  boolean getEnableNestedVirtualization();
}
