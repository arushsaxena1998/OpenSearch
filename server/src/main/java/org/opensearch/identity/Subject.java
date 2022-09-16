/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

package org.opensearch.identity;

import java.security.Principal;

/**
 * An individual, process, or device that causes information to flow among objects or change to the system state.
 *
 * Used to authorize activities inside of the OpenSearch ecosystem.
 */
public interface Subject {

    /**
     * Get the application-wide uniquely identifying principal
     * */
    public Principal getPrincipal();

}
