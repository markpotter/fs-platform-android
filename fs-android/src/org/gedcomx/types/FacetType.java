/**
 * Copyright 2011-2012 Intellectual Reserve, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.gedcomx.types;

import org.gedcomx.common.URI;

/**
 * Enumeration of known facet types.
 *
 * @author Reed Ellsworth
 */
/*
@XmlQNameEnum (
  base = XmlQNameEnum.BaseType.URI
)
*/
public enum FacetType
{

  /**
   * A year.
   */
  Year,

  /**
   * A (geographic) state.
   */
  State,

  /**
   * A province.
   */
  Province,

  /**
   * A country.
   */
  Country,

  /**
   * A city.
   */
  City,

  /**
   * A parish
   */
  Parish,

  /**
   * A township.
   */
  Township,

  /**
   * A page.
   */
  Page,

  /**
   * A volume.
   */
  Volume,

  /**
   * A date.
   */
  Date,

  /**
   * A place.
   */
  Place,

  /**
   * A name.
   */
  Name,

  /**
   * A gender.
   */
  Gender,

  /**
   * Custom
   */
//  @XmlUnknownQNameEnumValue
  OTHER;

  /**
   * Return the QName value for this enum.
   *
   * @return The QName value for this enum.
   */
  public URI toQNameURI() {
    return null; // URI.create(org.codehaus.enunciate.XmlQNameEnumUtil.toURIValue(this));
  }

  /**
   * Get the enumeration from the QName.
   *
   * @param qname The qname.
   * @return The enumeration.
   */
  public static FacetType fromQNameURI( URI qname ) {
    return null; // org.codehaus.enunciate.XmlQNameEnumUtil.fromURIValue(qname.toString(), FacetType.class);
  }

}
