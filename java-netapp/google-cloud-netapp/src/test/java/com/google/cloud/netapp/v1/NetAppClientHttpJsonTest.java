/*
 * Copyright 2024 Google LLC
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

package com.google.cloud.netapp.v1;

import static com.google.cloud.netapp.v1.NetAppClient.ListActiveDirectoriesPagedResponse;
import static com.google.cloud.netapp.v1.NetAppClient.ListBackupPoliciesPagedResponse;
import static com.google.cloud.netapp.v1.NetAppClient.ListBackupVaultsPagedResponse;
import static com.google.cloud.netapp.v1.NetAppClient.ListBackupsPagedResponse;
import static com.google.cloud.netapp.v1.NetAppClient.ListKmsConfigsPagedResponse;
import static com.google.cloud.netapp.v1.NetAppClient.ListLocationsPagedResponse;
import static com.google.cloud.netapp.v1.NetAppClient.ListReplicationsPagedResponse;
import static com.google.cloud.netapp.v1.NetAppClient.ListSnapshotsPagedResponse;
import static com.google.cloud.netapp.v1.NetAppClient.ListStoragePoolsPagedResponse;
import static com.google.cloud.netapp.v1.NetAppClient.ListVolumesPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.cloud.netapp.v1.stub.HttpJsonNetAppStub;
import com.google.common.collect.Lists;
import com.google.longrunning.Operation;
import com.google.protobuf.Any;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import com.google.protobuf.Timestamp;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class NetAppClientHttpJsonTest {
  private static MockHttpService mockService;
  private static NetAppClient client;

  @BeforeClass
  public static void startStaticServer() throws IOException {
    mockService =
        new MockHttpService(
            HttpJsonNetAppStub.getMethodDescriptors(), NetAppSettings.getDefaultEndpoint());
    NetAppSettings settings =
        NetAppSettings.newHttpJsonBuilder()
            .setTransportChannelProvider(
                NetAppSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = NetAppClient.create(settings);
  }

  @AfterClass
  public static void stopServer() {
    client.close();
  }

  @Before
  public void setUp() {}

  @After
  public void tearDown() throws Exception {
    mockService.reset();
  }

  @Test
  public void listStoragePoolsTest() throws Exception {
    StoragePool responsesElement = StoragePool.newBuilder().build();
    ListStoragePoolsResponse expectedResponse =
        ListStoragePoolsResponse.newBuilder()
            .setNextPageToken("")
            .addAllStoragePools(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListStoragePoolsPagedResponse pagedListResponse = client.listStoragePools(parent);

    List<StoragePool> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getStoragePoolsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listStoragePoolsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listStoragePools(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listStoragePoolsTest2() throws Exception {
    StoragePool responsesElement = StoragePool.newBuilder().build();
    ListStoragePoolsResponse expectedResponse =
        ListStoragePoolsResponse.newBuilder()
            .setNextPageToken("")
            .addAllStoragePools(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";

    ListStoragePoolsPagedResponse pagedListResponse = client.listStoragePools(parent);

    List<StoragePool> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getStoragePoolsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listStoragePoolsExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      client.listStoragePools(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createStoragePoolTest() throws Exception {
    StoragePool expectedResponse =
        StoragePool.newBuilder()
            .setName(StoragePoolName.of("[PROJECT]", "[LOCATION]", "[STORAGE_POOL]").toString())
            .setServiceLevel(ServiceLevel.forNumber(0))
            .setCapacityGib(498394811)
            .setVolumeCapacityGib(643777472)
            .setVolumeCount(-1362665558)
            .setStateDetails("stateDetails1730982001")
            .setCreateTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .putAllLabels(new HashMap<String, String>())
            .setNetwork("network1843485230")
            .setActiveDirectory(
                ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]").toString())
            .setKmsConfig(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
            .setLdapEnabled(true)
            .setPsaRange("psaRange-534274785")
            .setEncryptionType(EncryptionType.forNumber(0))
            .setGlobalAccessAllowed(true)
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createStoragePoolTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    StoragePool storagePool = StoragePool.newBuilder().build();
    String storagePoolId = "storagePoolId1617506482";

    StoragePool actualResponse =
        client.createStoragePoolAsync(parent, storagePool, storagePoolId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createStoragePoolExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      StoragePool storagePool = StoragePool.newBuilder().build();
      String storagePoolId = "storagePoolId1617506482";
      client.createStoragePoolAsync(parent, storagePool, storagePoolId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void createStoragePoolTest2() throws Exception {
    StoragePool expectedResponse =
        StoragePool.newBuilder()
            .setName(StoragePoolName.of("[PROJECT]", "[LOCATION]", "[STORAGE_POOL]").toString())
            .setServiceLevel(ServiceLevel.forNumber(0))
            .setCapacityGib(498394811)
            .setVolumeCapacityGib(643777472)
            .setVolumeCount(-1362665558)
            .setStateDetails("stateDetails1730982001")
            .setCreateTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .putAllLabels(new HashMap<String, String>())
            .setNetwork("network1843485230")
            .setActiveDirectory(
                ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]").toString())
            .setKmsConfig(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
            .setLdapEnabled(true)
            .setPsaRange("psaRange-534274785")
            .setEncryptionType(EncryptionType.forNumber(0))
            .setGlobalAccessAllowed(true)
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createStoragePoolTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String parent = "projects/project-5833/locations/location-5833";
    StoragePool storagePool = StoragePool.newBuilder().build();
    String storagePoolId = "storagePoolId1617506482";

    StoragePool actualResponse =
        client.createStoragePoolAsync(parent, storagePool, storagePoolId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createStoragePoolExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      StoragePool storagePool = StoragePool.newBuilder().build();
      String storagePoolId = "storagePoolId1617506482";
      client.createStoragePoolAsync(parent, storagePool, storagePoolId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void getStoragePoolTest() throws Exception {
    StoragePool expectedResponse =
        StoragePool.newBuilder()
            .setName(StoragePoolName.of("[PROJECT]", "[LOCATION]", "[STORAGE_POOL]").toString())
            .setServiceLevel(ServiceLevel.forNumber(0))
            .setCapacityGib(498394811)
            .setVolumeCapacityGib(643777472)
            .setVolumeCount(-1362665558)
            .setStateDetails("stateDetails1730982001")
            .setCreateTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .putAllLabels(new HashMap<String, String>())
            .setNetwork("network1843485230")
            .setActiveDirectory(
                ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]").toString())
            .setKmsConfig(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
            .setLdapEnabled(true)
            .setPsaRange("psaRange-534274785")
            .setEncryptionType(EncryptionType.forNumber(0))
            .setGlobalAccessAllowed(true)
            .build();
    mockService.addResponse(expectedResponse);

    StoragePoolName name = StoragePoolName.of("[PROJECT]", "[LOCATION]", "[STORAGE_POOL]");

    StoragePool actualResponse = client.getStoragePool(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getStoragePoolExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      StoragePoolName name = StoragePoolName.of("[PROJECT]", "[LOCATION]", "[STORAGE_POOL]");
      client.getStoragePool(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getStoragePoolTest2() throws Exception {
    StoragePool expectedResponse =
        StoragePool.newBuilder()
            .setName(StoragePoolName.of("[PROJECT]", "[LOCATION]", "[STORAGE_POOL]").toString())
            .setServiceLevel(ServiceLevel.forNumber(0))
            .setCapacityGib(498394811)
            .setVolumeCapacityGib(643777472)
            .setVolumeCount(-1362665558)
            .setStateDetails("stateDetails1730982001")
            .setCreateTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .putAllLabels(new HashMap<String, String>())
            .setNetwork("network1843485230")
            .setActiveDirectory(
                ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]").toString())
            .setKmsConfig(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
            .setLdapEnabled(true)
            .setPsaRange("psaRange-534274785")
            .setEncryptionType(EncryptionType.forNumber(0))
            .setGlobalAccessAllowed(true)
            .build();
    mockService.addResponse(expectedResponse);

    String name = "projects/project-1868/locations/location-1868/storagePools/storagePool-1868";

    StoragePool actualResponse = client.getStoragePool(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getStoragePoolExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-1868/locations/location-1868/storagePools/storagePool-1868";
      client.getStoragePool(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateStoragePoolTest() throws Exception {
    StoragePool expectedResponse =
        StoragePool.newBuilder()
            .setName(StoragePoolName.of("[PROJECT]", "[LOCATION]", "[STORAGE_POOL]").toString())
            .setServiceLevel(ServiceLevel.forNumber(0))
            .setCapacityGib(498394811)
            .setVolumeCapacityGib(643777472)
            .setVolumeCount(-1362665558)
            .setStateDetails("stateDetails1730982001")
            .setCreateTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .putAllLabels(new HashMap<String, String>())
            .setNetwork("network1843485230")
            .setActiveDirectory(
                ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]").toString())
            .setKmsConfig(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
            .setLdapEnabled(true)
            .setPsaRange("psaRange-534274785")
            .setEncryptionType(EncryptionType.forNumber(0))
            .setGlobalAccessAllowed(true)
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateStoragePoolTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    StoragePool storagePool =
        StoragePool.newBuilder()
            .setName(StoragePoolName.of("[PROJECT]", "[LOCATION]", "[STORAGE_POOL]").toString())
            .setServiceLevel(ServiceLevel.forNumber(0))
            .setCapacityGib(498394811)
            .setVolumeCapacityGib(643777472)
            .setVolumeCount(-1362665558)
            .setStateDetails("stateDetails1730982001")
            .setCreateTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .putAllLabels(new HashMap<String, String>())
            .setNetwork("network1843485230")
            .setActiveDirectory(
                ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]").toString())
            .setKmsConfig(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
            .setLdapEnabled(true)
            .setPsaRange("psaRange-534274785")
            .setEncryptionType(EncryptionType.forNumber(0))
            .setGlobalAccessAllowed(true)
            .build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    StoragePool actualResponse = client.updateStoragePoolAsync(storagePool, updateMask).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void updateStoragePoolExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      StoragePool storagePool =
          StoragePool.newBuilder()
              .setName(StoragePoolName.of("[PROJECT]", "[LOCATION]", "[STORAGE_POOL]").toString())
              .setServiceLevel(ServiceLevel.forNumber(0))
              .setCapacityGib(498394811)
              .setVolumeCapacityGib(643777472)
              .setVolumeCount(-1362665558)
              .setStateDetails("stateDetails1730982001")
              .setCreateTime(Timestamp.newBuilder().build())
              .setDescription("description-1724546052")
              .putAllLabels(new HashMap<String, String>())
              .setNetwork("network1843485230")
              .setActiveDirectory(
                  ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]")
                      .toString())
              .setKmsConfig(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
              .setLdapEnabled(true)
              .setPsaRange("psaRange-534274785")
              .setEncryptionType(EncryptionType.forNumber(0))
              .setGlobalAccessAllowed(true)
              .build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateStoragePoolAsync(storagePool, updateMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteStoragePoolTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteStoragePoolTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    StoragePoolName name = StoragePoolName.of("[PROJECT]", "[LOCATION]", "[STORAGE_POOL]");

    client.deleteStoragePoolAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteStoragePoolExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      StoragePoolName name = StoragePoolName.of("[PROJECT]", "[LOCATION]", "[STORAGE_POOL]");
      client.deleteStoragePoolAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteStoragePoolTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteStoragePoolTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name = "projects/project-1868/locations/location-1868/storagePools/storagePool-1868";

    client.deleteStoragePoolAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteStoragePoolExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-1868/locations/location-1868/storagePools/storagePool-1868";
      client.deleteStoragePoolAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void listVolumesTest() throws Exception {
    Volume responsesElement = Volume.newBuilder().build();
    ListVolumesResponse expectedResponse =
        ListVolumesResponse.newBuilder()
            .setNextPageToken("")
            .addAllVolumes(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListVolumesPagedResponse pagedListResponse = client.listVolumes(parent);

    List<Volume> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getVolumesList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listVolumesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listVolumes(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listVolumesTest2() throws Exception {
    Volume responsesElement = Volume.newBuilder().build();
    ListVolumesResponse expectedResponse =
        ListVolumesResponse.newBuilder()
            .setNextPageToken("")
            .addAllVolumes(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";

    ListVolumesPagedResponse pagedListResponse = client.listVolumes(parent);

    List<Volume> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getVolumesList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listVolumesExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      client.listVolumes(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getVolumeTest() throws Exception {
    Volume expectedResponse =
        Volume.newBuilder()
            .setName(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .setStateDetails("stateDetails1730982001")
            .setCreateTime(Timestamp.newBuilder().build())
            .setShareName("shareName-1582221558")
            .setPsaRange("psaRange-534274785")
            .setStoragePool(
                StoragePoolName.of("[PROJECT]", "[LOCATION]", "[STORAGE_POOL]").toString())
            .setNetwork("network1843485230")
            .setServiceLevel(ServiceLevel.forNumber(0))
            .setCapacityGib(498394811)
            .setExportPolicy(ExportPolicy.newBuilder().build())
            .addAllProtocols(new ArrayList<Protocols>())
            .addAllSmbSettings(new ArrayList<SMBSettings>())
            .addAllMountOptions(new ArrayList<MountOption>())
            .setUnixPermissions("unixPermissions882114012")
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setSnapshotPolicy(SnapshotPolicy.newBuilder().build())
            .setSnapReserve(-1429587641)
            .setSnapshotDirectory(true)
            .setUsedGib(-279083970)
            .setSecurityStyle(SecurityStyle.forNumber(0))
            .setKerberosEnabled(true)
            .setLdapEnabled(true)
            .setActiveDirectory(
                ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]").toString())
            .setRestoreParameters(RestoreParameters.newBuilder().build())
            .setKmsConfig(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
            .setEncryptionType(EncryptionType.forNumber(0))
            .setHasReplication(true)
            .setBackupConfig(BackupConfig.newBuilder().build())
            .addAllRestrictedActions(new ArrayList<RestrictedAction>())
            .setTieringPolicy(TieringPolicy.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    VolumeName name = VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]");

    Volume actualResponse = client.getVolume(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getVolumeExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      VolumeName name = VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]");
      client.getVolume(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getVolumeTest2() throws Exception {
    Volume expectedResponse =
        Volume.newBuilder()
            .setName(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .setStateDetails("stateDetails1730982001")
            .setCreateTime(Timestamp.newBuilder().build())
            .setShareName("shareName-1582221558")
            .setPsaRange("psaRange-534274785")
            .setStoragePool(
                StoragePoolName.of("[PROJECT]", "[LOCATION]", "[STORAGE_POOL]").toString())
            .setNetwork("network1843485230")
            .setServiceLevel(ServiceLevel.forNumber(0))
            .setCapacityGib(498394811)
            .setExportPolicy(ExportPolicy.newBuilder().build())
            .addAllProtocols(new ArrayList<Protocols>())
            .addAllSmbSettings(new ArrayList<SMBSettings>())
            .addAllMountOptions(new ArrayList<MountOption>())
            .setUnixPermissions("unixPermissions882114012")
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setSnapshotPolicy(SnapshotPolicy.newBuilder().build())
            .setSnapReserve(-1429587641)
            .setSnapshotDirectory(true)
            .setUsedGib(-279083970)
            .setSecurityStyle(SecurityStyle.forNumber(0))
            .setKerberosEnabled(true)
            .setLdapEnabled(true)
            .setActiveDirectory(
                ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]").toString())
            .setRestoreParameters(RestoreParameters.newBuilder().build())
            .setKmsConfig(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
            .setEncryptionType(EncryptionType.forNumber(0))
            .setHasReplication(true)
            .setBackupConfig(BackupConfig.newBuilder().build())
            .addAllRestrictedActions(new ArrayList<RestrictedAction>())
            .setTieringPolicy(TieringPolicy.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    String name = "projects/project-4193/locations/location-4193/volumes/volume-4193";

    Volume actualResponse = client.getVolume(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getVolumeExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-4193/locations/location-4193/volumes/volume-4193";
      client.getVolume(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createVolumeTest() throws Exception {
    Volume expectedResponse =
        Volume.newBuilder()
            .setName(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .setStateDetails("stateDetails1730982001")
            .setCreateTime(Timestamp.newBuilder().build())
            .setShareName("shareName-1582221558")
            .setPsaRange("psaRange-534274785")
            .setStoragePool(
                StoragePoolName.of("[PROJECT]", "[LOCATION]", "[STORAGE_POOL]").toString())
            .setNetwork("network1843485230")
            .setServiceLevel(ServiceLevel.forNumber(0))
            .setCapacityGib(498394811)
            .setExportPolicy(ExportPolicy.newBuilder().build())
            .addAllProtocols(new ArrayList<Protocols>())
            .addAllSmbSettings(new ArrayList<SMBSettings>())
            .addAllMountOptions(new ArrayList<MountOption>())
            .setUnixPermissions("unixPermissions882114012")
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setSnapshotPolicy(SnapshotPolicy.newBuilder().build())
            .setSnapReserve(-1429587641)
            .setSnapshotDirectory(true)
            .setUsedGib(-279083970)
            .setSecurityStyle(SecurityStyle.forNumber(0))
            .setKerberosEnabled(true)
            .setLdapEnabled(true)
            .setActiveDirectory(
                ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]").toString())
            .setRestoreParameters(RestoreParameters.newBuilder().build())
            .setKmsConfig(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
            .setEncryptionType(EncryptionType.forNumber(0))
            .setHasReplication(true)
            .setBackupConfig(BackupConfig.newBuilder().build())
            .addAllRestrictedActions(new ArrayList<RestrictedAction>())
            .setTieringPolicy(TieringPolicy.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createVolumeTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    Volume volume = Volume.newBuilder().build();
    String volumeId = "volumeId-1869770283";

    Volume actualResponse = client.createVolumeAsync(parent, volume, volumeId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createVolumeExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      Volume volume = Volume.newBuilder().build();
      String volumeId = "volumeId-1869770283";
      client.createVolumeAsync(parent, volume, volumeId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void createVolumeTest2() throws Exception {
    Volume expectedResponse =
        Volume.newBuilder()
            .setName(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .setStateDetails("stateDetails1730982001")
            .setCreateTime(Timestamp.newBuilder().build())
            .setShareName("shareName-1582221558")
            .setPsaRange("psaRange-534274785")
            .setStoragePool(
                StoragePoolName.of("[PROJECT]", "[LOCATION]", "[STORAGE_POOL]").toString())
            .setNetwork("network1843485230")
            .setServiceLevel(ServiceLevel.forNumber(0))
            .setCapacityGib(498394811)
            .setExportPolicy(ExportPolicy.newBuilder().build())
            .addAllProtocols(new ArrayList<Protocols>())
            .addAllSmbSettings(new ArrayList<SMBSettings>())
            .addAllMountOptions(new ArrayList<MountOption>())
            .setUnixPermissions("unixPermissions882114012")
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setSnapshotPolicy(SnapshotPolicy.newBuilder().build())
            .setSnapReserve(-1429587641)
            .setSnapshotDirectory(true)
            .setUsedGib(-279083970)
            .setSecurityStyle(SecurityStyle.forNumber(0))
            .setKerberosEnabled(true)
            .setLdapEnabled(true)
            .setActiveDirectory(
                ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]").toString())
            .setRestoreParameters(RestoreParameters.newBuilder().build())
            .setKmsConfig(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
            .setEncryptionType(EncryptionType.forNumber(0))
            .setHasReplication(true)
            .setBackupConfig(BackupConfig.newBuilder().build())
            .addAllRestrictedActions(new ArrayList<RestrictedAction>())
            .setTieringPolicy(TieringPolicy.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createVolumeTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String parent = "projects/project-5833/locations/location-5833";
    Volume volume = Volume.newBuilder().build();
    String volumeId = "volumeId-1869770283";

    Volume actualResponse = client.createVolumeAsync(parent, volume, volumeId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createVolumeExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      Volume volume = Volume.newBuilder().build();
      String volumeId = "volumeId-1869770283";
      client.createVolumeAsync(parent, volume, volumeId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void updateVolumeTest() throws Exception {
    Volume expectedResponse =
        Volume.newBuilder()
            .setName(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .setStateDetails("stateDetails1730982001")
            .setCreateTime(Timestamp.newBuilder().build())
            .setShareName("shareName-1582221558")
            .setPsaRange("psaRange-534274785")
            .setStoragePool(
                StoragePoolName.of("[PROJECT]", "[LOCATION]", "[STORAGE_POOL]").toString())
            .setNetwork("network1843485230")
            .setServiceLevel(ServiceLevel.forNumber(0))
            .setCapacityGib(498394811)
            .setExportPolicy(ExportPolicy.newBuilder().build())
            .addAllProtocols(new ArrayList<Protocols>())
            .addAllSmbSettings(new ArrayList<SMBSettings>())
            .addAllMountOptions(new ArrayList<MountOption>())
            .setUnixPermissions("unixPermissions882114012")
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setSnapshotPolicy(SnapshotPolicy.newBuilder().build())
            .setSnapReserve(-1429587641)
            .setSnapshotDirectory(true)
            .setUsedGib(-279083970)
            .setSecurityStyle(SecurityStyle.forNumber(0))
            .setKerberosEnabled(true)
            .setLdapEnabled(true)
            .setActiveDirectory(
                ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]").toString())
            .setRestoreParameters(RestoreParameters.newBuilder().build())
            .setKmsConfig(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
            .setEncryptionType(EncryptionType.forNumber(0))
            .setHasReplication(true)
            .setBackupConfig(BackupConfig.newBuilder().build())
            .addAllRestrictedActions(new ArrayList<RestrictedAction>())
            .setTieringPolicy(TieringPolicy.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateVolumeTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    Volume volume =
        Volume.newBuilder()
            .setName(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .setStateDetails("stateDetails1730982001")
            .setCreateTime(Timestamp.newBuilder().build())
            .setShareName("shareName-1582221558")
            .setPsaRange("psaRange-534274785")
            .setStoragePool(
                StoragePoolName.of("[PROJECT]", "[LOCATION]", "[STORAGE_POOL]").toString())
            .setNetwork("network1843485230")
            .setServiceLevel(ServiceLevel.forNumber(0))
            .setCapacityGib(498394811)
            .setExportPolicy(ExportPolicy.newBuilder().build())
            .addAllProtocols(new ArrayList<Protocols>())
            .addAllSmbSettings(new ArrayList<SMBSettings>())
            .addAllMountOptions(new ArrayList<MountOption>())
            .setUnixPermissions("unixPermissions882114012")
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setSnapshotPolicy(SnapshotPolicy.newBuilder().build())
            .setSnapReserve(-1429587641)
            .setSnapshotDirectory(true)
            .setUsedGib(-279083970)
            .setSecurityStyle(SecurityStyle.forNumber(0))
            .setKerberosEnabled(true)
            .setLdapEnabled(true)
            .setActiveDirectory(
                ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]").toString())
            .setRestoreParameters(RestoreParameters.newBuilder().build())
            .setKmsConfig(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
            .setEncryptionType(EncryptionType.forNumber(0))
            .setHasReplication(true)
            .setBackupConfig(BackupConfig.newBuilder().build())
            .addAllRestrictedActions(new ArrayList<RestrictedAction>())
            .setTieringPolicy(TieringPolicy.newBuilder().build())
            .build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Volume actualResponse = client.updateVolumeAsync(volume, updateMask).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void updateVolumeExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      Volume volume =
          Volume.newBuilder()
              .setName(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
              .setStateDetails("stateDetails1730982001")
              .setCreateTime(Timestamp.newBuilder().build())
              .setShareName("shareName-1582221558")
              .setPsaRange("psaRange-534274785")
              .setStoragePool(
                  StoragePoolName.of("[PROJECT]", "[LOCATION]", "[STORAGE_POOL]").toString())
              .setNetwork("network1843485230")
              .setServiceLevel(ServiceLevel.forNumber(0))
              .setCapacityGib(498394811)
              .setExportPolicy(ExportPolicy.newBuilder().build())
              .addAllProtocols(new ArrayList<Protocols>())
              .addAllSmbSettings(new ArrayList<SMBSettings>())
              .addAllMountOptions(new ArrayList<MountOption>())
              .setUnixPermissions("unixPermissions882114012")
              .putAllLabels(new HashMap<String, String>())
              .setDescription("description-1724546052")
              .setSnapshotPolicy(SnapshotPolicy.newBuilder().build())
              .setSnapReserve(-1429587641)
              .setSnapshotDirectory(true)
              .setUsedGib(-279083970)
              .setSecurityStyle(SecurityStyle.forNumber(0))
              .setKerberosEnabled(true)
              .setLdapEnabled(true)
              .setActiveDirectory(
                  ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]")
                      .toString())
              .setRestoreParameters(RestoreParameters.newBuilder().build())
              .setKmsConfig(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
              .setEncryptionType(EncryptionType.forNumber(0))
              .setHasReplication(true)
              .setBackupConfig(BackupConfig.newBuilder().build())
              .addAllRestrictedActions(new ArrayList<RestrictedAction>())
              .setTieringPolicy(TieringPolicy.newBuilder().build())
              .build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateVolumeAsync(volume, updateMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteVolumeTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteVolumeTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    VolumeName name = VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]");

    client.deleteVolumeAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteVolumeExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      VolumeName name = VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]");
      client.deleteVolumeAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteVolumeTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteVolumeTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name = "projects/project-4193/locations/location-4193/volumes/volume-4193";

    client.deleteVolumeAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteVolumeExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-4193/locations/location-4193/volumes/volume-4193";
      client.deleteVolumeAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void revertVolumeTest() throws Exception {
    Volume expectedResponse =
        Volume.newBuilder()
            .setName(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .setStateDetails("stateDetails1730982001")
            .setCreateTime(Timestamp.newBuilder().build())
            .setShareName("shareName-1582221558")
            .setPsaRange("psaRange-534274785")
            .setStoragePool(
                StoragePoolName.of("[PROJECT]", "[LOCATION]", "[STORAGE_POOL]").toString())
            .setNetwork("network1843485230")
            .setServiceLevel(ServiceLevel.forNumber(0))
            .setCapacityGib(498394811)
            .setExportPolicy(ExportPolicy.newBuilder().build())
            .addAllProtocols(new ArrayList<Protocols>())
            .addAllSmbSettings(new ArrayList<SMBSettings>())
            .addAllMountOptions(new ArrayList<MountOption>())
            .setUnixPermissions("unixPermissions882114012")
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setSnapshotPolicy(SnapshotPolicy.newBuilder().build())
            .setSnapReserve(-1429587641)
            .setSnapshotDirectory(true)
            .setUsedGib(-279083970)
            .setSecurityStyle(SecurityStyle.forNumber(0))
            .setKerberosEnabled(true)
            .setLdapEnabled(true)
            .setActiveDirectory(
                ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]").toString())
            .setRestoreParameters(RestoreParameters.newBuilder().build())
            .setKmsConfig(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
            .setEncryptionType(EncryptionType.forNumber(0))
            .setHasReplication(true)
            .setBackupConfig(BackupConfig.newBuilder().build())
            .addAllRestrictedActions(new ArrayList<RestrictedAction>())
            .setTieringPolicy(TieringPolicy.newBuilder().build())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("revertVolumeTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    RevertVolumeRequest request =
        RevertVolumeRequest.newBuilder()
            .setName(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .setSnapshotId("snapshotId-1113817601")
            .build();

    Volume actualResponse = client.revertVolumeAsync(request).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void revertVolumeExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      RevertVolumeRequest request =
          RevertVolumeRequest.newBuilder()
              .setName(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
              .setSnapshotId("snapshotId-1113817601")
              .build();
      client.revertVolumeAsync(request).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void listSnapshotsTest() throws Exception {
    Snapshot responsesElement = Snapshot.newBuilder().build();
    ListSnapshotsResponse expectedResponse =
        ListSnapshotsResponse.newBuilder()
            .setNextPageToken("")
            .addAllSnapshots(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    VolumeName parent = VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]");

    ListSnapshotsPagedResponse pagedListResponse = client.listSnapshots(parent);

    List<Snapshot> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getSnapshotsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listSnapshotsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      VolumeName parent = VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]");
      client.listSnapshots(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listSnapshotsTest2() throws Exception {
    Snapshot responsesElement = Snapshot.newBuilder().build();
    ListSnapshotsResponse expectedResponse =
        ListSnapshotsResponse.newBuilder()
            .setNextPageToken("")
            .addAllSnapshots(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-402/locations/location-402/volumes/volume-402";

    ListSnapshotsPagedResponse pagedListResponse = client.listSnapshots(parent);

    List<Snapshot> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getSnapshotsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listSnapshotsExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-402/locations/location-402/volumes/volume-402";
      client.listSnapshots(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getSnapshotTest() throws Exception {
    Snapshot expectedResponse =
        Snapshot.newBuilder()
            .setName(
                SnapshotName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[SNAPSHOT]").toString())
            .setStateDetails("stateDetails1730982001")
            .setDescription("description-1724546052")
            .setUsedBytes(-1915843223)
            .setCreateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .build();
    mockService.addResponse(expectedResponse);

    SnapshotName name = SnapshotName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[SNAPSHOT]");

    Snapshot actualResponse = client.getSnapshot(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getSnapshotExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      SnapshotName name = SnapshotName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[SNAPSHOT]");
      client.getSnapshot(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getSnapshotTest2() throws Exception {
    Snapshot expectedResponse =
        Snapshot.newBuilder()
            .setName(
                SnapshotName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[SNAPSHOT]").toString())
            .setStateDetails("stateDetails1730982001")
            .setDescription("description-1724546052")
            .setUsedBytes(-1915843223)
            .setCreateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-4650/locations/location-4650/volumes/volume-4650/snapshots/snapshot-4650";

    Snapshot actualResponse = client.getSnapshot(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getSnapshotExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-4650/locations/location-4650/volumes/volume-4650/snapshots/snapshot-4650";
      client.getSnapshot(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createSnapshotTest() throws Exception {
    Snapshot expectedResponse =
        Snapshot.newBuilder()
            .setName(
                SnapshotName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[SNAPSHOT]").toString())
            .setStateDetails("stateDetails1730982001")
            .setDescription("description-1724546052")
            .setUsedBytes(-1915843223)
            .setCreateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createSnapshotTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    VolumeName parent = VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]");
    Snapshot snapshot = Snapshot.newBuilder().build();
    String snapshotId = "snapshotId-1113817601";

    Snapshot actualResponse = client.createSnapshotAsync(parent, snapshot, snapshotId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createSnapshotExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      VolumeName parent = VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]");
      Snapshot snapshot = Snapshot.newBuilder().build();
      String snapshotId = "snapshotId-1113817601";
      client.createSnapshotAsync(parent, snapshot, snapshotId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void createSnapshotTest2() throws Exception {
    Snapshot expectedResponse =
        Snapshot.newBuilder()
            .setName(
                SnapshotName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[SNAPSHOT]").toString())
            .setStateDetails("stateDetails1730982001")
            .setDescription("description-1724546052")
            .setUsedBytes(-1915843223)
            .setCreateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createSnapshotTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String parent = "projects/project-402/locations/location-402/volumes/volume-402";
    Snapshot snapshot = Snapshot.newBuilder().build();
    String snapshotId = "snapshotId-1113817601";

    Snapshot actualResponse = client.createSnapshotAsync(parent, snapshot, snapshotId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createSnapshotExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-402/locations/location-402/volumes/volume-402";
      Snapshot snapshot = Snapshot.newBuilder().build();
      String snapshotId = "snapshotId-1113817601";
      client.createSnapshotAsync(parent, snapshot, snapshotId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteSnapshotTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteSnapshotTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    SnapshotName name = SnapshotName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[SNAPSHOT]");

    client.deleteSnapshotAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteSnapshotExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      SnapshotName name = SnapshotName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[SNAPSHOT]");
      client.deleteSnapshotAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteSnapshotTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteSnapshotTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name =
        "projects/project-4650/locations/location-4650/volumes/volume-4650/snapshots/snapshot-4650";

    client.deleteSnapshotAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteSnapshotExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-4650/locations/location-4650/volumes/volume-4650/snapshots/snapshot-4650";
      client.deleteSnapshotAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void updateSnapshotTest() throws Exception {
    Snapshot expectedResponse =
        Snapshot.newBuilder()
            .setName(
                SnapshotName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[SNAPSHOT]").toString())
            .setStateDetails("stateDetails1730982001")
            .setDescription("description-1724546052")
            .setUsedBytes(-1915843223)
            .setCreateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateSnapshotTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    Snapshot snapshot =
        Snapshot.newBuilder()
            .setName(
                SnapshotName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[SNAPSHOT]").toString())
            .setStateDetails("stateDetails1730982001")
            .setDescription("description-1724546052")
            .setUsedBytes(-1915843223)
            .setCreateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Snapshot actualResponse = client.updateSnapshotAsync(snapshot, updateMask).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void updateSnapshotExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      Snapshot snapshot =
          Snapshot.newBuilder()
              .setName(
                  SnapshotName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[SNAPSHOT]").toString())
              .setStateDetails("stateDetails1730982001")
              .setDescription("description-1724546052")
              .setUsedBytes(-1915843223)
              .setCreateTime(Timestamp.newBuilder().build())
              .putAllLabels(new HashMap<String, String>())
              .build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateSnapshotAsync(snapshot, updateMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void listActiveDirectoriesTest() throws Exception {
    ActiveDirectory responsesElement = ActiveDirectory.newBuilder().build();
    ListActiveDirectoriesResponse expectedResponse =
        ListActiveDirectoriesResponse.newBuilder()
            .setNextPageToken("")
            .addAllActiveDirectories(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListActiveDirectoriesPagedResponse pagedListResponse = client.listActiveDirectories(parent);

    List<ActiveDirectory> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getActiveDirectoriesList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listActiveDirectoriesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listActiveDirectories(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listActiveDirectoriesTest2() throws Exception {
    ActiveDirectory responsesElement = ActiveDirectory.newBuilder().build();
    ListActiveDirectoriesResponse expectedResponse =
        ListActiveDirectoriesResponse.newBuilder()
            .setNextPageToken("")
            .addAllActiveDirectories(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";

    ListActiveDirectoriesPagedResponse pagedListResponse = client.listActiveDirectories(parent);

    List<ActiveDirectory> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getActiveDirectoriesList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listActiveDirectoriesExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      client.listActiveDirectories(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getActiveDirectoryTest() throws Exception {
    ActiveDirectory expectedResponse =
        ActiveDirectory.newBuilder()
            .setName(
                ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setDomain("domain-1326197564")
            .setSite("site3530567")
            .setDns("dns99625")
            .setNetBiosPrefix("netBiosPrefix621636698")
            .setOrganizationalUnit("organizationalUnit-576895166")
            .setAesEncryption(true)
            .setUsername("username-265713450")
            .setPassword("password1216985755")
            .addAllBackupOperators(new ArrayList<String>())
            .addAllSecurityOperators(new ArrayList<String>())
            .setKdcHostname("kdcHostname-256273283")
            .setKdcIp("kdcIp101893361")
            .setNfsUsersWithLdap(true)
            .setDescription("description-1724546052")
            .setLdapSigning(true)
            .setEncryptDcConnections(true)
            .putAllLabels(new HashMap<String, String>())
            .setStateDetails("stateDetails1730982001")
            .build();
    mockService.addResponse(expectedResponse);

    ActiveDirectoryName name =
        ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]");

    ActiveDirectory actualResponse = client.getActiveDirectory(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getActiveDirectoryExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ActiveDirectoryName name =
          ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]");
      client.getActiveDirectory(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getActiveDirectoryTest2() throws Exception {
    ActiveDirectory expectedResponse =
        ActiveDirectory.newBuilder()
            .setName(
                ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setDomain("domain-1326197564")
            .setSite("site3530567")
            .setDns("dns99625")
            .setNetBiosPrefix("netBiosPrefix621636698")
            .setOrganizationalUnit("organizationalUnit-576895166")
            .setAesEncryption(true)
            .setUsername("username-265713450")
            .setPassword("password1216985755")
            .addAllBackupOperators(new ArrayList<String>())
            .addAllSecurityOperators(new ArrayList<String>())
            .setKdcHostname("kdcHostname-256273283")
            .setKdcIp("kdcIp101893361")
            .setNfsUsersWithLdap(true)
            .setDescription("description-1724546052")
            .setLdapSigning(true)
            .setEncryptDcConnections(true)
            .putAllLabels(new HashMap<String, String>())
            .setStateDetails("stateDetails1730982001")
            .build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-2715/locations/location-2715/activeDirectories/activeDirectorie-2715";

    ActiveDirectory actualResponse = client.getActiveDirectory(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getActiveDirectoryExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-2715/locations/location-2715/activeDirectories/activeDirectorie-2715";
      client.getActiveDirectory(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createActiveDirectoryTest() throws Exception {
    ActiveDirectory expectedResponse =
        ActiveDirectory.newBuilder()
            .setName(
                ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setDomain("domain-1326197564")
            .setSite("site3530567")
            .setDns("dns99625")
            .setNetBiosPrefix("netBiosPrefix621636698")
            .setOrganizationalUnit("organizationalUnit-576895166")
            .setAesEncryption(true)
            .setUsername("username-265713450")
            .setPassword("password1216985755")
            .addAllBackupOperators(new ArrayList<String>())
            .addAllSecurityOperators(new ArrayList<String>())
            .setKdcHostname("kdcHostname-256273283")
            .setKdcIp("kdcIp101893361")
            .setNfsUsersWithLdap(true)
            .setDescription("description-1724546052")
            .setLdapSigning(true)
            .setEncryptDcConnections(true)
            .putAllLabels(new HashMap<String, String>())
            .setStateDetails("stateDetails1730982001")
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createActiveDirectoryTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    ActiveDirectory activeDirectory = ActiveDirectory.newBuilder().build();
    String activeDirectoryId = "activeDirectoryId589359490";

    ActiveDirectory actualResponse =
        client.createActiveDirectoryAsync(parent, activeDirectory, activeDirectoryId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createActiveDirectoryExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      ActiveDirectory activeDirectory = ActiveDirectory.newBuilder().build();
      String activeDirectoryId = "activeDirectoryId589359490";
      client.createActiveDirectoryAsync(parent, activeDirectory, activeDirectoryId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void createActiveDirectoryTest2() throws Exception {
    ActiveDirectory expectedResponse =
        ActiveDirectory.newBuilder()
            .setName(
                ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setDomain("domain-1326197564")
            .setSite("site3530567")
            .setDns("dns99625")
            .setNetBiosPrefix("netBiosPrefix621636698")
            .setOrganizationalUnit("organizationalUnit-576895166")
            .setAesEncryption(true)
            .setUsername("username-265713450")
            .setPassword("password1216985755")
            .addAllBackupOperators(new ArrayList<String>())
            .addAllSecurityOperators(new ArrayList<String>())
            .setKdcHostname("kdcHostname-256273283")
            .setKdcIp("kdcIp101893361")
            .setNfsUsersWithLdap(true)
            .setDescription("description-1724546052")
            .setLdapSigning(true)
            .setEncryptDcConnections(true)
            .putAllLabels(new HashMap<String, String>())
            .setStateDetails("stateDetails1730982001")
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createActiveDirectoryTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String parent = "projects/project-5833/locations/location-5833";
    ActiveDirectory activeDirectory = ActiveDirectory.newBuilder().build();
    String activeDirectoryId = "activeDirectoryId589359490";

    ActiveDirectory actualResponse =
        client.createActiveDirectoryAsync(parent, activeDirectory, activeDirectoryId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createActiveDirectoryExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      ActiveDirectory activeDirectory = ActiveDirectory.newBuilder().build();
      String activeDirectoryId = "activeDirectoryId589359490";
      client.createActiveDirectoryAsync(parent, activeDirectory, activeDirectoryId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void updateActiveDirectoryTest() throws Exception {
    ActiveDirectory expectedResponse =
        ActiveDirectory.newBuilder()
            .setName(
                ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setDomain("domain-1326197564")
            .setSite("site3530567")
            .setDns("dns99625")
            .setNetBiosPrefix("netBiosPrefix621636698")
            .setOrganizationalUnit("organizationalUnit-576895166")
            .setAesEncryption(true)
            .setUsername("username-265713450")
            .setPassword("password1216985755")
            .addAllBackupOperators(new ArrayList<String>())
            .addAllSecurityOperators(new ArrayList<String>())
            .setKdcHostname("kdcHostname-256273283")
            .setKdcIp("kdcIp101893361")
            .setNfsUsersWithLdap(true)
            .setDescription("description-1724546052")
            .setLdapSigning(true)
            .setEncryptDcConnections(true)
            .putAllLabels(new HashMap<String, String>())
            .setStateDetails("stateDetails1730982001")
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateActiveDirectoryTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    ActiveDirectory activeDirectory =
        ActiveDirectory.newBuilder()
            .setName(
                ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setDomain("domain-1326197564")
            .setSite("site3530567")
            .setDns("dns99625")
            .setNetBiosPrefix("netBiosPrefix621636698")
            .setOrganizationalUnit("organizationalUnit-576895166")
            .setAesEncryption(true)
            .setUsername("username-265713450")
            .setPassword("password1216985755")
            .addAllBackupOperators(new ArrayList<String>())
            .addAllSecurityOperators(new ArrayList<String>())
            .setKdcHostname("kdcHostname-256273283")
            .setKdcIp("kdcIp101893361")
            .setNfsUsersWithLdap(true)
            .setDescription("description-1724546052")
            .setLdapSigning(true)
            .setEncryptDcConnections(true)
            .putAllLabels(new HashMap<String, String>())
            .setStateDetails("stateDetails1730982001")
            .build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    ActiveDirectory actualResponse =
        client.updateActiveDirectoryAsync(activeDirectory, updateMask).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void updateActiveDirectoryExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ActiveDirectory activeDirectory =
          ActiveDirectory.newBuilder()
              .setName(
                  ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]")
                      .toString())
              .setCreateTime(Timestamp.newBuilder().build())
              .setDomain("domain-1326197564")
              .setSite("site3530567")
              .setDns("dns99625")
              .setNetBiosPrefix("netBiosPrefix621636698")
              .setOrganizationalUnit("organizationalUnit-576895166")
              .setAesEncryption(true)
              .setUsername("username-265713450")
              .setPassword("password1216985755")
              .addAllBackupOperators(new ArrayList<String>())
              .addAllSecurityOperators(new ArrayList<String>())
              .setKdcHostname("kdcHostname-256273283")
              .setKdcIp("kdcIp101893361")
              .setNfsUsersWithLdap(true)
              .setDescription("description-1724546052")
              .setLdapSigning(true)
              .setEncryptDcConnections(true)
              .putAllLabels(new HashMap<String, String>())
              .setStateDetails("stateDetails1730982001")
              .build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateActiveDirectoryAsync(activeDirectory, updateMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteActiveDirectoryTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteActiveDirectoryTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    ActiveDirectoryName name =
        ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]");

    client.deleteActiveDirectoryAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteActiveDirectoryExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ActiveDirectoryName name =
          ActiveDirectoryName.of("[PROJECT]", "[LOCATION]", "[ACTIVE_DIRECTORY]");
      client.deleteActiveDirectoryAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteActiveDirectoryTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteActiveDirectoryTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name =
        "projects/project-2715/locations/location-2715/activeDirectories/activeDirectorie-2715";

    client.deleteActiveDirectoryAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteActiveDirectoryExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-2715/locations/location-2715/activeDirectories/activeDirectorie-2715";
      client.deleteActiveDirectoryAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void listKmsConfigsTest() throws Exception {
    KmsConfig responsesElement = KmsConfig.newBuilder().build();
    ListKmsConfigsResponse expectedResponse =
        ListKmsConfigsResponse.newBuilder()
            .setNextPageToken("")
            .addAllKmsConfigs(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListKmsConfigsPagedResponse pagedListResponse = client.listKmsConfigs(parent);

    List<KmsConfig> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getKmsConfigsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listKmsConfigsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listKmsConfigs(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listKmsConfigsTest2() throws Exception {
    KmsConfig responsesElement = KmsConfig.newBuilder().build();
    ListKmsConfigsResponse expectedResponse =
        ListKmsConfigsResponse.newBuilder()
            .setNextPageToken("")
            .addAllKmsConfigs(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";

    ListKmsConfigsPagedResponse pagedListResponse = client.listKmsConfigs(parent);

    List<KmsConfig> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getKmsConfigsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listKmsConfigsExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      client.listKmsConfigs(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createKmsConfigTest() throws Exception {
    KmsConfig expectedResponse =
        KmsConfig.newBuilder()
            .setName(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
            .setCryptoKeyName("cryptoKeyName1447084425")
            .setStateDetails("stateDetails1730982001")
            .setCreateTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .putAllLabels(new HashMap<String, String>())
            .setInstructions("instructions757376421")
            .setServiceAccount("serviceAccount1079137720")
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createKmsConfigTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    KmsConfig kmsConfig = KmsConfig.newBuilder().build();
    String kmsConfigId = "kmsConfigId-1159731602";

    KmsConfig actualResponse = client.createKmsConfigAsync(parent, kmsConfig, kmsConfigId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createKmsConfigExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      KmsConfig kmsConfig = KmsConfig.newBuilder().build();
      String kmsConfigId = "kmsConfigId-1159731602";
      client.createKmsConfigAsync(parent, kmsConfig, kmsConfigId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void createKmsConfigTest2() throws Exception {
    KmsConfig expectedResponse =
        KmsConfig.newBuilder()
            .setName(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
            .setCryptoKeyName("cryptoKeyName1447084425")
            .setStateDetails("stateDetails1730982001")
            .setCreateTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .putAllLabels(new HashMap<String, String>())
            .setInstructions("instructions757376421")
            .setServiceAccount("serviceAccount1079137720")
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createKmsConfigTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String parent = "projects/project-5833/locations/location-5833";
    KmsConfig kmsConfig = KmsConfig.newBuilder().build();
    String kmsConfigId = "kmsConfigId-1159731602";

    KmsConfig actualResponse = client.createKmsConfigAsync(parent, kmsConfig, kmsConfigId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createKmsConfigExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      KmsConfig kmsConfig = KmsConfig.newBuilder().build();
      String kmsConfigId = "kmsConfigId-1159731602";
      client.createKmsConfigAsync(parent, kmsConfig, kmsConfigId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void getKmsConfigTest() throws Exception {
    KmsConfig expectedResponse =
        KmsConfig.newBuilder()
            .setName(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
            .setCryptoKeyName("cryptoKeyName1447084425")
            .setStateDetails("stateDetails1730982001")
            .setCreateTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .putAllLabels(new HashMap<String, String>())
            .setInstructions("instructions757376421")
            .setServiceAccount("serviceAccount1079137720")
            .build();
    mockService.addResponse(expectedResponse);

    KmsConfigName name = KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]");

    KmsConfig actualResponse = client.getKmsConfig(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getKmsConfigExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      KmsConfigName name = KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]");
      client.getKmsConfig(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getKmsConfigTest2() throws Exception {
    KmsConfig expectedResponse =
        KmsConfig.newBuilder()
            .setName(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
            .setCryptoKeyName("cryptoKeyName1447084425")
            .setStateDetails("stateDetails1730982001")
            .setCreateTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .putAllLabels(new HashMap<String, String>())
            .setInstructions("instructions757376421")
            .setServiceAccount("serviceAccount1079137720")
            .build();
    mockService.addResponse(expectedResponse);

    String name = "projects/project-7344/locations/location-7344/kmsConfigs/kmsConfig-7344";

    KmsConfig actualResponse = client.getKmsConfig(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getKmsConfigExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-7344/locations/location-7344/kmsConfigs/kmsConfig-7344";
      client.getKmsConfig(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateKmsConfigTest() throws Exception {
    KmsConfig expectedResponse =
        KmsConfig.newBuilder()
            .setName(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
            .setCryptoKeyName("cryptoKeyName1447084425")
            .setStateDetails("stateDetails1730982001")
            .setCreateTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .putAllLabels(new HashMap<String, String>())
            .setInstructions("instructions757376421")
            .setServiceAccount("serviceAccount1079137720")
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateKmsConfigTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    KmsConfig kmsConfig =
        KmsConfig.newBuilder()
            .setName(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
            .setCryptoKeyName("cryptoKeyName1447084425")
            .setStateDetails("stateDetails1730982001")
            .setCreateTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .putAllLabels(new HashMap<String, String>())
            .setInstructions("instructions757376421")
            .setServiceAccount("serviceAccount1079137720")
            .build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    KmsConfig actualResponse = client.updateKmsConfigAsync(kmsConfig, updateMask).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void updateKmsConfigExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      KmsConfig kmsConfig =
          KmsConfig.newBuilder()
              .setName(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
              .setCryptoKeyName("cryptoKeyName1447084425")
              .setStateDetails("stateDetails1730982001")
              .setCreateTime(Timestamp.newBuilder().build())
              .setDescription("description-1724546052")
              .putAllLabels(new HashMap<String, String>())
              .setInstructions("instructions757376421")
              .setServiceAccount("serviceAccount1079137720")
              .build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateKmsConfigAsync(kmsConfig, updateMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void encryptVolumesTest() throws Exception {
    KmsConfig expectedResponse =
        KmsConfig.newBuilder()
            .setName(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
            .setCryptoKeyName("cryptoKeyName1447084425")
            .setStateDetails("stateDetails1730982001")
            .setCreateTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .putAllLabels(new HashMap<String, String>())
            .setInstructions("instructions757376421")
            .setServiceAccount("serviceAccount1079137720")
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("encryptVolumesTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    EncryptVolumesRequest request =
        EncryptVolumesRequest.newBuilder()
            .setName(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
            .build();

    KmsConfig actualResponse = client.encryptVolumesAsync(request).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void encryptVolumesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      EncryptVolumesRequest request =
          EncryptVolumesRequest.newBuilder()
              .setName(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
              .build();
      client.encryptVolumesAsync(request).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void verifyKmsConfigTest() throws Exception {
    VerifyKmsConfigResponse expectedResponse =
        VerifyKmsConfigResponse.newBuilder()
            .setHealthy(true)
            .setHealthError("healthError-1935935220")
            .setInstructions("instructions757376421")
            .build();
    mockService.addResponse(expectedResponse);

    VerifyKmsConfigRequest request =
        VerifyKmsConfigRequest.newBuilder()
            .setName(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
            .build();

    VerifyKmsConfigResponse actualResponse = client.verifyKmsConfig(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void verifyKmsConfigExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      VerifyKmsConfigRequest request =
          VerifyKmsConfigRequest.newBuilder()
              .setName(KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]").toString())
              .build();
      client.verifyKmsConfig(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteKmsConfigTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteKmsConfigTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    KmsConfigName name = KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]");

    client.deleteKmsConfigAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteKmsConfigExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      KmsConfigName name = KmsConfigName.of("[PROJECT]", "[LOCATION]", "[KMS_CONFIG]");
      client.deleteKmsConfigAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteKmsConfigTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteKmsConfigTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name = "projects/project-7344/locations/location-7344/kmsConfigs/kmsConfig-7344";

    client.deleteKmsConfigAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteKmsConfigExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-7344/locations/location-7344/kmsConfigs/kmsConfig-7344";
      client.deleteKmsConfigAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void listReplicationsTest() throws Exception {
    Replication responsesElement = Replication.newBuilder().build();
    ListReplicationsResponse expectedResponse =
        ListReplicationsResponse.newBuilder()
            .setNextPageToken("")
            .addAllReplications(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    VolumeName parent = VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]");

    ListReplicationsPagedResponse pagedListResponse = client.listReplications(parent);

    List<Replication> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getReplicationsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listReplicationsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      VolumeName parent = VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]");
      client.listReplications(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listReplicationsTest2() throws Exception {
    Replication responsesElement = Replication.newBuilder().build();
    ListReplicationsResponse expectedResponse =
        ListReplicationsResponse.newBuilder()
            .setNextPageToken("")
            .addAllReplications(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-402/locations/location-402/volumes/volume-402";

    ListReplicationsPagedResponse pagedListResponse = client.listReplications(parent);

    List<Replication> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getReplicationsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listReplicationsExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-402/locations/location-402/volumes/volume-402";
      client.listReplications(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getReplicationTest() throws Exception {
    Replication expectedResponse =
        Replication.newBuilder()
            .setName(
                ReplicationName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[REPLICATION]")
                    .toString())
            .setStateDetails("stateDetails1730982001")
            .setHealthy(true)
            .setCreateTime(Timestamp.newBuilder().build())
            .setDestinationVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .setTransferStats(TransferStats.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setDestinationVolumeParameters(DestinationVolumeParameters.newBuilder().build())
            .setSourceVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .build();
    mockService.addResponse(expectedResponse);

    ReplicationName name =
        ReplicationName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[REPLICATION]");

    Replication actualResponse = client.getReplication(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getReplicationExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ReplicationName name =
          ReplicationName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[REPLICATION]");
      client.getReplication(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getReplicationTest2() throws Exception {
    Replication expectedResponse =
        Replication.newBuilder()
            .setName(
                ReplicationName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[REPLICATION]")
                    .toString())
            .setStateDetails("stateDetails1730982001")
            .setHealthy(true)
            .setCreateTime(Timestamp.newBuilder().build())
            .setDestinationVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .setTransferStats(TransferStats.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setDestinationVolumeParameters(DestinationVolumeParameters.newBuilder().build())
            .setSourceVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-1038/locations/location-1038/volumes/volume-1038/replications/replication-1038";

    Replication actualResponse = client.getReplication(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getReplicationExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-1038/locations/location-1038/volumes/volume-1038/replications/replication-1038";
      client.getReplication(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void createReplicationTest() throws Exception {
    Replication expectedResponse =
        Replication.newBuilder()
            .setName(
                ReplicationName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[REPLICATION]")
                    .toString())
            .setStateDetails("stateDetails1730982001")
            .setHealthy(true)
            .setCreateTime(Timestamp.newBuilder().build())
            .setDestinationVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .setTransferStats(TransferStats.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setDestinationVolumeParameters(DestinationVolumeParameters.newBuilder().build())
            .setSourceVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createReplicationTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    VolumeName parent = VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]");
    Replication replication = Replication.newBuilder().build();
    String replicationId = "replicationId1170820615";

    Replication actualResponse =
        client.createReplicationAsync(parent, replication, replicationId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createReplicationExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      VolumeName parent = VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]");
      Replication replication = Replication.newBuilder().build();
      String replicationId = "replicationId1170820615";
      client.createReplicationAsync(parent, replication, replicationId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void createReplicationTest2() throws Exception {
    Replication expectedResponse =
        Replication.newBuilder()
            .setName(
                ReplicationName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[REPLICATION]")
                    .toString())
            .setStateDetails("stateDetails1730982001")
            .setHealthy(true)
            .setCreateTime(Timestamp.newBuilder().build())
            .setDestinationVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .setTransferStats(TransferStats.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setDestinationVolumeParameters(DestinationVolumeParameters.newBuilder().build())
            .setSourceVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createReplicationTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String parent = "projects/project-402/locations/location-402/volumes/volume-402";
    Replication replication = Replication.newBuilder().build();
    String replicationId = "replicationId1170820615";

    Replication actualResponse =
        client.createReplicationAsync(parent, replication, replicationId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createReplicationExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-402/locations/location-402/volumes/volume-402";
      Replication replication = Replication.newBuilder().build();
      String replicationId = "replicationId1170820615";
      client.createReplicationAsync(parent, replication, replicationId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteReplicationTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteReplicationTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    ReplicationName name =
        ReplicationName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[REPLICATION]");

    client.deleteReplicationAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteReplicationExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ReplicationName name =
          ReplicationName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[REPLICATION]");
      client.deleteReplicationAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteReplicationTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteReplicationTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name =
        "projects/project-1038/locations/location-1038/volumes/volume-1038/replications/replication-1038";

    client.deleteReplicationAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteReplicationExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-1038/locations/location-1038/volumes/volume-1038/replications/replication-1038";
      client.deleteReplicationAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void updateReplicationTest() throws Exception {
    Replication expectedResponse =
        Replication.newBuilder()
            .setName(
                ReplicationName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[REPLICATION]")
                    .toString())
            .setStateDetails("stateDetails1730982001")
            .setHealthy(true)
            .setCreateTime(Timestamp.newBuilder().build())
            .setDestinationVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .setTransferStats(TransferStats.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setDestinationVolumeParameters(DestinationVolumeParameters.newBuilder().build())
            .setSourceVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateReplicationTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    Replication replication =
        Replication.newBuilder()
            .setName(
                ReplicationName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[REPLICATION]")
                    .toString())
            .setStateDetails("stateDetails1730982001")
            .setHealthy(true)
            .setCreateTime(Timestamp.newBuilder().build())
            .setDestinationVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .setTransferStats(TransferStats.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setDestinationVolumeParameters(DestinationVolumeParameters.newBuilder().build())
            .setSourceVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Replication actualResponse = client.updateReplicationAsync(replication, updateMask).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void updateReplicationExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      Replication replication =
          Replication.newBuilder()
              .setName(
                  ReplicationName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[REPLICATION]")
                      .toString())
              .setStateDetails("stateDetails1730982001")
              .setHealthy(true)
              .setCreateTime(Timestamp.newBuilder().build())
              .setDestinationVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
              .setTransferStats(TransferStats.newBuilder().build())
              .putAllLabels(new HashMap<String, String>())
              .setDescription("description-1724546052")
              .setDestinationVolumeParameters(DestinationVolumeParameters.newBuilder().build())
              .setSourceVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
              .build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateReplicationAsync(replication, updateMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void stopReplicationTest() throws Exception {
    Replication expectedResponse =
        Replication.newBuilder()
            .setName(
                ReplicationName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[REPLICATION]")
                    .toString())
            .setStateDetails("stateDetails1730982001")
            .setHealthy(true)
            .setCreateTime(Timestamp.newBuilder().build())
            .setDestinationVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .setTransferStats(TransferStats.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setDestinationVolumeParameters(DestinationVolumeParameters.newBuilder().build())
            .setSourceVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("stopReplicationTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    StopReplicationRequest request =
        StopReplicationRequest.newBuilder()
            .setName(
                ReplicationName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[REPLICATION]")
                    .toString())
            .setForce(true)
            .build();

    Replication actualResponse = client.stopReplicationAsync(request).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void stopReplicationExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      StopReplicationRequest request =
          StopReplicationRequest.newBuilder()
              .setName(
                  ReplicationName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[REPLICATION]")
                      .toString())
              .setForce(true)
              .build();
      client.stopReplicationAsync(request).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void resumeReplicationTest() throws Exception {
    Replication expectedResponse =
        Replication.newBuilder()
            .setName(
                ReplicationName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[REPLICATION]")
                    .toString())
            .setStateDetails("stateDetails1730982001")
            .setHealthy(true)
            .setCreateTime(Timestamp.newBuilder().build())
            .setDestinationVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .setTransferStats(TransferStats.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setDestinationVolumeParameters(DestinationVolumeParameters.newBuilder().build())
            .setSourceVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("resumeReplicationTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    ResumeReplicationRequest request =
        ResumeReplicationRequest.newBuilder()
            .setName(
                ReplicationName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[REPLICATION]")
                    .toString())
            .build();

    Replication actualResponse = client.resumeReplicationAsync(request).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void resumeReplicationExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ResumeReplicationRequest request =
          ResumeReplicationRequest.newBuilder()
              .setName(
                  ReplicationName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[REPLICATION]")
                      .toString())
              .build();
      client.resumeReplicationAsync(request).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void reverseReplicationDirectionTest() throws Exception {
    Replication expectedResponse =
        Replication.newBuilder()
            .setName(
                ReplicationName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[REPLICATION]")
                    .toString())
            .setStateDetails("stateDetails1730982001")
            .setHealthy(true)
            .setCreateTime(Timestamp.newBuilder().build())
            .setDestinationVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .setTransferStats(TransferStats.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setDescription("description-1724546052")
            .setDestinationVolumeParameters(DestinationVolumeParameters.newBuilder().build())
            .setSourceVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("reverseReplicationDirectionTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    ReverseReplicationDirectionRequest request =
        ReverseReplicationDirectionRequest.newBuilder()
            .setName(
                ReplicationName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[REPLICATION]")
                    .toString())
            .build();

    Replication actualResponse = client.reverseReplicationDirectionAsync(request).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void reverseReplicationDirectionExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ReverseReplicationDirectionRequest request =
          ReverseReplicationDirectionRequest.newBuilder()
              .setName(
                  ReplicationName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[REPLICATION]")
                      .toString())
              .build();
      client.reverseReplicationDirectionAsync(request).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void createBackupVaultTest() throws Exception {
    BackupVault expectedResponse =
        BackupVault.newBuilder()
            .setName(BackupVaultName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .putAllLabels(new HashMap<String, String>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createBackupVaultTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    BackupVault backupVault = BackupVault.newBuilder().build();
    String backupVaultId = "backupVaultId-1897432373";

    BackupVault actualResponse =
        client.createBackupVaultAsync(parent, backupVault, backupVaultId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createBackupVaultExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      BackupVault backupVault = BackupVault.newBuilder().build();
      String backupVaultId = "backupVaultId-1897432373";
      client.createBackupVaultAsync(parent, backupVault, backupVaultId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void createBackupVaultTest2() throws Exception {
    BackupVault expectedResponse =
        BackupVault.newBuilder()
            .setName(BackupVaultName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .putAllLabels(new HashMap<String, String>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createBackupVaultTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String parent = "projects/project-5833/locations/location-5833";
    BackupVault backupVault = BackupVault.newBuilder().build();
    String backupVaultId = "backupVaultId-1897432373";

    BackupVault actualResponse =
        client.createBackupVaultAsync(parent, backupVault, backupVaultId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createBackupVaultExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      BackupVault backupVault = BackupVault.newBuilder().build();
      String backupVaultId = "backupVaultId-1897432373";
      client.createBackupVaultAsync(parent, backupVault, backupVaultId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void getBackupVaultTest() throws Exception {
    BackupVault expectedResponse =
        BackupVault.newBuilder()
            .setName(BackupVaultName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .putAllLabels(new HashMap<String, String>())
            .build();
    mockService.addResponse(expectedResponse);

    BackupVaultName name = BackupVaultName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]");

    BackupVault actualResponse = client.getBackupVault(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getBackupVaultExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      BackupVaultName name = BackupVaultName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]");
      client.getBackupVault(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getBackupVaultTest2() throws Exception {
    BackupVault expectedResponse =
        BackupVault.newBuilder()
            .setName(BackupVaultName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .putAllLabels(new HashMap<String, String>())
            .build();
    mockService.addResponse(expectedResponse);

    String name = "projects/project-237/locations/location-237/backupVaults/backupVault-237";

    BackupVault actualResponse = client.getBackupVault(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getBackupVaultExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-237/locations/location-237/backupVaults/backupVault-237";
      client.getBackupVault(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listBackupVaultsTest() throws Exception {
    BackupVault responsesElement = BackupVault.newBuilder().build();
    ListBackupVaultsResponse expectedResponse =
        ListBackupVaultsResponse.newBuilder()
            .setNextPageToken("")
            .addAllBackupVaults(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListBackupVaultsPagedResponse pagedListResponse = client.listBackupVaults(parent);

    List<BackupVault> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getBackupVaultsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listBackupVaultsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listBackupVaults(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listBackupVaultsTest2() throws Exception {
    BackupVault responsesElement = BackupVault.newBuilder().build();
    ListBackupVaultsResponse expectedResponse =
        ListBackupVaultsResponse.newBuilder()
            .setNextPageToken("")
            .addAllBackupVaults(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";

    ListBackupVaultsPagedResponse pagedListResponse = client.listBackupVaults(parent);

    List<BackupVault> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getBackupVaultsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listBackupVaultsExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      client.listBackupVaults(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateBackupVaultTest() throws Exception {
    BackupVault expectedResponse =
        BackupVault.newBuilder()
            .setName(BackupVaultName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .putAllLabels(new HashMap<String, String>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateBackupVaultTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    BackupVault backupVault =
        BackupVault.newBuilder()
            .setName(BackupVaultName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .setDescription("description-1724546052")
            .putAllLabels(new HashMap<String, String>())
            .build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    BackupVault actualResponse = client.updateBackupVaultAsync(backupVault, updateMask).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void updateBackupVaultExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      BackupVault backupVault =
          BackupVault.newBuilder()
              .setName(BackupVaultName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]").toString())
              .setCreateTime(Timestamp.newBuilder().build())
              .setDescription("description-1724546052")
              .putAllLabels(new HashMap<String, String>())
              .build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateBackupVaultAsync(backupVault, updateMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteBackupVaultTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteBackupVaultTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    BackupVaultName name = BackupVaultName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]");

    client.deleteBackupVaultAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteBackupVaultExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      BackupVaultName name = BackupVaultName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]");
      client.deleteBackupVaultAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteBackupVaultTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteBackupVaultTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name = "projects/project-237/locations/location-237/backupVaults/backupVault-237";

    client.deleteBackupVaultAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteBackupVaultExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "projects/project-237/locations/location-237/backupVaults/backupVault-237";
      client.deleteBackupVaultAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void createBackupTest() throws Exception {
    Backup expectedResponse =
        Backup.newBuilder()
            .setName(
                BackupName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]", "[BACKUP]").toString())
            .setDescription("description-1724546052")
            .setVolumeUsageBytes(962433704)
            .setSourceVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .setSourceSnapshot(
                SnapshotName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[SNAPSHOT]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setChainStorageBytes(1614651561)
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createBackupTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    BackupVaultName parent = BackupVaultName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]");
    Backup backup = Backup.newBuilder().build();
    String backupId = "backupId2121930365";

    Backup actualResponse = client.createBackupAsync(parent, backup, backupId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createBackupExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      BackupVaultName parent = BackupVaultName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]");
      Backup backup = Backup.newBuilder().build();
      String backupId = "backupId2121930365";
      client.createBackupAsync(parent, backup, backupId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void createBackupTest2() throws Exception {
    Backup expectedResponse =
        Backup.newBuilder()
            .setName(
                BackupName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]", "[BACKUP]").toString())
            .setDescription("description-1724546052")
            .setVolumeUsageBytes(962433704)
            .setSourceVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .setSourceSnapshot(
                SnapshotName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[SNAPSHOT]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setChainStorageBytes(1614651561)
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createBackupTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String parent = "projects/project-5588/locations/location-5588/backupVaults/backupVault-5588";
    Backup backup = Backup.newBuilder().build();
    String backupId = "backupId2121930365";

    Backup actualResponse = client.createBackupAsync(parent, backup, backupId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createBackupExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5588/locations/location-5588/backupVaults/backupVault-5588";
      Backup backup = Backup.newBuilder().build();
      String backupId = "backupId2121930365";
      client.createBackupAsync(parent, backup, backupId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void getBackupTest() throws Exception {
    Backup expectedResponse =
        Backup.newBuilder()
            .setName(
                BackupName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]", "[BACKUP]").toString())
            .setDescription("description-1724546052")
            .setVolumeUsageBytes(962433704)
            .setSourceVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .setSourceSnapshot(
                SnapshotName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[SNAPSHOT]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setChainStorageBytes(1614651561)
            .build();
    mockService.addResponse(expectedResponse);

    BackupName name = BackupName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]", "[BACKUP]");

    Backup actualResponse = client.getBackup(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getBackupExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      BackupName name = BackupName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]", "[BACKUP]");
      client.getBackup(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getBackupTest2() throws Exception {
    Backup expectedResponse =
        Backup.newBuilder()
            .setName(
                BackupName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]", "[BACKUP]").toString())
            .setDescription("description-1724546052")
            .setVolumeUsageBytes(962433704)
            .setSourceVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .setSourceSnapshot(
                SnapshotName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[SNAPSHOT]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setChainStorageBytes(1614651561)
            .build();
    mockService.addResponse(expectedResponse);

    String name =
        "projects/project-6240/locations/location-6240/backupVaults/backupVault-6240/backups/backup-6240";

    Backup actualResponse = client.getBackup(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getBackupExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-6240/locations/location-6240/backupVaults/backupVault-6240/backups/backup-6240";
      client.getBackup(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listBackupsTest() throws Exception {
    Backup responsesElement = Backup.newBuilder().build();
    ListBackupsResponse expectedResponse =
        ListBackupsResponse.newBuilder()
            .setNextPageToken("")
            .addAllBackups(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    BackupVaultName parent = BackupVaultName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]");

    ListBackupsPagedResponse pagedListResponse = client.listBackups(parent);

    List<Backup> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getBackupsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listBackupsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      BackupVaultName parent = BackupVaultName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]");
      client.listBackups(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listBackupsTest2() throws Exception {
    Backup responsesElement = Backup.newBuilder().build();
    ListBackupsResponse expectedResponse =
        ListBackupsResponse.newBuilder()
            .setNextPageToken("")
            .addAllBackups(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5588/locations/location-5588/backupVaults/backupVault-5588";

    ListBackupsPagedResponse pagedListResponse = client.listBackups(parent);

    List<Backup> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getBackupsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listBackupsExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5588/locations/location-5588/backupVaults/backupVault-5588";
      client.listBackups(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void deleteBackupTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteBackupTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    BackupName name = BackupName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]", "[BACKUP]");

    client.deleteBackupAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteBackupExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      BackupName name = BackupName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]", "[BACKUP]");
      client.deleteBackupAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteBackupTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteBackupTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name =
        "projects/project-6240/locations/location-6240/backupVaults/backupVault-6240/backups/backup-6240";

    client.deleteBackupAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteBackupExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-6240/locations/location-6240/backupVaults/backupVault-6240/backups/backup-6240";
      client.deleteBackupAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void updateBackupTest() throws Exception {
    Backup expectedResponse =
        Backup.newBuilder()
            .setName(
                BackupName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]", "[BACKUP]").toString())
            .setDescription("description-1724546052")
            .setVolumeUsageBytes(962433704)
            .setSourceVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .setSourceSnapshot(
                SnapshotName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[SNAPSHOT]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setChainStorageBytes(1614651561)
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateBackupTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    Backup backup =
        Backup.newBuilder()
            .setName(
                BackupName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]", "[BACKUP]").toString())
            .setDescription("description-1724546052")
            .setVolumeUsageBytes(962433704)
            .setSourceVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
            .setSourceSnapshot(
                SnapshotName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[SNAPSHOT]").toString())
            .setCreateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .setChainStorageBytes(1614651561)
            .build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    Backup actualResponse = client.updateBackupAsync(backup, updateMask).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void updateBackupExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      Backup backup =
          Backup.newBuilder()
              .setName(
                  BackupName.of("[PROJECT]", "[LOCATION]", "[BACKUP_VAULT]", "[BACKUP]").toString())
              .setDescription("description-1724546052")
              .setVolumeUsageBytes(962433704)
              .setSourceVolume(VolumeName.of("[PROJECT]", "[LOCATION]", "[VOLUME]").toString())
              .setSourceSnapshot(
                  SnapshotName.of("[PROJECT]", "[LOCATION]", "[VOLUME]", "[SNAPSHOT]").toString())
              .setCreateTime(Timestamp.newBuilder().build())
              .putAllLabels(new HashMap<String, String>())
              .setChainStorageBytes(1614651561)
              .build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateBackupAsync(backup, updateMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void createBackupPolicyTest() throws Exception {
    BackupPolicy expectedResponse =
        BackupPolicy.newBuilder()
            .setName(BackupPolicyName.of("[PROJECT]", "[LOCATION]", "[BACKUP_POLICY]").toString())
            .setDailyBackupLimit(532629348)
            .setWeeklyBackupLimit(-2075144708)
            .setMonthlyBackupLimit(-1253809680)
            .setDescription("description-1724546052")
            .setEnabled(true)
            .setAssignedVolumeCount(396892795)
            .setCreateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createBackupPolicyTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
    BackupPolicy backupPolicy = BackupPolicy.newBuilder().build();
    String backupPolicyId = "backupPolicyId-1278533169";

    BackupPolicy actualResponse =
        client.createBackupPolicyAsync(parent, backupPolicy, backupPolicyId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createBackupPolicyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      BackupPolicy backupPolicy = BackupPolicy.newBuilder().build();
      String backupPolicyId = "backupPolicyId-1278533169";
      client.createBackupPolicyAsync(parent, backupPolicy, backupPolicyId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void createBackupPolicyTest2() throws Exception {
    BackupPolicy expectedResponse =
        BackupPolicy.newBuilder()
            .setName(BackupPolicyName.of("[PROJECT]", "[LOCATION]", "[BACKUP_POLICY]").toString())
            .setDailyBackupLimit(532629348)
            .setWeeklyBackupLimit(-2075144708)
            .setMonthlyBackupLimit(-1253809680)
            .setDescription("description-1724546052")
            .setEnabled(true)
            .setAssignedVolumeCount(396892795)
            .setCreateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("createBackupPolicyTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String parent = "projects/project-5833/locations/location-5833";
    BackupPolicy backupPolicy = BackupPolicy.newBuilder().build();
    String backupPolicyId = "backupPolicyId-1278533169";

    BackupPolicy actualResponse =
        client.createBackupPolicyAsync(parent, backupPolicy, backupPolicyId).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void createBackupPolicyExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      BackupPolicy backupPolicy = BackupPolicy.newBuilder().build();
      String backupPolicyId = "backupPolicyId-1278533169";
      client.createBackupPolicyAsync(parent, backupPolicy, backupPolicyId).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void getBackupPolicyTest() throws Exception {
    BackupPolicy expectedResponse =
        BackupPolicy.newBuilder()
            .setName(BackupPolicyName.of("[PROJECT]", "[LOCATION]", "[BACKUP_POLICY]").toString())
            .setDailyBackupLimit(532629348)
            .setWeeklyBackupLimit(-2075144708)
            .setMonthlyBackupLimit(-1253809680)
            .setDescription("description-1724546052")
            .setEnabled(true)
            .setAssignedVolumeCount(396892795)
            .setCreateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .build();
    mockService.addResponse(expectedResponse);

    BackupPolicyName name = BackupPolicyName.of("[PROJECT]", "[LOCATION]", "[BACKUP_POLICY]");

    BackupPolicy actualResponse = client.getBackupPolicy(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getBackupPolicyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      BackupPolicyName name = BackupPolicyName.of("[PROJECT]", "[LOCATION]", "[BACKUP_POLICY]");
      client.getBackupPolicy(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getBackupPolicyTest2() throws Exception {
    BackupPolicy expectedResponse =
        BackupPolicy.newBuilder()
            .setName(BackupPolicyName.of("[PROJECT]", "[LOCATION]", "[BACKUP_POLICY]").toString())
            .setDailyBackupLimit(532629348)
            .setWeeklyBackupLimit(-2075144708)
            .setMonthlyBackupLimit(-1253809680)
            .setDescription("description-1724546052")
            .setEnabled(true)
            .setAssignedVolumeCount(396892795)
            .setCreateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .build();
    mockService.addResponse(expectedResponse);

    String name = "projects/project-1374/locations/location-1374/backupPolicies/backupPolicie-1374";

    BackupPolicy actualResponse = client.getBackupPolicy(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getBackupPolicyExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-1374/locations/location-1374/backupPolicies/backupPolicie-1374";
      client.getBackupPolicy(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listBackupPoliciesTest() throws Exception {
    BackupPolicy responsesElement = BackupPolicy.newBuilder().build();
    ListBackupPoliciesResponse expectedResponse =
        ListBackupPoliciesResponse.newBuilder()
            .setNextPageToken("")
            .addAllBackupPolicies(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");

    ListBackupPoliciesPagedResponse pagedListResponse = client.listBackupPolicies(parent);

    List<BackupPolicy> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getBackupPoliciesList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listBackupPoliciesExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
      client.listBackupPolicies(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void listBackupPoliciesTest2() throws Exception {
    BackupPolicy responsesElement = BackupPolicy.newBuilder().build();
    ListBackupPoliciesResponse expectedResponse =
        ListBackupPoliciesResponse.newBuilder()
            .setNextPageToken("")
            .addAllBackupPolicies(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String parent = "projects/project-5833/locations/location-5833";

    ListBackupPoliciesPagedResponse pagedListResponse = client.listBackupPolicies(parent);

    List<BackupPolicy> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getBackupPoliciesList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listBackupPoliciesExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String parent = "projects/project-5833/locations/location-5833";
      client.listBackupPolicies(parent);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void updateBackupPolicyTest() throws Exception {
    BackupPolicy expectedResponse =
        BackupPolicy.newBuilder()
            .setName(BackupPolicyName.of("[PROJECT]", "[LOCATION]", "[BACKUP_POLICY]").toString())
            .setDailyBackupLimit(532629348)
            .setWeeklyBackupLimit(-2075144708)
            .setMonthlyBackupLimit(-1253809680)
            .setDescription("description-1724546052")
            .setEnabled(true)
            .setAssignedVolumeCount(396892795)
            .setCreateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("updateBackupPolicyTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    BackupPolicy backupPolicy =
        BackupPolicy.newBuilder()
            .setName(BackupPolicyName.of("[PROJECT]", "[LOCATION]", "[BACKUP_POLICY]").toString())
            .setDailyBackupLimit(532629348)
            .setWeeklyBackupLimit(-2075144708)
            .setMonthlyBackupLimit(-1253809680)
            .setDescription("description-1724546052")
            .setEnabled(true)
            .setAssignedVolumeCount(396892795)
            .setCreateTime(Timestamp.newBuilder().build())
            .putAllLabels(new HashMap<String, String>())
            .build();
    FieldMask updateMask = FieldMask.newBuilder().build();

    BackupPolicy actualResponse = client.updateBackupPolicyAsync(backupPolicy, updateMask).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void updateBackupPolicyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      BackupPolicy backupPolicy =
          BackupPolicy.newBuilder()
              .setName(BackupPolicyName.of("[PROJECT]", "[LOCATION]", "[BACKUP_POLICY]").toString())
              .setDailyBackupLimit(532629348)
              .setWeeklyBackupLimit(-2075144708)
              .setMonthlyBackupLimit(-1253809680)
              .setDescription("description-1724546052")
              .setEnabled(true)
              .setAssignedVolumeCount(396892795)
              .setCreateTime(Timestamp.newBuilder().build())
              .putAllLabels(new HashMap<String, String>())
              .build();
      FieldMask updateMask = FieldMask.newBuilder().build();
      client.updateBackupPolicyAsync(backupPolicy, updateMask).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteBackupPolicyTest() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteBackupPolicyTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    BackupPolicyName name = BackupPolicyName.of("[PROJECT]", "[LOCATION]", "[BACKUP_POLICY]");

    client.deleteBackupPolicyAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteBackupPolicyExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      BackupPolicyName name = BackupPolicyName.of("[PROJECT]", "[LOCATION]", "[BACKUP_POLICY]");
      client.deleteBackupPolicyAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void deleteBackupPolicyTest2() throws Exception {
    Empty expectedResponse = Empty.newBuilder().build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("deleteBackupPolicyTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    String name = "projects/project-1374/locations/location-1374/backupPolicies/backupPolicie-1374";

    client.deleteBackupPolicyAsync(name).get();

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void deleteBackupPolicyExceptionTest2() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name =
          "projects/project-1374/locations/location-1374/backupPolicies/backupPolicie-1374";
      client.deleteBackupPolicyAsync(name).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void listLocationsTest() throws Exception {
    Location responsesElement = Location.newBuilder().build();
    ListLocationsResponse expectedResponse =
        ListLocationsResponse.newBuilder()
            .setNextPageToken("")
            .addAllLocations(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    ListLocationsRequest request =
        ListLocationsRequest.newBuilder()
            .setName("projects/project-3664")
            .setFilter("filter-1274492040")
            .setPageSize(883849137)
            .setPageToken("pageToken873572522")
            .build();

    ListLocationsPagedResponse pagedListResponse = client.listLocations(request);

    List<Location> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getLocationsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listLocationsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      ListLocationsRequest request =
          ListLocationsRequest.newBuilder()
              .setName("projects/project-3664")
              .setFilter("filter-1274492040")
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .build();
      client.listLocations(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getLocationTest() throws Exception {
    Location expectedResponse =
        Location.newBuilder()
            .setName("name3373707")
            .setLocationId("locationId1541836720")
            .setDisplayName("displayName1714148973")
            .putAllLabels(new HashMap<String, String>())
            .setMetadata(Any.newBuilder().build())
            .build();
    mockService.addResponse(expectedResponse);

    GetLocationRequest request =
        GetLocationRequest.newBuilder()
            .setName("projects/project-9062/locations/location-9062")
            .build();

    Location actualResponse = client.getLocation(request);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getLocationExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      GetLocationRequest request =
          GetLocationRequest.newBuilder()
              .setName("projects/project-9062/locations/location-9062")
              .build();
      client.getLocation(request);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
