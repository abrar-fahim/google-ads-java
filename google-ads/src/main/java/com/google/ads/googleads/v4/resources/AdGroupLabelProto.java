// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/resources/ad_group_label.proto

package com.google.ads.googleads.v4.resources;

public final class AdGroupLabelProto {
  private AdGroupLabelProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_resources_AdGroupLabel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_resources_AdGroupLabel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v4/resources/ad_g" +
      "roup_label.proto\022!google.ads.googleads.v" +
      "4.resources\032\037google/api/field_behavior.p" +
      "roto\032\031google/api/resource.proto\032\036google/" +
      "protobuf/wrappers.proto\032\034google/api/anno" +
      "tations.proto\"\344\002\n\014AdGroupLabel\022D\n\rresour" +
      "ce_name\030\001 \001(\tB-\340A\005\372A\'\n%googleads.googlea" +
      "pis.com/AdGroupLabel\022X\n\010ad_group\030\002 \001(\0132\034" +
      ".google.protobuf.StringValueB(\340A\005\372A\"\n go" +
      "ogleads.googleapis.com/AdGroup\022S\n\005label\030" +
      "\003 \001(\0132\034.google.protobuf.StringValueB&\340A\005" +
      "\372A \n\036googleads.googleapis.com/Label:_\352A\\" +
      "\n%googleads.googleapis.com/AdGroupLabel\022" +
      "3customers/{customer}/adGroupLabels/{ad_" +
      "group_label}B\376\001\n%com.google.ads.googlead" +
      "s.v4.resourcesB\021AdGroupLabelProtoP\001ZJgoo" +
      "gle.golang.org/genproto/googleapis/ads/g" +
      "oogleads/v4/resources;resources\242\002\003GAA\252\002!" +
      "Google.Ads.GoogleAds.V4.Resources\312\002!Goog" +
      "le\\Ads\\GoogleAds\\V4\\Resources\352\002%Google::" +
      "Ads::GoogleAds::V4::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_resources_AdGroupLabel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_resources_AdGroupLabel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_resources_AdGroupLabel_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroup", "Label", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
