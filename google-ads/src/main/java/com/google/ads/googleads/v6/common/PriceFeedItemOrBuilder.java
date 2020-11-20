// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/common/extensions.proto

package com.google.ads.googleads.v6.common;

public interface PriceFeedItemOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.common.PriceFeedItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Price extension type of this extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.enums.PriceExtensionTypeEnum.PriceExtensionType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Price extension type of this extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.enums.PriceExtensionTypeEnum.PriceExtensionType type = 1;</code>
   * @return The type.
   */
  com.google.ads.googleads.v6.enums.PriceExtensionTypeEnum.PriceExtensionType getType();

  /**
   * <pre>
   * Price qualifier for all offers of this price extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.enums.PriceExtensionPriceQualifierEnum.PriceExtensionPriceQualifier price_qualifier = 2;</code>
   * @return The enum numeric value on the wire for priceQualifier.
   */
  int getPriceQualifierValue();
  /**
   * <pre>
   * Price qualifier for all offers of this price extension.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.enums.PriceExtensionPriceQualifierEnum.PriceExtensionPriceQualifier price_qualifier = 2;</code>
   * @return The priceQualifier.
   */
  com.google.ads.googleads.v6.enums.PriceExtensionPriceQualifierEnum.PriceExtensionPriceQualifier getPriceQualifier();

  /**
   * <pre>
   * Tracking URL template for all offers of this price extension.
   * </pre>
   *
   * <code>string tracking_url_template = 7;</code>
   * @return Whether the trackingUrlTemplate field is set.
   */
  boolean hasTrackingUrlTemplate();
  /**
   * <pre>
   * Tracking URL template for all offers of this price extension.
   * </pre>
   *
   * <code>string tracking_url_template = 7;</code>
   * @return The trackingUrlTemplate.
   */
  java.lang.String getTrackingUrlTemplate();
  /**
   * <pre>
   * Tracking URL template for all offers of this price extension.
   * </pre>
   *
   * <code>string tracking_url_template = 7;</code>
   * @return The bytes for trackingUrlTemplate.
   */
  com.google.protobuf.ByteString
      getTrackingUrlTemplateBytes();

  /**
   * <pre>
   * The code of the language used for this price extension.
   * </pre>
   *
   * <code>string language_code = 8;</code>
   * @return Whether the languageCode field is set.
   */
  boolean hasLanguageCode();
  /**
   * <pre>
   * The code of the language used for this price extension.
   * </pre>
   *
   * <code>string language_code = 8;</code>
   * @return The languageCode.
   */
  java.lang.String getLanguageCode();
  /**
   * <pre>
   * The code of the language used for this price extension.
   * </pre>
   *
   * <code>string language_code = 8;</code>
   * @return The bytes for languageCode.
   */
  com.google.protobuf.ByteString
      getLanguageCodeBytes();

  /**
   * <pre>
   * The price offerings in this price extension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.PriceOffer price_offerings = 5;</code>
   */
  java.util.List<com.google.ads.googleads.v6.common.PriceOffer> 
      getPriceOfferingsList();
  /**
   * <pre>
   * The price offerings in this price extension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.PriceOffer price_offerings = 5;</code>
   */
  com.google.ads.googleads.v6.common.PriceOffer getPriceOfferings(int index);
  /**
   * <pre>
   * The price offerings in this price extension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.PriceOffer price_offerings = 5;</code>
   */
  int getPriceOfferingsCount();
  /**
   * <pre>
   * The price offerings in this price extension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.PriceOffer price_offerings = 5;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v6.common.PriceOfferOrBuilder> 
      getPriceOfferingsOrBuilderList();
  /**
   * <pre>
   * The price offerings in this price extension.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.PriceOffer price_offerings = 5;</code>
   */
  com.google.ads.googleads.v6.common.PriceOfferOrBuilder getPriceOfferingsOrBuilder(
      int index);

  /**
   * <pre>
   * Tracking URL template for all offers of this price extension.
   * </pre>
   *
   * <code>string final_url_suffix = 9;</code>
   * @return Whether the finalUrlSuffix field is set.
   */
  boolean hasFinalUrlSuffix();
  /**
   * <pre>
   * Tracking URL template for all offers of this price extension.
   * </pre>
   *
   * <code>string final_url_suffix = 9;</code>
   * @return The finalUrlSuffix.
   */
  java.lang.String getFinalUrlSuffix();
  /**
   * <pre>
   * Tracking URL template for all offers of this price extension.
   * </pre>
   *
   * <code>string final_url_suffix = 9;</code>
   * @return The bytes for finalUrlSuffix.
   */
  com.google.protobuf.ByteString
      getFinalUrlSuffixBytes();
}
