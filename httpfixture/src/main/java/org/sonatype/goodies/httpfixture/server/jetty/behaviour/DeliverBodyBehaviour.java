/*
 * Copyright (c) 2010-present Sonatype, Inc. All rights reserved.
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
package org.sonatype.goodies.httpfixture.server.jetty.behaviour;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.sonatype.goodies.httpfixture.server.api.Behaviour;

/**
 * {@link Behaviour} that combines {@link ErrorBehaviour} and {@link Content} behaviours,
 * by letting specifying response error code along with body, thus allowing to simulate error pages too.
 */
public class DeliverBodyBehaviour
    extends BehaviourSupport
{
  private final int code;

  private final String bodyContentType;

  private final String body;

  public DeliverBodyBehaviour(final int code, final String bodyContentType, final String body) {
    this.code = code;
    this.bodyContentType = bodyContentType;
    this.body = body;
  }

  public boolean execute(HttpServletRequest request, HttpServletResponse response, Map<Object, Object> ctx)
      throws Exception
  {
    response.setStatus(code);
    response.setContentType(bodyContentType);
    final byte[] bodyPayload = body.getBytes("UTF-8");
    response.setContentLength(bodyPayload.length);
    response.getOutputStream().write(bodyPayload);
    return true;
  }
}