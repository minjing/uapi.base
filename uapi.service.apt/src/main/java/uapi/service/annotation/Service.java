/*
 * Copyright (C) 2017. The UAPI Authors
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at the LICENSE file.
 *
 * You must gained the permission from the authors if you want to
 * use the project into a commercial product
 */

package uapi.service.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicate the annotated class is a uapi.service
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Service {

    /**
     * The uapi.service types
     *
     * @return  Service types
     */
    Class<?>[] value() default {};

    /**
     * Service ids
     *
     * @return  Service ids
     */
    String[] ids() default {};

    /**
     * Indicate the uapi.service should be activated after system launched automatically or not
     *
     * @return  True means activated the uapi.service otherwise do nothing
     */
    boolean autoActive() default false;

    /**
     * Indicate type of the uapi.service
     *
     * @return  The uapi.service type
     */
    ServiceType type() default ServiceType.Singleton;
}
