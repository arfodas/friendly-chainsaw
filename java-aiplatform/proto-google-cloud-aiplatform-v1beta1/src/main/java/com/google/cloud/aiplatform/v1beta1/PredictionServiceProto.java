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
// source: google/cloud/aiplatform/v1beta1/prediction_service.proto

package com.google.cloud.aiplatform.v1beta1;

public final class PredictionServiceProto {
  private PredictionServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PredictRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PredictResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PredictResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_RawPredictRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RawPredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StreamingPredictRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StreamingPredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StreamingPredictResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StreamingPredictResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_ConcurrentExplanationSpecOverrideEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_ConcurrentExplanationSpecOverrideEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_ConcurrentExplanation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_ConcurrentExplanation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_ConcurrentExplanationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_ConcurrentExplanationsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CountTokensRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CountTokensRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_CountTokensResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_CountTokensResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/aiplatform/v1beta1/predic"
          + "tion_service.proto\022\037google.cloud.aiplatf"
          + "orm.v1beta1\032\034google/api/annotations.prot"
          + "o\032\027google/api/client.proto\032\037google/api/f"
          + "ield_behavior.proto\032\031google/api/httpbody"
          + ".proto\032\031google/api/resource.proto\0321googl"
          + "e/cloud/aiplatform/v1beta1/explanation.p"
          + "roto\032+google/cloud/aiplatform/v1beta1/ty"
          + "pes.proto\032\034google/protobuf/struct.proto\""
          + "\254\001\n\016PredictRequest\022=\n\010endpoint\030\001 \001(\tB+\342A"
          + "\001\002\372A$\n\"aiplatform.googleapis.com/Endpoin"
          + "t\022/\n\tinstances\030\002 \003(\0132\026.google.protobuf.V"
          + "alueB\004\342A\001\002\022*\n\nparameters\030\003 \001(\0132\026.google."
          + "protobuf.Value\"\204\002\n\017PredictResponse\022+\n\013pr"
          + "edictions\030\001 \003(\0132\026.google.protobuf.Value\022"
          + "\031\n\021deployed_model_id\030\002 \001(\t\0227\n\005model\030\003 \001("
          + "\tB(\342A\001\003\372A!\n\037aiplatform.googleapis.com/Mo"
          + "del\022\036\n\020model_version_id\030\005 \001(\tB\004\342A\001\003\022 \n\022m"
          + "odel_display_name\030\004 \001(\tB\004\342A\001\003\022.\n\010metadat"
          + "a\030\006 \001(\0132\026.google.protobuf.ValueB\004\342A\001\003\"{\n"
          + "\021RawPredictRequest\022=\n\010endpoint\030\001 \001(\tB+\342A"
          + "\001\002\372A$\n\"aiplatform.googleapis.com/Endpoin"
          + "t\022\'\n\thttp_body\030\002 \001(\0132\024.google.api.HttpBo"
          + "dy\"\316\001\n\027StreamingPredictRequest\022=\n\010endpoi"
          + "nt\030\001 \001(\tB+\342A\001\002\372A$\n\"aiplatform.googleapis"
          + ".com/Endpoint\0227\n\006inputs\030\002 \003(\0132\'.google.c"
          + "loud.aiplatform.v1beta1.Tensor\022;\n\nparame"
          + "ters\030\003 \001(\0132\'.google.cloud.aiplatform.v1b"
          + "eta1.Tensor\"\221\001\n\030StreamingPredictResponse"
          + "\0228\n\007outputs\030\001 \003(\0132\'.google.cloud.aiplatf"
          + "orm.v1beta1.Tensor\022;\n\nparameters\030\002 \001(\0132\'"
          + ".google.cloud.aiplatform.v1beta1.Tensor\""
          + "\266\004\n\016ExplainRequest\022=\n\010endpoint\030\001 \001(\tB+\342A"
          + "\001\002\372A$\n\"aiplatform.googleapis.com/Endpoin"
          + "t\022/\n\tinstances\030\002 \003(\0132\026.google.protobuf.V"
          + "alueB\004\342A\001\002\022*\n\nparameters\030\004 \001(\0132\026.google."
          + "protobuf.Value\022[\n\031explanation_spec_overr"
          + "ide\030\005 \001(\01328.google.cloud.aiplatform.v1be"
          + "ta1.ExplanationSpecOverride\022\212\001\n$concurre"
          + "nt_explanation_spec_override\030\006 \003(\0132V.goo"
          + "gle.cloud.aiplatform.v1beta1.ExplainRequ"
          + "est.ConcurrentExplanationSpecOverrideEnt"
          + "ryB\004\342A\001\001\022\031\n\021deployed_model_id\030\003 \001(\t\032\202\001\n&"
          + "ConcurrentExplanationSpecOverrideEntry\022\013"
          + "\n\003key\030\001 \001(\t\022G\n\005value\030\002 \001(\01328.google.clou"
          + "d.aiplatform.v1beta1.ExplanationSpecOver"
          + "ride:\0028\001\"\361\003\n\017ExplainResponse\022B\n\014explanat"
          + "ions\030\001 \003(\0132,.google.cloud.aiplatform.v1b"
          + "eta1.Explanation\022m\n\027concurrent_explanati"
          + "ons\030\004 \003(\0132L.google.cloud.aiplatform.v1be"
          + "ta1.ExplainResponse.ConcurrentExplanatio"
          + "nsEntry\022\031\n\021deployed_model_id\030\002 \001(\t\022+\n\013pr"
          + "edictions\030\003 \003(\0132\026.google.protobuf.Value\032"
          + "[\n\025ConcurrentExplanation\022B\n\014explanations"
          + "\030\001 \003(\0132,.google.cloud.aiplatform.v1beta1"
          + ".Explanation\032\205\001\n\033ConcurrentExplanationsE"
          + "ntry\022\013\n\003key\030\001 \001(\t\022U\n\005value\030\002 \001(\0132F.googl"
          + "e.cloud.aiplatform.v1beta1.ExplainRespon"
          + "se.ConcurrentExplanation:\0028\001\"\204\001\n\022CountTo"
          + "kensRequest\022=\n\010endpoint\030\001 \001(\tB+\342A\001\002\372A$\n\""
          + "aiplatform.googleapis.com/Endpoint\022/\n\tin"
          + "stances\030\002 \003(\0132\026.google.protobuf.ValueB\004\342"
          + "A\001\002\"N\n\023CountTokensResponse\022\024\n\014total_toke"
          + "ns\030\001 \001(\005\022!\n\031total_billable_characters\030\002 "
          + "\001(\0052\211\014\n\021PredictionService\022\250\002\n\007Predict\022/."
          + "google.cloud.aiplatform.v1beta1.PredictR"
          + "equest\0320.google.cloud.aiplatform.v1beta1"
          + ".PredictResponse\"\271\001\332A\035endpoint,instances"
          + ",parameters\202\323\344\223\002\222\001\">/v1beta1/{endpoint=p"
          + "rojects/*/locations/*/endpoints/*}:predi"
          + "ct:\001*ZM\"H/v1beta1/{endpoint=projects/*/l"
          + "ocations/*/publishers/*/models/*}:predic"
          + "t:\001*\022\215\002\n\nRawPredict\0222.google.cloud.aipla"
          + "tform.v1beta1.RawPredictRequest\032\024.google"
          + ".api.HttpBody\"\264\001\332A\022endpoint,http_body\202\323\344"
          + "\223\002\230\001\"A/v1beta1/{endpoint=projects/*/loca"
          + "tions/*/endpoints/*}:rawPredict:\001*ZP\"K/v"
          + "1beta1/{endpoint=projects/*/locations/*/"
          + "publishers/*/models/*}:rawPredict:\001*\022\311\002\n"
          + "\026ServerStreamingPredict\0228.google.cloud.a"
          + "iplatform.v1beta1.StreamingPredictReques"
          + "t\0329.google.cloud.aiplatform.v1beta1.Stre"
          + "amingPredictResponse\"\267\001\202\323\344\223\002\260\001\"M/v1beta1"
          + "/{endpoint=projects/*/locations/*/endpoi"
          + "nts/*}:serverStreamingPredict:\001*Z\\\"W/v1b"
          + "eta1/{endpoint=projects/*/locations/*/pu"
          + "blishers/*/models/*}:serverStreamingPred"
          + "ict:\001*0\001\022\351\001\n\007Explain\022/.google.cloud.aipl"
          + "atform.v1beta1.ExplainRequest\0320.google.c"
          + "loud.aiplatform.v1beta1.ExplainResponse\""
          + "{\332A/endpoint,instances,parameters,deploy"
          + "ed_model_id\202\323\344\223\002C\">/v1beta1/{endpoint=pr"
          + "ojects/*/locations/*/endpoints/*}:explai"
          + "n:\001*\022\261\002\n\013CountTokens\0223.google.cloud.aipl"
          + "atform.v1beta1.CountTokensRequest\0324.goog"
          + "le.cloud.aiplatform.v1beta1.CountTokensR"
          + "esponse\"\266\001\332A\022endpoint,instances\202\323\344\223\002\232\001\"B"
          + "/v1beta1/{endpoint=projects/*/locations/"
          + "*/endpoints/*}:countTokens:\001*ZQ\"L/v1beta"
          + "1/{endpoint=projects/*/locations/*/publi"
          + "shers/*/models/*}:countTokens:\001*\032M\312A\031aip"
          + "latform.googleapis.com\322A.https://www.goo"
          + "gleapis.com/auth/cloud-platformB\355\001\n#com."
          + "google.cloud.aiplatform.v1beta1B\026Predict"
          + "ionServiceProtoP\001ZCcloud.google.com/go/a"
          + "iplatform/apiv1beta1/aiplatformpb;aiplat"
          + "formpb\252\002\037Google.Cloud.AIPlatform.V1Beta1"
          + "\312\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Goo"
          + "gle::Cloud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.HttpBodyProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.TypesProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_PredictRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_PredictRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PredictRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "Instances", "Parameters",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PredictResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_PredictResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PredictResponse_descriptor,
            new java.lang.String[] {
              "Predictions",
              "DeployedModelId",
              "Model",
              "ModelVersionId",
              "ModelDisplayName",
              "Metadata",
            });
    internal_static_google_cloud_aiplatform_v1beta1_RawPredictRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_RawPredictRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_RawPredictRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "HttpBody",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StreamingPredictRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_StreamingPredictRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StreamingPredictRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "Inputs", "Parameters",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StreamingPredictResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_StreamingPredictResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StreamingPredictResponse_descriptor,
            new java.lang.String[] {
              "Outputs", "Parameters",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_descriptor,
            new java.lang.String[] {
              "Endpoint",
              "Instances",
              "Parameters",
              "ExplanationSpecOverride",
              "ConcurrentExplanationSpecOverride",
              "DeployedModelId",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_ConcurrentExplanationSpecOverrideEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_ConcurrentExplanationSpecOverrideEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplainRequest_ConcurrentExplanationSpecOverrideEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_descriptor,
            new java.lang.String[] {
              "Explanations", "ConcurrentExplanations", "DeployedModelId", "Predictions",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_ConcurrentExplanation_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_ConcurrentExplanation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_ConcurrentExplanation_descriptor,
            new java.lang.String[] {
              "Explanations",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_ConcurrentExplanationsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_ConcurrentExplanationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ExplainResponse_ConcurrentExplanationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CountTokensRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_CountTokensRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CountTokensRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "Instances",
            });
    internal_static_google_cloud_aiplatform_v1beta1_CountTokensResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_CountTokensResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_CountTokensResponse_descriptor,
            new java.lang.String[] {
              "TotalTokens", "TotalBillableCharacters",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.HttpBodyProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.TypesProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
