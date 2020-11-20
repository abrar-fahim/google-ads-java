// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/extension_feed_item_service.proto

package com.google.ads.googleads.v6.services;

public final class ExtensionFeedItemServiceProto {
  private ExtensionFeedItemServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_GetExtensionFeedItemRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_GetExtensionFeedItemRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateExtensionFeedItemsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateExtensionFeedItemsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_ExtensionFeedItemOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_ExtensionFeedItemOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateExtensionFeedItemsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateExtensionFeedItemsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateExtensionFeedItemResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateExtensionFeedItemResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nBgoogle/ads/googleads/v6/services/exten" +
      "sion_feed_item_service.proto\022 google.ads" +
      ".googleads.v6.services\0329google/ads/googl" +
      "eads/v6/enums/response_content_type.prot" +
      "o\032;google/ads/googleads/v6/resources/ext" +
      "ension_feed_item.proto\032\034google/api/annot" +
      "ations.proto\032\027google/api/client.proto\032\037g" +
      "oogle/api/field_behavior.proto\032\031google/a" +
      "pi/resource.proto\032 google/protobuf/field" +
      "_mask.proto\032\027google/rpc/status.proto\"h\n\033" +
      "GetExtensionFeedItemRequest\022I\n\rresource_" +
      "name\030\001 \001(\tB2\340A\002\372A,\n*googleads.googleapis" +
      ".com/ExtensionFeedItem\"\255\002\n\037MutateExtensi" +
      "onFeedItemsRequest\022\030\n\013customer_id\030\001 \001(\tB" +
      "\003\340A\002\022U\n\noperations\030\002 \003(\0132<.google.ads.go" +
      "ogleads.v6.services.ExtensionFeedItemOpe" +
      "rationB\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n\r" +
      "validate_only\030\004 \001(\010\022i\n\025response_content_" +
      "type\030\005 \001(\0162J.google.ads.googleads.v6.enu" +
      "ms.ResponseContentTypeEnum.ResponseConte" +
      "ntType\"\374\001\n\032ExtensionFeedItemOperation\022/\n" +
      "\013update_mask\030\004 \001(\0132\032.google.protobuf.Fie" +
      "ldMask\022F\n\006create\030\001 \001(\01324.google.ads.goog" +
      "leads.v6.resources.ExtensionFeedItemH\000\022F" +
      "\n\006update\030\002 \001(\01324.google.ads.googleads.v6" +
      ".resources.ExtensionFeedItemH\000\022\020\n\006remove" +
      "\030\003 \001(\tH\000B\013\n\toperation\"\247\001\n MutateExtensio" +
      "nFeedItemsResponse\0221\n\025partial_failure_er" +
      "ror\030\003 \001(\0132\022.google.rpc.Status\022P\n\007results" +
      "\030\002 \003(\0132?.google.ads.googleads.v6.service" +
      "s.MutateExtensionFeedItemResult\"\211\001\n\035Muta" +
      "teExtensionFeedItemResult\022\025\n\rresource_na" +
      "me\030\001 \001(\t\022Q\n\023extension_feed_item\030\002 \001(\01324." +
      "google.ads.googleads.v6.resources.Extens" +
      "ionFeedItem2\224\004\n\030ExtensionFeedItemService" +
      "\022\331\001\n\024GetExtensionFeedItem\022=.google.ads.g" +
      "oogleads.v6.services.GetExtensionFeedIte" +
      "mRequest\0324.google.ads.googleads.v6.resou" +
      "rces.ExtensionFeedItem\"L\202\323\344\223\0026\0224/v6/{res" +
      "ource_name=customers/*/extensionFeedItem" +
      "s/*}\332A\rresource_name\022\376\001\n\030MutateExtension" +
      "FeedItems\022A.google.ads.googleads.v6.serv" +
      "ices.MutateExtensionFeedItemsRequest\032B.g" +
      "oogle.ads.googleads.v6.services.MutateEx" +
      "tensionFeedItemsResponse\"[\202\323\344\223\002<\"7/v6/cu" +
      "stomers/{customer_id=*}/extensionFeedIte" +
      "ms:mutate:\001*\332A\026customer_id,operations\032\033\312" +
      "A\030googleads.googleapis.comB\204\002\n$com.googl" +
      "e.ads.googleads.v6.servicesB\035ExtensionFe" +
      "edItemServiceProtoP\001ZHgoogle.golang.org/" +
      "genproto/googleapis/ads/googleads/v6/ser" +
      "vices;services\242\002\003GAA\252\002 Google.Ads.Google" +
      "Ads.V6.Services\312\002 Google\\Ads\\GoogleAds\\V" +
      "6\\Services\352\002$Google::Ads::GoogleAds::V6:" +
      ":Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v6.resources.ExtensionFeedItemProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_services_GetExtensionFeedItemRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_services_GetExtensionFeedItemRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_GetExtensionFeedItemRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v6_services_MutateExtensionFeedItemsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v6_services_MutateExtensionFeedItemsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateExtensionFeedItemsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v6_services_ExtensionFeedItemOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v6_services_ExtensionFeedItemOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_ExtensionFeedItemOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v6_services_MutateExtensionFeedItemsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v6_services_MutateExtensionFeedItemsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateExtensionFeedItemsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v6_services_MutateExtensionFeedItemResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v6_services_MutateExtensionFeedItemResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateExtensionFeedItemResult_descriptor,
        new java.lang.String[] { "ResourceName", "ExtensionFeedItem", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v6.enums.ResponseContentTypeProto.getDescriptor();
    com.google.ads.googleads.v6.resources.ExtensionFeedItemProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
