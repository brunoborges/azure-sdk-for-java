/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.website.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * VnetRoute contract used to pass routing information for a vnet.
 */
@JsonFlatten
public class VnetRoute extends Resource {
    /**
     * The name of this route. This is only returned by the server and does
     * not need to be set by the client.
     */
    @JsonProperty(value = "properties.name")
    private String vnetRouteName;

    /**
     * The starting address for this route. This may also include a CIDR
     * notation, in which case the end address must not be specified.
     */
    @JsonProperty(value = "properties.startAddress")
    private String startAddress;

    /**
     * The ending address for this route. If the start address is specified in
     * CIDR notation, this must be omitted.
     */
    @JsonProperty(value = "properties.endAddress")
    private String endAddress;

    /**
     * The type of route this is:
     * DEFAULT - By default, every web app has routes to the local
     * address ranges specified by RFC1918
     * INHERITED - Routes inherited from the real Virtual Network
     * routes
     * STATIC - Static route set on the web app only
     * 
     * These values will be used for syncing a Web App's routes
     * with those from a Virtual Network. This operation will clear all
     * DEFAULT and INHERITED routes and replace them
     * with new INHERITED routes.
     */
    @JsonProperty(value = "properties.routeType")
    private String routeType;

    /**
     * Get the vnetRouteName value.
     *
     * @return the vnetRouteName value
     */
    public String getVnetRouteName() {
        return this.vnetRouteName;
    }

    /**
     * Set the vnetRouteName value.
     *
     * @param vnetRouteName the vnetRouteName value to set
     */
    public void setVnetRouteName(String vnetRouteName) {
        this.vnetRouteName = vnetRouteName;
    }

    /**
     * Get the startAddress value.
     *
     * @return the startAddress value
     */
    public String getStartAddress() {
        return this.startAddress;
    }

    /**
     * Set the startAddress value.
     *
     * @param startAddress the startAddress value to set
     */
    public void setStartAddress(String startAddress) {
        this.startAddress = startAddress;
    }

    /**
     * Get the endAddress value.
     *
     * @return the endAddress value
     */
    public String getEndAddress() {
        return this.endAddress;
    }

    /**
     * Set the endAddress value.
     *
     * @param endAddress the endAddress value to set
     */
    public void setEndAddress(String endAddress) {
        this.endAddress = endAddress;
    }

    /**
     * Get the routeType value.
     *
     * @return the routeType value
     */
    public String getRouteType() {
        return this.routeType;
    }

    /**
     * Set the routeType value.
     *
     * @param routeType the routeType value to set
     */
    public void setRouteType(String routeType) {
        this.routeType = routeType;
    }

}