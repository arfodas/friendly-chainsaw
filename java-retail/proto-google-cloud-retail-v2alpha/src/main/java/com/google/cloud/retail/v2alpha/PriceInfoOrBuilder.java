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
// source: google/cloud/retail/v2alpha/common.proto

package com.google.cloud.retail.v2alpha;

public interface PriceInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.PriceInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The 3-letter currency code defined in [ISO
   * 4217](https://www.iso.org/iso-4217-currency-codes.html).
   *
   * If this field is an unrecognizable currency code, an INVALID_ARGUMENT
   * error is returned.
   *
   * The
   * [Product.Type.VARIANT][google.cloud.retail.v2alpha.Product.Type.VARIANT]
   * [Product][google.cloud.retail.v2alpha.Product]s with the same
   * [Product.primary_product_id][google.cloud.retail.v2alpha.Product.primary_product_id]
   * must share the same
   * [currency_code][google.cloud.retail.v2alpha.PriceInfo.currency_code].
   * Otherwise, a FAILED_PRECONDITION error is returned.
   * </pre>
   *
   * <code>string currency_code = 1;</code>
   *
   * @return The currencyCode.
   */
  java.lang.String getCurrencyCode();
  /**
   *
   *
   * <pre>
   * The 3-letter currency code defined in [ISO
   * 4217](https://www.iso.org/iso-4217-currency-codes.html).
   *
   * If this field is an unrecognizable currency code, an INVALID_ARGUMENT
   * error is returned.
   *
   * The
   * [Product.Type.VARIANT][google.cloud.retail.v2alpha.Product.Type.VARIANT]
   * [Product][google.cloud.retail.v2alpha.Product]s with the same
   * [Product.primary_product_id][google.cloud.retail.v2alpha.Product.primary_product_id]
   * must share the same
   * [currency_code][google.cloud.retail.v2alpha.PriceInfo.currency_code].
   * Otherwise, a FAILED_PRECONDITION error is returned.
   * </pre>
   *
   * <code>string currency_code = 1;</code>
   *
   * @return The bytes for currencyCode.
   */
  com.google.protobuf.ByteString getCurrencyCodeBytes();

  /**
   *
   *
   * <pre>
   * Price of the product.
   *
   * Google Merchant Center property
   * [price](https://support.google.com/merchants/answer/6324371). Schema.org
   * property [Offer.price](https://schema.org/price).
   * </pre>
   *
   * <code>float price = 2;</code>
   *
   * @return The price.
   */
  float getPrice();

  /**
   *
   *
   * <pre>
   * Price of the product without any discount. If zero, by default set to be
   * the [price][google.cloud.retail.v2alpha.PriceInfo.price]. If set,
   * [original_price][google.cloud.retail.v2alpha.PriceInfo.original_price]
   * should be greater than or equal to
   * [price][google.cloud.retail.v2alpha.PriceInfo.price], otherwise an
   * INVALID_ARGUMENT error is thrown.
   * </pre>
   *
   * <code>float original_price = 3;</code>
   *
   * @return The originalPrice.
   */
  float getOriginalPrice();

  /**
   *
   *
   * <pre>
   * The costs associated with the sale of a particular product. Used for gross
   * profit reporting.
   *
   * * Profit = [price][google.cloud.retail.v2alpha.PriceInfo.price] -
   * [cost][google.cloud.retail.v2alpha.PriceInfo.cost]
   *
   * Google Merchant Center property
   * [cost_of_goods_sold](https://support.google.com/merchants/answer/9017895).
   * </pre>
   *
   * <code>float cost = 4;</code>
   *
   * @return The cost.
   */
  float getCost();

  /**
   *
   *
   * <pre>
   * The timestamp when the [price][google.cloud.retail.v2alpha.PriceInfo.price]
   * starts to be effective. This can be set as a future timestamp, and the
   * [price][google.cloud.retail.v2alpha.PriceInfo.price] is only used for
   * search after
   * [price_effective_time][google.cloud.retail.v2alpha.PriceInfo.price_effective_time].
   * If so, the
   * [original_price][google.cloud.retail.v2alpha.PriceInfo.original_price] must
   * be set and
   * [original_price][google.cloud.retail.v2alpha.PriceInfo.original_price] is
   * used before
   * [price_effective_time][google.cloud.retail.v2alpha.PriceInfo.price_effective_time].
   *
   * Do not set if [price][google.cloud.retail.v2alpha.PriceInfo.price] is
   * always effective because it will cause additional latency during search.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp price_effective_time = 5;</code>
   *
   * @return Whether the priceEffectiveTime field is set.
   */
  boolean hasPriceEffectiveTime();
  /**
   *
   *
   * <pre>
   * The timestamp when the [price][google.cloud.retail.v2alpha.PriceInfo.price]
   * starts to be effective. This can be set as a future timestamp, and the
   * [price][google.cloud.retail.v2alpha.PriceInfo.price] is only used for
   * search after
   * [price_effective_time][google.cloud.retail.v2alpha.PriceInfo.price_effective_time].
   * If so, the
   * [original_price][google.cloud.retail.v2alpha.PriceInfo.original_price] must
   * be set and
   * [original_price][google.cloud.retail.v2alpha.PriceInfo.original_price] is
   * used before
   * [price_effective_time][google.cloud.retail.v2alpha.PriceInfo.price_effective_time].
   *
   * Do not set if [price][google.cloud.retail.v2alpha.PriceInfo.price] is
   * always effective because it will cause additional latency during search.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp price_effective_time = 5;</code>
   *
   * @return The priceEffectiveTime.
   */
  com.google.protobuf.Timestamp getPriceEffectiveTime();
  /**
   *
   *
   * <pre>
   * The timestamp when the [price][google.cloud.retail.v2alpha.PriceInfo.price]
   * starts to be effective. This can be set as a future timestamp, and the
   * [price][google.cloud.retail.v2alpha.PriceInfo.price] is only used for
   * search after
   * [price_effective_time][google.cloud.retail.v2alpha.PriceInfo.price_effective_time].
   * If so, the
   * [original_price][google.cloud.retail.v2alpha.PriceInfo.original_price] must
   * be set and
   * [original_price][google.cloud.retail.v2alpha.PriceInfo.original_price] is
   * used before
   * [price_effective_time][google.cloud.retail.v2alpha.PriceInfo.price_effective_time].
   *
   * Do not set if [price][google.cloud.retail.v2alpha.PriceInfo.price] is
   * always effective because it will cause additional latency during search.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp price_effective_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getPriceEffectiveTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The timestamp when the [price][google.cloud.retail.v2alpha.PriceInfo.price]
   * stops to be effective. The
   * [price][google.cloud.retail.v2alpha.PriceInfo.price] is used for search
   * before
   * [price_expire_time][google.cloud.retail.v2alpha.PriceInfo.price_expire_time].
   * If this field is set, the
   * [original_price][google.cloud.retail.v2alpha.PriceInfo.original_price] must
   * be set and
   * [original_price][google.cloud.retail.v2alpha.PriceInfo.original_price] is
   * used after
   * [price_expire_time][google.cloud.retail.v2alpha.PriceInfo.price_expire_time].
   *
   * Do not set if [price][google.cloud.retail.v2alpha.PriceInfo.price] is
   * always effective because it will cause additional latency during search.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp price_expire_time = 6;</code>
   *
   * @return Whether the priceExpireTime field is set.
   */
  boolean hasPriceExpireTime();
  /**
   *
   *
   * <pre>
   * The timestamp when the [price][google.cloud.retail.v2alpha.PriceInfo.price]
   * stops to be effective. The
   * [price][google.cloud.retail.v2alpha.PriceInfo.price] is used for search
   * before
   * [price_expire_time][google.cloud.retail.v2alpha.PriceInfo.price_expire_time].
   * If this field is set, the
   * [original_price][google.cloud.retail.v2alpha.PriceInfo.original_price] must
   * be set and
   * [original_price][google.cloud.retail.v2alpha.PriceInfo.original_price] is
   * used after
   * [price_expire_time][google.cloud.retail.v2alpha.PriceInfo.price_expire_time].
   *
   * Do not set if [price][google.cloud.retail.v2alpha.PriceInfo.price] is
   * always effective because it will cause additional latency during search.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp price_expire_time = 6;</code>
   *
   * @return The priceExpireTime.
   */
  com.google.protobuf.Timestamp getPriceExpireTime();
  /**
   *
   *
   * <pre>
   * The timestamp when the [price][google.cloud.retail.v2alpha.PriceInfo.price]
   * stops to be effective. The
   * [price][google.cloud.retail.v2alpha.PriceInfo.price] is used for search
   * before
   * [price_expire_time][google.cloud.retail.v2alpha.PriceInfo.price_expire_time].
   * If this field is set, the
   * [original_price][google.cloud.retail.v2alpha.PriceInfo.original_price] must
   * be set and
   * [original_price][google.cloud.retail.v2alpha.PriceInfo.original_price] is
   * used after
   * [price_expire_time][google.cloud.retail.v2alpha.PriceInfo.price_expire_time].
   *
   * Do not set if [price][google.cloud.retail.v2alpha.PriceInfo.price] is
   * always effective because it will cause additional latency during search.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp price_expire_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getPriceExpireTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The price range of all the child
   * [Product.Type.VARIANT][google.cloud.retail.v2alpha.Product.Type.VARIANT]
   * [Product][google.cloud.retail.v2alpha.Product]s grouped together on the
   * [Product.Type.PRIMARY][google.cloud.retail.v2alpha.Product.Type.PRIMARY]
   * [Product][google.cloud.retail.v2alpha.Product]. Only populated for
   * [Product.Type.PRIMARY][google.cloud.retail.v2alpha.Product.Type.PRIMARY]
   * [Product][google.cloud.retail.v2alpha.Product]s.
   *
   * Note: This field is OUTPUT_ONLY for
   * [ProductService.GetProduct][google.cloud.retail.v2alpha.ProductService.GetProduct].
   * Do not set this field in API requests.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.PriceInfo.PriceRange price_range = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the priceRange field is set.
   */
  boolean hasPriceRange();
  /**
   *
   *
   * <pre>
   * Output only. The price range of all the child
   * [Product.Type.VARIANT][google.cloud.retail.v2alpha.Product.Type.VARIANT]
   * [Product][google.cloud.retail.v2alpha.Product]s grouped together on the
   * [Product.Type.PRIMARY][google.cloud.retail.v2alpha.Product.Type.PRIMARY]
   * [Product][google.cloud.retail.v2alpha.Product]. Only populated for
   * [Product.Type.PRIMARY][google.cloud.retail.v2alpha.Product.Type.PRIMARY]
   * [Product][google.cloud.retail.v2alpha.Product]s.
   *
   * Note: This field is OUTPUT_ONLY for
   * [ProductService.GetProduct][google.cloud.retail.v2alpha.ProductService.GetProduct].
   * Do not set this field in API requests.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.PriceInfo.PriceRange price_range = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The priceRange.
   */
  com.google.cloud.retail.v2alpha.PriceInfo.PriceRange getPriceRange();
  /**
   *
   *
   * <pre>
   * Output only. The price range of all the child
   * [Product.Type.VARIANT][google.cloud.retail.v2alpha.Product.Type.VARIANT]
   * [Product][google.cloud.retail.v2alpha.Product]s grouped together on the
   * [Product.Type.PRIMARY][google.cloud.retail.v2alpha.Product.Type.PRIMARY]
   * [Product][google.cloud.retail.v2alpha.Product]. Only populated for
   * [Product.Type.PRIMARY][google.cloud.retail.v2alpha.Product.Type.PRIMARY]
   * [Product][google.cloud.retail.v2alpha.Product]s.
   *
   * Note: This field is OUTPUT_ONLY for
   * [ProductService.GetProduct][google.cloud.retail.v2alpha.ProductService.GetProduct].
   * Do not set this field in API requests.
   * </pre>
   *
   * <code>
   * .google.cloud.retail.v2alpha.PriceInfo.PriceRange price_range = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.retail.v2alpha.PriceInfo.PriceRangeOrBuilder getPriceRangeOrBuilder();
}
