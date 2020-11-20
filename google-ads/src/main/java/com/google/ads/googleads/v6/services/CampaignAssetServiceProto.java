// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/campaign_asset_service.proto

package com.google.ads.googleads.v6.services;

public final class CampaignAssetServiceProto {
  private CampaignAssetServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_GetCampaignAssetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_GetCampaignAssetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateCampaignAssetsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateCampaignAssetsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_CampaignAssetOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_CampaignAssetOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateCampaignAssetsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateCampaignAssetsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateCampaignAssetResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateCampaignAssetResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n=google/ads/googleads/v6/services/campa" +
      "ign_asset_service.proto\022 google.ads.goog" +
      "leads.v6.services\0326google/ads/googleads/" +
      "v6/resources/campaign_asset.proto\032\034googl" +
      "e/api/annotations.proto\032\027google/api/clie" +
      "nt.proto\032\037google/api/field_behavior.prot" +
      "o\032\031google/api/resource.proto\032\027google/rpc" +
      "/status.proto\"`\n\027GetCampaignAssetRequest" +
      "\022E\n\rresource_name\030\001 \001(\tB.\340A\002\372A(\n&googlea" +
      "ds.googleapis.com/CampaignAsset\"\272\001\n\033Muta" +
      "teCampaignAssetsRequest\022\030\n\013customer_id\030\001" +
      " \001(\tB\003\340A\002\022Q\n\noperations\030\002 \003(\01328.google.a" +
      "ds.googleads.v6.services.CampaignAssetOp" +
      "erationB\003\340A\002\022\027\n\017partial_failure\030\003 \001(\010\022\025\n" +
      "\rvalidate_only\030\004 \001(\010\"{\n\026CampaignAssetOpe" +
      "ration\022B\n\006create\030\001 \001(\01320.google.ads.goog" +
      "leads.v6.resources.CampaignAssetH\000\022\020\n\006re" +
      "move\030\002 \001(\tH\000B\013\n\toperation\"\237\001\n\034MutateCamp" +
      "aignAssetsResponse\0221\n\025partial_failure_er" +
      "ror\030\001 \001(\0132\022.google.rpc.Status\022L\n\007results" +
      "\030\002 \003(\0132;.google.ads.googleads.v6.service" +
      "s.MutateCampaignAssetResult\"2\n\031MutateCam" +
      "paignAssetResult\022\025\n\rresource_name\030\001 \001(\t2" +
      "\360\003\n\024CampaignAssetService\022\311\001\n\020GetCampaign" +
      "Asset\0229.google.ads.googleads.v6.services" +
      ".GetCampaignAssetRequest\0320.google.ads.go" +
      "ogleads.v6.resources.CampaignAsset\"H\202\323\344\223" +
      "\0022\0220/v6/{resource_name=customers/*/campa" +
      "ignAssets/*}\332A\rresource_name\022\356\001\n\024MutateC" +
      "ampaignAssets\022=.google.ads.googleads.v6." +
      "services.MutateCampaignAssetsRequest\032>.g" +
      "oogle.ads.googleads.v6.services.MutateCa" +
      "mpaignAssetsResponse\"W\202\323\344\223\0028\"3/v6/custom" +
      "ers/{customer_id=*}/campaignAssets:mutat" +
      "e:\001*\332A\026customer_id,operations\032\033\312A\030google" +
      "ads.googleapis.comB\200\002\n$com.google.ads.go" +
      "ogleads.v6.servicesB\031CampaignAssetServic" +
      "eProtoP\001ZHgoogle.golang.org/genproto/goo" +
      "gleapis/ads/googleads/v6/services;servic" +
      "es\242\002\003GAA\252\002 Google.Ads.GoogleAds.V6.Servi" +
      "ces\312\002 Google\\Ads\\GoogleAds\\V6\\Services\352\002" +
      "$Google::Ads::GoogleAds::V6::Servicesb\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.resources.CampaignAssetProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_services_GetCampaignAssetRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_services_GetCampaignAssetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_GetCampaignAssetRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v6_services_MutateCampaignAssetsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v6_services_MutateCampaignAssetsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateCampaignAssetsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v6_services_CampaignAssetOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v6_services_CampaignAssetOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_CampaignAssetOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v6_services_MutateCampaignAssetsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v6_services_MutateCampaignAssetsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateCampaignAssetsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v6_services_MutateCampaignAssetResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v6_services_MutateCampaignAssetResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateCampaignAssetResult_descriptor,
        new java.lang.String[] { "ResourceName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v6.resources.CampaignAssetProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
