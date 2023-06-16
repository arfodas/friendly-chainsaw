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
// source: google/cloud/retail/v2/import_config.proto

package com.google.cloud.retail.v2;

public final class ImportConfigProto {
  private ImportConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_GcsSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_GcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_BigQuerySource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_BigQuerySource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ProductInlineSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ProductInlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_UserEventInlineSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_UserEventInlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ImportErrorsConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ImportErrorsConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ImportProductsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ImportProductsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ImportUserEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ImportUserEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ImportCompletionDataRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ImportCompletionDataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ProductInputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ProductInputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_UserEventInputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_UserEventInputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_CompletionDataInputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_CompletionDataInputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ImportMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ImportMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ImportProductsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ImportProductsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ImportUserEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ImportUserEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_UserEventImportSummary_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_UserEventImportSummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ImportCompletionDataResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ImportCompletionDataResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n*google/cloud/retail/v2/import_config.p"
          + "roto\022\026google.cloud.retail.v2\032\037google/api"
          + "/field_behavior.proto\032\031google/api/resour"
          + "ce.proto\032$google/cloud/retail/v2/product"
          + ".proto\032\'google/cloud/retail/v2/user_even"
          + "t.proto\032 google/protobuf/field_mask.prot"
          + "o\032\037google/protobuf/timestamp.proto\032\027goog"
          + "le/rpc/status.proto\032\026google/type/date.pr"
          + "oto\":\n\tGcsSource\022\030\n\ninput_uris\030\001 \003(\tB\004\342A"
          + "\001\002\022\023\n\013data_schema\030\002 \001(\t\"\276\001\n\016BigQuerySour"
          + "ce\022+\n\016partition_date\030\006 \001(\0132\021.google.type"
          + ".DateH\000\022\022\n\nproject_id\030\005 \001(\t\022\030\n\ndataset_i"
          + "d\030\001 \001(\tB\004\342A\001\002\022\026\n\010table_id\030\002 \001(\tB\004\342A\001\002\022\027\n"
          + "\017gcs_staging_dir\030\003 \001(\t\022\023\n\013data_schema\030\004 "
          + "\001(\tB\013\n\tpartition\"N\n\023ProductInlineSource\022"
          + "7\n\010products\030\001 \003(\0132\037.google.cloud.retail."
          + "v2.ProductB\004\342A\001\002\"U\n\025UserEventInlineSourc"
          + "e\022<\n\013user_events\030\001 \003(\0132!.google.cloud.re"
          + "tail.v2.UserEventB\004\342A\001\002\"9\n\022ImportErrorsC"
          + "onfig\022\024\n\ngcs_prefix\030\001 \001(\tH\000B\r\n\013destinati"
          + "on\"\372\003\n\025ImportProductsRequest\0225\n\006parent\030\001"
          + " \001(\tB%\342A\001\002\372A\036\n\034retail.googleapis.com/Bra"
          + "nch\022\026\n\nrequest_id\030\006 \001(\tB\002\030\001\022F\n\014input_con"
          + "fig\030\002 \001(\0132*.google.cloud.retail.v2.Produ"
          + "ctInputConfigB\004\342A\001\002\022A\n\rerrors_config\030\003 \001"
          + "(\0132*.google.cloud.retail.v2.ImportErrors"
          + "Config\022/\n\013update_mask\030\004 \001(\0132\032.google.pro"
          + "tobuf.FieldMask\022]\n\023reconciliation_mode\030\005"
          + " \001(\0162@.google.cloud.retail.v2.ImportProd"
          + "uctsRequest.ReconciliationMode\022!\n\031notifi"
          + "cation_pubsub_topic\030\007 \001(\t\"T\n\022Reconciliat"
          + "ionMode\022#\n\037RECONCILIATION_MODE_UNSPECIFI"
          + "ED\020\000\022\017\n\013INCREMENTAL\020\001\022\010\n\004FULL\020\002\"\336\001\n\027Impo"
          + "rtUserEventsRequest\0226\n\006parent\030\001 \001(\tB&\342A\001"
          + "\002\372A\037\n\035retail.googleapis.com/Catalog\022H\n\014i"
          + "nput_config\030\002 \001(\0132,.google.cloud.retail."
          + "v2.UserEventInputConfigB\004\342A\001\002\022A\n\rerrors_"
          + "config\030\003 \001(\0132*.google.cloud.retail.v2.Im"
          + "portErrorsConfig\"\307\001\n\033ImportCompletionDat"
          + "aRequest\0226\n\006parent\030\001 \001(\tB&\342A\001\002\372A\037\n\035retai"
          + "l.googleapis.com/Catalog\022M\n\014input_config"
          + "\030\002 \001(\01321.google.cloud.retail.v2.Completi"
          + "onDataInputConfigB\004\342A\001\002\022!\n\031notification_"
          + "pubsub_topic\030\003 \001(\t\"\351\001\n\022ProductInputConfi"
          + "g\022L\n\025product_inline_source\030\001 \001(\0132+.googl"
          + "e.cloud.retail.v2.ProductInlineSourceH\000\022"
          + "7\n\ngcs_source\030\002 \001(\0132!.google.cloud.retai"
          + "l.v2.GcsSourceH\000\022B\n\020big_query_source\030\003 \001"
          + "(\0132&.google.cloud.retail.v2.BigQuerySour"
          + "ceH\000B\010\n\006source\"\202\002\n\024UserEventInputConfig\022"
          + "W\n\030user_event_inline_source\030\001 \001(\0132-.goog"
          + "le.cloud.retail.v2.UserEventInlineSource"
          + "B\004\342A\001\002H\000\022=\n\ngcs_source\030\002 \001(\0132!.google.cl"
          + "oud.retail.v2.GcsSourceB\004\342A\001\002H\000\022H\n\020big_q"
          + "uery_source\030\003 \001(\0132&.google.cloud.retail."
          + "v2.BigQuerySourceB\004\342A\001\002H\000B\010\n\006source\"o\n\031C"
          + "ompletionDataInputConfig\022H\n\020big_query_so"
          + "urce\030\001 \001(\0132&.google.cloud.retail.v2.BigQ"
          + "uerySourceB\004\342A\001\002H\000B\010\n\006source\"\333\001\n\016ImportM"
          + "etadata\022/\n\013create_time\030\001 \001(\0132\032.google.pr"
          + "otobuf.Timestamp\022/\n\013update_time\030\002 \001(\0132\032."
          + "google.protobuf.Timestamp\022\025\n\rsuccess_cou"
          + "nt\030\003 \001(\003\022\025\n\rfailure_count\030\004 \001(\003\022\026\n\nreque"
          + "st_id\030\005 \001(\tB\002\030\001\022!\n\031notification_pubsub_t"
          + "opic\030\006 \001(\t\"\206\001\n\026ImportProductsResponse\022)\n"
          + "\rerror_samples\030\001 \003(\0132\022.google.rpc.Status"
          + "\022A\n\rerrors_config\030\002 \001(\0132*.google.cloud.r"
          + "etail.v2.ImportErrorsConfig\"\320\001\n\030ImportUs"
          + "erEventsResponse\022)\n\rerror_samples\030\001 \003(\0132"
          + "\022.google.rpc.Status\022A\n\rerrors_config\030\002 \001"
          + "(\0132*.google.cloud.retail.v2.ImportErrors"
          + "Config\022F\n\016import_summary\030\003 \001(\0132..google."
          + "cloud.retail.v2.UserEventImportSummary\"T"
          + "\n\026UserEventImportSummary\022\033\n\023joined_event"
          + "s_count\030\001 \001(\003\022\035\n\025unjoined_events_count\030\002"
          + " \001(\003\"I\n\034ImportCompletionDataResponse\022)\n\r"
          + "error_samples\030\001 \003(\0132\022.google.rpc.StatusB"
          + "\274\001\n\032com.google.cloud.retail.v2B\021ImportCo"
          + "nfigProtoP\001Z2cloud.google.com/go/retail/"
          + "apiv2/retailpb;retailpb\242\002\006RETAIL\252\002\026Googl"
          + "e.Cloud.Retail.V2\312\002\026Google\\Cloud\\Retail\\"
          + "V2\352\002\031Google::Cloud::Retail::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2.ProductProto.getDescriptor(),
              com.google.cloud.retail.v2.UserEventProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.type.DateProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2_GcsSource_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2_GcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_GcsSource_descriptor,
            new java.lang.String[] {
              "InputUris", "DataSchema",
            });
    internal_static_google_cloud_retail_v2_BigQuerySource_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2_BigQuerySource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_BigQuerySource_descriptor,
            new java.lang.String[] {
              "PartitionDate",
              "ProjectId",
              "DatasetId",
              "TableId",
              "GcsStagingDir",
              "DataSchema",
              "Partition",
            });
    internal_static_google_cloud_retail_v2_ProductInlineSource_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2_ProductInlineSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ProductInlineSource_descriptor,
            new java.lang.String[] {
              "Products",
            });
    internal_static_google_cloud_retail_v2_UserEventInlineSource_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2_UserEventInlineSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_UserEventInlineSource_descriptor,
            new java.lang.String[] {
              "UserEvents",
            });
    internal_static_google_cloud_retail_v2_ImportErrorsConfig_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_retail_v2_ImportErrorsConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ImportErrorsConfig_descriptor,
            new java.lang.String[] {
              "GcsPrefix", "Destination",
            });
    internal_static_google_cloud_retail_v2_ImportProductsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_retail_v2_ImportProductsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ImportProductsRequest_descriptor,
            new java.lang.String[] {
              "Parent",
              "RequestId",
              "InputConfig",
              "ErrorsConfig",
              "UpdateMask",
              "ReconciliationMode",
              "NotificationPubsubTopic",
            });
    internal_static_google_cloud_retail_v2_ImportUserEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_retail_v2_ImportUserEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ImportUserEventsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "InputConfig", "ErrorsConfig",
            });
    internal_static_google_cloud_retail_v2_ImportCompletionDataRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_retail_v2_ImportCompletionDataRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ImportCompletionDataRequest_descriptor,
            new java.lang.String[] {
              "Parent", "InputConfig", "NotificationPubsubTopic",
            });
    internal_static_google_cloud_retail_v2_ProductInputConfig_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_retail_v2_ProductInputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ProductInputConfig_descriptor,
            new java.lang.String[] {
              "ProductInlineSource", "GcsSource", "BigQuerySource", "Source",
            });
    internal_static_google_cloud_retail_v2_UserEventInputConfig_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_retail_v2_UserEventInputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_UserEventInputConfig_descriptor,
            new java.lang.String[] {
              "UserEventInlineSource", "GcsSource", "BigQuerySource", "Source",
            });
    internal_static_google_cloud_retail_v2_CompletionDataInputConfig_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_retail_v2_CompletionDataInputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_CompletionDataInputConfig_descriptor,
            new java.lang.String[] {
              "BigQuerySource", "Source",
            });
    internal_static_google_cloud_retail_v2_ImportMetadata_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_retail_v2_ImportMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ImportMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "UpdateTime",
              "SuccessCount",
              "FailureCount",
              "RequestId",
              "NotificationPubsubTopic",
            });
    internal_static_google_cloud_retail_v2_ImportProductsResponse_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_retail_v2_ImportProductsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ImportProductsResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorsConfig",
            });
    internal_static_google_cloud_retail_v2_ImportUserEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_retail_v2_ImportUserEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ImportUserEventsResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorsConfig", "ImportSummary",
            });
    internal_static_google_cloud_retail_v2_UserEventImportSummary_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_retail_v2_UserEventImportSummary_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_UserEventImportSummary_descriptor,
            new java.lang.String[] {
              "JoinedEventsCount", "UnjoinedEventsCount",
            });
    internal_static_google_cloud_retail_v2_ImportCompletionDataResponse_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_retail_v2_ImportCompletionDataResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ImportCompletionDataResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2.ProductProto.getDescriptor();
    com.google.cloud.retail.v2.UserEventProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
