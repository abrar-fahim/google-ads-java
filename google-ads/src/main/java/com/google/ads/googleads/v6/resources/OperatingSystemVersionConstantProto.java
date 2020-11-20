// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/resources/operating_system_version_constant.proto

package com.google.ads.googleads.v6.resources;

public final class OperatingSystemVersionConstantProto {
  private OperatingSystemVersionConstantProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_resources_OperatingSystemVersionConstant_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_resources_OperatingSystemVersionConstant_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nIgoogle/ads/googleads/v6/resources/oper" +
      "ating_system_version_constant.proto\022!goo" +
      "gle.ads.googleads.v6.resources\032Jgoogle/a" +
      "ds/googleads/v6/enums/operating_system_v" +
      "ersion_operator_type.proto\032\037google/api/f" +
      "ield_behavior.proto\032\031google/api/resource" +
      ".proto\032\034google/api/annotations.proto\"\235\004\n" +
      "\036OperatingSystemVersionConstant\022V\n\rresou" +
      "rce_name\030\001 \001(\tB?\340A\003\372A9\n7googleads.google" +
      "apis.com/OperatingSystemVersionConstant\022" +
      "\024\n\002id\030\007 \001(\003B\003\340A\003H\000\210\001\001\022\026\n\004name\030\010 \001(\tB\003\340A\003" +
      "H\001\210\001\001\022\"\n\020os_major_version\030\t \001(\005B\003\340A\003H\002\210\001" +
      "\001\022\"\n\020os_minor_version\030\n \001(\005B\003\340A\003H\003\210\001\001\022\204\001" +
      "\n\roperator_type\030\006 \001(\0162h.google.ads.googl" +
      "eads.v6.enums.OperatingSystemVersionOper" +
      "atorTypeEnum.OperatingSystemVersionOpera" +
      "torTypeB\003\340A\003:l\352Ai\n7googleads.googleapis." +
      "com/OperatingSystemVersionConstant\022.oper" +
      "atingSystemVersionConstants/{criterion_i" +
      "d}B\005\n\003_idB\007\n\005_nameB\023\n\021_os_major_versionB" +
      "\023\n\021_os_minor_versionB\220\002\n%com.google.ads." +
      "googleads.v6.resourcesB#OperatingSystemV" +
      "ersionConstantProtoP\001ZJgoogle.golang.org" +
      "/genproto/googleapis/ads/googleads/v6/re" +
      "sources;resources\242\002\003GAA\252\002!Google.Ads.Goo" +
      "gleAds.V6.Resources\312\002!Google\\Ads\\GoogleA" +
      "ds\\V6\\Resources\352\002%Google::Ads::GoogleAds" +
      "::V6::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.enums.OperatingSystemVersionOperatorTypeProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_resources_OperatingSystemVersionConstant_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_resources_OperatingSystemVersionConstant_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_resources_OperatingSystemVersionConstant_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "OsMajorVersion", "OsMinorVersion", "OperatorType", "Id", "Name", "OsMajorVersion", "OsMinorVersion", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v6.enums.OperatingSystemVersionOperatorTypeProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
