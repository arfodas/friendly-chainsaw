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
// source: google/cloud/resourcesettings/v1/resource_settings.proto

package com.google.cloud.resourcesettings.v1;

public interface SettingMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcesettings.v1.SettingMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The human readable name for this setting.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The human readable name for this setting.
   * </pre>
   *
   * <code>string display_name = 1;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * A detailed description of what this setting does.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * A detailed description of what this setting does.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * A flag indicating that values of this setting cannot be modified (see
   * documentation of the specific setting for updates and reasons).
   * </pre>
   *
   * <code>bool read_only = 3;</code>
   *
   * @return The readOnly.
   */
  boolean getReadOnly();

  /**
   *
   *
   * <pre>
   * The data type for this setting.
   * </pre>
   *
   * <code>.google.cloud.resourcesettings.v1.SettingMetadata.DataType data_type = 4;</code>
   *
   * @return The enum numeric value on the wire for dataType.
   */
  int getDataTypeValue();
  /**
   *
   *
   * <pre>
   * The data type for this setting.
   * </pre>
   *
   * <code>.google.cloud.resourcesettings.v1.SettingMetadata.DataType data_type = 4;</code>
   *
   * @return The dataType.
   */
  com.google.cloud.resourcesettings.v1.SettingMetadata.DataType getDataType();

  /**
   *
   *
   * <pre>
   * The value provided by [Setting.effective_value][google.cloud.resourcesettings.v1.Setting.effective_value] if no setting value is
   * explicitly set.
   *
   * Note: not all settings have a default value.
   * </pre>
   *
   * <code>.google.cloud.resourcesettings.v1.Value default_value = 5;</code>
   *
   * @return Whether the defaultValue field is set.
   */
  boolean hasDefaultValue();
  /**
   *
   *
   * <pre>
   * The value provided by [Setting.effective_value][google.cloud.resourcesettings.v1.Setting.effective_value] if no setting value is
   * explicitly set.
   *
   * Note: not all settings have a default value.
   * </pre>
   *
   * <code>.google.cloud.resourcesettings.v1.Value default_value = 5;</code>
   *
   * @return The defaultValue.
   */
  com.google.cloud.resourcesettings.v1.Value getDefaultValue();
  /**
   *
   *
   * <pre>
   * The value provided by [Setting.effective_value][google.cloud.resourcesettings.v1.Setting.effective_value] if no setting value is
   * explicitly set.
   *
   * Note: not all settings have a default value.
   * </pre>
   *
   * <code>.google.cloud.resourcesettings.v1.Value default_value = 5;</code>
   */
  com.google.cloud.resourcesettings.v1.ValueOrBuilder getDefaultValueOrBuilder();
}
