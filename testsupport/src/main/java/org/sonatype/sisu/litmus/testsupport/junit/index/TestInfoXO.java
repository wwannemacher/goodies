/*
 * Copyright (c) 2007-2014 Sonatype, Inc. All rights reserved.
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
package org.sonatype.sisu.litmus.testsupport.junit.index;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * Test information exchange object.
 *
 * @since 1.10
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestInfo", propOrder = {
    "link",
    "key",
    "value"
})
@XmlRootElement(name = "testInfo")
@Generated(value = "XJC 2.2.5-b10", date = "2014-03-10T19:09:54")
@XStreamAlias("testInfo")
public class TestInfoXO
{

  protected boolean link;

  @XmlElement(required = true)
  protected String key;

  @XmlElement(required = true)
  protected String value;

  /**
   * Gets the value of the link property.
   */
  public boolean isLink() {
    return link;
  }

  /**
   * Sets the value of the link property.
   */
  public void setLink(boolean value) {
    this.link = value;
  }

  /**
   * Gets the value of the key property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getKey() {
    return key;
  }

  /**
   * Sets the value of the key property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setKey(String value) {
    this.key = value;
  }

  /**
   * Gets the value of the value property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getValue() {
    return value;
  }

  /**
   * Sets the value of the value property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setValue(String value) {
    this.value = value;
  }

  public TestInfoXO withLink(boolean value) {
    setLink(value);
    return this;
  }

  public TestInfoXO withKey(String value) {
    setKey(value);
    return this;
  }

  public TestInfoXO withValue(String value) {
    setValue(value);
    return this;
  }

}
