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
// source: google/cloud/run/v2/traffic_target.proto

package com.google.cloud.run.v2;

public final class TrafficTargetProto {
  private TrafficTargetProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_run_v2_TrafficTarget_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_TrafficTarget_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_run_v2_TrafficTargetStatus_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_run_v2_TrafficTargetStatus_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/run/v2/traffic_target.pro"
          + "to\022\023google.cloud.run.v2\032\031google/api/reso"
          + "urce.proto\"\241\001\n\rTrafficTarget\022>\n\004type\030\001 \001"
          + "(\01620.google.cloud.run.v2.TrafficTargetAl"
          + "locationType\0222\n\010revision\030\002 \001(\tB \372A\035\n\033run"
          + ".googleapis.com/Revision\022\017\n\007percent\030\003 \001("
          + "\005\022\013\n\003tag\030\004 \001(\t\"\264\001\n\023TrafficTargetStatus\022>"
          + "\n\004type\030\001 \001(\01620.google.cloud.run.v2.Traff"
          + "icTargetAllocationType\0222\n\010revision\030\002 \001(\t"
          + "B \372A\035\n\033run.googleapis.com/Revision\022\017\n\007pe"
          + "rcent\030\003 \001(\005\022\013\n\003tag\030\004 \001(\t\022\013\n\003uri\030\005 \001(\t*\245\001"
          + "\n\033TrafficTargetAllocationType\022.\n*TRAFFIC"
          + "_TARGET_ALLOCATION_TYPE_UNSPECIFIED\020\000\022)\n"
          + "%TRAFFIC_TARGET_ALLOCATION_TYPE_LATEST\020\001"
          + "\022+\n\'TRAFFIC_TARGET_ALLOCATION_TYPE_REVIS"
          + "ION\020\002BZ\n\027com.google.cloud.run.v2B\022Traffi"
          + "cTargetProtoP\001Z)cloud.google.com/go/run/"
          + "apiv2/runpb;runpbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_run_v2_TrafficTarget_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_run_v2_TrafficTarget_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_run_v2_TrafficTarget_descriptor,
            new java.lang.String[] {
              "Type", "Revision", "Percent", "Tag",
            });
    internal_static_google_cloud_run_v2_TrafficTargetStatus_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_run_v2_TrafficTargetStatus_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_run_v2_TrafficTargetStatus_descriptor,
            new java.lang.String[] {
              "Type", "Revision", "Percent", "Tag", "Uri",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
