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
// source: google/cloud/recommender/v1/recommendation.proto

package com.google.cloud.recommender.v1;

public final class RecommendationOuterClass {
  private RecommendationOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_Recommendation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_Recommendation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_Recommendation_InsightReference_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_Recommendation_InsightReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_RecommendationContent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_RecommendationContent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_OperationGroup_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_OperationGroup_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_Operation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_Operation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_Operation_PathFiltersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_Operation_PathFiltersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_Operation_PathValueMatchersEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_Operation_PathValueMatchersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_ValueMatcher_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_ValueMatcher_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_CostProjection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_CostProjection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_SecurityProjection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_SecurityProjection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_SustainabilityProjection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_SustainabilityProjection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_ReliabilityProjection_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_ReliabilityProjection_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_Impact_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_Impact_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_RecommendationStateInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_RecommendationStateInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommender_v1_RecommendationStateInfo_StateMetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommender_v1_RecommendationStateInfo_StateMetadataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/recommender/v1/recommenda"
          + "tion.proto\022\033google.cloud.recommender.v1\032"
          + "\031google/api/resource.proto\032\036google/proto"
          + "buf/duration.proto\032\034google/protobuf/stru"
          + "ct.proto\032\037google/protobuf/timestamp.prot"
          + "o\032\027google/type/money.proto\"\242\t\n\016Recommend"
          + "ation\022\014\n\004name\030\001 \001(\t\022\023\n\013description\030\002 \001(\t"
          + "\022\033\n\023recommender_subtype\030\014 \001(\t\0225\n\021last_re"
          + "fresh_time\030\004 \001(\0132\032.google.protobuf.Times"
          + "tamp\022;\n\016primary_impact\030\005 \001(\0132#.google.cl"
          + "oud.recommender.v1.Impact\022>\n\021additional_"
          + "impact\030\006 \003(\0132#.google.cloud.recommender."
          + "v1.Impact\022F\n\010priority\030\021 \001(\01624.google.clo"
          + "ud.recommender.v1.Recommendation.Priorit"
          + "y\022C\n\007content\030\007 \001(\01322.google.cloud.recomm"
          + "ender.v1.RecommendationContent\022H\n\nstate_"
          + "info\030\n \001(\01324.google.cloud.recommender.v1"
          + ".RecommendationStateInfo\022\014\n\004etag\030\013 \001(\t\022Y"
          + "\n\023associated_insights\030\016 \003(\0132<.google.clo"
          + "ud.recommender.v1.Recommendation.Insight"
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
          + "recommendation}\"\211\001\n\025RecommendationConten"
          + "t\022E\n\020operation_groups\030\002 \003(\0132+.google.clo"
          + "ud.recommender.v1.OperationGroup\022)\n\010over"
          + "view\030\003 \001(\0132\027.google.protobuf.Struct\"L\n\016O"
          + "perationGroup\022:\n\noperations\030\001 \003(\0132&.goog"
          + "le.cloud.recommender.v1.Operation\"\327\004\n\tOp"
          + "eration\022\016\n\006action\030\001 \001(\t\022\025\n\rresource_type"
          + "\030\002 \001(\t\022\020\n\010resource\030\003 \001(\t\022\014\n\004path\030\004 \001(\t\022\027"
          + "\n\017source_resource\030\005 \001(\t\022\023\n\013source_path\030\006"
          + " \001(\t\022\'\n\005value\030\007 \001(\0132\026.google.protobuf.Va"
          + "lueH\000\022B\n\rvalue_matcher\030\n \001(\0132).google.cl"
          + "oud.recommender.v1.ValueMatcherH\000\022M\n\014pat"
          + "h_filters\030\010 \003(\01327.google.cloud.recommend"
          + "er.v1.Operation.PathFiltersEntry\022Z\n\023path"
          + "_value_matchers\030\013 \003(\0132=.google.cloud.rec"
          + "ommender.v1.Operation.PathValueMatchersE"
          + "ntry\032J\n\020PathFiltersEntry\022\013\n\003key\030\001 \001(\t\022%\n"
          + "\005value\030\002 \001(\0132\026.google.protobuf.Value:\0028\001"
          + "\032c\n\026PathValueMatchersEntry\022\013\n\003key\030\001 \001(\t\022"
          + "8\n\005value\030\002 \001(\0132).google.cloud.recommende"
          + "r.v1.ValueMatcher:\0028\001B\014\n\npath_value\":\n\014V"
          + "alueMatcher\022\031\n\017matches_pattern\030\001 \001(\tH\000B\017"
          + "\n\rmatch_variant\"\223\001\n\016CostProjection\022 \n\004co"
          + "st\030\001 \001(\0132\022.google.type.Money\022+\n\010duration"
          + "\030\002 \001(\0132\031.google.protobuf.Duration\0222\n\026cos"
          + "t_in_local_currency\030\003 \001(\0132\022.google.type."
          + "Money\">\n\022SecurityProjection\022(\n\007details\030\002"
          + " \001(\0132\027.google.protobuf.Struct\"Y\n\030Sustain"
          + "abilityProjection\022\020\n\010kg_c_o2e\030\001 \001(\001\022+\n\010d"
          + "uration\030\002 \001(\0132\031.google.protobuf.Duration"
          + "\"\354\001\n\025ReliabilityProjection\022J\n\005risks\030\001 \003("
          + "\0162;.google.cloud.recommender.v1.Reliabil"
          + "ityProjection.RiskType\022(\n\007details\030\002 \001(\0132"
          + "\027.google.protobuf.Struct\"]\n\010RiskType\022\031\n\025"
          + "RISK_TYPE_UNSPECIFIED\020\000\022\026\n\022SERVICE_DISRU"
          + "PTION\020\001\022\r\n\tDATA_LOSS\020\002\022\017\n\013ACCESS_DENY\020\003\""
          + "\250\004\n\006Impact\022>\n\010category\030\001 \001(\0162,.google.cl"
          + "oud.recommender.v1.Impact.Category\022F\n\017co"
          + "st_projection\030d \001(\0132+.google.cloud.recom"
          + "mender.v1.CostProjectionH\000\022N\n\023security_p"
          + "rojection\030e \001(\0132/.google.cloud.recommend"
          + "er.v1.SecurityProjectionH\000\022Z\n\031sustainabi"
          + "lity_projection\030f \001(\01325.google.cloud.rec"
          + "ommender.v1.SustainabilityProjectionH\000\022T"
          + "\n\026reliability_projection\030g \001(\01322.google."
          + "cloud.recommender.v1.ReliabilityProjecti"
          + "onH\000\"\205\001\n\010Category\022\030\n\024CATEGORY_UNSPECIFIE"
          + "D\020\000\022\010\n\004COST\020\001\022\014\n\010SECURITY\020\002\022\017\n\013PERFORMAN"
          + "CE\020\003\022\021\n\rMANAGEABILITY\020\004\022\022\n\016SUSTAINABILIT"
          + "Y\020\005\022\017\n\013RELIABILITY\020\006B\014\n\nprojection\"\336\002\n\027R"
          + "ecommendationStateInfo\022I\n\005state\030\001 \001(\0162:."
          + "google.cloud.recommender.v1.Recommendati"
          + "onStateInfo.State\022_\n\016state_metadata\030\002 \003("
          + "\0132G.google.cloud.recommender.v1.Recommen"
          + "dationStateInfo.StateMetadataEntry\0324\n\022St"
          + "ateMetadataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002"
          + " \001(\t:\0028\001\"a\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000"
          + "\022\n\n\006ACTIVE\020\001\022\013\n\007CLAIMED\020\006\022\r\n\tSUCCEEDED\020\003"
          + "\022\n\n\006FAILED\020\004\022\r\n\tDISMISSED\020\005B\336\003\n\037com.goog"
          + "le.cloud.recommender.v1P\001ZAcloud.google."
          + "com/go/recommender/apiv1/recommenderpb;r"
          + "ecommenderpb\242\002\004CREC\252\002\033Google.Cloud.Recom"
          + "mender.V1\352A\317\002\n&recommender.googleapis.co"
          + "m/Recommender\022Bprojects/{project}/locati"
          + "ons/{location}/recommenders/{recommender"
          + "}\022QbillingAccounts/{billing_account}/loc"
          + "ations/{location}/recommenders/{recommen"
          + "der}\022@folders/{folder}/locations/{locati"
          + "on}/recommenders/{recommender}\022Lorganiza"
          + "tions/{organization}/locations/{location"
          + "}/recommenders/{recommender}b\006proto3"
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
    internal_static_google_cloud_recommender_v1_Recommendation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_recommender_v1_Recommendation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_Recommendation_descriptor,
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
    internal_static_google_cloud_recommender_v1_Recommendation_InsightReference_descriptor =
        internal_static_google_cloud_recommender_v1_Recommendation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_recommender_v1_Recommendation_InsightReference_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_Recommendation_InsightReference_descriptor,
            new java.lang.String[] {
              "Insight",
            });
    internal_static_google_cloud_recommender_v1_RecommendationContent_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_recommender_v1_RecommendationContent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_RecommendationContent_descriptor,
            new java.lang.String[] {
              "OperationGroups", "Overview",
            });
    internal_static_google_cloud_recommender_v1_OperationGroup_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_recommender_v1_OperationGroup_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_OperationGroup_descriptor,
            new java.lang.String[] {
              "Operations",
            });
    internal_static_google_cloud_recommender_v1_Operation_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_recommender_v1_Operation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_Operation_descriptor,
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
    internal_static_google_cloud_recommender_v1_Operation_PathFiltersEntry_descriptor =
        internal_static_google_cloud_recommender_v1_Operation_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_recommender_v1_Operation_PathFiltersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_Operation_PathFiltersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_recommender_v1_Operation_PathValueMatchersEntry_descriptor =
        internal_static_google_cloud_recommender_v1_Operation_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_recommender_v1_Operation_PathValueMatchersEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_Operation_PathValueMatchersEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_recommender_v1_ValueMatcher_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_recommender_v1_ValueMatcher_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_ValueMatcher_descriptor,
            new java.lang.String[] {
              "MatchesPattern", "MatchVariant",
            });
    internal_static_google_cloud_recommender_v1_CostProjection_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_recommender_v1_CostProjection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_CostProjection_descriptor,
            new java.lang.String[] {
              "Cost", "Duration", "CostInLocalCurrency",
            });
    internal_static_google_cloud_recommender_v1_SecurityProjection_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_recommender_v1_SecurityProjection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_SecurityProjection_descriptor,
            new java.lang.String[] {
              "Details",
            });
    internal_static_google_cloud_recommender_v1_SustainabilityProjection_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_recommender_v1_SustainabilityProjection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_SustainabilityProjection_descriptor,
            new java.lang.String[] {
              "KgCO2E", "Duration",
            });
    internal_static_google_cloud_recommender_v1_ReliabilityProjection_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_recommender_v1_ReliabilityProjection_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_ReliabilityProjection_descriptor,
            new java.lang.String[] {
              "Risks", "Details",
            });
    internal_static_google_cloud_recommender_v1_Impact_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_recommender_v1_Impact_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_Impact_descriptor,
            new java.lang.String[] {
              "Category",
              "CostProjection",
              "SecurityProjection",
              "SustainabilityProjection",
              "ReliabilityProjection",
              "Projection",
            });
    internal_static_google_cloud_recommender_v1_RecommendationStateInfo_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_recommender_v1_RecommendationStateInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_RecommendationStateInfo_descriptor,
            new java.lang.String[] {
              "State", "StateMetadata",
            });
    internal_static_google_cloud_recommender_v1_RecommendationStateInfo_StateMetadataEntry_descriptor =
        internal_static_google_cloud_recommender_v1_RecommendationStateInfo_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_recommender_v1_RecommendationStateInfo_StateMetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommender_v1_RecommendationStateInfo_StateMetadataEntry_descriptor,
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
