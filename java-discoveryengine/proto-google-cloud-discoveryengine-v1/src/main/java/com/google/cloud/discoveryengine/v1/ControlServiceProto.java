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
// source: google/cloud/discoveryengine/v1/control_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1;

public final class ControlServiceProto {
  private ControlServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_CreateControlRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_CreateControlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_UpdateControlRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_UpdateControlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_DeleteControlRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_DeleteControlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_GetControlRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_GetControlRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_ListControlsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_ListControlsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_ListControlsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_ListControlsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/discoveryengine/v1/contro"
          + "l_service.proto\022\037google.cloud.discoverye"
          + "ngine.v1\032\034google/api/annotations.proto\032\027"
          + "google/api/client.proto\032\037google/api/fiel"
          + "d_behavior.proto\032\031google/api/resource.pr"
          + "oto\032-google/cloud/discoveryengine/v1/con"
          + "trol.proto\032\033google/protobuf/empty.proto\032"
          + " google/protobuf/field_mask.proto\"\257\001\n\024Cr"
          + "eateControlRequest\022>\n\006parent\030\001 \001(\tB.\340A\002\372"
          + "A(\022&discoveryengine.googleapis.com/Contr"
          + "ol\022>\n\007control\030\002 \001(\0132(.google.cloud.disco"
          + "veryengine.v1.ControlB\003\340A\002\022\027\n\ncontrol_id"
          + "\030\003 \001(\tB\003\340A\002\"\214\001\n\024UpdateControlRequest\022>\n\007"
          + "control\030\001 \001(\0132(.google.cloud.discoveryen"
          + "gine.v1.ControlB\003\340A\002\0224\n\013update_mask\030\002 \001("
          + "\0132\032.google.protobuf.FieldMaskB\003\340A\001\"T\n\024De"
          + "leteControlRequest\022<\n\004name\030\001 \001(\tB.\340A\002\372A("
          + "\n&discoveryengine.googleapis.com/Control"
          + "\"Q\n\021GetControlRequest\022<\n\004name\030\001 \001(\tB.\340A\002"
          + "\372A(\n&discoveryengine.googleapis.com/Cont"
          + "rol\"\233\001\n\023ListControlsRequest\022>\n\006parent\030\001 "
          + "\001(\tB.\340A\002\372A(\022&discoveryengine.googleapis."
          + "com/Control\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\np"
          + "age_token\030\003 \001(\tB\003\340A\001\022\023\n\006filter\030\004 \001(\tB\003\340A"
          + "\001\"k\n\024ListControlsResponse\022:\n\010controls\030\001 "
          + "\003(\0132(.google.cloud.discoveryengine.v1.Co"
          + "ntrol\022\027\n\017next_page_token\030\002 \001(\t2\345\016\n\016Contr"
          + "olService\022\377\002\n\rCreateControl\0225.google.clo"
          + "ud.discoveryengine.v1.CreateControlReque"
          + "st\032(.google.cloud.discoveryengine.v1.Con"
          + "trol\"\214\002\332A\031parent,control,control_id\202\323\344\223\002"
          + "\351\001\"9/v1/{parent=projects/*/locations/*/d"
          + "ataStores/*}/controls:\007controlZR\"G/v1/{p"
          + "arent=projects/*/locations/*/collections"
          + "/*/dataStores/*}/controls:\007controlZO\"D/v"
          + "1/{parent=projects/*/locations/*/collect"
          + "ions/*/engines/*}/controls:\007control\022\275\002\n\r"
          + "DeleteControl\0225.google.cloud.discoveryen"
          + "gine.v1.DeleteControlRequest\032\026.google.pr"
          + "otobuf.Empty\"\334\001\332A\004name\202\323\344\223\002\316\001*9/v1/{name"
          + "=projects/*/locations/*/dataStores/*/con"
          + "trols/*}ZI*G/v1/{name=projects/*/locatio"
          + "ns/*/collections/*/dataStores/*/controls"
          + "/*}ZF*D/v1/{name=projects/*/locations/*/"
          + "collections/*/engines/*/controls/*}\022\221\003\n\r"
          + "UpdateControl\0225.google.cloud.discoveryen"
          + "gine.v1.UpdateControlRequest\032(.google.cl"
          + "oud.discoveryengine.v1.Control\"\236\002\332A\023cont"
          + "rol,update_mask\202\323\344\223\002\201\0022A/v1/{control.nam"
          + "e=projects/*/locations/*/dataStores/*/co"
          + "ntrols/*}:\007controlZZ2O/v1/{control.name="
          + "projects/*/locations/*/collections/*/dat"
          + "aStores/*/controls/*}:\007controlZW2L/v1/{c"
          + "ontrol.name=projects/*/locations/*/colle"
          + "ctions/*/engines/*/controls/*}:\007control\022"
          + "\311\002\n\nGetControl\0222.google.cloud.discoverye"
          + "ngine.v1.GetControlRequest\032(.google.clou"
          + "d.discoveryengine.v1.Control\"\334\001\332A\004name\202\323"
          + "\344\223\002\316\001\0229/v1/{name=projects/*/locations/*/"
          + "dataStores/*/controls/*}ZI\022G/v1/{name=pr"
          + "ojects/*/locations/*/collections/*/dataS"
          + "tores/*/controls/*}ZF\022D/v1/{name=project"
          + "s/*/locations/*/collections/*/engines/*/"
          + "controls/*}\022\334\002\n\014ListControls\0224.google.cl"
          + "oud.discoveryengine.v1.ListControlsReque"
          + "st\0325.google.cloud.discoveryengine.v1.Lis"
          + "tControlsResponse\"\336\001\332A\006parent\202\323\344\223\002\316\001\0229/v"
          + "1/{parent=projects/*/locations/*/dataSto"
          + "res/*}/controlsZI\022G/v1/{parent=projects/"
          + "*/locations/*/collections/*/dataStores/*"
          + "}/controlsZF\022D/v1/{parent=projects/*/loc"
          + "ations/*/collections/*/engines/*}/contro"
          + "ls\032R\312A\036discoveryengine.googleapis.com\322A."
          + "https://www.googleapis.com/auth/cloud-pl"
          + "atformB\206\002\n#com.google.cloud.discoveryeng"
          + "ine.v1B\023ControlServiceProtoP\001ZMcloud.goo"
          + "gle.com/go/discoveryengine/apiv1/discove"
          + "ryenginepb;discoveryenginepb\242\002\017DISCOVERY"
          + "ENGINE\252\002\037Google.Cloud.DiscoveryEngine.V1"
          + "\312\002\037Google\\Cloud\\DiscoveryEngine\\V1\352\002\"Goo"
          + "gle::Cloud::DiscoveryEngine::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1.ControlProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1_CreateControlRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_CreateControlRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_CreateControlRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Control", "ControlId",
            });
    internal_static_google_cloud_discoveryengine_v1_UpdateControlRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1_UpdateControlRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_UpdateControlRequest_descriptor,
            new java.lang.String[] {
              "Control", "UpdateMask",
            });
    internal_static_google_cloud_discoveryengine_v1_DeleteControlRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1_DeleteControlRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_DeleteControlRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1_GetControlRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1_GetControlRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_GetControlRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1_ListControlsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1_ListControlsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_ListControlsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_discoveryengine_v1_ListControlsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_discoveryengine_v1_ListControlsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_ListControlsResponse_descriptor,
            new java.lang.String[] {
              "Controls", "NextPageToken",
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
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1.ControlProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
