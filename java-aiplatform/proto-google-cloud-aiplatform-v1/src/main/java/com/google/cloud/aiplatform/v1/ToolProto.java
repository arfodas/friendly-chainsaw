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
// source: google/cloud/aiplatform/v1/tool.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public final class ToolProto {
  private ToolProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Tool_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Tool_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FunctionDeclaration_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FunctionDeclaration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FunctionCall_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FunctionCall_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FunctionResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FunctionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Retrieval_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Retrieval_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_VertexAISearch_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_VertexAISearch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GoogleSearchRetrieval_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GoogleSearchRetrieval_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ToolConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ToolConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_FunctionCallingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_FunctionCallingConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n%google/cloud/aiplatform/v1/tool.proto\022"
          + "\032google.cloud.aiplatform.v1\032\037google/api/"
          + "field_behavior.proto\032\031google/api/resourc"
          + "e.proto\032(google/cloud/aiplatform/v1/open"
          + "api.proto\032\034google/protobuf/struct.proto\""
          + "\363\001\n\004Tool\022S\n\025function_declarations\030\001 \003(\0132"
          + "/.google.cloud.aiplatform.v1.FunctionDec"
          + "larationB\003\340A\001\022=\n\tretrieval\030\002 \001(\0132%.googl"
          + "e.cloud.aiplatform.v1.RetrievalB\003\340A\001\022W\n\027"
          + "google_search_retrieval\030\003 \001(\01321.google.c"
          + "loud.aiplatform.v1.GoogleSearchRetrieval"
          + "B\003\340A\001\"\177\n\023FunctionDeclaration\022\021\n\004name\030\001 \001"
          + "(\tB\003\340A\002\022\030\n\013description\030\002 \001(\tB\003\340A\001\022;\n\npar"
          + "ameters\030\003 \001(\0132\".google.cloud.aiplatform."
          + "v1.SchemaB\003\340A\001\"M\n\014FunctionCall\022\021\n\004name\030\001"
          + " \001(\tB\003\340A\002\022*\n\004args\030\002 \001(\0132\027.google.protobu"
          + "f.StructB\003\340A\001\"U\n\020FunctionResponse\022\021\n\004nam"
          + "e\030\001 \001(\tB\003\340A\002\022.\n\010response\030\002 \001(\0132\027.google."
          + "protobuf.StructB\003\340A\002\"\177\n\tRetrieval\022F\n\020ver"
          + "tex_ai_search\030\002 \001(\0132*.google.cloud.aipla"
          + "tform.v1.VertexAISearchH\000\022 \n\023disable_att"
          + "ribution\030\003 \001(\010B\003\340A\001B\010\n\006source\"(\n\016VertexA"
          + "ISearch\022\026\n\tdatastore\030\001 \001(\tB\003\340A\002\"\027\n\025Googl"
          + "eSearchRetrieval\"e\n\nToolConfig\022W\n\027functi"
          + "on_calling_config\030\001 \001(\01321.google.cloud.a"
          + "iplatform.v1.FunctionCallingConfigB\003\340A\001\""
          + "\302\001\n\025FunctionCallingConfig\022I\n\004mode\030\001 \001(\0162"
          + "6.google.cloud.aiplatform.v1.FunctionCal"
          + "lingConfig.ModeB\003\340A\001\022#\n\026allowed_function"
          + "_names\030\002 \003(\tB\003\340A\001\"9\n\004Mode\022\024\n\020MODE_UNSPEC"
          + "IFIED\020\000\022\010\n\004AUTO\020\001\022\007\n\003ANY\020\002\022\010\n\004NONE\020\003B\307\001\n"
          + "\036com.google.cloud.aiplatform.v1B\tToolPro"
          + "toP\001Z>cloud.google.com/go/aiplatform/api"
          + "v1/aiplatformpb;aiplatformpb\252\002\032Google.Cl"
          + "oud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatf"
          + "orm\\V1\352\002\035Google::Cloud::AIPlatform::V1b\006"
          + "proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.OpenApiProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_Tool_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Tool_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Tool_descriptor,
            new java.lang.String[] {
              "FunctionDeclarations", "Retrieval", "GoogleSearchRetrieval",
            });
    internal_static_google_cloud_aiplatform_v1_FunctionDeclaration_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_FunctionDeclaration_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FunctionDeclaration_descriptor,
            new java.lang.String[] {
              "Name", "Description", "Parameters",
            });
    internal_static_google_cloud_aiplatform_v1_FunctionCall_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_FunctionCall_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FunctionCall_descriptor,
            new java.lang.String[] {
              "Name", "Args",
            });
    internal_static_google_cloud_aiplatform_v1_FunctionResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_FunctionResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FunctionResponse_descriptor,
            new java.lang.String[] {
              "Name", "Response",
            });
    internal_static_google_cloud_aiplatform_v1_Retrieval_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_Retrieval_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Retrieval_descriptor,
            new java.lang.String[] {
              "VertexAiSearch", "DisableAttribution", "Source",
            });
    internal_static_google_cloud_aiplatform_v1_VertexAISearch_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_VertexAISearch_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_VertexAISearch_descriptor,
            new java.lang.String[] {
              "Datastore",
            });
    internal_static_google_cloud_aiplatform_v1_GoogleSearchRetrieval_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_GoogleSearchRetrieval_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GoogleSearchRetrieval_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_aiplatform_v1_ToolConfig_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_ToolConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ToolConfig_descriptor,
            new java.lang.String[] {
              "FunctionCallingConfig",
            });
    internal_static_google_cloud_aiplatform_v1_FunctionCallingConfig_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1_FunctionCallingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_FunctionCallingConfig_descriptor,
            new java.lang.String[] {
              "Mode", "AllowedFunctionNames",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.OpenApiProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
