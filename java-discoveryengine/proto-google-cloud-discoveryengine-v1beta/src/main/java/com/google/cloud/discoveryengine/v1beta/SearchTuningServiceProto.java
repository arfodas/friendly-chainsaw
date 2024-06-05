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
// source: google/cloud/discoveryengine/v1beta/search_tuning_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1beta;

public final class SearchTuningServiceProto {
  private SearchTuningServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ListCustomModelsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ListCustomModelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ListCustomModelsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ListCustomModelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelRequest_GcsTrainingInput_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelRequest_GcsTrainingInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelResponse_MetricsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelResponse_MetricsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n?google/cloud/discoveryengine/v1beta/se"
          + "arch_tuning_service.proto\022#google.cloud."
          + "discoveryengine.v1beta\032\034google/api/annot"
          + "ations.proto\032\027google/api/client.proto\032\037g"
          + "oogle/api/field_behavior.proto\032\031google/a"
          + "pi/resource.proto\032=google/cloud/discover"
          + "yengine/v1beta/custom_tuning_model.proto"
          + "\0327google/cloud/discoveryengine/v1beta/im"
          + "port_config.proto\032#google/longrunning/op"
          + "erations.proto\032\037google/protobuf/timestam"
          + "p.proto\032\027google/rpc/status.proto\"_\n\027List"
          + "CustomModelsRequest\022D\n\ndata_store\030\001 \001(\tB"
          + "0\340A\002\372A*\n(discoveryengine.googleapis.com/"
          + "DataStore\"b\n\030ListCustomModelsResponse\022F\n"
          + "\006models\030\001 \003(\01326.google.cloud.discoveryen"
          + "gine.v1beta.CustomTuningModel\"\312\003\n\027TrainC"
          + "ustomModelRequest\022k\n\022gcs_training_input\030"
          + "\002 \001(\0132M.google.cloud.discoveryengine.v1b"
          + "eta.TrainCustomModelRequest.GcsTrainingI"
          + "nputH\000\022D\n\ndata_store\030\001 \001(\tB0\340A\002\372A*\n(disc"
          + "overyengine.googleapis.com/DataStore\022\022\n\n"
          + "model_type\030\003 \001(\t\022L\n\014error_config\030\004 \001(\01326"
          + ".google.cloud.discoveryengine.v1beta.Imp"
          + "ortErrorConfig\022\020\n\010model_id\030\005 \001(\t\032v\n\020GcsT"
          + "rainingInput\022\030\n\020corpus_data_path\030\001 \001(\t\022\027"
          + "\n\017query_data_path\030\002 \001(\t\022\027\n\017train_data_pa"
          + "th\030\003 \001(\t\022\026\n\016test_data_path\030\004 \001(\tB\020\n\016trai"
          + "ning_input\"\312\002\n\030TrainCustomModelResponse\022"
          + ")\n\rerror_samples\030\001 \003(\0132\022.google.rpc.Stat"
          + "us\022L\n\014error_config\030\002 \001(\01326.google.cloud."
          + "discoveryengine.v1beta.ImportErrorConfig"
          + "\022\024\n\014model_status\030\003 \001(\t\022[\n\007metrics\030\004 \003(\0132"
          + "J.google.cloud.discoveryengine.v1beta.Tr"
          + "ainCustomModelResponse.MetricsEntry\022\022\n\nm"
          + "odel_name\030\005 \001(\t\032.\n\014MetricsEntry\022\013\n\003key\030\001"
          + " \001(\t\022\r\n\005value\030\002 \001(\001:\0028\001\"|\n\030TrainCustomMo"
          + "delMetadata\022/\n\013create_time\030\001 \001(\0132\032.googl"
          + "e.protobuf.Timestamp\022/\n\013update_time\030\002 \001("
          + "\0132\032.google.protobuf.Timestamp2\256\005\n\023Search"
          + "TuningService\022\323\002\n\020TrainCustomModel\022<.goo"
          + "gle.cloud.discoveryengine.v1beta.TrainCu"
          + "stomModelRequest\032\035.google.longrunning.Op"
          + "eration\"\341\001\312A|\n<google.cloud.discoveryeng"
          + "ine.v1beta.TrainCustomModelResponse\022<goo"
          + "gle.cloud.discoveryengine.v1beta.TrainCu"
          + "stomModelMetadata\202\323\344\223\002\\\"W/v1beta/{data_s"
          + "tore=projects/*/locations/*/collections/"
          + "*/dataStores/*}:trainCustomModel:\001*\022\354\001\n\020"
          + "ListCustomModels\022<.google.cloud.discover"
          + "yengine.v1beta.ListCustomModelsRequest\032="
          + ".google.cloud.discoveryengine.v1beta.Lis"
          + "tCustomModelsResponse\"[\202\323\344\223\002U\022S/v1beta/{"
          + "data_store=projects/*/locations/*/collec"
          + "tions/*/dataStores/*}/customModels\032R\312A\036d"
          + "iscoveryengine.googleapis.com\322A.https://"
          + "www.googleapis.com/auth/cloud-platformB\237"
          + "\002\n\'com.google.cloud.discoveryengine.v1be"
          + "taB\030SearchTuningServiceProtoP\001ZQcloud.go"
          + "ogle.com/go/discoveryengine/apiv1beta/di"
          + "scoveryenginepb;discoveryenginepb\242\002\017DISC"
          + "OVERYENGINE\252\002#Google.Cloud.DiscoveryEngi"
          + "ne.V1Beta\312\002#Google\\Cloud\\DiscoveryEngine"
          + "\\V1beta\352\002&Google::Cloud::DiscoveryEngine"
          + "::V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.CustomTuningModelProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.ImportConfigProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1beta_ListCustomModelsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_ListCustomModelsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ListCustomModelsRequest_descriptor,
            new java.lang.String[] {
              "DataStore",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ListCustomModelsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1beta_ListCustomModelsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ListCustomModelsResponse_descriptor,
            new java.lang.String[] {
              "Models",
            });
    internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelRequest_descriptor,
            new java.lang.String[] {
              "GcsTrainingInput",
              "DataStore",
              "ModelType",
              "ErrorConfig",
              "ModelId",
              "TrainingInput",
            });
    internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelRequest_GcsTrainingInput_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelRequest_GcsTrainingInput_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelRequest_GcsTrainingInput_descriptor,
            new java.lang.String[] {
              "CorpusDataPath", "QueryDataPath", "TrainDataPath", "TestDataPath",
            });
    internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorConfig", "ModelStatus", "Metrics", "ModelName",
            });
    internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelResponse_MetricsEntry_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelResponse_MetricsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelResponse_MetricsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_TrainCustomModelMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.CustomTuningModelProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.ImportConfigProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
