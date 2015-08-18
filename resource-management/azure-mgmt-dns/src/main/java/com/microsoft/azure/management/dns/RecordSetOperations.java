/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.azure.management.dns;

import com.microsoft.azure.management.dns.models.RecordSetCreateOrUpdateParameters;
import com.microsoft.azure.management.dns.models.RecordSetCreateOrUpdateResponse;
import com.microsoft.azure.management.dns.models.RecordSetDeleteParameters;
import com.microsoft.azure.management.dns.models.RecordSetGetResponse;
import com.microsoft.azure.management.dns.models.RecordSetListParameters;
import com.microsoft.azure.management.dns.models.RecordSetListResponse;
import com.microsoft.azure.management.dns.models.RecordType;
import com.microsoft.windowsazure.core.OperationResponse;
import com.microsoft.windowsazure.exception.ServiceException;
import java.io.IOException;
import java.util.concurrent.Future;

/**
* Operations for managing the RecordSets in a DNS zone.
*/
public interface RecordSetOperations {
    /**
    * Creates a RecordSet within a DNS zone.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param zoneName Required. The name of the zone without a terminating dot.
    * @param relativeRecordSetName Required. The name of the RecordSet,
    * relative to the name of the zone.
    * @param recordType Required. The type of DNS record.
    * @param parameters Required. Parameters supplied to the CreateOrUpdate
    * operation.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The response to a RecordSet CreateOrUpdate operation.
    */
    RecordSetCreateOrUpdateResponse createOrUpdate(String resourceGroupName, String zoneName, String relativeRecordSetName, RecordType recordType, RecordSetCreateOrUpdateParameters parameters) throws IOException, ServiceException;
    
    /**
    * Creates a RecordSet within a DNS zone.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param zoneName Required. The name of the zone without a terminating dot.
    * @param relativeRecordSetName Required. The name of the RecordSet,
    * relative to the name of the zone.
    * @param recordType Required. The type of DNS record.
    * @param parameters Required. Parameters supplied to the CreateOrUpdate
    * operation.
    * @return The response to a RecordSet CreateOrUpdate operation.
    */
    Future<RecordSetCreateOrUpdateResponse> createOrUpdateAsync(String resourceGroupName, String zoneName, String relativeRecordSetName, RecordType recordType, RecordSetCreateOrUpdateParameters parameters);
    
    /**
    * Removes a RecordSet from a DNS zone.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param zoneName Required. The name of the zone without a terminating dot.
    * @param relativeRecordSetName Required. The name of the RecordSet,
    * relative to the name of the zone.
    * @param recordType Required. The type of DNS record.
    * @param parameters Required. The parameters supplied to delete a record
    * set.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    OperationResponse delete(String resourceGroupName, String zoneName, String relativeRecordSetName, RecordType recordType, RecordSetDeleteParameters parameters) throws IOException, ServiceException;
    
    /**
    * Removes a RecordSet from a DNS zone.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param zoneName Required. The name of the zone without a terminating dot.
    * @param relativeRecordSetName Required. The name of the RecordSet,
    * relative to the name of the zone.
    * @param recordType Required. The type of DNS record.
    * @param parameters Required. The parameters supplied to delete a record
    * set.
    * @return A standard service response including an HTTP status code and
    * request ID.
    */
    Future<OperationResponse> deleteAsync(String resourceGroupName, String zoneName, String relativeRecordSetName, RecordType recordType, RecordSetDeleteParameters parameters);
    
    /**
    * Gets a RecordSet.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param zoneName Required. The name of the zone without a terminating dot.
    * @param relativeRecordSetName Required. The name of the RecordSet,
    * relative to the name of the zone.
    * @param recordType Required. The type of DNS record.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The response to a RecordSet Get operation.
    */
    RecordSetGetResponse get(String resourceGroupName, String zoneName, String relativeRecordSetName, RecordType recordType) throws IOException, ServiceException;
    
    /**
    * Gets a RecordSet.
    *
    * @param resourceGroupName Required. The name of the resource group.
    * @param zoneName Required. The name of the zone without a terminating dot.
    * @param relativeRecordSetName Required. The name of the RecordSet,
    * relative to the name of the zone.
    * @param recordType Required. The type of DNS record.
    * @return The response to a RecordSet Get operation.
    */
    Future<RecordSetGetResponse> getAsync(String resourceGroupName, String zoneName, String relativeRecordSetName, RecordType recordType);
    
    /**
    * Lists the RecordSets of a specified type in a DNS zone.
    *
    * @param resourceGroupName Required. The name of the resource group that
    * contains the zone.
    * @param zoneName Required. The name of the zone from which to enumerate
    * RecordsSets.
    * @param recordType Required. The type of record sets to enumerate.
    * @param parameters Optional. Query parameters. If null is passed returns
    * the default number of zones.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The response to a RecordSet List operation.
    */
    RecordSetListResponse list(String resourceGroupName, String zoneName, RecordType recordType, RecordSetListParameters parameters) throws IOException, ServiceException;
    
    /**
    * Lists the RecordSets of a specified type in a DNS zone.
    *
    * @param resourceGroupName Required. The name of the resource group that
    * contains the zone.
    * @param zoneName Required. The name of the zone from which to enumerate
    * RecordsSets.
    * @param recordType Required. The type of record sets to enumerate.
    * @param parameters Optional. Query parameters. If null is passed returns
    * the default number of zones.
    * @return The response to a RecordSet List operation.
    */
    Future<RecordSetListResponse> listAsync(String resourceGroupName, String zoneName, RecordType recordType, RecordSetListParameters parameters);
    
    /**
    * Lists all RecordSets in a DNS zone.
    *
    * @param resourceGroupName Required. The name of the resource group that
    * contains the zone.
    * @param zoneName Required. The name of the zone from which to enumerate
    * RecordSets.
    * @param parameters Optional. Query parameters. If null is passed returns
    * the default number of zones.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The response to a RecordSet List operation.
    */
    RecordSetListResponse listAll(String resourceGroupName, String zoneName, RecordSetListParameters parameters) throws IOException, ServiceException;
    
    /**
    * Lists all RecordSets in a DNS zone.
    *
    * @param resourceGroupName Required. The name of the resource group that
    * contains the zone.
    * @param zoneName Required. The name of the zone from which to enumerate
    * RecordSets.
    * @param parameters Optional. Query parameters. If null is passed returns
    * the default number of zones.
    * @return The response to a RecordSet List operation.
    */
    Future<RecordSetListResponse> listAllAsync(String resourceGroupName, String zoneName, RecordSetListParameters parameters);
    
    /**
    * Lists RecordSets in a DNS zone. Depending on the previous call, it will
    * list all types or by type.
    *
    * @param nextLink Required. NextLink from the previous successful call to
    * List operation.
    * @throws IOException Signals that an I/O exception of some sort has
    * occurred. This class is the general class of exceptions produced by
    * failed or interrupted I/O operations.
    * @throws ServiceException Thrown if an unexpected response is found.
    * @return The response to a RecordSet List operation.
    */
    RecordSetListResponse listNext(String nextLink) throws IOException, ServiceException;
    
    /**
    * Lists RecordSets in a DNS zone. Depending on the previous call, it will
    * list all types or by type.
    *
    * @param nextLink Required. NextLink from the previous successful call to
    * List operation.
    * @return The response to a RecordSet List operation.
    */
    Future<RecordSetListResponse> listNextAsync(String nextLink);
}