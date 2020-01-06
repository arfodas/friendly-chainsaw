/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/kms/v1/service.proto

package com.google.cloud.kms.v1;

public interface CreateCryptoKeyVersionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.kms.v1.CreateCryptoKeyVersionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The [name][google.cloud.kms.v1.CryptoKey.name] of the [CryptoKey][google.cloud.kms.v1.CryptoKey] associated with
   * the [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion].
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
   * Required. The [name][google.cloud.kms.v1.CryptoKey.name] of the [CryptoKey][google.cloud.kms.v1.CryptoKey] associated with
   * the [CryptoKeyVersions][google.cloud.kms.v1.CryptoKeyVersion].
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
   * Required. A [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with initial field values.
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the cryptoKeyVersion field is set.
   */
  boolean hasCryptoKeyVersion();
  /**
   *
   *
   * <pre>
   * Required. A [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with initial field values.
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The cryptoKeyVersion.
   */
  com.google.cloud.kms.v1.CryptoKeyVersion getCryptoKeyVersion();
  /**
   *
   *
   * <pre>
   * Required. A [CryptoKeyVersion][google.cloud.kms.v1.CryptoKeyVersion] with initial field values.
   * </pre>
   *
   * <code>
   * .google.cloud.kms.v1.CryptoKeyVersion crypto_key_version = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.kms.v1.CryptoKeyVersionOrBuilder getCryptoKeyVersionOrBuilder();
}
