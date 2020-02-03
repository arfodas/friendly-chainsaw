/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A client to Cloud Billing API.
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>================== CloudBillingClient ==================
 *
 * <p>Service Description: Retrieves GCP Console billing accounts and associates them with projects.
 *
 * <p>Sample for CloudBillingClient:
 *
 * <pre>
 * <code>
 * try (CloudBillingClient cloudBillingClient = CloudBillingClient.create()) {
 *   BillingAccountName name = BillingAccountName.of("[BILLING_ACCOUNT]");
 *   BillingAccount response = cloudBillingClient.getBillingAccount(name);
 * }
 * </code>
 * </pre>
 *
 * ================== CloudCatalogClient ==================
 *
 * <p>Service Description: A catalog of Google Cloud Platform services and SKUs. Provides pricing
 * information and metadata on Google Cloud Platform services and SKUs.
 *
 * <p>Sample for CloudCatalogClient:
 *
 * <pre>
 * <code>
 * try (CloudCatalogClient cloudCatalogClient = CloudCatalogClient.create()) {
 *
 *   ListServicesPagedResponse response = cloudCatalogClient.listServices();
 * }
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
package com.google.cloud.billing.v1;

import javax.annotation.Generated;
