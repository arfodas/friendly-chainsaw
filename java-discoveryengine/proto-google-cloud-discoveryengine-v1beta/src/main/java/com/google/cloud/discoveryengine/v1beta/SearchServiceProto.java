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
// source: google/cloud/discoveryengine/v1beta/search_service.proto

package com.google.cloud.discoveryengine.v1beta;

public final class SearchServiceProto {
  private SearchServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_FacetSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_FacetSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_FacetSpec_FacetKey_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_FacetSpec_FacetKey_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_BoostSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_BoostSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_BoostSpec_ConditionBoostSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_BoostSpec_ConditionBoostSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_QueryExpansionSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_QueryExpansionSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_SpellCorrectionSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_SpellCorrectionSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_ContentSearchSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_ContentSearchSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_ContentSearchSpec_SnippetSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_ContentSearchSpec_SnippetSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_ContentSearchSpec_SummarySpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_ContentSearchSpec_SummarySpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_ParamsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_ParamsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_SearchResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_SearchResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_Facet_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_Facet_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_Facet_FacetValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_Facet_FacetValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_GuidedSearchResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_GuidedSearchResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_GuidedSearchResult_RefinementAttribute_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_GuidedSearchResult_RefinementAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_Summary_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_Summary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/discoveryengine/v1beta/se"
          + "arch_service.proto\022#google.cloud.discove"
          + "ryengine.v1beta\032\034google/api/annotations."
          + "proto\032\027google/api/client.proto\032\037google/a"
          + "pi/field_behavior.proto\032\031google/api/reso"
          + "urce.proto\0320google/cloud/discoveryengine"
          + "/v1beta/common.proto\0322google/cloud/disco"
          + "veryengine/v1beta/document.proto\032\034google"
          + "/protobuf/struct.proto\"\201\021\n\rSearchRequest"
          + "\022L\n\016serving_config\030\001 \001(\tB4\340A\002\372A.\n,discov"
          + "eryengine.googleapis.com/ServingConfig\022:"
          + "\n\006branch\030\002 \001(\tB*\372A\'\n%discoveryengine.goo"
          + "gleapis.com/Branch\022\r\n\005query\030\003 \001(\t\022\021\n\tpag"
          + "e_size\030\004 \001(\005\022\022\n\npage_token\030\005 \001(\t\022\016\n\006offs"
          + "et\030\006 \001(\005\022\016\n\006filter\030\007 \001(\t\022\020\n\010order_by\030\010 \001"
          + "(\t\022Q\n\013facet_specs\030\t \003(\0132<.google.cloud.d"
          + "iscoveryengine.v1beta.SearchRequest.Face"
          + "tSpec\022P\n\nboost_spec\030\n \001(\0132<.google.cloud"
          + ".discoveryengine.v1beta.SearchRequest.Bo"
          + "ostSpec\022N\n\006params\030\013 \003(\0132>.google.cloud.d"
          + "iscoveryengine.v1beta.SearchRequest.Para"
          + "msEntry\022c\n\024query_expansion_spec\030\r \001(\0132E."
          + "google.cloud.discoveryengine.v1beta.Sear"
          + "chRequest.QueryExpansionSpec\022e\n\025spell_co"
          + "rrection_spec\030\016 \001(\0132F.google.cloud.disco"
          + "veryengine.v1beta.SearchRequest.SpellCor"
          + "rectionSpec\022\026\n\016user_pseudo_id\030\017 \001(\t\022a\n\023c"
          + "ontent_search_spec\030\030 \001(\0132D.google.cloud."
          + "discoveryengine.v1beta.SearchRequest.Con"
          + "tentSearchSpec\032\204\003\n\tFacetSpec\022]\n\tfacet_ke"
          + "y\030\001 \001(\0132E.google.cloud.discoveryengine.v"
          + "1beta.SearchRequest.FacetSpec.FacetKeyB\003"
          + "\340A\002\022\r\n\005limit\030\002 \001(\005\022\034\n\024excluded_filter_ke"
          + "ys\030\003 \003(\t\022\037\n\027enable_dynamic_position\030\004 \001("
          + "\010\032\311\001\n\010FacetKey\022\020\n\003key\030\001 \001(\tB\003\340A\002\022@\n\tinte"
          + "rvals\030\002 \003(\0132-.google.cloud.discoveryengi"
          + "ne.v1beta.Interval\022\031\n\021restricted_values\030"
          + "\003 \003(\t\022\020\n\010prefixes\030\004 \003(\t\022\020\n\010contains\030\005 \003("
          + "\t\022\030\n\020case_insensitive\030\006 \001(\010\022\020\n\010order_by\030"
          + "\007 \001(\t\032\263\001\n\tBoostSpec\022n\n\025condition_boost_s"
          + "pecs\030\001 \003(\0132O.google.cloud.discoveryengin"
          + "e.v1beta.SearchRequest.BoostSpec.Conditi"
          + "onBoostSpec\0326\n\022ConditionBoostSpec\022\021\n\tcon"
          + "dition\030\001 \001(\t\022\r\n\005boost\030\002 \001(\002\032\270\001\n\022QueryExp"
          + "ansionSpec\022b\n\tcondition\030\001 \001(\0162O.google.c"
          + "loud.discoveryengine.v1beta.SearchReques"
          + "t.QueryExpansionSpec.Condition\">\n\tCondit"
          + "ion\022\031\n\025CONDITION_UNSPECIFIED\020\000\022\014\n\010DISABL"
          + "ED\020\001\022\010\n\004AUTO\020\002\032\255\001\n\023SpellCorrectionSpec\022Y"
          + "\n\004mode\030\001 \001(\0162K.google.cloud.discoveryeng"
          + "ine.v1beta.SearchRequest.SpellCorrection"
          + "Spec.Mode\";\n\004Mode\022\024\n\020MODE_UNSPECIFIED\020\000\022"
          + "\023\n\017SUGGESTION_ONLY\020\001\022\010\n\004AUTO\020\002\032\322\002\n\021Conte"
          + "ntSearchSpec\022f\n\014snippet_spec\030\001 \001(\0132P.goo"
          + "gle.cloud.discoveryengine.v1beta.SearchR"
          + "equest.ContentSearchSpec.SnippetSpec\022f\n\014"
          + "summary_spec\030\002 \001(\0132P.google.cloud.discov"
          + "eryengine.v1beta.SearchRequest.ContentSe"
          + "archSpec.SummarySpec\032@\n\013SnippetSpec\022\031\n\021m"
          + "ax_snippet_count\030\001 \001(\005\022\026\n\016reference_only"
          + "\030\002 \001(\010\032+\n\013SummarySpec\022\034\n\024summary_result_"
          + "count\030\001 \001(\005\032E\n\013ParamsEntry\022\013\n\003key\030\001 \001(\t\022"
          + "%\n\005value\030\002 \001(\0132\026.google.protobuf.Value:\002"
          + "8\001\"\270\010\n\016SearchResponse\022Q\n\007results\030\001 \003(\0132@"
          + ".google.cloud.discoveryengine.v1beta.Sea"
          + "rchResponse.SearchResult\022I\n\006facets\030\002 \003(\013"
          + "29.google.cloud.discoveryengine.v1beta.S"
          + "earchResponse.Facet\022d\n\024guided_search_res"
          + "ult\030\010 \001(\0132F.google.cloud.discoveryengine"
          + ".v1beta.SearchResponse.GuidedSearchResul"
          + "t\022\022\n\ntotal_size\030\003 \001(\005\022\031\n\021attribution_tok"
          + "en\030\004 \001(\t\022\027\n\017next_page_token\030\005 \001(\t\022\027\n\017cor"
          + "rected_query\030\007 \001(\t\022L\n\007summary\030\t \001(\0132;.go"
          + "ogle.cloud.discoveryengine.v1beta.Search"
          + "Response.Summary\022\030\n\020applied_controls\030\n \003"
          + "(\t\032[\n\014SearchResult\022\n\n\002id\030\001 \001(\t\022?\n\010docume"
          + "nt\030\002 \001(\0132-.google.cloud.discoveryengine."
          + "v1beta.Document\032\201\002\n\005Facet\022\013\n\003key\030\001 \001(\t\022T"
          + "\n\006values\030\002 \003(\0132D.google.cloud.discoverye"
          + "ngine.v1beta.SearchResponse.Facet.FacetV"
          + "alue\022\025\n\rdynamic_facet\030\003 \001(\010\032~\n\nFacetValu"
          + "e\022\017\n\005value\030\001 \001(\tH\000\022A\n\010interval\030\002 \001(\0132-.g"
          + "oogle.cloud.discoveryengine.v1beta.Inter"
          + "valH\000\022\r\n\005count\030\003 \001(\003B\r\n\013facet_value\032\326\001\n\022"
          + "GuidedSearchResult\022y\n\025refinement_attribu"
          + "tes\030\001 \003(\0132Z.google.cloud.discoveryengine"
          + ".v1beta.SearchResponse.GuidedSearchResul"
          + "t.RefinementAttribute\032E\n\023RefinementAttri"
          + "bute\022\025\n\rattribute_key\030\001 \001(\t\022\027\n\017attribute"
          + "_value\030\002 \001(\t\032\037\n\007Summary\022\024\n\014summary_text\030"
          + "\001 \001(\t2\243\003\n\rSearchService\022\275\002\n\006Search\0222.goo"
          + "gle.cloud.discoveryengine.v1beta.SearchR"
          + "equest\0323.google.cloud.discoveryengine.v1"
          + "beta.SearchResponse\"\311\001\202\323\344\223\002\302\001\"T/v1beta/{"
          + "serving_config=projects/*/locations/*/da"
          + "taStores/*/servingConfigs/*}:search:\001*Zg"
          + "\"b/v1beta/{serving_config=projects/*/loc"
          + "ations/*/collections/*/dataStores/*/serv"
          + "ingConfigs/*}:search:\001*\032R\312A\036discoveryeng"
          + "ine.googleapis.com\322A.https://www.googlea"
          + "pis.com/auth/cloud-platformB\231\002\n\'com.goog"
          + "le.cloud.discoveryengine.v1betaB\022SearchS"
          + "erviceProtoP\001ZQcloud.google.com/go/disco"
          + "veryengine/apiv1beta/discoveryenginepb;d"
          + "iscoveryenginepb\242\002\017DISCOVERYENGINE\252\002#Goo"
          + "gle.Cloud.DiscoveryEngine.V1Beta\312\002#Googl"
          + "e\\Cloud\\DiscoveryEngine\\V1beta\352\002&Google:"
          + ":Cloud::DiscoveryEngine::V1betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.CommonProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.DocumentProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_descriptor,
            new java.lang.String[] {
              "ServingConfig",
              "Branch",
              "Query",
              "PageSize",
              "PageToken",
              "Offset",
              "Filter",
              "OrderBy",
              "FacetSpecs",
              "BoostSpec",
              "Params",
              "QueryExpansionSpec",
              "SpellCorrectionSpec",
              "UserPseudoId",
              "ContentSearchSpec",
            });
    internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_FacetSpec_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_FacetSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_FacetSpec_descriptor,
            new java.lang.String[] {
              "FacetKey", "Limit", "ExcludedFilterKeys", "EnableDynamicPosition",
            });
    internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_FacetSpec_FacetKey_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_FacetSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_FacetSpec_FacetKey_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_FacetSpec_FacetKey_descriptor,
            new java.lang.String[] {
              "Key",
              "Intervals",
              "RestrictedValues",
              "Prefixes",
              "Contains",
              "CaseInsensitive",
              "OrderBy",
            });
    internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_BoostSpec_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_BoostSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_BoostSpec_descriptor,
            new java.lang.String[] {
              "ConditionBoostSpecs",
            });
    internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_BoostSpec_ConditionBoostSpec_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_BoostSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_BoostSpec_ConditionBoostSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_BoostSpec_ConditionBoostSpec_descriptor,
            new java.lang.String[] {
              "Condition", "Boost",
            });
    internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_QueryExpansionSpec_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_QueryExpansionSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_QueryExpansionSpec_descriptor,
            new java.lang.String[] {
              "Condition",
            });
    internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_SpellCorrectionSpec_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_SpellCorrectionSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_SpellCorrectionSpec_descriptor,
            new java.lang.String[] {
              "Mode",
            });
    internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_ContentSearchSpec_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_ContentSearchSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_ContentSearchSpec_descriptor,
            new java.lang.String[] {
              "SnippetSpec", "SummarySpec",
            });
    internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_ContentSearchSpec_SnippetSpec_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_ContentSearchSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_ContentSearchSpec_SnippetSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_ContentSearchSpec_SnippetSpec_descriptor,
            new java.lang.String[] {
              "MaxSnippetCount", "ReferenceOnly",
            });
    internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_ContentSearchSpec_SummarySpec_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_ContentSearchSpec_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_ContentSearchSpec_SummarySpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_ContentSearchSpec_SummarySpec_descriptor,
            new java.lang.String[] {
              "SummaryResultCount",
            });
    internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_ParamsEntry_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_descriptor
            .getNestedTypes()
            .get(5);
    internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_ParamsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_SearchRequest_ParamsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_descriptor,
            new java.lang.String[] {
              "Results",
              "Facets",
              "GuidedSearchResult",
              "TotalSize",
              "AttributionToken",
              "NextPageToken",
              "CorrectedQuery",
              "Summary",
              "AppliedControls",
            });
    internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_SearchResult_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_SearchResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_SearchResult_descriptor,
            new java.lang.String[] {
              "Id", "Document",
            });
    internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_Facet_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_Facet_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_Facet_descriptor,
            new java.lang.String[] {
              "Key", "Values", "DynamicFacet",
            });
    internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_Facet_FacetValue_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_Facet_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_Facet_FacetValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_Facet_FacetValue_descriptor,
            new java.lang.String[] {
              "Value", "Interval", "Count", "FacetValue",
            });
    internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_GuidedSearchResult_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_GuidedSearchResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_GuidedSearchResult_descriptor,
            new java.lang.String[] {
              "RefinementAttributes",
            });
    internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_GuidedSearchResult_RefinementAttribute_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_GuidedSearchResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_GuidedSearchResult_RefinementAttribute_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_GuidedSearchResult_RefinementAttribute_descriptor,
            new java.lang.String[] {
              "AttributeKey", "AttributeValue",
            });
    internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_Summary_descriptor =
        internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_Summary_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_SearchResponse_Summary_descriptor,
            new java.lang.String[] {
              "SummaryText",
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
    com.google.cloud.discoveryengine.v1beta.CommonProto.getDescriptor();
    com.google.cloud.discoveryengine.v1beta.DocumentProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
