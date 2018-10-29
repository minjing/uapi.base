/*
 * Copyright (c) 2018. The UAPI Authors
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at the LICENSE file.
 *
 * You must gained the permission from the authors if you want to
 * use the project into a commercial product
 */

package uapi.service.annotation;

/**
 * Service type
 */
public enum ServiceType {

    /**
     * If the uapi.service is tagged as Singleton which means framework will create only
     * on instance for this uapi.service at application lifecycle.
     */
    Singleton,

    /**
     * If the uapi.service is tagged as Prototype which means framework will create new
     * instance from the prototype uapi.service when other uapi.service reference the prototype
     * uapi.service.
     */
    Prototype
}
