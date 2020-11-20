// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/resources/feed_item.proto

package com.google.ads.googleads.v6.resources;

public final class FeedItemProto {
  private FeedItemProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_resources_FeedItem_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_resources_FeedItem_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_resources_FeedItemAttributeValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_resources_FeedItemAttributeValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_resources_FeedItemPlaceholderPolicyInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_resources_FeedItemPlaceholderPolicyInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_resources_FeedItemValidationError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_resources_FeedItemValidationError_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n1google/ads/googleads/v6/resources/feed" +
      "_item.proto\022!google.ads.googleads.v6.res" +
      "ources\0325google/ads/googleads/v6/common/c" +
      "ustom_parameter.proto\0320google/ads/google" +
      "ads/v6/common/feed_common.proto\032+google/" +
      "ads/googleads/v6/common/policy.proto\032Ego" +
      "ogle/ads/googleads/v6/enums/feed_item_qu" +
      "ality_approval_status.proto\032Hgoogle/ads/" +
      "googleads/v6/enums/feed_item_quality_dis" +
      "approval_reason.proto\0324google/ads/google" +
      "ads/v6/enums/feed_item_status.proto\032?goo" +
      "gle/ads/googleads/v6/enums/feed_item_val" +
      "idation_status.proto\032=google/ads/googlea" +
      "ds/v6/enums/geo_targeting_restriction.pr" +
      "oto\0324google/ads/googleads/v6/enums/place" +
      "holder_type.proto\032:google/ads/googleads/" +
      "v6/enums/policy_approval_status.proto\0328g" +
      "oogle/ads/googleads/v6/enums/policy_revi" +
      "ew_status.proto\032?google/ads/googleads/v6" +
      "/errors/feed_item_validation_error.proto" +
      "\032\037google/api/field_behavior.proto\032\031googl" +
      "e/api/resource.proto\032\034google/api/annotat" +
      "ions.proto\"\300\006\n\010FeedItem\022@\n\rresource_name" +
      "\030\001 \001(\tB)\340A\005\372A#\n!googleads.googleapis.com" +
      "/FeedItem\0228\n\004feed\030\013 \001(\tB%\340A\005\372A\037\n\035googlea" +
      "ds.googleapis.com/FeedH\000\210\001\001\022\024\n\002id\030\014 \001(\003B" +
      "\003\340A\003H\001\210\001\001\022\034\n\017start_date_time\030\r \001(\tH\002\210\001\001\022" +
      "\032\n\rend_date_time\030\016 \001(\tH\003\210\001\001\022S\n\020attribute" +
      "_values\030\006 \003(\01329.google.ads.googleads.v6." +
      "resources.FeedItemAttributeValue\022u\n\031geo_" +
      "targeting_restriction\030\007 \001(\0162R.google.ads" +
      ".googleads.v6.enums.GeoTargetingRestrict" +
      "ionEnum.GeoTargetingRestriction\022N\n\025url_c" +
      "ustom_parameters\030\010 \003(\0132/.google.ads.goog" +
      "leads.v6.common.CustomParameter\022U\n\006statu" +
      "s\030\t \001(\0162@.google.ads.googleads.v6.enums." +
      "FeedItemStatusEnum.FeedItemStatusB\003\340A\003\022[" +
      "\n\014policy_infos\030\n \003(\0132@.google.ads.google" +
      "ads.v6.resources.FeedItemPlaceholderPoli" +
      "cyInfoB\003\340A\003:b\352A_\n!googleads.googleapis.c" +
      "om/FeedItem\022:customers/{customer_id}/fee" +
      "dItems/{feed_id}~{feed_item_id}B\007\n\005_feed" +
      "B\005\n\003_idB\022\n\020_start_date_timeB\020\n\016_end_date" +
      "_time\"\234\003\n\026FeedItemAttributeValue\022\036\n\021feed" +
      "_attribute_id\030\013 \001(\003H\000\210\001\001\022\032\n\rinteger_valu" +
      "e\030\014 \001(\003H\001\210\001\001\022\032\n\rboolean_value\030\r \001(\010H\002\210\001\001" +
      "\022\031\n\014string_value\030\016 \001(\tH\003\210\001\001\022\031\n\014double_va" +
      "lue\030\017 \001(\001H\004\210\001\001\022:\n\013price_value\030\006 \001(\0132%.go" +
      "ogle.ads.googleads.v6.common.Money\022\026\n\016in" +
      "teger_values\030\020 \003(\003\022\026\n\016boolean_values\030\021 \003" +
      "(\010\022\025\n\rstring_values\030\022 \003(\t\022\025\n\rdouble_valu" +
      "es\030\023 \003(\001B\024\n\022_feed_attribute_idB\020\n\016_integ" +
      "er_valueB\020\n\016_boolean_valueB\017\n\r_string_va" +
      "lueB\017\n\r_double_value\"\345\007\n\035FeedItemPlaceho" +
      "lderPolicyInfo\022f\n\025placeholder_type_enum\030" +
      "\n \001(\0162B.google.ads.googleads.v6.enums.Pl" +
      "aceholderTypeEnum.PlaceholderTypeB\003\340A\003\022," +
      "\n\032feed_mapping_resource_name\030\013 \001(\tB\003\340A\003H" +
      "\000\210\001\001\022d\n\rreview_status\030\003 \001(\0162H.google.ads" +
      ".googleads.v6.enums.PolicyReviewStatusEn" +
      "um.PolicyReviewStatusB\003\340A\003\022j\n\017approval_s" +
      "tatus\030\004 \001(\0162L.google.ads.googleads.v6.en" +
      "ums.PolicyApprovalStatusEnum.PolicyAppro" +
      "valStatusB\003\340A\003\022S\n\024policy_topic_entries\030\005" +
      " \003(\01320.google.ads.googleads.v6.common.Po" +
      "licyTopicEntryB\003\340A\003\022t\n\021validation_status" +
      "\030\006 \001(\0162T.google.ads.googleads.v6.enums.F" +
      "eedItemValidationStatusEnum.FeedItemVali" +
      "dationStatusB\003\340A\003\022Z\n\021validation_errors\030\007" +
      " \003(\0132:.google.ads.googleads.v6.resources" +
      ".FeedItemValidationErrorB\003\340A\003\022\204\001\n\027qualit" +
      "y_approval_status\030\010 \001(\0162^.google.ads.goo" +
      "gleads.v6.enums.FeedItemQualityApprovalS" +
      "tatusEnum.FeedItemQualityApprovalStatusB" +
      "\003\340A\003\022\216\001\n\033quality_disapproval_reasons\030\t \003" +
      "(\0162d.google.ads.googleads.v6.enums.FeedI" +
      "temQualityDisapprovalReasonEnum.FeedItem" +
      "QualityDisapprovalReasonB\003\340A\003B\035\n\033_feed_m" +
      "apping_resource_name\"\212\002\n\027FeedItemValidat" +
      "ionError\022r\n\020validation_error\030\001 \001(\0162S.goo" +
      "gle.ads.googleads.v6.errors.FeedItemVali" +
      "dationErrorEnum.FeedItemValidationErrorB" +
      "\003\340A\003\022\035\n\013description\030\006 \001(\tB\003\340A\003H\000\210\001\001\022\037\n\022f" +
      "eed_attribute_ids\030\007 \003(\003B\003\340A\003\022\034\n\nextra_in" +
      "fo\030\010 \001(\tB\003\340A\003H\001\210\001\001B\016\n\014_descriptionB\r\n\013_e" +
      "xtra_infoB\372\001\n%com.google.ads.googleads.v" +
      "6.resourcesB\rFeedItemProtoP\001ZJgoogle.gol" +
      "ang.org/genproto/googleapis/ads/googlead" +
      "s/v6/resources;resources\242\002\003GAA\252\002!Google." +
      "Ads.GoogleAds.V6.Resources\312\002!Google\\Ads\\" +
      "GoogleAds\\V6\\Resources\352\002%Google::Ads::Go" +
      "ogleAds::V6::Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v6.common.CustomParameterProto.getDescriptor(),
          com.google.ads.googleads.v6.common.FeedCommonProto.getDescriptor(),
          com.google.ads.googleads.v6.common.PolicyProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.FeedItemQualityApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.FeedItemQualityDisapprovalReasonProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.FeedItemStatusProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.FeedItemValidationStatusProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.GeoTargetingRestrictionProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.PlaceholderTypeProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.PolicyApprovalStatusProto.getDescriptor(),
          com.google.ads.googleads.v6.enums.PolicyReviewStatusProto.getDescriptor(),
          com.google.ads.googleads.v6.errors.FeedItemValidationErrorProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_resources_FeedItem_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_resources_FeedItem_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_resources_FeedItem_descriptor,
        new java.lang.String[] { "ResourceName", "Feed", "Id", "StartDateTime", "EndDateTime", "AttributeValues", "GeoTargetingRestriction", "UrlCustomParameters", "Status", "PolicyInfos", "Feed", "Id", "StartDateTime", "EndDateTime", });
    internal_static_google_ads_googleads_v6_resources_FeedItemAttributeValue_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_ads_googleads_v6_resources_FeedItemAttributeValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_resources_FeedItemAttributeValue_descriptor,
        new java.lang.String[] { "FeedAttributeId", "IntegerValue", "BooleanValue", "StringValue", "DoubleValue", "PriceValue", "IntegerValues", "BooleanValues", "StringValues", "DoubleValues", "FeedAttributeId", "IntegerValue", "BooleanValue", "StringValue", "DoubleValue", });
    internal_static_google_ads_googleads_v6_resources_FeedItemPlaceholderPolicyInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_ads_googleads_v6_resources_FeedItemPlaceholderPolicyInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_resources_FeedItemPlaceholderPolicyInfo_descriptor,
        new java.lang.String[] { "PlaceholderTypeEnum", "FeedMappingResourceName", "ReviewStatus", "ApprovalStatus", "PolicyTopicEntries", "ValidationStatus", "ValidationErrors", "QualityApprovalStatus", "QualityDisapprovalReasons", "FeedMappingResourceName", });
    internal_static_google_ads_googleads_v6_resources_FeedItemValidationError_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_google_ads_googleads_v6_resources_FeedItemValidationError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_resources_FeedItemValidationError_descriptor,
        new java.lang.String[] { "ValidationError", "Description", "FeedAttributeIds", "ExtraInfo", "Description", "ExtraInfo", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v6.common.CustomParameterProto.getDescriptor();
    com.google.ads.googleads.v6.common.FeedCommonProto.getDescriptor();
    com.google.ads.googleads.v6.common.PolicyProto.getDescriptor();
    com.google.ads.googleads.v6.enums.FeedItemQualityApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v6.enums.FeedItemQualityDisapprovalReasonProto.getDescriptor();
    com.google.ads.googleads.v6.enums.FeedItemStatusProto.getDescriptor();
    com.google.ads.googleads.v6.enums.FeedItemValidationStatusProto.getDescriptor();
    com.google.ads.googleads.v6.enums.GeoTargetingRestrictionProto.getDescriptor();
    com.google.ads.googleads.v6.enums.PlaceholderTypeProto.getDescriptor();
    com.google.ads.googleads.v6.enums.PolicyApprovalStatusProto.getDescriptor();
    com.google.ads.googleads.v6.enums.PolicyReviewStatusProto.getDescriptor();
    com.google.ads.googleads.v6.errors.FeedItemValidationErrorProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
