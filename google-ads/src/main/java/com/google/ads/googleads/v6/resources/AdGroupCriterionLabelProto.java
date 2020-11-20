// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/resources/ad_group_criterion_label.proto

package com.google.ads.googleads.v6.resources;

public final class AdGroupCriterionLabelProto {
  private AdGroupCriterionLabelProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_resources_AdGroupCriterionLabel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_resources_AdGroupCriterionLabel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n@google/ads/googleads/v6/resources/ad_g" +
      "roup_criterion_label.proto\022!google.ads.g" +
      "oogleads.v6.resources\032\037google/api/field_" +
      "behavior.proto\032\031google/api/resource.prot" +
      "o\032\034google/api/annotations.proto\"\246\003\n\025AdGr" +
      "oupCriterionLabel\022M\n\rresource_name\030\001 \001(\t" +
      "B6\340A\005\372A0\n.googleads.googleapis.com/AdGro" +
      "upCriterionLabel\022R\n\022ad_group_criterion\030\004" +
      " \001(\tB1\340A\005\372A+\n)googleads.googleapis.com/A" +
      "dGroupCriterionH\000\210\001\001\022:\n\005label\030\005 \001(\tB&\340A\005" +
      "\372A \n\036googleads.googleapis.com/LabelH\001\210\001\001" +
      ":\214\001\352A\210\001\n.googleads.googleapis.com/AdGrou" +
      "pCriterionLabel\022Vcustomers/{customer_id}" +
      "/adGroupCriterionLabels/{ad_group_id}~{c" +
      "riterion_id}~{label_id}B\025\n\023_ad_group_cri" +
      "terionB\010\n\006_labelB\207\002\n%com.google.ads.goog" +
      "leads.v6.resourcesB\032AdGroupCriterionLabe" +
      "lProtoP\001ZJgoogle.golang.org/genproto/goo" +
      "gleapis/ads/googleads/v6/resources;resou" +
      "rces\242\002\003GAA\252\002!Google.Ads.GoogleAds.V6.Res" +
      "ources\312\002!Google\\Ads\\GoogleAds\\V6\\Resourc" +
      "es\352\002%Google::Ads::GoogleAds::V6::Resourc" +
      "esb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_resources_AdGroupCriterionLabel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_resources_AdGroupCriterionLabel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_resources_AdGroupCriterionLabel_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroupCriterion", "Label", "AdGroupCriterion", "Label", });
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
