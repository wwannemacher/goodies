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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-b10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.10 at 07:09:54 PM PDT 
//


package org.sonatype.sisu.litmus.testsupport.junit.index;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.thoughtworks.xstream.annotations.XStreamAlias;


/**
 * <p>Java class for Test complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Test">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="index" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="className" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="methodName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="duration" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="success" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="throwableMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="throwableStacktrace" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://sonatype.com/xsd/litmus-testsupport/index/1.0}testInfo" maxOccurs="unbounded"
 * minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Test", propOrder = {
    "index",
    "className",
    "methodName",
    "duration",
    "success",
    "throwableMessage",
    "throwableStacktrace",
    "testInfos"
})
@XmlRootElement(name = "test")
@Generated(value = "XJC 2.2.5-b10", date = "2014-03-10T19:09:54")
@XStreamAlias("test")
public class TestXO
{

  protected int index;

  @XmlElement(required = true)
  protected String className;

  @XmlElement(required = true)
  protected String methodName;

  protected long duration;

  protected boolean success;

  protected String throwableMessage;

  protected String throwableStacktrace;

  @XmlElement(name = "testInfo", namespace = "http://sonatype.com/xsd/litmus-testsupport/index/1.0")
  protected List<TestInfoXO> testInfos;

  /**
   * Gets the value of the index property.
   */
  public int getIndex() {
    return index;
  }

  /**
   * Sets the value of the index property.
   */
  public void setIndex(int value) {
    this.index = value;
  }

  /**
   * Gets the value of the className property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getClassName() {
    return className;
  }

  /**
   * Sets the value of the className property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setClassName(String value) {
    this.className = value;
  }

  /**
   * Gets the value of the methodName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getMethodName() {
    return methodName;
  }

  /**
   * Sets the value of the methodName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setMethodName(String value) {
    this.methodName = value;
  }

  /**
   * Gets the value of the duration property.
   */
  public long getDuration() {
    return duration;
  }

  /**
   * Sets the value of the duration property.
   */
  public void setDuration(long value) {
    this.duration = value;
  }

  /**
   * Gets the value of the success property.
   */
  public boolean isSuccess() {
    return success;
  }

  /**
   * Sets the value of the success property.
   */
  public void setSuccess(boolean value) {
    this.success = value;
  }

  /**
   * Gets the value of the throwableMessage property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getThrowableMessage() {
    return throwableMessage;
  }

  /**
   * Sets the value of the throwableMessage property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setThrowableMessage(String value) {
    this.throwableMessage = value;
  }

  /**
   * Gets the value of the throwableStacktrace property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getThrowableStacktrace() {
    return throwableStacktrace;
  }

  /**
   * Sets the value of the throwableStacktrace property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setThrowableStacktrace(String value) {
    this.throwableStacktrace = value;
  }

  /**
   * Gets the value of the testInfos property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the testInfos property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTestInfos().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link TestInfoXO }
   */
  public List<TestInfoXO> getTestInfos() {
    if (testInfos == null) {
      testInfos = new ArrayList<TestInfoXO>();
    }
    return this.testInfos;
  }

  public void setTestInfos(List<TestInfoXO> value) {
    this.testInfos = null;
    List<TestInfoXO> draftl = this.getTestInfos();
    draftl.addAll(value);
  }

  public TestXO withIndex(int value) {
    setIndex(value);
    return this;
  }

  public TestXO withClassName(String value) {
    setClassName(value);
    return this;
  }

  public TestXO withMethodName(String value) {
    setMethodName(value);
    return this;
  }

  public TestXO withDuration(long value) {
    setDuration(value);
    return this;
  }

  public TestXO withSuccess(boolean value) {
    setSuccess(value);
    return this;
  }

  public TestXO withThrowableMessage(String value) {
    setThrowableMessage(value);
    return this;
  }

  public TestXO withThrowableStacktrace(String value) {
    setThrowableStacktrace(value);
    return this;
  }

  public TestXO withTestInfos(TestInfoXO... values) {
    if (values != null) {
      for (TestInfoXO value : values) {
        getTestInfos().add(value);
      }
    }
    return this;
  }

  public TestXO withTestInfos(Collection<TestInfoXO> values) {
    if (values != null) {
      getTestInfos().addAll(values);
    }
    return this;
  }

  public TestXO withTestInfos(List<TestInfoXO> value) {
    setTestInfos(value);
    return this;
  }

}
