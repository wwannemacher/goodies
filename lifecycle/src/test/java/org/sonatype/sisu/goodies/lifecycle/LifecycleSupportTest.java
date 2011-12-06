/*
 * Copyright (c) 2007-2011 Sonatype, Inc. All rights reserved.
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
package org.sonatype.sisu.goodies.lifecycle;

import org.junit.Test;
import org.sonatype.sisu.litmus.testsupport.TestSupport;

import static org.junit.Assert.fail;

/**
 * Tests for {@link LifecycleSupport}.
 */
public class LifecycleSupportTest
    extends TestSupport
{
    @Test
    public void startStop() throws Exception {
        LifecycleSupport support = new LifecycleSupport() {
            @Override
            protected void onFailure(final Throwable cause) {
                super.onFailure(cause);
            }

            @Override
            protected void doStart() throws Exception {
                log("DO START");
            }

            @Override
            protected void doStop() throws Exception {
                log("DO STOP");
            }
        };

        support.start();
        support.stop();
        support.start();
        support.stop();
    }

    @Test
    public void startStopFail() throws Exception {
        LifecycleSupport support = new LifecycleSupport() {
            @Override
            protected void onFailure(final Throwable cause) {
                super.onFailure(cause);
            }

            @Override
            protected void doStart() throws Exception {
                log("DO START");
            }

            @Override
            protected void doStop() throws Exception {
                log("DO STOP");
                throw new Exception("FAIL");
            }
        };

        support.start();

        try {
            support.stop();
            fail();
        }
        catch (Exception e) {
            // expected
        }

        try {
            support.start();
            fail("Allowed start after fail");
        }
        catch (Exception e) {
            // expected
        }
    }
}