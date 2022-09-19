/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.securitycenter.v1beta1.samples;

// [START securitycenter_v1beta1_generated_securitycenterclient_getorganizationsettings_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.securitycenter.v1beta1.GetOrganizationSettingsRequest;
import com.google.cloud.securitycenter.v1beta1.OrganizationSettings;
import com.google.cloud.securitycenter.v1beta1.OrganizationSettingsName;
import com.google.cloud.securitycenter.v1beta1.SecurityCenterClient;

public class AsyncGetOrganizationSettings {

  public static void main(String[] args) throws Exception {
    asyncGetOrganizationSettings();
  }

  public static void asyncGetOrganizationSettings() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (SecurityCenterClient securityCenterClient = SecurityCenterClient.create()) {
      GetOrganizationSettingsRequest request =
          GetOrganizationSettingsRequest.newBuilder()
              .setName(OrganizationSettingsName.of("[ORGANIZATION]").toString())
              .build();
      ApiFuture<OrganizationSettings> future =
          securityCenterClient.getOrganizationSettingsCallable().futureCall(request);
      // Do something.
      OrganizationSettings response = future.get();
    }
  }
}
// [END securitycenter_v1beta1_generated_securitycenterclient_getorganizationsettings_async]
