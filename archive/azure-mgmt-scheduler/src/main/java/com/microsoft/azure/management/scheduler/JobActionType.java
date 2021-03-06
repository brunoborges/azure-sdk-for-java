/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.scheduler;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for JobActionType.
 */
public enum JobActionType {
    /** Enum value Http. */
    HTTP("Http"),

    /** Enum value Https. */
    HTTPS("Https"),

    /** Enum value StorageQueue. */
    STORAGE_QUEUE("StorageQueue"),

    /** Enum value ServiceBusQueue. */
    SERVICE_BUS_QUEUE("ServiceBusQueue"),

    /** Enum value ServiceBusTopic. */
    SERVICE_BUS_TOPIC("ServiceBusTopic");

    /** The actual serialized value for a JobActionType instance. */
    private String value;

    JobActionType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a JobActionType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed JobActionType object, or null if unable to parse.
     */
    @JsonCreator
    public static JobActionType fromString(String value) {
        JobActionType[] items = JobActionType.values();
        for (JobActionType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
