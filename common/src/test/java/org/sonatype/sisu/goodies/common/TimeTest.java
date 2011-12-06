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
package org.sonatype.sisu.goodies.common;

import org.junit.Test;
import org.sonatype.sisu.litmus.testsupport.TestSupport;

import static org.junit.Assert.assertEquals;

/**
 * Tests for {@link Time}.
 */
public class TimeTest
    extends TestSupport
{
    @Test(expected = NullPointerException.class)
    public void nullUnit() {
        new Time(1, null);
    }

    @Test
    public void testTimeConversions() {
        Time oneDay = Time.days(1);

        assertEquals(1 * 24 * 60 * 60 * 1000 * 1000L, oneDay.toMicros());
        assertEquals(1 * 24 * 60 * 60 * 1000L, oneDay.toMillis());
        assertEquals(1 * 24 * 60 * 60L, oneDay.toSeconds());
        assertEquals(1 * 24 * 60L, oneDay.toMinutes());
        assertEquals(1 * 24L, oneDay.toHours());
        assertEquals(1L, oneDay.toDays());

        assertEquals(Time.micros(1 * 24 * 60 * 60 * 1000 * 1000L).toDays(), oneDay.getValue());
        assertEquals(Time.millis(1 * 24 * 60 * 60 * 1000L).toDays(), oneDay.getValue());
        assertEquals(Time.seconds(1 * 24 * 60 * 60L).toDays(), oneDay.getValue());
        assertEquals(Time.minutes(1 * 24 * 60L).toDays(), oneDay.getValue());
        assertEquals(Time.hours(1 * 24L).toDays(), oneDay.getValue());
        assertEquals(Time.days(1L).toDays(), oneDay.getValue());
    }
}