// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v5/resources/conversion_action.proto

package com.google.ads.googleads.v5.resources;

public final class ConversionActionProto {
  private ConversionActionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_resources_ConversionAction_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_resources_ConversionAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_resources_ConversionAction_AttributionModelSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_resources_ConversionAction_AttributionModelSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_resources_ConversionAction_ValueSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_resources_ConversionAction_ValueSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_resources_ConversionAction_FirebaseSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_resources_ConversionAction_FirebaseSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v5_resources_ConversionAction_ThirdPartyAppAnalyticsSettings_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v5_resources_ConversionAction_ThirdPartyAppAnalyticsSettings_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9google/ads/googleads/v5/resources/conv" +
      "ersion_action.proto\022!google.ads.googlead" +
      "s.v5.resources\0320google/ads/googleads/v5/" +
      "common/tag_snippet.proto\0325google/ads/goo" +
      "gleads/v5/enums/attribution_model.proto\032" +
      ">google/ads/googleads/v5/enums/conversio" +
      "n_action_category.proto\032Cgoogle/ads/goog" +
      "leads/v5/enums/conversion_action_countin" +
      "g_type.proto\032<google/ads/googleads/v5/en" +
      "ums/conversion_action_status.proto\032:goog" +
      "le/ads/googleads/v5/enums/conversion_act" +
      "ion_type.proto\032<google/ads/googleads/v5/" +
      "enums/data_driven_model_status.proto\0325go" +
      "ogle/ads/googleads/v5/enums/mobile_app_v" +
      "endor.proto\032\037google/api/field_behavior.p" +
      "roto\032\031google/api/resource.proto\032\034google/" +
      "api/annotations.proto\"\224\022\n\020ConversionActi" +
      "on\022H\n\rresource_name\030\001 \001(\tB1\340A\005\372A+\n)googl" +
      "eads.googleapis.com/ConversionAction\022\024\n\002" +
      "id\030\025 \001(\003B\003\340A\003H\000\210\001\001\022\021\n\004name\030\026 \001(\tH\001\210\001\001\022`\n" +
      "\006status\030\004 \001(\0162P.google.ads.googleads.v5." +
      "enums.ConversionActionStatusEnum.Convers" +
      "ionActionStatus\022_\n\004type\030\005 \001(\0162L.google.a" +
      "ds.googleads.v5.enums.ConversionActionTy" +
      "peEnum.ConversionActionTypeB\003\340A\005\022f\n\010cate" +
      "gory\030\006 \001(\0162T.google.ads.googleads.v5.enu" +
      "ms.ConversionActionCategoryEnum.Conversi" +
      "onActionCategory\022 \n\016owner_customer\030\027 \001(\t" +
      "B\003\340A\003H\002\210\001\001\022*\n\035include_in_conversions_met" +
      "ric\030\030 \001(\010H\003\210\001\001\022/\n\"click_through_lookback" +
      "_window_days\030\031 \001(\003H\004\210\001\001\022.\n!view_through_" +
      "lookback_window_days\030\032 \001(\003H\005\210\001\001\022Y\n\016value" +
      "_settings\030\013 \001(\0132A.google.ads.googleads.v" +
      "5.resources.ConversionAction.ValueSettin" +
      "gs\022s\n\rcounting_type\030\014 \001(\0162\\.google.ads.g" +
      "oogleads.v5.enums.ConversionActionCounti" +
      "ngTypeEnum.ConversionActionCountingType\022" +
      "p\n\032attribution_model_settings\030\r \001(\0132L.go" +
      "ogle.ads.googleads.v5.resources.Conversi" +
      "onAction.AttributionModelSettings\022E\n\014tag" +
      "_snippets\030\016 \003(\0132*.google.ads.googleads.v" +
      "5.common.TagSnippetB\003\340A\003\022(\n\033phone_call_d" +
      "uration_seconds\030\033 \001(\003H\006\210\001\001\022\023\n\006app_id\030\034 \001" +
      "(\tH\007\210\001\001\022b\n\021mobile_app_vendor\030\021 \001(\0162B.goo" +
      "gle.ads.googleads.v5.enums.MobileAppVend" +
      "orEnum.MobileAppVendorB\003\340A\003\022d\n\021firebase_" +
      "settings\030\022 \001(\0132D.google.ads.googleads.v5" +
      ".resources.ConversionAction.FirebaseSett" +
      "ingsB\003\340A\003\022\203\001\n\"third_party_app_analytics_" +
      "settings\030\023 \001(\0132R.google.ads.googleads.v5" +
      ".resources.ConversionAction.ThirdPartyAp" +
      "pAnalyticsSettingsB\003\340A\003\032\362\001\n\030AttributionM" +
      "odelSettings\022_\n\021attribution_model\030\001 \001(\0162" +
      "D.google.ads.googleads.v5.enums.Attribut" +
      "ionModelEnum.AttributionModel\022u\n\030data_dr" +
      "iven_model_status\030\002 \001(\0162N.google.ads.goo" +
      "gleads.v5.enums.DataDrivenModelStatusEnu" +
      "m.DataDrivenModelStatusB\003\340A\003\032\277\001\n\rValueSe" +
      "ttings\022\032\n\rdefault_value\030\004 \001(\001H\000\210\001\001\022\"\n\025de" +
      "fault_currency_code\030\005 \001(\tH\001\210\001\001\022%\n\030always" +
      "_use_default_value\030\006 \001(\010H\002\210\001\001B\020\n\016_defaul" +
      "t_valueB\030\n\026_default_currency_codeB\033\n\031_al" +
      "ways_use_default_value\032l\n\020FirebaseSettin" +
      "gs\022\034\n\nevent_name\030\003 \001(\tB\003\340A\003H\000\210\001\001\022\034\n\nproj" +
      "ect_id\030\004 \001(\tB\003\340A\003H\001\210\001\001B\r\n\013_event_nameB\r\n" +
      "\013_project_id\032M\n\036ThirdPartyAppAnalyticsSe" +
      "ttings\022\034\n\nevent_name\030\002 \001(\tB\003\340A\003H\000\210\001\001B\r\n\013" +
      "_event_name:j\352Ag\n)googleads.googleapis.c" +
      "om/ConversionAction\022:customers/{customer" +
      "}/conversionActions/{conversion_action}B" +
      "\005\n\003_idB\007\n\005_nameB\021\n\017_owner_customerB \n\036_i" +
      "nclude_in_conversions_metricB%\n#_click_t" +
      "hrough_lookback_window_daysB$\n\"_view_thr" +
      "ough_lookback_window_daysB\036\n\034_phone_call" +
      "_duration_secondsB\t\n\007_app_idB\202\002\n%com.goo" +
      "gle.ads.googleads.v5.resourcesB\025Conversi" +
      "onActionProtoP\001ZJgoogle.golang.org/genpr" +
      "oto/googleapis/ads/googleads/v5/resource" +
      "s;resources\242\002\003GAA\252\002!Google.Ads.GoogleAds" +
      ".V5.Resources\312\002!Google\\Ads\\GoogleAds\\V5\\" +
      "Resources\352\002%Google::Ads::GoogleAds::V5::" +
      "Resourcesb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v5.common.TagSnippetProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.AttributionModelProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.ConversionActionCategoryProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.ConversionActionCountingTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.ConversionActionStatusProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.ConversionActionTypeProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.DataDrivenModelStatusProto.getDescriptor(),
          com.google.ads.googleads.v5.enums.MobileAppVendorProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v5_resources_ConversionAction_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v5_resources_ConversionAction_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_resources_ConversionAction_descriptor,
        new java.lang.String[] { "ResourceName", "Id", "Name", "Status", "Type", "Category", "OwnerCustomer", "IncludeInConversionsMetric", "ClickThroughLookbackWindowDays", "ViewThroughLookbackWindowDays", "ValueSettings", "CountingType", "AttributionModelSettings", "TagSnippets", "PhoneCallDurationSeconds", "AppId", "MobileAppVendor", "FirebaseSettings", "ThirdPartyAppAnalyticsSettings", "Id", "Name", "OwnerCustomer", "IncludeInConversionsMetric", "ClickThroughLookbackWindowDays", "ViewThroughLookbackWindowDays", "PhoneCallDurationSeconds", "AppId", });
    internal_static_google_ads_googleads_v5_resources_ConversionAction_AttributionModelSettings_descriptor =
      internal_static_google_ads_googleads_v5_resources_ConversionAction_descriptor.getNestedTypes().get(0);
    internal_static_google_ads_googleads_v5_resources_ConversionAction_AttributionModelSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_resources_ConversionAction_AttributionModelSettings_descriptor,
        new java.lang.String[] { "AttributionModel", "DataDrivenModelStatus", });
    internal_static_google_ads_googleads_v5_resources_ConversionAction_ValueSettings_descriptor =
      internal_static_google_ads_googleads_v5_resources_ConversionAction_descriptor.getNestedTypes().get(1);
    internal_static_google_ads_googleads_v5_resources_ConversionAction_ValueSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_resources_ConversionAction_ValueSettings_descriptor,
        new java.lang.String[] { "DefaultValue", "DefaultCurrencyCode", "AlwaysUseDefaultValue", "DefaultValue", "DefaultCurrencyCode", "AlwaysUseDefaultValue", });
    internal_static_google_ads_googleads_v5_resources_ConversionAction_FirebaseSettings_descriptor =
      internal_static_google_ads_googleads_v5_resources_ConversionAction_descriptor.getNestedTypes().get(2);
    internal_static_google_ads_googleads_v5_resources_ConversionAction_FirebaseSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_resources_ConversionAction_FirebaseSettings_descriptor,
        new java.lang.String[] { "EventName", "ProjectId", "EventName", "ProjectId", });
    internal_static_google_ads_googleads_v5_resources_ConversionAction_ThirdPartyAppAnalyticsSettings_descriptor =
      internal_static_google_ads_googleads_v5_resources_ConversionAction_descriptor.getNestedTypes().get(3);
    internal_static_google_ads_googleads_v5_resources_ConversionAction_ThirdPartyAppAnalyticsSettings_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v5_resources_ConversionAction_ThirdPartyAppAnalyticsSettings_descriptor,
        new java.lang.String[] { "EventName", "EventName", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.ads.googleads.v5.common.TagSnippetProto.getDescriptor();
    com.google.ads.googleads.v5.enums.AttributionModelProto.getDescriptor();
    com.google.ads.googleads.v5.enums.ConversionActionCategoryProto.getDescriptor();
    com.google.ads.googleads.v5.enums.ConversionActionCountingTypeProto.getDescriptor();
    com.google.ads.googleads.v5.enums.ConversionActionStatusProto.getDescriptor();
    com.google.ads.googleads.v5.enums.ConversionActionTypeProto.getDescriptor();
    com.google.ads.googleads.v5.enums.DataDrivenModelStatusProto.getDescriptor();
    com.google.ads.googleads.v5.enums.MobileAppVendorProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
