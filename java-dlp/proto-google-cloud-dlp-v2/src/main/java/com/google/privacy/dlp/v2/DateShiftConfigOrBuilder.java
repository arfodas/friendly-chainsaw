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
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface DateShiftConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.DateShiftConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Range of shift in days. Actual shift will be selected at random within this
   * range (inclusive ends). Negative means shift to earlier in time. Must not
   * be more than 365250 days (1000 years) each direction.
   * For example, 3 means shift date to at most 3 days into the future.
   * [Required]
   * </pre>
   *
   * <code>int32 upper_bound_days = 1;</code>
   */
  int getUpperBoundDays();

  /**
   *
   *
   * <pre>
   * For example, -5 means shift date to at most 5 days back in the past.
   * [Required]
   * </pre>
   *
   * <code>int32 lower_bound_days = 2;</code>
   */
  int getLowerBoundDays();

  /**
   *
   *
   * <pre>
   * Points to the field that contains the context, for example, an entity id.
   * If set, must also set cryptoKey. If set, shift will be consistent for the
   * given context.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId context = 3;</code>
   */
  boolean hasContext();
  /**
   *
   *
   * <pre>
   * Points to the field that contains the context, for example, an entity id.
   * If set, must also set cryptoKey. If set, shift will be consistent for the
   * given context.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId context = 3;</code>
   */
  com.google.privacy.dlp.v2.FieldId getContext();
  /**
   *
   *
   * <pre>
   * Points to the field that contains the context, for example, an entity id.
   * If set, must also set cryptoKey. If set, shift will be consistent for the
   * given context.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.FieldId context = 3;</code>
   */
  com.google.privacy.dlp.v2.FieldIdOrBuilder getContextOrBuilder();

  /**
   *
   *
   * <pre>
   * Causes the shift to be computed based on this key and the context. This
   * results in the same shift for the same context and crypto_key. If
   * set, must also set context. Can only be applied to table items.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 4;</code>
   */
  boolean hasCryptoKey();
  /**
   *
   *
   * <pre>
   * Causes the shift to be computed based on this key and the context. This
   * results in the same shift for the same context and crypto_key. If
   * set, must also set context. Can only be applied to table items.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 4;</code>
   */
  com.google.privacy.dlp.v2.CryptoKey getCryptoKey();
  /**
   *
   *
   * <pre>
   * Causes the shift to be computed based on this key and the context. This
   * results in the same shift for the same context and crypto_key. If
   * set, must also set context. Can only be applied to table items.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CryptoKey crypto_key = 4;</code>
   */
  com.google.privacy.dlp.v2.CryptoKeyOrBuilder getCryptoKeyOrBuilder();

  public com.google.privacy.dlp.v2.DateShiftConfig.MethodCase getMethodCase();
}
