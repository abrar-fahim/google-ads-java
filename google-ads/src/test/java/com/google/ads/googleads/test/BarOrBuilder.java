// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google-ads/src/test/proto/google/ads/googleads/test/tester.proto

package com.google.ads.googleads.test;

public interface BarOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.test.Bar)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 num = 1;</code>
   * @return The num.
   */
  long getNum();

  /**
   * <code>.google.protobuf.BoolValue nested_wrapper = 2;</code>
   * @return Whether the nestedWrapper field is set.
   */
  boolean hasNestedWrapper();
  /**
   * <code>.google.protobuf.BoolValue nested_wrapper = 2;</code>
   * @return The nestedWrapper.
   */
  com.google.protobuf.BoolValue getNestedWrapper();
  /**
   * <code>.google.protobuf.BoolValue nested_wrapper = 2;</code>
   */
  com.google.protobuf.BoolValueOrBuilder getNestedWrapperOrBuilder();

  /**
   * <code>int32 nested_presence = 3;</code>
   * @return Whether the nestedPresence field is set.
   */
  boolean hasNestedPresence();
  /**
   * <code>int32 nested_presence = 3;</code>
   * @return The nestedPresence.
   */
  int getNestedPresence();
}
