/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.contentmoderator.models;


/**
 * The optional parameters class for "getAllTerms" method.
 */
public class GetAllTermsOptionalParameter {
    /**
    * The pagination start index.
    */
    private Integer offset;

    /**
    * The max limit.
    */
    private Integer limit;

    /**
    * Get the offset value.
    *
    * @return the offset value
    */
    public Integer offset() {
        return this.offset;
    }

    /**
    * Get the limit value.
    *
    * @return the limit value
    */
    public Integer limit() {
        return this.limit;
    }

    /**
    * Set the offset value.
    * <p>
    * The pagination start index.
    *
    * @param offset the offset value to set
    * @return the getAllTermsOptionalParameter object itself.
    */
    public GetAllTermsOptionalParameter withOffset(int offset) {
        this.offset = offset;
        return this;
    }

    /**
    * Set the limit value.
    * <p>
    * The max limit.
    *
    * @param limit the limit value to set
    * @return the getAllTermsOptionalParameter object itself.
    */
    public GetAllTermsOptionalParameter withLimit(int limit) {
        this.limit = limit;
        return this;
    }

    }
