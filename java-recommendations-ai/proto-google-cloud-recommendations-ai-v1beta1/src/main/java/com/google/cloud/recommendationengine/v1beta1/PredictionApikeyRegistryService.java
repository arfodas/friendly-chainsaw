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
// source: google/cloud/recommendationengine/v1beta1/prediction_apikey_registry_service.proto

package com.google.cloud.recommendationengine.v1beta1;

public final class PredictionApikeyRegistryService {
  private PredictionApikeyRegistryService() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_PredictionApiKeyRegistration_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_PredictionApiKeyRegistration_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_CreatePredictionApiKeyRegistrationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_CreatePredictionApiKeyRegistrationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_ListPredictionApiKeyRegistrationsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_ListPredictionApiKeyRegistrationsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_ListPredictionApiKeyRegistrationsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_ListPredictionApiKeyRegistrationsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_recommendationengine_v1beta1_DeletePredictionApiKeyRegistrationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_recommendationengine_v1beta1_DeletePredictionApiKeyRegistrationRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nRgoogle/cloud/recommendationengine/v1be"
          + "ta1/prediction_apikey_registry_service.p"
          + "roto\022)google.cloud.recommendationengine."
          + "v1beta1\032\034google/api/annotations.proto\032\037g"
          + "oogle/api/field_behavior.proto\032\031google/a"
          + "pi/resource.proto\032\033google/protobuf/empty"
          + ".proto\032\027google/api/client.proto\032Ngoogle/"
          + "cloud/recommendationengine/v1beta1/recom"
          + "mendationengine_resources.proto\"/\n\034Predi"
          + "ctionApiKeyRegistration\022\017\n\007api_key\030\001 \001(\t"
          + "\"\354\001\n)CreatePredictionApiKeyRegistrationR"
          + "equest\022G\n\006parent\030\001 \001(\tB7\342A\001\002\372A0\n.recomme"
          + "ndationengine.googleapis.com/EventStore\022"
          + "v\n\037prediction_api_key_registration\030\002 \001(\013"
          + "2G.google.cloud.recommendationengine.v1b"
          + "eta1.PredictionApiKeyRegistrationB\004\342A\001\002\""
          + "\246\001\n(ListPredictionApiKeyRegistrationsReq"
          + "uest\022G\n\006parent\030\001 \001(\tB7\342A\001\002\372A0\n.recommend"
          + "ationengine.googleapis.com/EventStore\022\027\n"
          + "\tpage_size\030\002 \001(\005B\004\342A\001\001\022\030\n\npage_token\030\003 \001"
          + "(\tB\004\342A\001\001\"\267\001\n)ListPredictionApiKeyRegistr"
          + "ationsResponse\022q\n prediction_api_key_reg"
          + "istrations\030\001 \003(\0132G.google.cloud.recommen"
          + "dationengine.v1beta1.PredictionApiKeyReg"
          + "istration\022\027\n\017next_page_token\030\002 \001(\t\"\204\001\n)D"
          + "eletePredictionApiKeyRegistrationRequest"
          + "\022W\n\004name\030\001 \001(\tBI\342A\001\002\372AB\n@recommendatione"
          + "ngine.googleapis.com/PredictionApiKeyReg"
          + "istration2\227\010\n\030PredictionApiKeyRegistry\022\331"
          + "\002\n\"CreatePredictionApiKeyRegistration\022T."
          + "google.cloud.recommendationengine.v1beta"
          + "1.CreatePredictionApiKeyRegistrationRequ"
          + "est\032G.google.cloud.recommendationengine."
          + "v1beta1.PredictionApiKeyRegistration\"\223\001\332"
          + "A&parent,prediction_api_key_registration"
          + "\202\323\344\223\002d\"_/v1beta1/{parent=projects/*/loca"
          + "tions/*/catalogs/*/eventStores/*}/predic"
          + "tionApiKeyRegistrations:\001*\022\300\002\n!ListPredi"
          + "ctionApiKeyRegistrations\022S.google.cloud."
          + "recommendationengine.v1beta1.ListPredict"
          + "ionApiKeyRegistrationsRequest\032T.google.c"
          + "loud.recommendationengine.v1beta1.ListPr"
          + "edictionApiKeyRegistrationsResponse\"p\332A\006"
          + "parent\202\323\344\223\002a\022_/v1beta1/{parent=projects/"
          + "*/locations/*/catalogs/*/eventStores/*}/"
          + "predictionApiKeyRegistrations\022\202\002\n\"Delete"
          + "PredictionApiKeyRegistration\022T.google.cl"
          + "oud.recommendationengine.v1beta1.DeleteP"
          + "redictionApiKeyRegistrationRequest\032\026.goo"
          + "gle.protobuf.Empty\"n\332A\004name\202\323\344\223\002a*_/v1be"
          + "ta1/{name=projects/*/locations/*/catalog"
          + "s/*/eventStores/*/predictionApiKeyRegist"
          + "rations/*}\032W\312A#recommendationengine.goog"
          + "leapis.com\322A.https://www.googleapis.com/"
          + "auth/cloud-platformB\243\002\n-com.google.cloud"
          + ".recommendationengine.v1beta1P\001Zacloud.g"
          + "oogle.com/go/recommendationengine/apiv1b"
          + "eta1/recommendationenginepb;recommendati"
          + "onenginepb\242\002\005RECAI\252\002)Google.Cloud.Recomm"
          + "endationEngine.V1Beta1\312\002)Google\\Cloud\\Re"
          + "commendationEngine\\V1beta1\352\002,Google::Clo"
          + "ud::RecommendationEngine::V1beta1b\006proto"
          + "3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.cloud.recommendationengine.v1beta1.RecommendationengineResources
                  .getDescriptor(),
            });
    internal_static_google_cloud_recommendationengine_v1beta1_PredictionApiKeyRegistration_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_recommendationengine_v1beta1_PredictionApiKeyRegistration_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_PredictionApiKeyRegistration_descriptor,
            new java.lang.String[] {
              "ApiKey",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_CreatePredictionApiKeyRegistrationRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_recommendationengine_v1beta1_CreatePredictionApiKeyRegistrationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_CreatePredictionApiKeyRegistrationRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PredictionApiKeyRegistration",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_ListPredictionApiKeyRegistrationsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_recommendationengine_v1beta1_ListPredictionApiKeyRegistrationsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_ListPredictionApiKeyRegistrationsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_ListPredictionApiKeyRegistrationsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_recommendationengine_v1beta1_ListPredictionApiKeyRegistrationsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_ListPredictionApiKeyRegistrationsResponse_descriptor,
            new java.lang.String[] {
              "PredictionApiKeyRegistrations", "NextPageToken",
            });
    internal_static_google_cloud_recommendationengine_v1beta1_DeletePredictionApiKeyRegistrationRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_recommendationengine_v1beta1_DeletePredictionApiKeyRegistrationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_recommendationengine_v1beta1_DeletePredictionApiKeyRegistrationRequest_descriptor,
            new java.lang.String[] {
              "Name",
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
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.cloud.recommendationengine.v1beta1.RecommendationengineResources.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
