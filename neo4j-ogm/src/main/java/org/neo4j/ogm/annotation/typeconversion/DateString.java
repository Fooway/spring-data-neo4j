/*
 * Copyright (c)  [2011-2015] "Neo Technology" / "Graph Aware Ltd."
 *
 * This product is licensed to you under the Apache License, Version 2.0 (the "License").
 * You may not use this product except in compliance with the License.
 *
 * This product may include a number of subcomponents with
 * separate copyright notices and license terms. Your use of the source
 * code for these subcomponents is subject to the terms and
 * conditions of the subcomponent's license, as noted in the LICENSE file.
 */

package org.neo4j.ogm.annotation.typeconversion;

import java.lang.annotation.*;

/**
 * Converts a {@see java.util.Date} to a String in the ISO 8601 format: "yyyy-MM-dd’T’HH:mm:ss.SSSXXX" for storage in the graph
 * and back to a {@see java.util.Date} during retrieval.
 * @author Vince Bickers
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@Inherited
public @interface DateString {

    static final String CLASS = "org.neo4j.ogm.annotation.typeconversion.DateString";
    static final String FORMAT = "value";

    static final String ISO_8601 ="yyyy-MM-dd'T'HH:mm:ss.SSSXXX";

    String value() default ISO_8601;

}

