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
// source: google/analytics/data/v1beta/analytics_data_api.proto

package com.google.analytics.data.v1beta;

public interface QueryAudienceExportResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1beta.QueryAudienceExportResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Configuration data about AudienceExport being queried. Returned to help
   * interpret the audience rows in this response. For example, the dimensions
   * in this AudienceExport correspond to the columns in the AudienceRows.
   * </pre>
   *
   * <code>optional .google.analytics.data.v1beta.AudienceExport audience_export = 1;</code>
   *
   * @return Whether the audienceExport field is set.
   */
  boolean hasAudienceExport();
  /**
   *
   *
   * <pre>
   * Configuration data about AudienceExport being queried. Returned to help
   * interpret the audience rows in this response. For example, the dimensions
   * in this AudienceExport correspond to the columns in the AudienceRows.
   * </pre>
   *
   * <code>optional .google.analytics.data.v1beta.AudienceExport audience_export = 1;</code>
   *
   * @return The audienceExport.
   */
  com.google.analytics.data.v1beta.AudienceExport getAudienceExport();
  /**
   *
   *
   * <pre>
   * Configuration data about AudienceExport being queried. Returned to help
   * interpret the audience rows in this response. For example, the dimensions
   * in this AudienceExport correspond to the columns in the AudienceRows.
   * </pre>
   *
   * <code>optional .google.analytics.data.v1beta.AudienceExport audience_export = 1;</code>
   */
  com.google.analytics.data.v1beta.AudienceExportOrBuilder getAudienceExportOrBuilder();

  /**
   *
   *
   * <pre>
   * Rows for each user in an audience export. The number of rows in this
   * response will be less than or equal to request's page size.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.AudienceRow audience_rows = 2;</code>
   */
  java.util.List<com.google.analytics.data.v1beta.AudienceRow> getAudienceRowsList();
  /**
   *
   *
   * <pre>
   * Rows for each user in an audience export. The number of rows in this
   * response will be less than or equal to request's page size.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.AudienceRow audience_rows = 2;</code>
   */
  com.google.analytics.data.v1beta.AudienceRow getAudienceRows(int index);
  /**
   *
   *
   * <pre>
   * Rows for each user in an audience export. The number of rows in this
   * response will be less than or equal to request's page size.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.AudienceRow audience_rows = 2;</code>
   */
  int getAudienceRowsCount();
  /**
   *
   *
   * <pre>
   * Rows for each user in an audience export. The number of rows in this
   * response will be less than or equal to request's page size.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.AudienceRow audience_rows = 2;</code>
   */
  java.util.List<? extends com.google.analytics.data.v1beta.AudienceRowOrBuilder>
      getAudienceRowsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Rows for each user in an audience export. The number of rows in this
   * response will be less than or equal to request's page size.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1beta.AudienceRow audience_rows = 2;</code>
   */
  com.google.analytics.data.v1beta.AudienceRowOrBuilder getAudienceRowsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The total number of rows in the AudienceExport result. `rowCount` is
   * independent of the number of rows returned in the response, the `limit`
   * request parameter, and the `offset` request parameter. For example if a
   * query returns 175 rows and includes `limit` of 50 in the API request, the
   * response will contain `rowCount` of 175 but only 50 rows.
   *
   * To learn more about this pagination parameter, see
   * [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
   * </pre>
   *
   * <code>optional int32 row_count = 3;</code>
   *
   * @return Whether the rowCount field is set.
   */
  boolean hasRowCount();
  /**
   *
   *
   * <pre>
   * The total number of rows in the AudienceExport result. `rowCount` is
   * independent of the number of rows returned in the response, the `limit`
   * request parameter, and the `offset` request parameter. For example if a
   * query returns 175 rows and includes `limit` of 50 in the API request, the
   * response will contain `rowCount` of 175 but only 50 rows.
   *
   * To learn more about this pagination parameter, see
   * [Pagination](https://developers.google.com/analytics/devguides/reporting/data/v1/basics#pagination).
   * </pre>
   *
   * <code>optional int32 row_count = 3;</code>
   *
   * @return The rowCount.
   */
  int getRowCount();
}
