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
// source: google/cloud/dialogflow/cx/v3/page.proto

package com.google.cloud.dialogflow.cx.v3;

public interface EventHandlerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.EventHandler)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The unique identifier of this event handler.
   * </pre>
   *
   * <code>string name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The unique identifier of this event handler.
   * </pre>
   *
   * <code>string name = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of the event to handle.
   * </pre>
   *
   * <code>string event = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The event.
   */
  java.lang.String getEvent();
  /**
   *
   *
   * <pre>
   * Required. The name of the event to handle.
   * </pre>
   *
   * <code>string event = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for event.
   */
  com.google.protobuf.ByteString getEventBytes();

  /**
   *
   *
   * <pre>
   * The fulfillment to call when the event occurs.
   * Handling webhook errors with a fulfillment enabled with webhook could
   * cause infinite loop. It is invalid to specify such fulfillment for a
   * handler handling webhooks.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Fulfillment trigger_fulfillment = 5;</code>
   *
   * @return Whether the triggerFulfillment field is set.
   */
  boolean hasTriggerFulfillment();
  /**
   *
   *
   * <pre>
   * The fulfillment to call when the event occurs.
   * Handling webhook errors with a fulfillment enabled with webhook could
   * cause infinite loop. It is invalid to specify such fulfillment for a
   * handler handling webhooks.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Fulfillment trigger_fulfillment = 5;</code>
   *
   * @return The triggerFulfillment.
   */
  com.google.cloud.dialogflow.cx.v3.Fulfillment getTriggerFulfillment();
  /**
   *
   *
   * <pre>
   * The fulfillment to call when the event occurs.
   * Handling webhook errors with a fulfillment enabled with webhook could
   * cause infinite loop. It is invalid to specify such fulfillment for a
   * handler handling webhooks.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.Fulfillment trigger_fulfillment = 5;</code>
   */
  com.google.cloud.dialogflow.cx.v3.FulfillmentOrBuilder getTriggerFulfillmentOrBuilder();

  /**
   *
   *
   * <pre>
   * The target page to transition to.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
   * </pre>
   *
   * <code>string target_page = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the targetPage field is set.
   */
  boolean hasTargetPage();
  /**
   *
   *
   * <pre>
   * The target page to transition to.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
   * </pre>
   *
   * <code>string target_page = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The targetPage.
   */
  java.lang.String getTargetPage();
  /**
   *
   *
   * <pre>
   * The target page to transition to.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;/pages/&lt;Page ID&gt;`.
   * </pre>
   *
   * <code>string target_page = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for targetPage.
   */
  com.google.protobuf.ByteString getTargetPageBytes();

  /**
   *
   *
   * <pre>
   * The target flow to transition to.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;`.
   * </pre>
   *
   * <code>string target_flow = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return Whether the targetFlow field is set.
   */
  boolean hasTargetFlow();
  /**
   *
   *
   * <pre>
   * The target flow to transition to.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;`.
   * </pre>
   *
   * <code>string target_flow = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The targetFlow.
   */
  java.lang.String getTargetFlow();
  /**
   *
   *
   * <pre>
   * The target flow to transition to.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;/agents/&lt;Agent
   * ID&gt;/flows/&lt;Flow ID&gt;`.
   * </pre>
   *
   * <code>string target_flow = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for targetFlow.
   */
  com.google.protobuf.ByteString getTargetFlowBytes();

  public com.google.cloud.dialogflow.cx.v3.EventHandler.TargetCase getTargetCase();
}
