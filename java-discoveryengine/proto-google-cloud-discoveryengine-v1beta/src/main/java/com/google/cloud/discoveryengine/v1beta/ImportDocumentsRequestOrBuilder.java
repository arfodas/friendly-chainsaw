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
// source: google/cloud/discoveryengine/v1beta/import_config.proto

package com.google.cloud.discoveryengine.v1beta;

public interface ImportDocumentsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.ImportDocumentsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Inline source for the input content for documents.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.ImportDocumentsRequest.InlineSource inline_source = 2;
   * </code>
   *
   * @return Whether the inlineSource field is set.
   */
  boolean hasInlineSource();
  /**
   *
   *
   * <pre>
   * The Inline source for the input content for documents.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.ImportDocumentsRequest.InlineSource inline_source = 2;
   * </code>
   *
   * @return The inlineSource.
   */
  com.google.cloud.discoveryengine.v1beta.ImportDocumentsRequest.InlineSource getInlineSource();
  /**
   *
   *
   * <pre>
   * The Inline source for the input content for documents.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.ImportDocumentsRequest.InlineSource inline_source = 2;
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.ImportDocumentsRequest.InlineSourceOrBuilder
      getInlineSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.GcsSource gcs_source = 3;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.GcsSource gcs_source = 3;</code>
   *
   * @return The gcsSource.
   */
  com.google.cloud.discoveryengine.v1beta.GcsSource getGcsSource();
  /**
   *
   *
   * <pre>
   * Google Cloud Storage location for the input content.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.GcsSource gcs_source = 3;</code>
   */
  com.google.cloud.discoveryengine.v1beta.GcsSourceOrBuilder getGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * BigQuery input source.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.BigQuerySource bigquery_source = 4;</code>
   *
   * @return Whether the bigquerySource field is set.
   */
  boolean hasBigquerySource();
  /**
   *
   *
   * <pre>
   * BigQuery input source.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.BigQuerySource bigquery_source = 4;</code>
   *
   * @return The bigquerySource.
   */
  com.google.cloud.discoveryengine.v1beta.BigQuerySource getBigquerySource();
  /**
   *
   *
   * <pre>
   * BigQuery input source.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.BigQuerySource bigquery_source = 4;</code>
   */
  com.google.cloud.discoveryengine.v1beta.BigQuerySourceOrBuilder getBigquerySourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The parent branch resource name, such as
   * `projects/{project}/locations/{location}/dataStores/{data_store}/branches/{branch}`.
   * Requires create/update permission.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent branch resource name, such as
   * `projects/{project}/locations/{location}/dataStores/{data_store}/branches/{branch}`.
   * Requires create/update permission.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * The desired location of errors incurred during the Import.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.ImportErrorConfig error_config = 5;</code>
   *
   * @return Whether the errorConfig field is set.
   */
  boolean hasErrorConfig();
  /**
   *
   *
   * <pre>
   * The desired location of errors incurred during the Import.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.ImportErrorConfig error_config = 5;</code>
   *
   * @return The errorConfig.
   */
  com.google.cloud.discoveryengine.v1beta.ImportErrorConfig getErrorConfig();
  /**
   *
   *
   * <pre>
   * The desired location of errors incurred during the Import.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1beta.ImportErrorConfig error_config = 5;</code>
   */
  com.google.cloud.discoveryengine.v1beta.ImportErrorConfigOrBuilder getErrorConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The mode of reconciliation between existing documents and the documents to
   * be imported. Defaults to
   * [ReconciliationMode.INCREMENTAL][google.cloud.discoveryengine.v1beta.ImportDocumentsRequest.ReconciliationMode.INCREMENTAL].
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.ImportDocumentsRequest.ReconciliationMode reconciliation_mode = 6;
   * </code>
   *
   * @return The enum numeric value on the wire for reconciliationMode.
   */
  int getReconciliationModeValue();
  /**
   *
   *
   * <pre>
   * The mode of reconciliation between existing documents and the documents to
   * be imported. Defaults to
   * [ReconciliationMode.INCREMENTAL][google.cloud.discoveryengine.v1beta.ImportDocumentsRequest.ReconciliationMode.INCREMENTAL].
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1beta.ImportDocumentsRequest.ReconciliationMode reconciliation_mode = 6;
   * </code>
   *
   * @return The reconciliationMode.
   */
  com.google.cloud.discoveryengine.v1beta.ImportDocumentsRequest.ReconciliationMode
      getReconciliationMode();

  public com.google.cloud.discoveryengine.v1beta.ImportDocumentsRequest.SourceCase getSourceCase();
}
