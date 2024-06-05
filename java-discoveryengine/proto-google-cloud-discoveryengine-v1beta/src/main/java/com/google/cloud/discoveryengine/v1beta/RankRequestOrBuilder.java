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
// source: google/cloud/discoveryengine/v1beta/rank_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1beta;

public interface RankRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.RankRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the rank service config, such as
   * `projects/{project_num}/locations/{location_id}/rankingConfigs/default_ranking_config`.
   * </pre>
   *
   * <code>
   * string ranking_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The rankingConfig.
   */
  java.lang.String getRankingConfig();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the rank service config, such as
   * `projects/{project_num}/locations/{location_id}/rankingConfigs/default_ranking_config`.
   * </pre>
   *
   * <code>
   * string ranking_config = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for rankingConfig.
   */
  com.google.protobuf.ByteString getRankingConfigBytes();

  /**
   *
   *
   * <pre>
   * The identifier of the model to use. It is one of:
   *
   * * `semantic-ranker-512&#64;latest`: Semantic ranking model with maxiumn input
   * token size 512.
   *
   * It is set to `semantic-ranker-512&#64;latest` by default if unspecified.
   * </pre>
   *
   * <code>string model = 2;</code>
   *
   * @return The model.
   */
  java.lang.String getModel();
  /**
   *
   *
   * <pre>
   * The identifier of the model to use. It is one of:
   *
   * * `semantic-ranker-512&#64;latest`: Semantic ranking model with maxiumn input
   * token size 512.
   *
   * It is set to `semantic-ranker-512&#64;latest` by default if unspecified.
   * </pre>
   *
   * <code>string model = 2;</code>
   *
   * @return The bytes for model.
   */
  com.google.protobuf.ByteString getModelBytes();

  /**
   *
   *
   * <pre>
   * The number of results to return. If this is unset or no bigger than zero,
   * returns all results.
   * </pre>
   *
   * <code>int32 top_n = 3;</code>
   *
   * @return The topN.
   */
  int getTopN();

  /**
   *
   *
   * <pre>
   * The query to use.
   * </pre>
   *
   * <code>string query = 4;</code>
   *
   * @return The query.
   */
  java.lang.String getQuery();
  /**
   *
   *
   * <pre>
   * The query to use.
   * </pre>
   *
   * <code>string query = 4;</code>
   *
   * @return The bytes for query.
   */
  com.google.protobuf.ByteString getQueryBytes();

  /**
   *
   *
   * <pre>
   * Required. A list of records to rank. At most 200 records to rank.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.RankingRecord records = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.discoveryengine.v1beta.RankingRecord> getRecordsList();
  /**
   *
   *
   * <pre>
   * Required. A list of records to rank. At most 200 records to rank.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.RankingRecord records = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.RankingRecord getRecords(int index);
  /**
   *
   *
   * <pre>
   * Required. A list of records to rank. At most 200 records to rank.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.RankingRecord records = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getRecordsCount();
  /**
   *
   *
   * <pre>
   * Required. A list of records to rank. At most 200 records to rank.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.RankingRecord records = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.discoveryengine.v1beta.RankingRecordOrBuilder>
      getRecordsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. A list of records to rank. At most 200 records to rank.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.RankingRecord records = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.RankingRecordOrBuilder getRecordsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * If true, the response will contain only record ID and score. By default, it
   * is false, the response will contain record details.
   * </pre>
   *
   * <code>bool ignore_record_details_in_response = 6;</code>
   *
   * @return The ignoreRecordDetailsInResponse.
   */
  boolean getIgnoreRecordDetailsInResponse();

  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 7;</code>
   */
  int getUserLabelsCount();
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 7;</code>
   */
  boolean containsUserLabels(java.lang.String key);
  /** Use {@link #getUserLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getUserLabels();
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 7;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getUserLabelsMap();
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 7;</code>
   */
  /* nullable */
  java.lang.String getUserLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * The user labels applied to a resource must meet the following requirements:
   *
   * * Each resource can have multiple labels, up to a maximum of 64.
   * * Each label must be a key-value pair.
   * * Keys have a minimum length of 1 character and a maximum length of 63
   *   characters and cannot be empty. Values can be empty and have a maximum
   *   length of 63 characters.
   * * Keys and values can contain only lowercase letters, numeric characters,
   *   underscores, and dashes. All characters must use UTF-8 encoding, and
   *   international characters are allowed.
   * * The key portion of a label must be unique. However, you can use the same
   *   key with multiple resources.
   * * Keys must start with a lowercase letter or international character.
   *
   * See [Google Cloud
   * Document](https://cloud.google.com/resource-manager/docs/creating-managing-labels#requirements)
   * for more details.
   * </pre>
   *
   * <code>map&lt;string, string&gt; user_labels = 7;</code>
   */
  java.lang.String getUserLabelsOrThrow(java.lang.String key);
}
