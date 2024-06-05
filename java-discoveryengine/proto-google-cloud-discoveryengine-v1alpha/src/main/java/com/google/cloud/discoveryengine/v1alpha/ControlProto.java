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
// source: google/cloud/discoveryengine/v1alpha/control.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1alpha;

public final class ControlProto {
  private ControlProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Condition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Condition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Condition_QueryTerm_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Condition_QueryTerm_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Condition_TimeRange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Condition_TimeRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Control_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Control_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Control_BoostAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Control_BoostAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Control_FilterAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Control_FilterAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Control_RedirectAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Control_RedirectAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_Control_SynonymsAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_Control_SynonymsAction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n2google/cloud/discoveryengine/v1alpha/c"
          + "ontrol.proto\022$google.cloud.discoveryengi"
          + "ne.v1alpha\032\037google/api/field_behavior.pr"
          + "oto\032\031google/api/resource.proto\0321google/c"
          + "loud/discoveryengine/v1alpha/common.prot"
          + "o\032\037google/protobuf/timestamp.proto\"\314\002\n\tC"
          + "ondition\022N\n\013query_terms\030\002 \003(\01329.google.c"
          + "loud.discoveryengine.v1alpha.Condition.Q"
          + "ueryTerm\022T\n\021active_time_range\030\003 \003(\01329.go"
          + "ogle.cloud.discoveryengine.v1alpha.Condi"
          + "tion.TimeRange\032.\n\tQueryTerm\022\r\n\005value\030\001 \001"
          + "(\t\022\022\n\nfull_match\030\002 \001(\010\032i\n\tTimeRange\022.\n\ns"
          + "tart_time\030\001 \001(\0132\032.google.protobuf.Timest"
          + "amp\022,\n\010end_time\030\002 \001(\0132\032.google.protobuf."
          + "Timestamp\"\267\n\n\007Control\022Q\n\014boost_action\030\006 "
          + "\001(\01329.google.cloud.discoveryengine.v1alp"
          + "ha.Control.BoostActionH\000\022S\n\rfilter_actio"
          + "n\030\007 \001(\0132:.google.cloud.discoveryengine.v"
          + "1alpha.Control.FilterActionH\000\022W\n\017redirec"
          + "t_action\030\t \001(\0132<.google.cloud.discoverye"
          + "ngine.v1alpha.Control.RedirectActionH\000\022W"
          + "\n\017synonyms_action\030\n \001(\0132<.google.cloud.d"
          + "iscoveryengine.v1alpha.Control.SynonymsA"
          + "ctionH\000\022\021\n\004name\030\001 \001(\tB\003\340A\005\022\031\n\014display_na"
          + "me\030\002 \001(\tB\003\340A\002\022*\n\035associated_serving_conf"
          + "ig_ids\030\003 \003(\tB\003\340A\003\022Q\n\rsolution_type\030\004 \001(\016"
          + "22.google.cloud.discoveryengine.v1alpha."
          + "SolutionTypeB\006\340A\002\340A\005\022F\n\tuse_cases\030\010 \003(\0162"
          + "3.google.cloud.discoveryengine.v1alpha.S"
          + "earchUseCase\022C\n\nconditions\030\005 \003(\0132/.googl"
          + "e.cloud.discoveryengine.v1alpha.Conditio"
          + "n\032|\n\013BoostAction\022\022\n\005boost\030\001 \001(\002B\003\340A\002\022\023\n\006"
          + "filter\030\002 \001(\tB\003\340A\002\022D\n\ndata_store\030\003 \001(\tB0\340"
          + "A\002\372A*\n(discoveryengine.googleapis.com/Da"
          + "taStore\032i\n\014FilterAction\022\023\n\006filter\030\001 \001(\tB"
          + "\003\340A\002\022D\n\ndata_store\030\002 \001(\tB0\340A\002\372A*\n(discov"
          + "eryengine.googleapis.com/DataStore\032+\n\016Re"
          + "directAction\022\031\n\014redirect_uri\030\001 \001(\tB\003\340A\002\032"
          + "\"\n\016SynonymsAction\022\020\n\010synonyms\030\001 \003(\t:\323\002\352A"
          + "\317\002\n&discoveryengine.googleapis.com/Contr"
          + "ol\022Rprojects/{project}/locations/{locati"
          + "on}/dataStores/{data_store}/controls/{co"
          + "ntrol}\022kprojects/{project}/locations/{lo"
          + "cation}/collections/{collection}/dataSto"
          + "res/{data_store}/controls/{control}\022dpro"
          + "jects/{project}/locations/{location}/col"
          + "lections/{collection}/engines/{engine}/c"
          + "ontrols/{control}B\010\n\006actionB\230\002\n(com.goog"
          + "le.cloud.discoveryengine.v1alphaB\014Contro"
          + "lProtoP\001ZRcloud.google.com/go/discoverye"
          + "ngine/apiv1alpha/discoveryenginepb;disco"
          + "veryenginepb\242\002\017DISCOVERYENGINE\252\002$Google."
          + "Cloud.DiscoveryEngine.V1Alpha\312\002$Google\\C"
          + "loud\\DiscoveryEngine\\V1alpha\352\002\'Google::C"
          + "loud::DiscoveryEngine::V1alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.CommonProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Condition_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Condition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Condition_descriptor,
            new java.lang.String[] {
              "QueryTerms", "ActiveTimeRange",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Condition_QueryTerm_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Condition_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Condition_QueryTerm_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Condition_QueryTerm_descriptor,
            new java.lang.String[] {
              "Value", "FullMatch",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Condition_TimeRange_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Condition_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_Condition_TimeRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Condition_TimeRange_descriptor,
            new java.lang.String[] {
              "StartTime", "EndTime",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Control_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_Control_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Control_descriptor,
            new java.lang.String[] {
              "BoostAction",
              "FilterAction",
              "RedirectAction",
              "SynonymsAction",
              "Name",
              "DisplayName",
              "AssociatedServingConfigIds",
              "SolutionType",
              "UseCases",
              "Conditions",
              "Action",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Control_BoostAction_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Control_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_Control_BoostAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Control_BoostAction_descriptor,
            new java.lang.String[] {
              "Boost", "Filter", "DataStore",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Control_FilterAction_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Control_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_Control_FilterAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Control_FilterAction_descriptor,
            new java.lang.String[] {
              "Filter", "DataStore",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Control_RedirectAction_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Control_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_discoveryengine_v1alpha_Control_RedirectAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Control_RedirectAction_descriptor,
            new java.lang.String[] {
              "RedirectUri",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_Control_SynonymsAction_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_Control_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_discoveryengine_v1alpha_Control_SynonymsAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_Control_SynonymsAction_descriptor,
            new java.lang.String[] {
              "Synonyms",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1alpha.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
