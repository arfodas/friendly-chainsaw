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
// source: google/cloud/recommendationengine/v1beta1/recommendationengine_resources.proto

package com.google.cloud.recommendationengine.v1beta1;

public final class RecommendationengineResources {
  private RecommendationengineResources() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nNgoogle/cloud/recommendationengine/v1be"
          + "ta1/recommendationengine_resources.proto"
          + "\022)google.cloud.recommendationengine.v1be"
          + "ta1\032\031google/api/resource.protoB\254\010\n-com.g"
          + "oogle.cloud.recommendationengine.v1beta1"
          + "P\001Zacloud.google.com/go/recommendationen"
          + "gine/apiv1beta1/recommendationenginepb;r"
          + "ecommendationenginepb\242\002\005RECAI\252\002)Google.C"
          + "loud.RecommendationEngine.V1Beta1\312\002)Goog"
          + "le\\Cloud\\RecommendationEngine\\V1beta1\352\002,"
          + "Google::Cloud::RecommendationEngine::V1b"
          + "eta1\352Ai\n+recommendationengine.googleapis"
          + ".com/Catalog\022:projects/{project}/locatio"
          + "ns/{location}/catalogs/{catalog}\352A\222\001\n3re"
          + "commendationengine.googleapis.com/Catalo"
          + "gItemPath\022[projects/{project}/locations/"
          + "{location}/catalogs/{catalog}/catalogIte"
          + "ms/{catalog_item_path}\352A\206\001\n.recommendati"
          + "onengine.googleapis.com/EventStore\022Tproj"
          + "ects/{project}/locations/{location}/cata"
          + "logs/{catalog}/eventStores/{event_store}"
          + "\352A\331\001\n@recommendationengine.googleapis.co"
          + "m/PredictionApiKeyRegistration\022\224\001project"
          + "s/{project}/locations/{location}/catalog"
          + "s/{catalog}/eventStores/{event_store}/pr"
          + "edictionApiKeyRegistrations/{prediction_"
          + "api_key_registration}\352A\234\001\n-recommendatio"
          + "nengine.googleapis.com/Placement\022kprojec"
          + "ts/{project}/locations/{location}/catalo"
          + "gs/{catalog}/eventStores/{event_store}/p"
          + "lacements/{placement}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
