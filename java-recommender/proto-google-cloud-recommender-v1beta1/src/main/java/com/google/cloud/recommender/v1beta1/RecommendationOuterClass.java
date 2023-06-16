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
// source: google/cloud/recommender/v1beta1/recommendation.proto

package com.google.cloud.recommender.v1beta1;

public final class RecommendationOuterClass {
  private RecommendationOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1beta1_Recommendation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1beta1_Recommendation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1beta1_Recommendation_InsightReference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1beta1_Recommendation_InsightReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1beta1_RecommendationContent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1beta1_RecommendationContent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1beta1_OperationGroup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1beta1_OperationGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1beta1_Operation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1beta1_Operation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1beta1_Operation_PathFiltersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1beta1_Operation_PathFiltersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1beta1_Operation_PathValueMatchersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1beta1_Operation_PathValueMatchersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1beta1_ValueMatcher_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1beta1_ValueMatcher_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1beta1_CostProjection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1beta1_CostProjection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1beta1_SecurityProjection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1beta1_SecurityProjection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1beta1_SustainabilityProjection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1beta1_SustainabilityProjection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1beta1_Impact_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1beta1_Impact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1beta1_RecommendationStateInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1beta1_RecommendationStateInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1beta1_RecommendationStateInfo_StateMetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1beta1_RecommendationStateInfo_StateMetadataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/recommender/v1beta1/recom"
          + "mendation.proto\022 google.cloud.recommende"
          + "r.v1beta1\032\031google/api/resource.proto\032\036go"
          + "ogle/protobuf/duration.proto\032\034google/pro"
          + "tobuf/struct.proto\032\037google/protobuf/time"
          + "stamp.proto\032\027google/type/money.proto\"\300\t\n"
          + "\016Recommendation\022\014\n\004name\030\001 \001(\t\022\023\n\013descrip"
          + "tion\030\002 \001(\t\022\033\n\023recommender_subtype\030\014 \001(\t\022"
          + "5\n\021last_refresh_time\030\004 \001(\0132\032.google.prot"
          + "obuf.Timestamp\022@\n\016primary_impact\030\005 \001(\0132("
          + ".google.cloud.recommender.v1beta1.Impact"
          + "\022C\n\021additional_impact\030\006 \003(\0132(.google.clo"
          + "ud.recommender.v1beta1.Impact\022K\n\010priorit"
          + "y\030\021 \001(\01629.google.cloud.recommender.v1bet"
          + "a1.Recommendation.Priority\022H\n\007content\030\007 "
          + "\001(\01327.google.cloud.recommender.v1beta1.R"
          + "ecommendationContent\022M\n\nstate_info\030\n \001(\013"
          + "29.google.cloud.recommender.v1beta1.Reco"
          + "mmendationStateInfo\022\014\n\004etag\030\013 \001(\t\022^\n\023ass"
          + "ociated_insights\030\016 \003(\0132A.google.cloud.re"
          + "commender.v1beta1.Recommendation.Insight"
          + "Reference\022\024\n\014xor_group_id\030\022 \001(\t\032#\n\020Insig"
          + "htReference\022\017\n\007insight\030\001 \001(\t\"D\n\010Priority"
          + "\022\030\n\024PRIORITY_UNSPECIFIED\020\000\022\006\n\002P4\020\001\022\006\n\002P3"
          + "\020\002\022\006\n\002P2\020\003\022\006\n\002P1\020\004:\332\003\352A\326\003\n)recommender.g"
          + "oogleapis.com/Recommendation\022cprojects/{"
          + "project}/locations/{location}/recommende"
          + "rs/{recommender}/recommendations/{recomm"
          + "endation}\022rbillingAccounts/{billing_acco"
          + "unt}/locations/{location}/recommenders/{"
          + "recommender}/recommendations/{recommenda"
          + "tion}\022afolders/{folder}/locations/{locat"
          + "ion}/recommenders/{recommender}/recommen"
          + "dations/{recommendation}\022morganizations/"
          + "{organization}/locations/{location}/reco"
          + "mmenders/{recommender}/recommendations/{"
          + "recommendation}\"\216\001\n\025RecommendationConten"
          + "t\022J\n\020operation_groups\030\002 \003(\01320.google.clo"
          + "ud.recommender.v1beta1.OperationGroup\022)\n"
          + "\010overview\030\003 \001(\0132\027.google.protobuf.Struct"
          + "\"Q\n\016OperationGroup\022?\n\noperations\030\001 \003(\0132+"
          + ".google.cloud.recommender.v1beta1.Operat"
          + "ion\"\353\004\n\tOperation\022\016\n\006action\030\001 \001(\t\022\025\n\rres"
          + "ource_type\030\002 \001(\t\022\020\n\010resource\030\003 \001(\t\022\014\n\004pa"
          + "th\030\004 \001(\t\022\027\n\017source_resource\030\005 \001(\t\022\023\n\013sou"
          + "rce_path\030\006 \001(\t\022\'\n\005value\030\007 \001(\0132\026.google.p"
          + "rotobuf.ValueH\000\022G\n\rvalue_matcher\030\n \001(\0132."
          + ".google.cloud.recommender.v1beta1.ValueM"
          + "atcherH\000\022R\n\014path_filters\030\010 \003(\0132<.google."
          + "cloud.recommender.v1beta1.Operation.Path"
          + "FiltersEntry\022_\n\023path_value_matchers\030\013 \003("
          + "\0132B.google.cloud.recommender.v1beta1.Ope"
          + "ration.PathValueMatchersEntry\032J\n\020PathFil"
          + "tersEntry\022\013\n\003key\030\001 \001(\t\022%\n\005value\030\002 \001(\0132\026."
          + "google.protobuf.Value:\0028\001\032h\n\026PathValueMa"
          + "tchersEntry\022\013\n\003key\030\001 \001(\t\022=\n\005value\030\002 \001(\0132"
          + "..google.cloud.recommender.v1beta1.Value"
          + "Matcher:\0028\001B\014\n\npath_value\":\n\014ValueMatche"
          + "r\022\031\n\017matches_pattern\030\001 \001(\tH\000B\017\n\rmatch_va"
          + "riant\"_\n\016CostProjection\022 \n\004cost\030\001 \001(\0132\022."
          + "google.type.Money\022+\n\010duration\030\002 \001(\0132\031.go"
          + "ogle.protobuf.Duration\">\n\022SecurityProjec"
          + "tion\022(\n\007details\030\002 \001(\0132\027.google.protobuf."
          + "Struct\"Y\n\030SustainabilityProjection\022\020\n\010kg"
          + "_c_o2e\030\001 \001(\001\022+\n\010duration\030\002 \001(\0132\031.google."
          + "protobuf.Duration\"\324\003\n\006Impact\022C\n\010category"
          + "\030\001 \001(\01621.google.cloud.recommender.v1beta"
          + "1.Impact.Category\022K\n\017cost_projection\030d \001"
          + "(\01320.google.cloud.recommender.v1beta1.Co"
          + "stProjectionH\000\022S\n\023security_projection\030e "
          + "\001(\01324.google.cloud.recommender.v1beta1.S"
          + "ecurityProjectionH\000\022_\n\031sustainability_pr"
          + "ojection\030f \001(\0132:.google.cloud.recommende"
          + "r.v1beta1.SustainabilityProjectionH\000\"t\n\010"
          + "Category\022\030\n\024CATEGORY_UNSPECIFIED\020\000\022\010\n\004CO"
          + "ST\020\001\022\014\n\010SECURITY\020\002\022\017\n\013PERFORMANCE\020\003\022\021\n\rM"
          + "ANAGEABILITY\020\004\022\022\n\016SUSTAINABILITY\020\005B\014\n\npr"
          + "ojection\"\350\002\n\027RecommendationStateInfo\022N\n\005"
          + "state\030\001 \001(\0162?.google.cloud.recommender.v"
          + "1beta1.RecommendationStateInfo.State\022d\n\016"
          + "state_metadata\030\002 \003(\0132L.google.cloud.reco"
          + "mmender.v1beta1.RecommendationStateInfo."
          + "StateMetadataEntry\0324\n\022StateMetadataEntry"
          + "\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"a\n\005Stat"
          + "e\022\025\n\021STATE_UNSPECIFIED\020\000\022\n\n\006ACTIVE\020\001\022\013\n\007"
          + "CLAIMED\020\006\022\r\n\tSUCCEEDED\020\003\022\n\n\006FAILED\020\004\022\r\n\t"
          + "DISMISSED\020\005B\355\003\n$com.google.cloud.recomme"
          + "nder.v1beta1P\001ZFcloud.google.com/go/reco"
          + "mmender/apiv1beta1/recommenderpb;recomme"
          + "nderpb\242\002\004CREC\252\002 Google.Cloud.Recommender"
          + ".V1Beta1\352A\317\002\n&recommender.googleapis.com"
          + "/Recommender\022Bprojects/{project}/locatio"
          + "ns/{location}/recommenders/{recommender}"
          + "\022QbillingAccounts/{billing_account}/loca"
          + "tions/{location}/recommenders/{recommend"
          + "er}\022@folders/{folder}/locations/{locatio"
          + "n}/recommenders/{recommender}\022Lorganizat"
          + "ions/{organization}/locations/{location}"
          + "/recommenders/{recommender}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.type.MoneyProto.getDescriptor(),
            });
    internal_static_google_cloud_recommender_v1beta1_Recommendation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_recommender_v1beta1_Recommendation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1beta1_Recommendation_descriptor,
            new java.lang.String[] {
              "Name",
              "Description",
              "RecommenderSubtype",
              "LastRefreshTime",
              "PrimaryImpact",
              "AdditionalImpact",
              "Priority",
              "Content",
              "StateInfo",
              "Etag",
              "AssociatedInsights",
              "XorGroupId",
            });
    internal_static_google_cloud_recommender_v1beta1_Recommendation_InsightReference_descriptor =
        internal_static_google_cloud_recommender_v1beta1_Recommendation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_recommender_v1beta1_Recommendation_InsightReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1beta1_Recommendation_InsightReference_descriptor,
            new java.lang.String[] {
              "Insight",
            });
    internal_static_google_cloud_recommender_v1beta1_RecommendationContent_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_recommender_v1beta1_RecommendationContent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1beta1_RecommendationContent_descriptor,
            new java.lang.String[] {
              "OperationGroups", "Overview",
            });
    internal_static_google_cloud_recommender_v1beta1_OperationGroup_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_recommender_v1beta1_OperationGroup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1beta1_OperationGroup_descriptor,
            new java.lang.String[] {
              "Operations",
            });
    internal_static_google_cloud_recommender_v1beta1_Operation_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_recommender_v1beta1_Operation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1beta1_Operation_descriptor,
            new java.lang.String[] {
              "Action",
              "ResourceType",
              "Resource",
              "Path",
              "SourceResource",
              "SourcePath",
              "Value",
              "ValueMatcher",
              "PathFilters",
              "PathValueMatchers",
              "PathValue",
            });
    internal_static_google_cloud_recommender_v1beta1_Operation_PathFiltersEntry_descriptor =
        internal_static_google_cloud_recommender_v1beta1_Operation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_recommender_v1beta1_Operation_PathFiltersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1beta1_Operation_PathFiltersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_recommender_v1beta1_Operation_PathValueMatchersEntry_descriptor =
        internal_static_google_cloud_recommender_v1beta1_Operation_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_recommender_v1beta1_Operation_PathValueMatchersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1beta1_Operation_PathValueMatchersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_recommender_v1beta1_ValueMatcher_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_recommender_v1beta1_ValueMatcher_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1beta1_ValueMatcher_descriptor,
            new java.lang.String[] {
              "MatchesPattern", "MatchVariant",
            });
    internal_static_google_cloud_recommender_v1beta1_CostProjection_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_recommender_v1beta1_CostProjection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1beta1_CostProjection_descriptor,
            new java.lang.String[] {
              "Cost", "Duration",
            });
    internal_static_google_cloud_recommender_v1beta1_SecurityProjection_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_recommender_v1beta1_SecurityProjection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1beta1_SecurityProjection_descriptor,
            new java.lang.String[] {
              "Details",
            });
    internal_static_google_cloud_recommender_v1beta1_SustainabilityProjection_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_recommender_v1beta1_SustainabilityProjection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1beta1_SustainabilityProjection_descriptor,
            new java.lang.String[] {
              "KgCO2E", "Duration",
            });
    internal_static_google_cloud_recommender_v1beta1_Impact_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_recommender_v1beta1_Impact_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1beta1_Impact_descriptor,
            new java.lang.String[] {
              "Category",
              "CostProjection",
              "SecurityProjection",
              "SustainabilityProjection",
              "Projection",
            });
    internal_static_google_cloud_recommender_v1beta1_RecommendationStateInfo_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_recommender_v1beta1_RecommendationStateInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1beta1_RecommendationStateInfo_descriptor,
            new java.lang.String[] {
              "State", "StateMetadata",
            });
    internal_static_google_cloud_recommender_v1beta1_RecommendationStateInfo_StateMetadataEntry_descriptor =
        internal_static_google_cloud_recommender_v1beta1_RecommendationStateInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_recommender_v1beta1_RecommendationStateInfo_StateMetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1beta1_RecommendationStateInfo_StateMetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.type.MoneyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
