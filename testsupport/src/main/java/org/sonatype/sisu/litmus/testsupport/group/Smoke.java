/*
 * Copyright (c) 2007-2013 Sonatype, Inc. All rights reserved.
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

package org.sonatype.sisu.litmus.testsupport.group;

/**
 * Marker interface to <b>categorize an integration test</b> as part of the minimal set of tests that a developer
 * should
 * execute before pushing new code.
 * <p/>
 * For unit tests, it is considered best practice to ensure <b>ALL</b> of your unit tests pass as the minimal measure
 * by which you judge accepting new code into your project.
 *
 * @since litmus 1.5
 */
public interface Smoke
{

}
