// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/customer_manager_link_service.proto

package com.google.ads.googleads.v6.services;

public interface MutateCustomerManagerLinkRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.services.MutateCustomerManagerLinkRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The ID of the customer whose customer manager links are being modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <pre>
   * Required. The ID of the customer whose customer manager links are being modified.
   * </pre>
   *
   * <code>string customer_id = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <pre>
   * Required. The list of operations to perform on individual customer manager links.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.services.CustomerManagerLinkOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<com.google.ads.googleads.v6.services.CustomerManagerLinkOperation> 
      getOperationsList();
  /**
   * <pre>
   * Required. The list of operations to perform on individual customer manager links.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.services.CustomerManagerLinkOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v6.services.CustomerManagerLinkOperation getOperations(int index);
  /**
   * <pre>
   * Required. The list of operations to perform on individual customer manager links.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.services.CustomerManagerLinkOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  int getOperationsCount();
  /**
   * <pre>
   * Required. The list of operations to perform on individual customer manager links.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.services.CustomerManagerLinkOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.util.List<? extends com.google.ads.googleads.v6.services.CustomerManagerLinkOperationOrBuilder> 
      getOperationsOrBuilderList();
  /**
   * <pre>
   * Required. The list of operations to perform on individual customer manager links.
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.services.CustomerManagerLinkOperation operations = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.ads.googleads.v6.services.CustomerManagerLinkOperationOrBuilder getOperationsOrBuilder(
      int index);
}
