// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v6/common/policy.proto

package com.google.ads.googleads.v6.common;

public interface PolicyTopicEntryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v6.common.PolicyTopicEntry)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Policy topic this finding refers to. For example, "ALCOHOL",
   * "TRADEMARKS_IN_AD_TEXT", or "DESTINATION_NOT_WORKING". The set of possible
   * policy topics is not fixed for a particular API version and may change
   * at any time.
   * </pre>
   *
   * <code>string topic = 5;</code>
   * @return Whether the topic field is set.
   */
  boolean hasTopic();
  /**
   * <pre>
   * Policy topic this finding refers to. For example, "ALCOHOL",
   * "TRADEMARKS_IN_AD_TEXT", or "DESTINATION_NOT_WORKING". The set of possible
   * policy topics is not fixed for a particular API version and may change
   * at any time.
   * </pre>
   *
   * <code>string topic = 5;</code>
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   * <pre>
   * Policy topic this finding refers to. For example, "ALCOHOL",
   * "TRADEMARKS_IN_AD_TEXT", or "DESTINATION_NOT_WORKING". The set of possible
   * policy topics is not fixed for a particular API version and may change
   * at any time.
   * </pre>
   *
   * <code>string topic = 5;</code>
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString
      getTopicBytes();

  /**
   * <pre>
   * Describes the negative or positive effect this policy will have on serving.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.enums.PolicyTopicEntryTypeEnum.PolicyTopicEntryType type = 2;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Describes the negative or positive effect this policy will have on serving.
   * </pre>
   *
   * <code>.google.ads.googleads.v6.enums.PolicyTopicEntryTypeEnum.PolicyTopicEntryType type = 2;</code>
   * @return The type.
   */
  com.google.ads.googleads.v6.enums.PolicyTopicEntryTypeEnum.PolicyTopicEntryType getType();

  /**
   * <pre>
   * Additional information that explains policy finding
   * (e.g. the brand name for a trademark finding).
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.PolicyTopicEvidence evidences = 3;</code>
   */
  java.util.List<com.google.ads.googleads.v6.common.PolicyTopicEvidence> 
      getEvidencesList();
  /**
   * <pre>
   * Additional information that explains policy finding
   * (e.g. the brand name for a trademark finding).
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.PolicyTopicEvidence evidences = 3;</code>
   */
  com.google.ads.googleads.v6.common.PolicyTopicEvidence getEvidences(int index);
  /**
   * <pre>
   * Additional information that explains policy finding
   * (e.g. the brand name for a trademark finding).
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.PolicyTopicEvidence evidences = 3;</code>
   */
  int getEvidencesCount();
  /**
   * <pre>
   * Additional information that explains policy finding
   * (e.g. the brand name for a trademark finding).
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.PolicyTopicEvidence evidences = 3;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v6.common.PolicyTopicEvidenceOrBuilder> 
      getEvidencesOrBuilderList();
  /**
   * <pre>
   * Additional information that explains policy finding
   * (e.g. the brand name for a trademark finding).
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.PolicyTopicEvidence evidences = 3;</code>
   */
  com.google.ads.googleads.v6.common.PolicyTopicEvidenceOrBuilder getEvidencesOrBuilder(
      int index);

  /**
   * <pre>
   * Indicates how serving of this resource may be affected (e.g. not serving
   * in a country).
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.PolicyTopicConstraint constraints = 4;</code>
   */
  java.util.List<com.google.ads.googleads.v6.common.PolicyTopicConstraint> 
      getConstraintsList();
  /**
   * <pre>
   * Indicates how serving of this resource may be affected (e.g. not serving
   * in a country).
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.PolicyTopicConstraint constraints = 4;</code>
   */
  com.google.ads.googleads.v6.common.PolicyTopicConstraint getConstraints(int index);
  /**
   * <pre>
   * Indicates how serving of this resource may be affected (e.g. not serving
   * in a country).
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.PolicyTopicConstraint constraints = 4;</code>
   */
  int getConstraintsCount();
  /**
   * <pre>
   * Indicates how serving of this resource may be affected (e.g. not serving
   * in a country).
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.PolicyTopicConstraint constraints = 4;</code>
   */
  java.util.List<? extends com.google.ads.googleads.v6.common.PolicyTopicConstraintOrBuilder> 
      getConstraintsOrBuilderList();
  /**
   * <pre>
   * Indicates how serving of this resource may be affected (e.g. not serving
   * in a country).
   * </pre>
   *
   * <code>repeated .google.ads.googleads.v6.common.PolicyTopicConstraint constraints = 4;</code>
   */
  com.google.ads.googleads.v6.common.PolicyTopicConstraintOrBuilder getConstraintsOrBuilder(
      int index);
}
