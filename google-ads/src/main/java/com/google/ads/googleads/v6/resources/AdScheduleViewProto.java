// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/resources/ad_schedule_view.proto

package com.google.ads.googleads.v6.resources;

public final class AdScheduleViewProto {
  private AdScheduleViewProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_resources_AdScheduleView_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_resources_AdScheduleView_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v6/resources/ad_s" +
      "chedule_view.proto\022!google.ads.googleads" +
      ".v6.resources\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\032\034googl" +
      "e/api/annotations.proto\"\314\001\n\016AdScheduleVi" +
      "ew\022F\n\rresource_name\030\001 \001(\tB/\340A\003\372A)\n\'googl" +
      "eads.googleapis.com/AdScheduleView:r\352Ao\n" +
      "\'googleads.googleapis.com/AdScheduleView" +
      "\022Dcustomers/{customer_id}/adScheduleView" +
      "s/{campaign_id}~{criterion_id}B\200\002\n%com.g" +
      "oogle.ads.googleads.v6.resourcesB\023AdSche" +
      "duleViewProtoP\001ZJgoogle.golang.org/genpr" +
      "oto/googleapis/ads/googleads/v6/resource" +
      "s;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds" +
      ".V6.Resources\312\002!Google\\Ads\\GoogleAds\\V6\\" +
      "Resources\352\002%Google::Ads::GoogleAds::V6::" +
      "Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_resources_AdScheduleView_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_resources_AdScheduleView_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_resources_AdScheduleView_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
