/*
 * Copyright 2024 Google LLC
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
// source: google/analytics/admin/v1alpha/resources.proto

// Protobuf Java Version: 3.25.2
package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Types of Property resources.
 * </pre>
 *
 * Protobuf enum {@code google.analytics.admin.v1alpha.PropertyType}
 */
public enum PropertyType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unknown or unspecified property type
   * </pre>
   *
   * <code>PROPERTY_TYPE_UNSPECIFIED = 0;</code>
   */
  PROPERTY_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Ordinary GA4 property
   * </pre>
   *
   * <code>PROPERTY_TYPE_ORDINARY = 1;</code>
   */
  PROPERTY_TYPE_ORDINARY(1),
  /**
   *
   *
   * <pre>
   * GA4 subproperty
   * </pre>
   *
   * <code>PROPERTY_TYPE_SUBPROPERTY = 2;</code>
   */
  PROPERTY_TYPE_SUBPROPERTY(2),
  /**
   *
   *
   * <pre>
   * GA4 rollup property
   * </pre>
   *
   * <code>PROPERTY_TYPE_ROLLUP = 3;</code>
   */
  PROPERTY_TYPE_ROLLUP(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unknown or unspecified property type
   * </pre>
   *
   * <code>PROPERTY_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int PROPERTY_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Ordinary GA4 property
   * </pre>
   *
   * <code>PROPERTY_TYPE_ORDINARY = 1;</code>
   */
  public static final int PROPERTY_TYPE_ORDINARY_VALUE = 1;
  /**
   *
   *
   * <pre>
   * GA4 subproperty
   * </pre>
   *
   * <code>PROPERTY_TYPE_SUBPROPERTY = 2;</code>
   */
  public static final int PROPERTY_TYPE_SUBPROPERTY_VALUE = 2;
  /**
   *
   *
   * <pre>
   * GA4 rollup property
   * </pre>
   *
   * <code>PROPERTY_TYPE_ROLLUP = 3;</code>
   */
  public static final int PROPERTY_TYPE_ROLLUP_VALUE = 3;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static PropertyType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PropertyType forNumber(int value) {
    switch (value) {
      case 0:
        return PROPERTY_TYPE_UNSPECIFIED;
      case 1:
        return PROPERTY_TYPE_ORDINARY;
      case 2:
        return PROPERTY_TYPE_SUBPROPERTY;
      case 3:
        return PROPERTY_TYPE_ROLLUP;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PropertyType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<PropertyType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<PropertyType>() {
        public PropertyType findValueByNumber(int number) {
          return PropertyType.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.ResourcesProto.getDescriptor().getEnumTypes().get(9);
  }

  private static final PropertyType[] VALUES = values();

  public static PropertyType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PropertyType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.analytics.admin.v1alpha.PropertyType)
}
