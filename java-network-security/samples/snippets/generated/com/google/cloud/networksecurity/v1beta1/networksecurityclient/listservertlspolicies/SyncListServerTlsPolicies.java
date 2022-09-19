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

package com.google.cloud.networksecurity.v1beta1.samples;

// [START networksecurity_v1beta1_generated_networksecurityclient_listservertlspolicies_sync]
import com.google.cloud.networksecurity.v1beta1.ListServerTlsPoliciesRequest;
import com.google.cloud.networksecurity.v1beta1.LocationName;
import com.google.cloud.networksecurity.v1beta1.NetworkSecurityClient;
import com.google.cloud.networksecurity.v1beta1.ServerTlsPolicy;

public class SyncListServerTlsPolicies {

  public static void main(String[] args) throws Exception {
    syncListServerTlsPolicies();
  }

  public static void syncListServerTlsPolicies() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (NetworkSecurityClient networkSecurityClient = NetworkSecurityClient.create()) {
      ListServerTlsPoliciesRequest request =
          ListServerTlsPoliciesRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      for (ServerTlsPolicy element :
          networkSecurityClient.listServerTlsPolicies(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END networksecurity_v1beta1_generated_networksecurityclient_listservertlspolicies_sync]
