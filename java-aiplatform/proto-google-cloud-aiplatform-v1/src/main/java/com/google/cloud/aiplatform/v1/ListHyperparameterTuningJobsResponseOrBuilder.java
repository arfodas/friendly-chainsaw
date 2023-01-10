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
// source: google/cloud/aiplatform/v1/job_service.proto

package com.google.cloud.aiplatform.v1;

public interface ListHyperparameterTuningJobsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ListHyperparameterTuningJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of HyperparameterTuningJobs in the requested page.
   * [HyperparameterTuningJob.trials][google.cloud.aiplatform.v1.HyperparameterTuningJob.trials]
   * of the jobs will be not be returned.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.HyperparameterTuningJob hyperparameter_tuning_jobs = 1;
   * </code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.HyperparameterTuningJob>
      getHyperparameterTuningJobsList();
  /**
   *
   *
   * <pre>
   * List of HyperparameterTuningJobs in the requested page.
   * [HyperparameterTuningJob.trials][google.cloud.aiplatform.v1.HyperparameterTuningJob.trials]
   * of the jobs will be not be returned.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.HyperparameterTuningJob hyperparameter_tuning_jobs = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1.HyperparameterTuningJob getHyperparameterTuningJobs(int index);
  /**
   *
   *
   * <pre>
   * List of HyperparameterTuningJobs in the requested page.
   * [HyperparameterTuningJob.trials][google.cloud.aiplatform.v1.HyperparameterTuningJob.trials]
   * of the jobs will be not be returned.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.HyperparameterTuningJob hyperparameter_tuning_jobs = 1;
   * </code>
   */
  int getHyperparameterTuningJobsCount();
  /**
   *
   *
   * <pre>
   * List of HyperparameterTuningJobs in the requested page.
   * [HyperparameterTuningJob.trials][google.cloud.aiplatform.v1.HyperparameterTuningJob.trials]
   * of the jobs will be not be returned.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.HyperparameterTuningJob hyperparameter_tuning_jobs = 1;
   * </code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.HyperparameterTuningJobOrBuilder>
      getHyperparameterTuningJobsOrBuilderList();
  /**
   *
   *
   * <pre>
   * List of HyperparameterTuningJobs in the requested page.
   * [HyperparameterTuningJob.trials][google.cloud.aiplatform.v1.HyperparameterTuningJob.trials]
   * of the jobs will be not be returned.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.aiplatform.v1.HyperparameterTuningJob hyperparameter_tuning_jobs = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1.HyperparameterTuningJobOrBuilder
      getHyperparameterTuningJobsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to
   * [ListHyperparameterTuningJobsRequest.page_token][google.cloud.aiplatform.v1.ListHyperparameterTuningJobsRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results.
   * Pass to
   * [ListHyperparameterTuningJobsRequest.page_token][google.cloud.aiplatform.v1.ListHyperparameterTuningJobsRequest.page_token]
   * to obtain that page.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
