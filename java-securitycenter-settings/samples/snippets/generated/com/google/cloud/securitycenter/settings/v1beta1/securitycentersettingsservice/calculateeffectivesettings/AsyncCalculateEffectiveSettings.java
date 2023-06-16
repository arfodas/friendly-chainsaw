/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.securitycenter.settings.v1beta1.samples;

// [START securitycenter_v1beta1_generated_SecurityCenterSettingsService_CalculateEffectiveSettings_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.securitycenter.settings.v1beta1.CalculateEffectiveSettingsRequest;
import com.google.cloud.securitycenter.settings.v1beta1.SecurityCenterSettingsServiceClient;
import com.google.cloud.securitycenter.settings.v1beta1.Settings;
import com.google.cloud.securitycenter.settings.v1beta1.SettingsName;

public class AsyncCalculateEffectiveSettings {

  public static void main(String[] args) throws Exception {
    asyncCalculateEffectiveSettings();
  }

  public static void asyncCalculateEffectiveSettings() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (SecurityCenterSettingsServiceClient securityCenterSettingsServiceClient =
        SecurityCenterSettingsServiceClient.create()) {
      CalculateEffectiveSettingsRequest request =
          CalculateEffectiveSettingsRequest.newBuilder()
              .setName(SettingsName.ofOrganizationName("[ORGANIZATION]").toString())
              .build();
      ApiFuture<Settings> future =
          securityCenterSettingsServiceClient
              .calculateEffectiveSettingsCallable()
              .futureCall(request);
      // Do something.
      Settings response = future.get();
    }
  }
}
// [END securitycenter_v1beta1_generated_SecurityCenterSettingsService_CalculateEffectiveSettings_async]
