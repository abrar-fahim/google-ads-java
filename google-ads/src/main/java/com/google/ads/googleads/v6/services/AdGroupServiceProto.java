// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/ad_group_service.proto

package com.google.ads.googleads.v6.services;

public final class AdGroupServiceProto {
  private AdGroupServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_GetAdGroupRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_GetAdGroupRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateAdGroupsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateAdGroupsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_AdGroupOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_AdGroupOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateAdGroupsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateAdGroupsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_MutateAdGroupResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_MutateAdGroupResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n7google/ads/googleads/v6/services/ad_gr" +
      "oup_service.proto\022 google.ads.googleads." +
      "v6.services\0329google/ads/googleads/v6/enu" +
      "ms/response_content_type.proto\0320google/a" +
      "ds/googleads/v6/resources/ad_group.proto" +
      "\032\034google/api/annotations.proto\032\027google/a" +
      "pi/client.proto\032\037google/api/field_behavi" +
      "or.proto\032\031google/api/resource.proto\032 goo" +
      "gle/protobuf/field_mask.proto\032\027google/rp" +
      "c/status.proto\"T\n\021GetAdGroupRequest\022?\n\rr" +
      "esource_name\030\001 \001(\tB(\340A\002\372A\"\n googleads.go" +
      "ogleapis.com/AdGroup\"\231\002\n\025MutateAdGroupsR" +
      "equest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022K\n\noper" +
      "ations\030\002 \003(\01322.google.ads.googleads.v6.s" +
      "ervices.AdGroupOperationB\003\340A\002\022\027\n\017partial" +
      "_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001(\010\022i\n" +
      "\025response_content_type\030\005 \001(\0162J.google.ad" +
      "s.googleads.v6.enums.ResponseContentType" +
      "Enum.ResponseContentType\"\336\001\n\020AdGroupOper" +
      "ation\022/\n\013update_mask\030\004 \001(\0132\032.google.prot" +
      "obuf.FieldMask\022<\n\006create\030\001 \001(\0132*.google." +
      "ads.googleads.v6.resources.AdGroupH\000\022<\n\006" +
      "update\030\002 \001(\0132*.google.ads.googleads.v6.r" +
      "esources.AdGroupH\000\022\020\n\006remove\030\003 \001(\tH\000B\013\n\t" +
      "operation\"\223\001\n\026MutateAdGroupsResponse\0221\n\025" +
      "partial_failure_error\030\003 \001(\0132\022.google.rpc" +
      ".Status\022F\n\007results\030\002 \003(\01325.google.ads.go" +
      "ogleads.v6.services.MutateAdGroupResult\"" +
      "j\n\023MutateAdGroupResult\022\025\n\rresource_name\030" +
      "\001 \001(\t\022<\n\010ad_group\030\002 \001(\0132*.google.ads.goo" +
      "gleads.v6.resources.AdGroup2\272\003\n\016AdGroupS" +
      "ervice\022\261\001\n\nGetAdGroup\0223.google.ads.googl" +
      "eads.v6.services.GetAdGroupRequest\032*.goo" +
      "gle.ads.googleads.v6.resources.AdGroup\"B" +
      "\202\323\344\223\002,\022*/v6/{resource_name=customers/*/a" +
      "dGroups/*}\332A\rresource_name\022\326\001\n\016MutateAdG" +
      "roups\0227.google.ads.googleads.v6.services" +
      ".MutateAdGroupsRequest\0328.google.ads.goog" +
      "leads.v6.services.MutateAdGroupsResponse" +
      "\"Q\202\323\344\223\0022\"-/v6/customers/{customer_id=*}/" +
      "adGroups:mutate:\001*\332A\026customer_id,operati" +
      "ons\032\033\312A\030googleads.googleapis.comB\372\001\n$com" +
      ".google.ads.googleads.v6.servicesB\023AdGro" +
      "upServiceProtoP\001ZHgoogle.golang.org/genp" +
      "roto/googleapis/ads/googleads/v6/service" +
      "s;services\242\002\003GAA\252\002 Google.Ads.GoogleAds." +
      "V6.Services\312\002 Google\\Ads\\GoogleAds\\V6\\Se" +
      "rvices\352\002$Google::Ads::GoogleAds::V6::Ser" +
      "vicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.enums.ResponseContentTypeProto.getDescriptor(),
          com.google.ads.googleads.v6.resources.AdGroupProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_services_GetAdGroupRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_services_GetAdGroupRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_GetAdGroupRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v6_services_MutateAdGroupsRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v6_services_MutateAdGroupsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateAdGroupsRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "PartialFailure", "ValidateOnly", "ResponseContentType", });
    internal_static_google_ads_googleads_v6_services_AdGroupOperation_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v6_services_AdGroupOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_AdGroupOperation_descriptor,
        new java.lang.String[] { "UpdateMask", "Create", "Update", "Remove", "Operation", });
    internal_static_google_ads_googleads_v6_services_MutateAdGroupsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v6_services_MutateAdGroupsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateAdGroupsResponse_descriptor,
        new java.lang.String[] { "PartialFailureError", "Results", });
    internal_static_google_ads_googleads_v6_services_MutateAdGroupResult_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v6_services_MutateAdGroupResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_MutateAdGroupResult_descriptor,
        new java.lang.String[] { "ResourceName", "AdGroup", });
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
    com.google.ads.googleads.v6.resources.AdGroupProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
