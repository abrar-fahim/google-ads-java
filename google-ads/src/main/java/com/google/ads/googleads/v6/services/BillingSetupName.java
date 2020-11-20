/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package com.google.ads.googleads.v6.services;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.api.pathtemplate.PathTemplate;
import com.google.api.resourcenames.ResourceName;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

/**
 * AUTO-GENERATED DOCUMENTATION AND CLASS
 */
@javax.annotation.Generated("by GAPIC protoc plugin")
public class BillingSetupName implements ResourceName {

  private static final PathTemplate PATH_TEMPLATE =
      PathTemplate.createWithoutUrlEncoding("customers/{customer_id}/billingSetups/{billing_setup_id}");

  private volatile Map<String, String> fieldValuesMap;

  private final String customerId;
  private final String billingSetupId;

  public String getCustomerId() {
    return customerId;
  }

  public String getBillingSetupId() {
    return billingSetupId;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public Builder toBuilder() {
    return new Builder(this);
  }

  private BillingSetupName(Builder builder) {
    customerId = Preconditions.checkNotNull(builder.getCustomerId());
    billingSetupId = Preconditions.checkNotNull(builder.getBillingSetupId());
  }

  public static BillingSetupName of(String customerId, String billingSetupId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setBillingSetupId(billingSetupId)
      .build();
  }

  public static String format(String customerId, String billingSetupId) {
    return newBuilder()
      .setCustomerId(customerId)
      .setBillingSetupId(billingSetupId)
      .build()
      .toString();
  }

  public static BillingSetupName parse(String formattedString) {
    if (formattedString.isEmpty()) {
      return null;
    }
    Map<String, String> matchMap =
        PATH_TEMPLATE.validatedMatch(formattedString, "BillingSetupName.parse: formattedString not in valid format");
    return of(matchMap.get("customer_id"), matchMap.get("billing_setup_id"));
  }

  public static List<BillingSetupName> parseList(List<String> formattedStrings) {
    List<BillingSetupName> list = new ArrayList<>(formattedStrings.size());
    for (String formattedString : formattedStrings) {
      list.add(parse(formattedString));
    }
    return list;
  }

  public static List<String> toStringList(List<BillingSetupName> values) {
    List<String> list = new ArrayList<String>(values.size());
    for (BillingSetupName value : values) {
      if (value == null) {
        list.add("");
      } else {
        list.add(value.toString());
      }
    }
    return list;
  }

  public static boolean isParsableFrom(String formattedString) {
    return PATH_TEMPLATE.matches(formattedString);
  }

  public Map<String, String> getFieldValuesMap() {
    if (fieldValuesMap == null) {
      synchronized (this) {
        if (fieldValuesMap == null) {
          ImmutableMap.Builder<String, String> fieldMapBuilder = ImmutableMap.builder();
          fieldMapBuilder.put("customerId", customerId);
          fieldMapBuilder.put("billingSetupId", billingSetupId);
          fieldValuesMap = fieldMapBuilder.build();
        }
      }
    }
    return fieldValuesMap;
  }

  public String getFieldValue(String fieldName) {
    return getFieldValuesMap().get(fieldName);
  }

  @Override
  public String toString() {
    return PATH_TEMPLATE.instantiate("customer_id", customerId, "billing_setup_id", billingSetupId);
  }

  /** Builder for BillingSetupName. */
  public static class Builder {

    private String customerId;
    private String billingSetupId;

    public String getCustomerId() {
      return customerId;
    }

    public String getBillingSetupId() {
      return billingSetupId;
    }

    public Builder setCustomerId(String customerId) {
      this.customerId = customerId;
      return this;
    }

    public Builder setBillingSetupId(String billingSetupId) {
      this.billingSetupId = billingSetupId;
      return this;
    }

    private Builder() {
    }

    private Builder(BillingSetupName billingSetupName) {
      customerId = billingSetupName.customerId;
      billingSetupId = billingSetupName.billingSetupId;
    }

    public BillingSetupName build() {
      return new BillingSetupName(this);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof BillingSetupName) {
      BillingSetupName that = (BillingSetupName) o;
      return (this.customerId.equals(that.customerId))
          && (this.billingSetupId.equals(that.billingSetupId));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= customerId.hashCode();
    h *= 1000003;
    h ^= billingSetupId.hashCode();
    return h;
  }
}

