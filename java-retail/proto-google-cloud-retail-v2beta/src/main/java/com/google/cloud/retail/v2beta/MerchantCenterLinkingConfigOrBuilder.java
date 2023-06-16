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
// source: google/cloud/retail/v2beta/catalog.proto

package com.google.cloud.retail.v2beta;

public interface MerchantCenterLinkingConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2beta.MerchantCenterLinkingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Links between Merchant Center accounts and branches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
   */
  java.util.List<com.google.cloud.retail.v2beta.MerchantCenterLink> getLinksList();
  /**
   *
   *
   * <pre>
   * Links between Merchant Center accounts and branches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
   */
  com.google.cloud.retail.v2beta.MerchantCenterLink getLinks(int index);
  /**
   *
   *
   * <pre>
   * Links between Merchant Center accounts and branches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
   */
  int getLinksCount();
  /**
   *
   *
   * <pre>
   * Links between Merchant Center accounts and branches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
   */
  java.util.List<? extends com.google.cloud.retail.v2beta.MerchantCenterLinkOrBuilder>
      getLinksOrBuilderList();
  /**
   *
   *
   * <pre>
   * Links between Merchant Center accounts and branches.
   * </pre>
   *
   * <code>repeated .google.cloud.retail.v2beta.MerchantCenterLink links = 1;</code>
   */
  com.google.cloud.retail.v2beta.MerchantCenterLinkOrBuilder getLinksOrBuilder(int index);
}
