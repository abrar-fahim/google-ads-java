// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/reach_plan_service.proto

package com.google.ads.googleads.v6.services;

public interface PlannedProductReachForecastOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.services.PlannedProductReachForecast)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Selected product for planning. The product codes returned are within the
   * set of the ones returned by ListPlannableProducts when using the same
   * location id.
   * </pre>
   *
   * <code>string plannable_product_code = 1;</code>
   * @return The plannableProductCode.
   */
  java.lang.String getPlannableProductCode();
  /**
   * <pre>
   * Selected product for planning. The product codes returned are within the
   * set of the ones returned by ListPlannableProducts when using the same
   * location id.
   * </pre>
   *
   * <code>string plannable_product_code = 1;</code>
   * @return The bytes for plannableProductCode.
   */
  com.google.protobuf.ByteString
      getPlannableProductCodeBytes();

  /**
   * <pre>
   * The cost in micros. This may differ from the product's input allocation
   * if one or more planned products cannot fulfill the budget because of
   * limited inventory.
   * </pre>
   *
   * <code>int64 cost_micros = 2;</code>
   * @return The costMicros.
   */
  long getCostMicros();

  /**
   * <pre>
   * Forecasted traffic metrics for this product.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.services.PlannedProductForecast planned_product_forecast = 3;</code>
   * @return Whether the plannedProductForecast field is set.
   */
  boolean hasPlannedProductForecast();
  /**
   * <pre>
   * Forecasted traffic metrics for this product.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.services.PlannedProductForecast planned_product_forecast = 3;</code>
   * @return The plannedProductForecast.
   */
  com.google.ads.googleads.v6.services.PlannedProductForecast getPlannedProductForecast();
  /**
   * <pre>
   * Forecasted traffic metrics for this product.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.services.PlannedProductForecast planned_product_forecast = 3;</code>
   */
  com.google.ads.googleads.v6.services.PlannedProductForecastOrBuilder getPlannedProductForecastOrBuilder();
}
