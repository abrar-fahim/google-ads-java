// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/merchant_center_link_service.proto

package com.google.ads.googleads.v6.services;

public interface ListMerchantCenterLinksResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.services.ListMerchantCenterLinksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Merchant Center links available for the requested customer
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.resources.MerchantCenterLink merchant_center_links = 1;</code>
   */
  java.util.List<com.google.ads.googleads.v6.resources.MerchantCenterLink> 
      getMerchantCenterLinksList();
  /**
   * <pre>
   * Merchant Center links available for the requested customer
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.resources.MerchantCenterLink merchant_center_links = 1;</code>
   */
  com.google.ads.googleads.v6.resources.MerchantCenterLink getMerchantCenterLinks(int index);
  /**
   * <pre>
   * Merchant Center links available for the requested customer
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.resources.MerchantCenterLink merchant_center_links = 1;</code>
   */
  int getMerchantCenterLinksCount();
  /**
   * <pre>
   * Merchant Center links available for the requested customer
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.resources.MerchantCenterLink merchant_center_links = 1;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v6.resources.MerchantCenterLinkOrBuilder> 
      getMerchantCenterLinksOrBuilderList();
  /**
   * <pre>
   * Merchant Center links available for the requested customer
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.resources.MerchantCenterLink merchant_center_links = 1;</code>
   */
  com.google.ads.googleads.v6.resources.MerchantCenterLinkOrBuilder getMerchantCenterLinksOrBuilder(
      int index);
}
