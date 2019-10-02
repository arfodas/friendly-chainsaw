/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/translate/v3/translation_service.proto

package com.google.cloud.translate.v3;

public interface DetectLanguageResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3.DetectLanguageResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of detected languages sorted by detection confidence in descending
   * order. The most probable language first.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.DetectedLanguage languages = 1;</code>
   */
  java.util.List<com.google.cloud.translate.v3.DetectedLanguage> getLanguagesList();
  /**
   *
   *
   * <pre>
   * A list of detected languages sorted by detection confidence in descending
   * order. The most probable language first.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.DetectedLanguage languages = 1;</code>
   */
  com.google.cloud.translate.v3.DetectedLanguage getLanguages(int index);
  /**
   *
   *
   * <pre>
   * A list of detected languages sorted by detection confidence in descending
   * order. The most probable language first.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.DetectedLanguage languages = 1;</code>
   */
  int getLanguagesCount();
  /**
   *
   *
   * <pre>
   * A list of detected languages sorted by detection confidence in descending
   * order. The most probable language first.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.DetectedLanguage languages = 1;</code>
   */
  java.util.List<? extends com.google.cloud.translate.v3.DetectedLanguageOrBuilder>
      getLanguagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of detected languages sorted by detection confidence in descending
   * order. The most probable language first.
   * </pre>
   *
   * <code>repeated .google.cloud.translation.v3.DetectedLanguage languages = 1;</code>
   */
  com.google.cloud.translate.v3.DetectedLanguageOrBuilder getLanguagesOrBuilder(int index);
}
