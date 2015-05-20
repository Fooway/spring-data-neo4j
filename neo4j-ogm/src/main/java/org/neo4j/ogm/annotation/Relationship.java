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
 * Identifies a relationship to another entity in the graph.
 * This annotation is not required unless the related entity is a {@see RelationshipEntity}
 *
 * @author Vince Bickers
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@Inherited
public @interface Relationship {

    static final String CLASS = "org.neo4j.ogm.annotation.Relationship";
    static final String TYPE = "type";
    static final String DIRECTION = "direction";

    static final String INCOMING = "INCOMING";
    static final String OUTGOING = "OUTGOING";
    static final String UNDIRECTED = "UNDIRECTED";

    /**
     * The relationship type to be used in the graph. If not specified, it defaults to the Upper Snake Case field name.
     * @return the relationship type
     */
    String type() default "";

    /**
     * The direction of the relationship.
     * @return the direction of the relationship
     */
    String direction() default OUTGOING;
}
