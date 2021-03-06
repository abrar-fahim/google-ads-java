// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/services/account_link_service.proto

package com.google.ads.googleads.v5.services;

public final class AccountLinkServiceProto {
  private AccountLinkServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_GetAccountLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_GetAccountLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_CreateAccountLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_CreateAccountLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_CreateAccountLinkResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_CreateAccountLinkResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_MutateAccountLinkRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_MutateAccountLinkRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_AccountLinkOperation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_AccountLinkOperation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_MutateAccountLinkResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_MutateAccountLinkResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_services_MutateAccountLinkResult_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_services_MutateAccountLinkResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n;google/ads/googleads/v5/services/accou" +
      "nt_link_service.proto\022 google.ads.google" +
      "ads.v5.services\0324google/ads/googleads/v5" +
      "/resources/account_link.proto\032\034google/ap" +
      "i/annotations.proto\032\027google/api/client.p" +
      "roto\032\037google/api/field_behavior.proto\032\031g" +
      "oogle/api/resource.proto\"\\\n\025GetAccountLi" +
      "nkRequest\022C\n\rresource_name\030\001 \001(\tB,\340A\002\372A&" +
      "\n$googleads.googleapis.com/AccountLink\"\177" +
      "\n\030CreateAccountLinkRequest\022\030\n\013customer_i" +
      "d\030\001 \001(\tB\003\340A\002\022I\n\014account_link\030\002 \001(\0132..goo" +
      "gle.ads.googleads.v5.resources.AccountLi" +
      "nkB\003\340A\002\"2\n\031CreateAccountLinkResponse\022\025\n\r" +
      "resource_name\030\001 \001(\t\"\264\001\n\030MutateAccountLin" +
      "kRequest\022\030\n\013customer_id\030\001 \001(\tB\003\340A\002\022N\n\top" +
      "eration\030\002 \001(\01326.google.ads.googleads.v5." +
      "services.AccountLinkOperationB\003\340A\002\022\027\n\017pa" +
      "rtial_failure\030\003 \001(\010\022\025\n\rvalidate_only\030\004 \001" +
      "(\010\"5\n\024AccountLinkOperation\022\020\n\006remove\030\003 \001" +
      "(\tH\000B\013\n\toperation\"f\n\031MutateAccountLinkRe" +
      "sponse\022I\n\006result\030\001 \001(\01329.google.ads.goog" +
      "leads.v5.services.MutateAccountLinkResul" +
      "t\"0\n\027MutateAccountLinkResult\022\025\n\rresource" +
      "_name\030\001 \001(\t2\302\005\n\022AccountLinkService\022\301\001\n\016G" +
      "etAccountLink\0227.google.ads.googleads.v5." +
      "services.GetAccountLinkRequest\032..google." +
      "ads.googleads.v5.resources.AccountLink\"F" +
      "\202\323\344\223\0020\022./v5/{resource_name=customers/*/a" +
      "ccountLinks/*}\332A\rresource_name\022\345\001\n\021Creat" +
      "eAccountLink\022:.google.ads.googleads.v5.s" +
      "ervices.CreateAccountLinkRequest\032;.googl" +
      "e.ads.googleads.v5.services.CreateAccoun" +
      "tLinkResponse\"W\202\323\344\223\0026\"1/v5/customers/{cu" +
      "stomer_id=*}/accountLinks:create:\001*\332A\030cu" +
      "stomer_id,account_link\022\342\001\n\021MutateAccount" +
      "Link\022:.google.ads.googleads.v5.services." +
      "MutateAccountLinkRequest\032;.google.ads.go" +
      "ogleads.v5.services.MutateAccountLinkRes" +
      "ponse\"T\202\323\344\223\0026\"1/v5/customers/{customer_i" +
      "d=*}/accountLinks:mutate:\001*\332A\025customer_i" +
      "d,operation\032\033\312A\030googleads.googleapis.com" +
      "B\376\001\n$com.google.ads.googleads.v5.service" +
      "sB\027AccountLinkServiceProtoP\001ZHgoogle.gol" +
      "ang.org/genproto/googleapis/ads/googlead" +
      "s/v5/services;services\242\002\003GAA\252\002 Google.Ad" +
      "s.GoogleAds.V5.Services\312\002 Google\\Ads\\Goo" +
      "gleAds\\V5\\Services\352\002$Google::Ads::Google" +
      "Ads::V5::Servicesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.resources.AccountLinkProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_services_GetAccountLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_services_GetAccountLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_GetAccountLinkRequest_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v5_services_CreateAccountLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v5_services_CreateAccountLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_CreateAccountLinkRequest_descriptor,
        new java.lang.String[] { "CustomerId", "AccountLink", });
    internal_static_google_ads_googleads_v5_services_CreateAccountLinkResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v5_services_CreateAccountLinkResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_CreateAccountLinkResponse_descriptor,
        new java.lang.String[] { "ResourceName", });
    internal_static_google_ads_googleads_v5_services_MutateAccountLinkRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v5_services_MutateAccountLinkRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_MutateAccountLinkRequest_descriptor,
        new java.lang.String[] { "CustomerId", "Operation", "PartialFailure", "ValidateOnly", });
    internal_static_google_ads_googleads_v5_services_AccountLinkOperation_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_google_ads_googleads_v5_services_AccountLinkOperation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_AccountLinkOperation_descriptor,
        new java.lang.String[] { "Remove", "Operation", });
    internal_static_google_ads_googleads_v5_services_MutateAccountLinkResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_google_ads_googleads_v5_services_MutateAccountLinkResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_MutateAccountLinkResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_google_ads_googleads_v5_services_MutateAccountLinkResult_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_google_ads_googleads_v5_services_MutateAccountLinkResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_services_MutateAccountLinkResult_descriptor,
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
    com.google.ads.googleads.v5.resources.AccountLinkProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
