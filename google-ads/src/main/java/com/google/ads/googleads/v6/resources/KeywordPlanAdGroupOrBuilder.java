// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/resources/keyword_plan_ad_group.proto

package com.google.ads.googleads.v6.resources;

public interface KeywordPlanAdGroupOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.resources.KeywordPlanAdGroup)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Immutable. The resource name of the Keyword Planner ad group.
   * KeywordPlanAdGroup resource names have the form:
   * `customers/{customer_id}/keywordPlanAdGroups/{kp_ad_group_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The resourceName.
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * Immutable. The resource name of the Keyword Planner ad group.
   * KeywordPlanAdGroup resource names have the form:
   * `customers/{customer_id}/keywordPlanAdGroups/{kp_ad_group_id}`
   * </pre>
   *
   * <code>string resource_name = 1 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The keyword plan campaign to which this ad group belongs.
   * </pre>
   *
   * <code>string keyword_plan_campaign = 6 [(.google.api.resource_reference) = { ... }</code>
   * @return Whether the keywordPlanCampaign field is set.
   */
  boolean hasKeywordPlanCampaign();
  /**
   * <pre>
   * The keyword plan campaign to which this ad group belongs.
   * </pre>
   *
   * <code>string keyword_plan_campaign = 6 [(.google.api.resource_reference) = { ... }</code>
   * @return The keywordPlanCampaign.
   */
  java.lang.String getKeywordPlanCampaign();
  /**
   * <pre>
   * The keyword plan campaign to which this ad group belongs.
   * </pre>
   *
   * <code>string keyword_plan_campaign = 6 [(.google.api.resource_reference) = { ... }</code>
   * @return The bytes for keywordPlanCampaign.
   */
  com.google.protobuf.ByteString
      getKeywordPlanCampaignBytes();

  /**
   * <pre>
   * Output only. The ID of the keyword plan ad group.
   * </pre>
   *
   * <code>int64 id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return Whether the id field is set.
   */
  boolean hasId();
  /**
   * <pre>
   * Output only. The ID of the keyword plan ad group.
   * </pre>
   *
   * <code>int64 id = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   * @return The id.
   */
  long getId();

  /**
   * <pre>
   * The name of the keyword plan ad group.
   * This field is required and should not be empty when creating keyword plan
   * ad group.
   * </pre>
   *
   * <code>string name = 8;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * The name of the keyword plan ad group.
   * This field is required and should not be empty when creating keyword plan
   * ad group.
   * </pre>
   *
   * <code>string name = 8;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name of the keyword plan ad group.
   * This field is required and should not be empty when creating keyword plan
   * ad group.
   * </pre>
   *
   * <code>string name = 8;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * A default ad group max cpc bid in micros in account currency for all
   * biddable keywords under the keyword plan ad group.
   * If not set, will inherit from parent campaign.
   * </pre>
   *
   * <code>int64 cpc_bid_micros = 9;</code>
   * @return Whether the cpcBidMicros field is set.
   */
  boolean hasCpcBidMicros();
  /**
   * <pre>
   * A default ad group max cpc bid in micros in account currency for all
   * biddable keywords under the keyword plan ad group.
   * If not set, will inherit from parent campaign.
   * </pre>
   *
   * <code>int64 cpc_bid_micros = 9;</code>
   * @return The cpcBidMicros.
   */
  long getCpcBidMicros();
}
