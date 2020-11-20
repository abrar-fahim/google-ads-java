// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/campaign_bid_modifier_service.proto

package com.google.ads.googleads.v6.services;

public interface MutateCampaignBidModifiersRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.services.MutateCampaignBidModifiersRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. ID of the customer whose campaign bid modifiers are being modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. ID of the customer whose campaign bid modifiers are being modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The list of operations to perform on individual campaign bid modifiers.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.services.CampaignBidModifierOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v6.services.CampaignBidModifierOperation> 
      getOperationsList();
  /**
   * <pre>
   * Required. The list of operations to perform on individual campaign bid modifiers.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.services.CampaignBidModifierOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v6.services.CampaignBidModifierOperation getOperations(int index);
  /**
   * <pre>
   * Required. The list of operations to perform on individual campaign bid modifiers.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.services.CampaignBidModifierOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * Required. The list of operations to perform on individual campaign bid modifiers.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.services.CampaignBidModifierOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v6.services.CampaignBidModifierOperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * Required. The list of operations to perform on individual campaign bid modifiers.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.services.CampaignBidModifierOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v6.services.CampaignBidModifierOperationOrBuilder getOperationsOrBuilder(
      int index);

  /**
   * <pre>
   * If true, successful operations will be carried out and invalid
   * operations will return errors. If false, all operations will be carried
   * out in one transaction if and only if they are all valid.
   * Default is false.
   * </pre>
   *
   * <code>bool partial_failure = 3;</code>
   * @return The partialFailure.
   */
  boolean getPartialFailure();

  /**
   * <pre>
   * If true, the request is validated but not executed. Only errors are
   * returned, not results.
   * </pre>
   *
   * <code>bool validate_only = 4;</code>
   * @return The validateOnly.
   */
  boolean getValidateOnly();
}
