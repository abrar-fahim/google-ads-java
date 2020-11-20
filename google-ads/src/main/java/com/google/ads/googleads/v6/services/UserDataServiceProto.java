// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/services/user_data_service.proto

package com.google.ads.googleads.v6.services;

public final class UserDataServiceProto {
  private UserDataServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_UploadUserDataRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_UploadUserDataRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_UserDataOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_UserDataOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_services_UploadUserDataResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_services_UploadUserDataResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v6/services/user_" +
      "data_service.proto\022 google.ads.googleads" +
      ".v6.services\0326google/ads/googleads/v6/co" +
      "mmon/offline_user_data.proto\032\034google/api" +
      "/annotations.proto\032\037google/api/field_beh" +
      "avior.proto\032\027google/api/client.proto\"\367\001\n" +
      "\025UploadUserDataRequest\022\030\n\013customer_id\030\001 " +
      "\001(\tB\003\340A\002\022L\n\noperations\030\003 \003(\01323.google.ad" +
      "s.googleads.v6.services.UserDataOperatio" +
      "nB\003\340A\002\022j\n!customer_match_user_list_metad" +
      "ata\030\002 \001(\0132=.google.ads.googleads.v6.comm" +
      "on.CustomerMatchUserListMetadataH\000B\n\n\010me" +
      "tadata\"\230\001\n\021UserDataOperation\022:\n\006create\030\001" +
      " \001(\0132(.google.ads.googleads.v6.common.Us" +
      "erDataH\000\022:\n\006remove\030\002 \001(\0132(.google.ads.go" +
      "ogleads.v6.common.UserDataH\000B\013\n\toperatio" +
      "n\"\222\001\n\026UploadUserDataResponse\022\035\n\020upload_d" +
      "ate_time\030\003 \001(\tH\000\210\001\001\022&\n\031received_operatio" +
      "ns_count\030\004 \001(\005H\001\210\001\001B\023\n\021_upload_date_time" +
      "B\034\n\032_received_operations_count2\355\001\n\017UserD" +
      "ataService\022\274\001\n\016UploadUserData\0227.google.a" +
      "ds.googleads.v6.services.UploadUserDataR" +
      "equest\0328.google.ads.googleads.v6.service" +
      "s.UploadUserDataResponse\"7\202\323\344\223\0021\",/v6/cu" +
      "stomers/{customer_id=*}:uploadUserData:\001" +
      "*\032\033\312A\030googleads.googleapis.comB\373\001\n$com.g" +
      "oogle.ads.googleads.v6.servicesB\024UserDat" +
      "aServiceProtoP\001ZHgoogle.golang.org/genpr" +
      "oto/googleapis/ads/googleads/v6/services" +
      ";services\242\002\003GAA\252\002 Google.Ads.GoogleAds.V" +
      "6.Services\312\002 Google\\Ads\\GoogleAds\\V6\\Ser" +
      "vices\352\002$Google::Ads::GoogleAds::V6::Serv" +
      "icesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.common.OfflineUserDataProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_services_UploadUserDataRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_services_UploadUserDataRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_UploadUserDataRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operations", "CustomerMatchUserListMetadata", "Metadata", });
    internal_static_google_ads_googleads_v6_services_UserDataOperation_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v6_services_UserDataOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_UserDataOperation_descriptor,
        new java.lang.String[] { "Create", "Remove", "Operation", });
    internal_static_google_ads_googleads_v6_services_UploadUserDataResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v6_services_UploadUserDataResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_services_UploadUserDataResponse_descriptor,
        new java.lang.String[] { "UploadDateTime", "ReceivedOperationsCount", "UploadDateTime", "ReceivedOperationsCount", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v6.common.OfflineUserDataProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
