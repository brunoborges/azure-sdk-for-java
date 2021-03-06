/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;


/**
 * The optional parameters class for "matchMethod" method.
 */
public class MatchMethodOptionalParameter {
    /**
    * The list Id.
    */
    private String listId;

    /**
    * Whether to retain the submitted image for future use; defaults to false if omitted.
    */
    private Boolean cacheImage;

    /**
    * Get the listId value.
    *
    * @return the listId value
    */
    public String listId() {
        return this.listId;
    }

    /**
    * Get the cacheImage value.
    *
    * @return the cacheImage value
    */
    public Boolean cacheImage() {
        return this.cacheImage;
    }

    /**
    * Set the listId value.
    * <p>
    * The list Id.
    *
    * @param listId the listId value to set
    * @return the matchMethodOptionalParameter object itself.
    */
    public MatchMethodOptionalParameter withListId(String listId) {
        this.listId = listId;
        return this;
    }

    /**
    * Set the cacheImage value.
    * <p>
    * Whether to retain the submitted image for future use; defaults to false if omitted.
    *
    * @param cacheImage the cacheImage value to set
    * @return the matchMethodOptionalParameter object itself.
    */
    public MatchMethodOptionalParameter withCacheImage(boolean cacheImage) {
        this.cacheImage = cacheImage;
        return this;
    }

    }
