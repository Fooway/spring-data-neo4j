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

package org.neo4j.ogm.annotation;

import java.lang.annotation.*;

/**
 * Establishes the mapping between a domain entity attribute
 * and a node or relationship property in the graph.
 *
 * This annotation is not needed if the mapping can be
 * derived by the OGM, according to the following
 * heuristics:
 *
 *      an accessor method
 *
 * @author Vince Bickers
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@Inherited
public @interface Property {

    static final String CLASS = "org.neo4j.ogm.annotation.Property";
    static final String NAME = "name";

    /**
     * The property name to be used in the graph.
     * @return
     */
    String name() default "";
}
