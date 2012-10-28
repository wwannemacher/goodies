/*
 * Copyright (c) 2007-2012 Sonatype, Inc. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package org.sonatype.sisu.goodies.common.io;

import org.jetbrains.annotations.NonNls;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.sonatype.sisu.goodies.common.UnhandledThrowable;

import java.io.Flushable;
import java.io.IOException;

/**
 * Quietly flushes {@link Flushable} objects.
 *
 * @since 1.0
 */
public final class Flusher
{
    @NonNls
    private static final Logger log = LoggerFactory.getLogger(Flusher.class);

    /**
     * @since 1.5
     */
    private Flusher() {}

    public static void flush(final Flushable... targets) {
        if (targets == null) return;

        for (Flushable target : targets) {
            if (target != null) {
                log.trace("Flushing: {}", target);
                try {
                    target.flush();
                }
                catch (IOException e) {
                    UnhandledThrowable.onFailure(e);
                }
            }
        }
    }
}