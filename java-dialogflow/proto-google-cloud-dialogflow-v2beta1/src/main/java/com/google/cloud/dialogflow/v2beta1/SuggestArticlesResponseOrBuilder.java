/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/dialogflow/v2beta1/participant.proto

package com.google.cloud.dialogflow.v2beta1;

public interface SuggestArticlesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.SuggestArticlesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Articles ordered by score in descending order.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.ArticleAnswer article_answers = 1;</code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.ArticleAnswer> getArticleAnswersList();
  /**
   *
   *
   * <pre>
   * Output only. Articles ordered by score in descending order.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.ArticleAnswer article_answers = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.ArticleAnswer getArticleAnswers(int index);
  /**
   *
   *
   * <pre>
   * Output only. Articles ordered by score in descending order.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.ArticleAnswer article_answers = 1;</code>
   */
  int getArticleAnswersCount();
  /**
   *
   *
   * <pre>
   * Output only. Articles ordered by score in descending order.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.ArticleAnswer article_answers = 1;</code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.ArticleAnswerOrBuilder>
      getArticleAnswersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Articles ordered by score in descending order.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.ArticleAnswer article_answers = 1;</code>
   */
  com.google.cloud.dialogflow.v2beta1.ArticleAnswerOrBuilder getArticleAnswersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The name of the latest conversation message used to compile
   * suggestion for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
   * </pre>
   *
   * <code>string latest_message = 2;</code>
   *
   * @return The latestMessage.
   */
  java.lang.String getLatestMessage();
  /**
   *
   *
   * <pre>
   * The name of the latest conversation message used to compile
   * suggestion for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversations/&lt;Conversation ID&gt;/messages/&lt;Message ID&gt;`.
   * </pre>
   *
   * <code>string latest_message = 2;</code>
   *
   * @return The bytes for latestMessage.
   */
  com.google.protobuf.ByteString getLatestMessageBytes();

  /**
   *
   *
   * <pre>
   * Number of messages prior to and including
   * [latest_message][google.cloud.dialogflow.v2beta1.SuggestArticlesResponse.latest_message]
   * to compile the suggestion. It may be smaller than the
   * [SuggestArticlesResponse.context_size][google.cloud.dialogflow.v2beta1.SuggestArticlesResponse.context_size]
   * field in the request if there aren't that many messages in the
   * conversation.
   * </pre>
   *
   * <code>int32 context_size = 3;</code>
   *
   * @return The contextSize.
   */
  int getContextSize();
}
