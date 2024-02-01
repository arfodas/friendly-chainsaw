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
// source: google/analytics/admin/v1beta/analytics_admin.proto

// Protobuf Java Version: 3.25.2
package com.google.analytics.admin.v1beta;

public interface ListFirebaseLinksResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1beta.ListFirebaseLinksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of FirebaseLinks. This will have at most one value.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.FirebaseLink firebase_links = 1;</code>
   */
  java.util.List<com.google.analytics.admin.v1beta.FirebaseLink> getFirebaseLinksList();
  /**
   *
   *
   * <pre>
   * List of FirebaseLinks. This will have at most one value.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.FirebaseLink firebase_links = 1;</code>
   */
  com.google.analytics.admin.v1beta.FirebaseLink getFirebaseLinks(int index);
  /**
   *
   *
   * <pre>
   * List of FirebaseLinks. This will have at most one value.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.FirebaseLink firebase_links = 1;</code>
   */
  int getFirebaseLinksCount();
  /**
   *
   *
   * <pre>
   * List of FirebaseLinks. This will have at most one value.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.FirebaseLink firebase_links = 1;</code>
   */
  java.util.List<? extends com.google.analytics.admin.v1beta.FirebaseLinkOrBuilder>
      getFirebaseLinksOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of FirebaseLinks. This will have at most one value.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1beta.FirebaseLink firebase_links = 1;</code>
   */
  com.google.analytics.admin.v1beta.FirebaseLinkOrBuilder getFirebaseLinksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * Currently, Google Analytics supports only one FirebaseLink per property,
   * so this will never be populated.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * Currently, Google Analytics supports only one FirebaseLink per property,
   * so this will never be populated.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
