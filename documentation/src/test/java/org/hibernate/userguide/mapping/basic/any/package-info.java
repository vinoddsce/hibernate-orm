/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later.
 * See the lgpl.txt file in the root directory or <http://www.gnu.org/licenses/lgpl-2.1.html>.
 */

// $Id$
//tag::mapping-column-any-meta-def-example[]
@AnyMetaDefs(
    @AnyMetaDef( name= "PropertyMetaDef", metaType = "string", idType = "long",
        metaValues = {
                @MetaValue(value = "S", targetEntity = StringProperty.class),
                @MetaValue(value = "I", targetEntity = IntegerProperty.class)
            }
        )
)
package org.hibernate.userguide.mapping.basic.any;

import org.hibernate.annotations.AnyMetaDef;
import org.hibernate.annotations.AnyMetaDefs;
import org.hibernate.annotations.MetaValue;
//end::mapping-column-any-meta-def-example[]

