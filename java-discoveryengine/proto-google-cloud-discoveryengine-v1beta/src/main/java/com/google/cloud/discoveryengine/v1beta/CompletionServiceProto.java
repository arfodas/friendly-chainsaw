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
// source: google/cloud/discoveryengine/v1beta/completion_service.proto

package com.google.cloud.discoveryengine.v1beta;

public final class CompletionServiceProto {
  private CompletionServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_CompleteQueryRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_CompleteQueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_CompleteQueryResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_CompleteQueryResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_CompleteQueryResponse_QuerySuggestion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_CompleteQueryResponse_QuerySuggestion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n<google/cloud/discoveryengine/v1beta/co"
          + "mpletion_service.proto\022#google.cloud.dis"
          + "coveryengine.v1beta\032\034google/api/annotati"
          + "ons.proto\032\027google/api/client.proto\032\037goog"
          + "le/api/field_behavior.proto\032\031google/api/"
          + "resource.proto\"\235\001\n\024CompleteQueryRequest\022"
          + "D\n\ndata_store\030\001 \001(\tB0\340A\002\372A*\n(discoveryen"
          + "gine.googleapis.com/DataStore\022\022\n\005query\030\002"
          + " \001(\tB\003\340A\002\022\023\n\013query_model\030\003 \001(\t\022\026\n\016user_p"
          + "seudo_id\030\004 \001(\t\"\245\001\n\025CompleteQueryResponse"
          + "\022e\n\021query_suggestions\030\001 \003(\0132J.google.clo"
          + "ud.discoveryengine.v1beta.CompleteQueryR"
          + "esponse.QuerySuggestion\032%\n\017QuerySuggesti"
          + "on\022\022\n\nsuggestion\030\001 \001(\t2\232\003\n\021CompletionSer"
          + "vice\022\260\002\n\rCompleteQuery\0229.google.cloud.di"
          + "scoveryengine.v1beta.CompleteQueryReques"
          + "t\032:.google.cloud.discoveryengine.v1beta."
          + "CompleteQueryResponse\"\247\001\202\323\344\223\002\240\001\022F/v1beta"
          + "/{data_store=projects/*/locations/*/data"
          + "Stores/*}:completeQueryZV\022T/v1beta/{data"
          + "_store=projects/*/locations/*/collection"
          + "s/*/dataStores/*}:completeQuery\032R\312A\036disc"
          + "overyengine.googleapis.com\322A.https://www"
          + ".googleapis.com/auth/cloud-platformB\235\002\n\'"
          + "com.google.cloud.discoveryengine.v1betaB"
          + "\026CompletionServiceProtoP\001ZQcloud.google."
          + "com/go/discoveryengine/apiv1beta/discove"
          + "ryenginepb;discoveryenginepb\242\002\017DISCOVERY"
          + "ENGINE\252\002#Google.Cloud.DiscoveryEngine.V1"
          + "Beta\312\002#Google\\Cloud\\DiscoveryEngine\\V1be"
          + "ta\352\002&Google::Cloud::DiscoveryEngine::V1b"
          + "etab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1beta_CompleteQueryRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_CompleteQueryRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_CompleteQueryRequest_descriptor,
            new java.lang.String[] {
              "DataStore", "Query", "QueryModel", "UserPseudoId",
            });
    internal_static_google_cloud_discoveryengine_v1beta_CompleteQueryResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1beta_CompleteQueryResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_CompleteQueryResponse_descriptor,
            new java.lang.String[] {
              "QuerySuggestions",
            });
    internal_static_google_cloud_discoveryengine_v1beta_CompleteQueryResponse_QuerySuggestion_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_CompleteQueryResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_CompleteQueryResponse_QuerySuggestion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_CompleteQueryResponse_QuerySuggestion_descriptor,
            new java.lang.String[] {
              "Suggestion",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
