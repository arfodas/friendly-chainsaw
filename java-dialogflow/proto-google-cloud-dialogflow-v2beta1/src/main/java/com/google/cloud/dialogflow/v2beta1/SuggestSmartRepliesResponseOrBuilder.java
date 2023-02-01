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

public interface SuggestSmartRepliesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2beta1.SuggestSmartRepliesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Multiple reply options provided by smart reply service. The
   * order is based on the rank of the model prediction.
   * The maximum number of the returned replies is set in SmartReplyConfig.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SmartReplyAnswer smart_reply_answers = 1;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer> getSmartReplyAnswersList();
  /**
   *
   *
   * <pre>
   * Output only. Multiple reply options provided by smart reply service. The
   * order is based on the rank of the model prediction.
   * The maximum number of the returned replies is set in SmartReplyConfig.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SmartReplyAnswer smart_reply_answers = 1;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.SmartReplyAnswer getSmartReplyAnswers(int index);
  /**
   *
   *
   * <pre>
   * Output only. Multiple reply options provided by smart reply service. The
   * order is based on the rank of the model prediction.
   * The maximum number of the returned replies is set in SmartReplyConfig.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SmartReplyAnswer smart_reply_answers = 1;
   * </code>
   */
  int getSmartReplyAnswersCount();
  /**
   *
   *
   * <pre>
   * Output only. Multiple reply options provided by smart reply service. The
   * order is based on the rank of the model prediction.
   * The maximum number of the returned replies is set in SmartReplyConfig.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SmartReplyAnswer smart_reply_answers = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2beta1.SmartReplyAnswerOrBuilder>
      getSmartReplyAnswersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. Multiple reply options provided by smart reply service. The
   * order is based on the rank of the model prediction.
   * The maximum number of the returned replies is set in SmartReplyConfig.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2beta1.SmartReplyAnswer smart_reply_answers = 1;
   * </code>
   */
  com.google.cloud.dialogflow.v2beta1.SmartReplyAnswerOrBuilder getSmartReplyAnswersOrBuilder(
      int index);

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
   * <code>string latest_message = 2 [(.google.api.resource_reference) = { ... }</code>
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
   * <code>string latest_message = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for latestMessage.
   */
  com.google.protobuf.ByteString getLatestMessageBytes();

  /**
   *
   *
   * <pre>
   * Number of messages prior to and including
   * [latest_message][google.cloud.dialogflow.v2beta1.SuggestSmartRepliesResponse.latest_message]
   * to compile the suggestion. It may be smaller than the
   * [SuggestSmartRepliesRequest.context_size][google.cloud.dialogflow.v2beta1.SuggestSmartRepliesRequest.context_size]
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
