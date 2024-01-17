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
// source: google/cloud/vertexai/v1/endpoint_service.proto

package com.google.cloud.vertexai.api;

public final class EndpointServiceProto {
  private EndpointServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_CreateEndpointRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_CreateEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_CreateEndpointOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_CreateEndpointOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_GetEndpointRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_GetEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_ListEndpointsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_ListEndpointsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_ListEndpointsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_ListEndpointsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_UpdateEndpointRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_UpdateEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_DeleteEndpointRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_DeleteEndpointRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_DeployModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_DeployModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_DeployModelRequest_TrafficSplitEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_DeployModelRequest_TrafficSplitEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_DeployModelResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_DeployModelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_DeployModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_DeployModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_UndeployModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_UndeployModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_UndeployModelRequest_TrafficSplitEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_UndeployModelRequest_TrafficSplitEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_UndeployModelResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_UndeployModelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_UndeployModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_UndeployModelOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_MutateDeployedModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_MutateDeployedModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_MutateDeployedModelResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_MutateDeployedModelResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_vertexai_v1_MutateDeployedModelOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_vertexai_v1_MutateDeployedModelOperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/vertexai/v1/endpoint_serv"
          + "ice.proto\022\030google.cloud.vertexai.v1\032\034goo"
          + "gle/api/annotations.proto\032\027google/api/cl"
          + "ient.proto\032\037google/api/field_behavior.pr"
          + "oto\032\031google/api/resource.proto\032\'google/c"
          + "loud/vertexai/v1/endpoint.proto\032(google/"
          + "cloud/vertexai/v1/operation.proto\032#googl"
          + "e/longrunning/operations.proto\032\033google/p"
          + "rotobuf/empty.proto\032 google/protobuf/fie"
          + "ld_mask.proto\"\252\001\n\025CreateEndpointRequest\022"
          + ":\n\006parent\030\001 \001(\tB*\342A\001\002\372A#\n!locations.goog"
          + "leapis.com/Location\022:\n\010endpoint\030\002 \001(\0132\"."
          + "google.cloud.vertexai.v1.EndpointB\004\342A\001\002\022"
          + "\031\n\013endpoint_id\030\004 \001(\tB\004\342A\001\005\"o\n\037CreateEndp"
          + "ointOperationMetadata\022L\n\020generic_metadat"
          + "a\030\001 \001(\01322.google.cloud.vertexai.v1.Gener"
          + "icOperationMetadata\"O\n\022GetEndpointReques"
          + "t\0229\n\004name\030\001 \001(\tB+\342A\001\002\372A$\n\"aiplatform.goo"
          + "gleapis.com/Endpoint\"\342\001\n\024ListEndpointsRe"
          + "quest\022:\n\006parent\030\001 \001(\tB*\342A\001\002\372A#\n!location"
          + "s.googleapis.com/Location\022\024\n\006filter\030\002 \001("
          + "\tB\004\342A\001\001\022\027\n\tpage_size\030\003 \001(\005B\004\342A\001\001\022\030\n\npage"
          + "_token\030\004 \001(\tB\004\342A\001\001\0223\n\tread_mask\030\005 \001(\0132\032."
          + "google.protobuf.FieldMaskB\004\342A\001\001\022\020\n\010order"
          + "_by\030\006 \001(\t\"g\n\025ListEndpointsResponse\0225\n\ten"
          + "dpoints\030\001 \003(\0132\".google.cloud.vertexai.v1"
          + ".Endpoint\022\027\n\017next_page_token\030\002 \001(\t\"\212\001\n\025U"
          + "pdateEndpointRequest\022:\n\010endpoint\030\001 \001(\0132\""
          + ".google.cloud.vertexai.v1.EndpointB\004\342A\001\002"
          + "\0225\n\013update_mask\030\002 \001(\0132\032.google.protobuf."
          + "FieldMaskB\004\342A\001\002\"R\n\025DeleteEndpointRequest"
          + "\0229\n\004name\030\001 \001(\tB+\342A\001\002\372A$\n\"aiplatform.goog"
          + "leapis.com/Endpoint\"\246\002\n\022DeployModelReque"
          + "st\022=\n\010endpoint\030\001 \001(\tB+\342A\001\002\372A$\n\"aiplatfor"
          + "m.googleapis.com/Endpoint\022E\n\016deployed_mo"
          + "del\030\002 \001(\0132\'.google.cloud.vertexai.v1.Dep"
          + "loyedModelB\004\342A\001\002\022U\n\rtraffic_split\030\003 \003(\0132"
          + ">.google.cloud.vertexai.v1.DeployModelRe"
          + "quest.TrafficSplitEntry\0323\n\021TrafficSplitE"
          + "ntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\005:\0028\001\"V\n\023"
          + "DeployModelResponse\022?\n\016deployed_model\030\001 "
          + "\001(\0132\'.google.cloud.vertexai.v1.DeployedM"
          + "odel\"l\n\034DeployModelOperationMetadata\022L\n\020"
          + "generic_metadata\030\001 \001(\01322.google.cloud.ve"
          + "rtexai.v1.GenericOperationMetadata\"\204\002\n\024U"
          + "ndeployModelRequest\022=\n\010endpoint\030\001 \001(\tB+\342"
          + "A\001\002\372A$\n\"aiplatform.googleapis.com/Endpoi"
          + "nt\022\037\n\021deployed_model_id\030\002 \001(\tB\004\342A\001\002\022W\n\rt"
          + "raffic_split\030\003 \003(\0132@.google.cloud.vertex"
          + "ai.v1.UndeployModelRequest.TrafficSplitE"
          + "ntry\0323\n\021TrafficSplitEntry\022\013\n\003key\030\001 \001(\t\022\r"
          + "\n\005value\030\002 \001(\005:\0028\001\"\027\n\025UndeployModelRespon"
          + "se\"n\n\036UndeployModelOperationMetadata\022L\n\020"
          + "generic_metadata\030\001 \001(\01322.google.cloud.ve"
          + "rtexai.v1.GenericOperationMetadata\"\331\001\n\032M"
          + "utateDeployedModelRequest\022=\n\010endpoint\030\001 "
          + "\001(\tB+\342A\001\002\372A$\n\"aiplatform.googleapis.com/"
          + "Endpoint\022E\n\016deployed_model\030\002 \001(\0132\'.googl"
          + "e.cloud.vertexai.v1.DeployedModelB\004\342A\001\002\022"
          + "5\n\013update_mask\030\004 \001(\0132\032.google.protobuf.F"
          + "ieldMaskB\004\342A\001\002\"^\n\033MutateDeployedModelRes"
          + "ponse\022?\n\016deployed_model\030\001 \001(\0132\'.google.c"
          + "loud.vertexai.v1.DeployedModel\"t\n$Mutate"
          + "DeployedModelOperationMetadata\022L\n\020generi"
          + "c_metadata\030\001 \001(\01322.google.cloud.vertexai"
          + ".v1.GenericOperationMetadata2\230\017\n\017Endpoin"
          + "tService\022\200\002\n\016CreateEndpoint\022/.google.clo"
          + "ud.vertexai.v1.CreateEndpointRequest\032\035.g"
          + "oogle.longrunning.Operation\"\235\001\312A+\n\010Endpo"
          + "int\022\037CreateEndpointOperationMetadata\332A\017p"
          + "arent,endpoint\332A\033parent,endpoint,endpoin"
          + "t_id\202\323\344\223\0029\"-/v1/{parent=projects/*/locat"
          + "ions/*}/endpoints:\010endpoint\022\235\001\n\013GetEndpo"
          + "int\022,.google.cloud.vertexai.v1.GetEndpoi"
          + "ntRequest\032\".google.cloud.vertexai.v1.End"
          + "point\"<\332A\004name\202\323\344\223\002/\022-/v1/{name=projects"
          + "/*/locations/*/endpoints/*}\022\260\001\n\rListEndp"
          + "oints\022..google.cloud.vertexai.v1.ListEnd"
          + "pointsRequest\032/.google.cloud.vertexai.v1"
          + ".ListEndpointsResponse\">\332A\006parent\202\323\344\223\002/\022"
          + "-/v1/{parent=projects/*/locations/*}/end"
          + "points\022\306\001\n\016UpdateEndpoint\022/.google.cloud"
          + ".vertexai.v1.UpdateEndpointRequest\032\".goo"
          + "gle.cloud.vertexai.v1.Endpoint\"_\332A\024endpo"
          + "int,update_mask\202\323\344\223\002B26/v1/{endpoint.nam"
          + "e=projects/*/locations/*/endpoints/*}:\010e"
          + "ndpoint\022\321\001\n\016DeleteEndpoint\022/.google.clou"
          + "d.vertexai.v1.DeleteEndpointRequest\032\035.go"
          + "ogle.longrunning.Operation\"o\312A0\n\025google."
          + "protobuf.Empty\022\027DeleteOperationMetadata\332"
          + "A\004name\202\323\344\223\002/*-/v1/{name=projects/*/locat"
          + "ions/*/endpoints/*}\022\203\002\n\013DeployModel\022,.go"
          + "ogle.cloud.vertexai.v1.DeployModelReques"
          + "t\032\035.google.longrunning.Operation\"\246\001\312A3\n\023"
          + "DeployModelResponse\022\034DeployModelOperatio"
          + "nMetadata\332A%endpoint,deployed_model,traf"
          + "fic_split\202\323\344\223\002B\"=/v1/{endpoint=projects/"
          + "*/locations/*/endpoints/*}:deployModel:\001"
          + "*\022\220\002\n\rUndeployModel\022..google.cloud.verte"
          + "xai.v1.UndeployModelRequest\032\035.google.lon"
          + "grunning.Operation\"\257\001\312A7\n\025UndeployModelR"
          + "esponse\022\036UndeployModelOperationMetadata\332"
          + "A(endpoint,deployed_model_id,traffic_spl"
          + "it\202\323\344\223\002D\"?/v1/{endpoint=projects/*/locat"
          + "ions/*/endpoints/*}:undeployModel:\001*\022\251\002\n"
          + "\023MutateDeployedModel\0224.google.cloud.vert"
          + "exai.v1.MutateDeployedModelRequest\032\035.goo"
          + "gle.longrunning.Operation\"\274\001\312AC\n\033MutateD"
          + "eployedModelResponse\022$MutateDeployedMode"
          + "lOperationMetadata\332A#endpoint,deployed_m"
          + "odel,update_mask\202\323\344\223\002J\"E/v1/{endpoint=pr"
          + "ojects/*/locations/*/endpoints/*}:mutate"
          + "DeployedModel:\001*\032M\312A\031aiplatform.googleap"
          + "is.com\322A.https://www.googleapis.com/auth"
          + "/cloud-platformB\321\001\n\035com.google.cloud.ver"
          + "texai.apiB\024EndpointServiceProtoP\001Z>cloud"
          + ".google.com/go/aiplatform/apiv1/aiplatfo"
          + "rmpb;aiplatformpb\252\002\032Google.Cloud.AIPlatf"
          + "orm.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Go"
          + "ogle::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.vertexai.api.EndpointProto.getDescriptor(),
              com.google.cloud.vertexai.api.OperationProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_vertexai_v1_CreateEndpointRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_vertexai_v1_CreateEndpointRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_CreateEndpointRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Endpoint", "EndpointId",
            });
    internal_static_google_cloud_vertexai_v1_CreateEndpointOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_vertexai_v1_CreateEndpointOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_CreateEndpointOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_vertexai_v1_GetEndpointRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_vertexai_v1_GetEndpointRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_GetEndpointRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_vertexai_v1_ListEndpointsRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_vertexai_v1_ListEndpointsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_ListEndpointsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "ReadMask", "OrderBy",
            });
    internal_static_google_cloud_vertexai_v1_ListEndpointsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_vertexai_v1_ListEndpointsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_ListEndpointsResponse_descriptor,
            new java.lang.String[] {
              "Endpoints", "NextPageToken",
            });
    internal_static_google_cloud_vertexai_v1_UpdateEndpointRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_vertexai_v1_UpdateEndpointRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_UpdateEndpointRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "UpdateMask",
            });
    internal_static_google_cloud_vertexai_v1_DeleteEndpointRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_vertexai_v1_DeleteEndpointRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_DeleteEndpointRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_vertexai_v1_DeployModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_vertexai_v1_DeployModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_DeployModelRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "DeployedModel", "TrafficSplit",
            });
    internal_static_google_cloud_vertexai_v1_DeployModelRequest_TrafficSplitEntry_descriptor =
        internal_static_google_cloud_vertexai_v1_DeployModelRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_vertexai_v1_DeployModelRequest_TrafficSplitEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_DeployModelRequest_TrafficSplitEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_vertexai_v1_DeployModelResponse_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_vertexai_v1_DeployModelResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_DeployModelResponse_descriptor,
            new java.lang.String[] {
              "DeployedModel",
            });
    internal_static_google_cloud_vertexai_v1_DeployModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_vertexai_v1_DeployModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_DeployModelOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_vertexai_v1_UndeployModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_vertexai_v1_UndeployModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_UndeployModelRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "DeployedModelId", "TrafficSplit",
            });
    internal_static_google_cloud_vertexai_v1_UndeployModelRequest_TrafficSplitEntry_descriptor =
        internal_static_google_cloud_vertexai_v1_UndeployModelRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_vertexai_v1_UndeployModelRequest_TrafficSplitEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_UndeployModelRequest_TrafficSplitEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_vertexai_v1_UndeployModelResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_vertexai_v1_UndeployModelResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_UndeployModelResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_vertexai_v1_UndeployModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_vertexai_v1_UndeployModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_UndeployModelOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    internal_static_google_cloud_vertexai_v1_MutateDeployedModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_vertexai_v1_MutateDeployedModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_MutateDeployedModelRequest_descriptor,
            new java.lang.String[] {
              "Endpoint", "DeployedModel", "UpdateMask",
            });
    internal_static_google_cloud_vertexai_v1_MutateDeployedModelResponse_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_vertexai_v1_MutateDeployedModelResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_MutateDeployedModelResponse_descriptor,
            new java.lang.String[] {
              "DeployedModel",
            });
    internal_static_google_cloud_vertexai_v1_MutateDeployedModelOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_vertexai_v1_MutateDeployedModelOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_vertexai_v1_MutateDeployedModelOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.vertexai.api.EndpointProto.getDescriptor();
    com.google.cloud.vertexai.api.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
