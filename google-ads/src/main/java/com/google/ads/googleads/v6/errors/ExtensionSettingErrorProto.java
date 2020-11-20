// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/errors/extension_setting_error.proto

package com.google.ads.googleads.v6.errors;

public final class ExtensionSettingErrorProto {
  private ExtensionSettingErrorProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v6_errors_ExtensionSettingErrorEnum_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v6_errors_ExtensionSettingErrorEnum_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n<google/ads/googleads/v6/errors/extensi" +
      "on_setting_error.proto\022\036google.ads.googl" +
      "eads.v6.errors\032\034google/api/annotations.p" +
      "roto\"\256\024\n\031ExtensionSettingErrorEnum\"\220\024\n\025E" +
      "xtensionSettingError\022\017\n\013UNSPECIFIED\020\000\022\013\n" +
      "\007UNKNOWN\020\001\022\027\n\023EXTENSIONS_REQUIRED\020\002\022%\n!F" +
      "EED_TYPE_EXTENSION_TYPE_MISMATCH\020\003\022\025\n\021IN" +
      "VALID_FEED_TYPE\020\004\0224\n0INVALID_FEED_TYPE_F" +
      "OR_CUSTOMER_EXTENSION_SETTING\020\005\022%\n!CANNO" +
      "T_CHANGE_FEED_ITEM_ON_CREATE\020\006\022)\n%CANNOT" +
      "_UPDATE_NEWLY_CREATED_EXTENSION\020\007\0223\n/NO_" +
      "EXISTING_AD_GROUP_EXTENSION_SETTING_FOR_" +
      "TYPE\020\010\0223\n/NO_EXISTING_CAMPAIGN_EXTENSION" +
      "_SETTING_FOR_TYPE\020\t\0223\n/NO_EXISTING_CUSTO" +
      "MER_EXTENSION_SETTING_FOR_TYPE\020\n\022-\n)AD_G" +
      "ROUP_EXTENSION_SETTING_ALREADY_EXISTS\020\013\022" +
      "-\n)CAMPAIGN_EXTENSION_SETTING_ALREADY_EX" +
      "ISTS\020\014\022-\n)CUSTOMER_EXTENSION_SETTING_ALR" +
      "EADY_EXISTS\020\r\0225\n1AD_GROUP_FEED_ALREADY_E" +
      "XISTS_FOR_PLACEHOLDER_TYPE\020\016\0225\n1CAMPAIGN" +
      "_FEED_ALREADY_EXISTS_FOR_PLACEHOLDER_TYP" +
      "E\020\017\0225\n1CUSTOMER_FEED_ALREADY_EXISTS_FOR_" +
      "PLACEHOLDER_TYPE\020\020\022\026\n\022VALUE_OUT_OF_RANGE" +
      "\020\021\022$\n CANNOT_SET_FIELD_WITH_FINAL_URLS\020\022" +
      "\022\026\n\022FINAL_URLS_NOT_SET\020\023\022\030\n\024INVALID_PHON" +
      "E_NUMBER\020\024\022*\n&PHONE_NUMBER_NOT_SUPPORTED" +
      "_FOR_COUNTRY\020\025\022-\n)CARRIER_SPECIFIC_SHORT" +
      "_NUMBER_NOT_ALLOWED\020\026\022#\n\037PREMIUM_RATE_NU" +
      "MBER_NOT_ALLOWED\020\027\022\032\n\026DISALLOWED_NUMBER_" +
      "TYPE\020\030\022(\n$INVALID_DOMESTIC_PHONE_NUMBER_" +
      "FORMAT\020\031\022#\n\037VANITY_PHONE_NUMBER_NOT_ALLO" +
      "WED\020\032\022\030\n\024INVALID_COUNTRY_CODE\020\033\022#\n\037INVAL" +
      "ID_CALL_CONVERSION_TYPE_ID\020\034\022.\n*CUSTOMER" +
      "_NOT_IN_ALLOWLIST_FOR_CALLTRACKING\020E\022*\n&" +
      "CALLTRACKING_NOT_SUPPORTED_FOR_COUNTRY\020\036" +
      "\022\022\n\016INVALID_APP_ID\020\037\022&\n\"QUOTES_IN_REVIEW" +
      "_EXTENSION_SNIPPET\020 \022\'\n#HYPHENS_IN_REVIE" +
      "W_EXTENSION_SNIPPET\020!\022(\n$REVIEW_EXTENSIO" +
      "N_SOURCE_NOT_ELIGIBLE\020\"\022(\n$SOURCE_NAME_I" +
      "N_REVIEW_EXTENSION_TEXT\020#\022\021\n\rMISSING_FIE" +
      "LD\020$\022\037\n\033INCONSISTENT_CURRENCY_CODES\020%\022*\n" +
      "&PRICE_EXTENSION_HAS_DUPLICATED_HEADERS\020" +
      "&\0224\n0PRICE_ITEM_HAS_DUPLICATED_HEADER_AN" +
      "D_DESCRIPTION\020\'\022%\n!PRICE_EXTENSION_HAS_T" +
      "OO_FEW_ITEMS\020(\022&\n\"PRICE_EXTENSION_HAS_TO" +
      "O_MANY_ITEMS\020)\022\025\n\021UNSUPPORTED_VALUE\020*\022\035\n" +
      "\031INVALID_DEVICE_PREFERENCE\020+\022\030\n\024INVALID_" +
      "SCHEDULE_END\020-\022*\n&DATE_TIME_MUST_BE_IN_A" +
      "CCOUNT_TIME_ZONE\020/\022%\n!OVERLAPPING_SCHEDU" +
      "LES_NOT_ALLOWED\0200\022 \n\034SCHEDULE_END_NOT_AF" +
      "TER_START\0201\022\036\n\032TOO_MANY_SCHEDULES_PER_DA" +
      "Y\0202\022&\n\"DUPLICATE_EXTENSION_FEED_ITEM_EDI" +
      "T\0203\022\033\n\027INVALID_SNIPPETS_HEADER\0204\022<\n8PHON" +
      "E_NUMBER_NOT_SUPPORTED_WITH_CALLTRACKING" +
      "_FOR_COUNTRY\0205\022\037\n\033CAMPAIGN_TARGETING_MIS" +
      "MATCH\0206\022\"\n\036CANNOT_OPERATE_ON_REMOVED_FEE" +
      "D\0207\022\033\n\027EXTENSION_TYPE_REQUIRED\0208\022-\n)INCO" +
      "MPATIBLE_UNDERLYING_MATCHING_FUNCTION\0209\022" +
      "\035\n\031START_DATE_AFTER_END_DATE\020:\022\030\n\024INVALI" +
      "D_PRICE_FORMAT\020;\022\032\n\026PROMOTION_INVALID_TI" +
      "ME\020<\022<\n8PROMOTION_CANNOT_SET_PERCENT_DIS" +
      "COUNT_AND_MONEY_DISCOUNT\020=\022>\n:PROMOTION_" +
      "CANNOT_SET_PROMOTION_CODE_AND_ORDERS_OVE" +
      "R_AMOUNT\020>\022%\n!TOO_MANY_DECIMAL_PLACES_SP" +
      "ECIFIED\020?\022\031\n\025INVALID_LANGUAGE_CODE\020@\022\030\n\024" +
      "UNSUPPORTED_LANGUAGE\020A\0220\n,CUSTOMER_CONSE" +
      "NT_FOR_CALL_RECORDING_REQUIRED\020B\022&\n\"EXTE" +
      "NSION_SETTING_UPDATE_IS_A_NOOP\020C\022\023\n\017DISA" +
      "LLOWED_TEXT\020DB\365\001\n\"com.google.ads.googlea" +
      "ds.v6.errorsB\032ExtensionSettingErrorProto" +
      "P\001ZDgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v6/errors;errors\242\002\003GAA\252\002" +
      "\036Google.Ads.GoogleAds.V6.Errors\312\002\036Google" +
      "\\Ads\\GoogleAds\\V6\\Errors\352\002\"Google::Ads::" +
      "GoogleAds::V6::Errorsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_google_ads_googleads_v6_errors_ExtensionSettingErrorEnum_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v6_errors_ExtensionSettingErrorEnum_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v6_errors_ExtensionSettingErrorEnum_descriptor,
        new java.lang.String[] { });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
