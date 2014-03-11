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
 * <p>Java class for Index complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Index">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="counter" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element ref="{http://sonatype.com/xsd/litmus-testsupport/index/1.0}test" maxOccurs="unbounded"
 * minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Index", propOrder = {
    "counter",
    "tests"
})
@XmlRootElement(name = "index")
@Generated(value = "XJC 2.2.5-b10", date = "2014-03-10T19:09:54")
@XStreamAlias("index")
public class IndexXO
{

  protected int counter;

  @XmlElement(name = "test", namespace = "http://sonatype.com/xsd/litmus-testsupport/index/1.0")
  protected List<TestXO> tests;

  /**
   * Gets the value of the counter property.
   */
  public int getCounter() {
    return counter;
  }

  /**
   * Sets the value of the counter property.
   */
  public void setCounter(int value) {
    this.counter = value;
  }

  /**
   * Gets the value of the tests property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the tests property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getTests().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link TestXO }
   */
  public List<TestXO> getTests() {
    if (tests == null) {
      tests = new ArrayList<TestXO>();
    }
    return this.tests;
  }

  public void setTests(List<TestXO> value) {
    this.tests = null;
    List<TestXO> draftl = this.getTests();
    draftl.addAll(value);
  }

  public IndexXO withCounter(int value) {
    setCounter(value);
    return this;
  }

  public IndexXO withTests(TestXO... values) {
    if (values != null) {
      for (TestXO value : values) {
        getTests().add(value);
      }
    }
    return this;
  }

  public IndexXO withTests(Collection<TestXO> values) {
    if (values != null) {
      getTests().addAll(values);
    }
    return this;
  }

  public IndexXO withTests(List<TestXO> value) {
    setTests(value);
    return this;
  }

}
