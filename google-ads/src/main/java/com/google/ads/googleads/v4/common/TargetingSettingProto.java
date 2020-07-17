// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v4/common/targeting_setting.proto

package com.google.ads.googleads.v4.common;

public final class TargetingSettingProto {
  private TargetingSettingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_common_TargetingSetting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_common_TargetingSetting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_common_TargetRestriction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_common_TargetRestriction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v4_common_TargetRestrictionOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v4_common_TargetRestrictionOperation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/ads/googleads/v4/common/targeti" +
      "ng_setting.proto\022\036google.ads.googleads.v" +
      "4.common\0327google/ads/googleads/v4/enums/" +
      "targeting_dimension.proto\032\036google/protob" +
      "uf/wrappers.proto\032\034google/api/annotation" +
      "s.proto\"\305\001\n\020TargetingSetting\022N\n\023target_r" +
      "estrictions\030\001 \003(\01321.google.ads.googleads" +
      ".v4.common.TargetRestriction\022a\n\035target_r" +
      "estriction_operations\030\002 \003(\0132:.google.ads" +
      ".googleads.v4.common.TargetRestrictionOp" +
      "eration\"\250\001\n\021TargetRestriction\022e\n\023targeti" +
      "ng_dimension\030\001 \001(\0162H.google.ads.googlead" +
      "s.v4.enums.TargetingDimensionEnum.Target" +
      "ingDimension\022,\n\010bid_only\030\002 \001(\0132\032.google." +
      "protobuf.BoolValue\"\364\001\n\032TargetRestriction" +
      "Operation\022U\n\010operator\030\001 \001(\0162C.google.ads" +
      ".googleads.v4.common.TargetRestrictionOp" +
      "eration.Operator\022@\n\005value\030\002 \001(\01321.google" +
      ".ads.googleads.v4.common.TargetRestricti" +
      "on\"=\n\010Operator\022\017\n\013UNSPECIFIED\020\000\022\013\n\007UNKNO" +
      "WN\020\001\022\007\n\003ADD\020\002\022\n\n\006REMOVE\020\003B\360\001\n\"com.google" +
      ".ads.googleads.v4.commonB\025TargetingSetti" +
      "ngProtoP\001ZDgoogle.golang.org/genproto/go" +
      "ogleapis/ads/googleads/v4/common;common\242" +
      "\002\003GAA\252\002\036Google.Ads.GoogleAds.V4.Common\312\002" +
      "\036Google\\Ads\\GoogleAds\\V4\\Common\352\002\"Google" +
      "::Ads::GoogleAds::V4::Commonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v4.enums.TargetingDimensionProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v4_common_TargetingSetting_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v4_common_TargetingSetting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_common_TargetingSetting_descriptor,
        new java.lang.String[] { "TargetRestrictions", "TargetRestrictionOperations", });
    internal_static_google_ads_googleads_v4_common_TargetRestriction_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v4_common_TargetRestriction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_common_TargetRestriction_descriptor,
        new java.lang.String[] { "TargetingDimension", "BidOnly", });
    internal_static_google_ads_googleads_v4_common_TargetRestrictionOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v4_common_TargetRestrictionOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v4_common_TargetRestrictionOperation_descriptor,
        new java.lang.String[] { "Operator", "Value", });
    com.google.ads.googleads.v4.enums.TargetingDimensionProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}