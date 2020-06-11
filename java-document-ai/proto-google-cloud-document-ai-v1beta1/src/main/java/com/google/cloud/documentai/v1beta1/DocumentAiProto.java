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
// source: google/cloud/documentai/v1beta1/document_understanding.proto

package com.google.cloud.documentai.v1beta1;

public final class DocumentAiProto {
  private DocumentAiProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_BatchProcessDocumentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_BatchProcessDocumentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_ProcessDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_ProcessDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_BatchProcessDocumentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_BatchProcessDocumentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_ProcessDocumentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_ProcessDocumentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_OcrParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_OcrParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_TableExtractionParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_TableExtractionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_TableBoundHint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_TableBoundHint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_FormExtractionParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_FormExtractionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_KeyValuePairHint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_KeyValuePairHint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_EntityExtractionParams_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_EntityExtractionParams_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_InputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_InputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_OutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_OutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_GcsSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_GcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_GcsDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_GcsDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_documentai_v1beta1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_documentai_v1beta1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n<google/cloud/documentai/v1beta1/docume"
          + "nt_understanding.proto\022\037google.cloud.doc"
          + "umentai.v1beta1\032\034google/api/annotations."
          + "proto\032\027google/api/client.proto\032\037google/a"
          + "pi/field_behavior.proto\032.google/cloud/do"
          + "cumentai/v1beta1/geometry.proto\032#google/"
          + "longrunning/operations.proto\032\037google/pro"
          + "tobuf/timestamp.proto\"~\n\034BatchProcessDoc"
          + "umentsRequest\022N\n\010requests\030\001 \003(\01327.google"
          + ".cloud.documentai.v1beta1.ProcessDocumen"
          + "tRequestB\003\340A\002\022\016\n\006parent\030\002 \001(\t\"\216\004\n\026Proces"
          + "sDocumentRequest\022G\n\014input_config\030\001 \001(\0132,"
          + ".google.cloud.documentai.v1beta1.InputCo"
          + "nfigB\003\340A\002\022I\n\routput_config\030\002 \001(\0132-.googl"
          + "e.cloud.documentai.v1beta1.OutputConfigB"
          + "\003\340A\002\022\025\n\rdocument_type\030\003 \001(\t\022W\n\027table_ext"
          + "raction_params\030\004 \001(\01326.google.cloud.docu"
          + "mentai.v1beta1.TableExtractionParams\022U\n\026"
          + "form_extraction_params\030\005 \001(\01325.google.cl"
          + "oud.documentai.v1beta1.FormExtractionPar"
          + "ams\022Y\n\030entity_extraction_params\030\006 \001(\01327."
          + "google.cloud.documentai.v1beta1.EntityEx"
          + "tractionParams\022>\n\nocr_params\030\007 \001(\0132*.goo"
          + "gle.cloud.documentai.v1beta1.OcrParams\"l"
          + "\n\035BatchProcessDocumentsResponse\022K\n\trespo"
          + "nses\030\001 \003(\01328.google.cloud.documentai.v1b"
          + "eta1.ProcessDocumentResponse\"\243\001\n\027Process"
          + "DocumentResponse\022B\n\014input_config\030\001 \001(\0132,"
          + ".google.cloud.documentai.v1beta1.InputCo"
          + "nfig\022D\n\routput_config\030\002 \001(\0132-.google.clo"
          + "ud.documentai.v1beta1.OutputConfig\"#\n\tOc"
          + "rParams\022\026\n\016language_hints\030\001 \003(\t\"\253\001\n\025Tabl"
          + "eExtractionParams\022\017\n\007enabled\030\001 \001(\010\022O\n\021ta"
          + "ble_bound_hints\030\002 \003(\0132/.google.cloud.doc"
          + "umentai.v1beta1.TableBoundHintB\003\340A\001\022\031\n\014h"
          + "eader_hints\030\003 \003(\tB\003\340A\001\022\025\n\rmodel_version\030"
          + "\004 \001(\t\"o\n\016TableBoundHint\022\030\n\013page_number\030\001"
          + " \001(\005B\003\340A\001\022C\n\014bounding_box\030\002 \001(\0132-.google"
          + ".cloud.documentai.v1beta1.BoundingPoly\"\217"
          + "\001\n\024FormExtractionParams\022\017\n\007enabled\030\001 \001(\010"
          + "\022O\n\024key_value_pair_hints\030\002 \003(\01321.google."
          + "cloud.documentai.v1beta1.KeyValuePairHin"
          + "t\022\025\n\rmodel_version\030\003 \001(\t\"4\n\020KeyValuePair"
          + "Hint\022\013\n\003key\030\001 \001(\t\022\023\n\013value_types\030\002 \003(\t\"@"
          + "\n\026EntityExtractionParams\022\017\n\007enabled\030\001 \001("
          + "\010\022\025\n\rmodel_version\030\002 \001(\t\"q\n\013InputConfig\022"
          + "@\n\ngcs_source\030\001 \001(\0132*.google.cloud.docum"
          + "entai.v1beta1.GcsSourceH\000\022\026\n\tmime_type\030\002"
          + " \001(\tB\003\340A\002B\010\n\006source\"\202\001\n\014OutputConfig\022J\n\017"
          + "gcs_destination\030\001 \001(\0132/.google.cloud.doc"
          + "umentai.v1beta1.GcsDestinationH\000\022\027\n\017page"
          + "s_per_shard\030\002 \001(\005B\r\n\013destination\"\035\n\tGcsS"
          + "ource\022\020\n\003uri\030\001 \001(\tB\003\340A\002\"\"\n\016GcsDestinatio"
          + "n\022\020\n\003uri\030\001 \001(\tB\003\340A\002\"\307\002\n\021OperationMetadat"
          + "a\022G\n\005state\030\001 \001(\01628.google.cloud.document"
          + "ai.v1beta1.OperationMetadata.State\022\025\n\rst"
          + "ate_message\030\002 \001(\t\022/\n\013create_time\030\003 \001(\0132\032"
          + ".google.protobuf.Timestamp\022/\n\013update_tim"
          + "e\030\004 \001(\0132\032.google.protobuf.Timestamp\"p\n\005S"
          + "tate\022\025\n\021STATE_UNSPECIFIED\020\000\022\014\n\010ACCEPTED\020"
          + "\001\022\013\n\007WAITING\020\002\022\013\n\007RUNNING\020\003\022\r\n\tSUCCEEDED"
          + "\020\004\022\r\n\tCANCELLED\020\005\022\n\n\006FAILED\020\0062\254\003\n\034Docume"
          + "ntUnderstandingService\022\274\002\n\025BatchProcessD"
          + "ocuments\022=.google.cloud.documentai.v1bet"
          + "a1.BatchProcessDocumentsRequest\032\035.google"
          + ".longrunning.Operation\"\304\001\202\323\344\223\002~\"?/v1beta"
          + "1/{parent=projects/*/locations/*}/docume"
          + "nts:batchProcess:\001*Z8\"3/v1beta1/{parent="
          + "projects/*}/documents:batchProcess:\001*\332A\010"
          + "requests\312A2\n\035BatchProcessDocumentsRespon"
          + "se\022\021OperationMetadata\032M\312A\031documentai.goo"
          + "gleapis.com\322A.https://www.googleapis.com"
          + "/auth/cloud-platformB\354\001\n#com.google.clou"
          + "d.documentai.v1beta1B\017DocumentAiProtoP\001Z"
          + "Igoogle.golang.org/genproto/googleapis/c"
          + "loud/documentai/v1beta1;documentai\252\002\037Goo"
          + "gle.Cloud.DocumentAI.V1Beta1\312\002\037Google\\Cl"
          + "oud\\DocumentAi\\V1beta1\352\002\"Google::Cloud::"
          + "DocumentAI::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.documentai.v1beta1.GeometryProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_documentai_v1beta1_BatchProcessDocumentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_documentai_v1beta1_BatchProcessDocumentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_BatchProcessDocumentsRequest_descriptor,
            new java.lang.String[] {
              "Requests", "Parent",
            });
    internal_static_google_cloud_documentai_v1beta1_ProcessDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_documentai_v1beta1_ProcessDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_ProcessDocumentRequest_descriptor,
            new java.lang.String[] {
              "InputConfig",
              "OutputConfig",
              "DocumentType",
              "TableExtractionParams",
              "FormExtractionParams",
              "EntityExtractionParams",
              "OcrParams",
            });
    internal_static_google_cloud_documentai_v1beta1_BatchProcessDocumentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_documentai_v1beta1_BatchProcessDocumentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_BatchProcessDocumentsResponse_descriptor,
            new java.lang.String[] {
              "Responses",
            });
    internal_static_google_cloud_documentai_v1beta1_ProcessDocumentResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_documentai_v1beta1_ProcessDocumentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_ProcessDocumentResponse_descriptor,
            new java.lang.String[] {
              "InputConfig", "OutputConfig",
            });
    internal_static_google_cloud_documentai_v1beta1_OcrParams_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_documentai_v1beta1_OcrParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_OcrParams_descriptor,
            new java.lang.String[] {
              "LanguageHints",
            });
    internal_static_google_cloud_documentai_v1beta1_TableExtractionParams_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_documentai_v1beta1_TableExtractionParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_TableExtractionParams_descriptor,
            new java.lang.String[] {
              "Enabled", "TableBoundHints", "HeaderHints", "ModelVersion",
            });
    internal_static_google_cloud_documentai_v1beta1_TableBoundHint_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_documentai_v1beta1_TableBoundHint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_TableBoundHint_descriptor,
            new java.lang.String[] {
              "PageNumber", "BoundingBox",
            });
    internal_static_google_cloud_documentai_v1beta1_FormExtractionParams_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_documentai_v1beta1_FormExtractionParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_FormExtractionParams_descriptor,
            new java.lang.String[] {
              "Enabled", "KeyValuePairHints", "ModelVersion",
            });
    internal_static_google_cloud_documentai_v1beta1_KeyValuePairHint_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_documentai_v1beta1_KeyValuePairHint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_KeyValuePairHint_descriptor,
            new java.lang.String[] {
              "Key", "ValueTypes",
            });
    internal_static_google_cloud_documentai_v1beta1_EntityExtractionParams_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_documentai_v1beta1_EntityExtractionParams_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_EntityExtractionParams_descriptor,
            new java.lang.String[] {
              "Enabled", "ModelVersion",
            });
    internal_static_google_cloud_documentai_v1beta1_InputConfig_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_documentai_v1beta1_InputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_InputConfig_descriptor,
            new java.lang.String[] {
              "GcsSource", "MimeType", "Source",
            });
    internal_static_google_cloud_documentai_v1beta1_OutputConfig_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_documentai_v1beta1_OutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_OutputConfig_descriptor,
            new java.lang.String[] {
              "GcsDestination", "PagesPerShard", "Destination",
            });
    internal_static_google_cloud_documentai_v1beta1_GcsSource_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_documentai_v1beta1_GcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_GcsSource_descriptor,
            new java.lang.String[] {
              "Uri",
            });
    internal_static_google_cloud_documentai_v1beta1_GcsDestination_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_documentai_v1beta1_GcsDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_GcsDestination_descriptor,
            new java.lang.String[] {
              "Uri",
            });
    internal_static_google_cloud_documentai_v1beta1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_documentai_v1beta1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_documentai_v1beta1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "State", "StateMessage", "CreateTime", "UpdateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.documentai.v1beta1.GeometryProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
