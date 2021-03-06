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
package org.gedcomx.source;

import org.gedcomx.common.Attributable;
import org.gedcomx.common.Attribution;
import org.gedcomx.common.Qualifier;
import org.gedcomx.common.URI;
import org.gedcomx.links.HypermediaEnabledData;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;


/**
 * An attributable reference to a description of a source.
 *
 * @author Reed Ellsworth
 */
@Root (name = "sourceReference", strict = false)
public class SourceReference extends HypermediaEnabledData implements Attributable
{

  @Attribute (name = "description", required = false)
  private URI descriptionRef;
  @Element (required = false)
  private Attribution attribution;
  @ElementList (entry = "qualifier", inline = true, required = false)
  private List<Qualifier> qualifiers;

  /**
   * The attribution metadata for this source reference.
   *
   * @return The attribution metadata for this source reference.
   */
  public Attribution getAttribution() {
    return attribution;
  }

  /**
   * The attribution metadata for this source reference.
   *
   * @param attribution The attribution metadata for this source reference.
   */
  public void setAttribution( Attribution attribution ) {
    this.attribution = attribution;
  }

  /**
   * A reference to a description of the source being referenced.
   *
   * @return A reference to a description of the source being referenced.
   */
  public URI getDescriptionRef() {
    return descriptionRef;
  }

  /**
   * A reference to a description of the source being referenced.
   *
   * @param descriptionRef A reference to a description of the source being referenced.
   */
  public void setDescriptionRef( URI descriptionRef ) {
    this.descriptionRef = descriptionRef;
  }

  /**
   * The qualifiers associated with this source reference.
   *
   * @return The qualifiers associated with this source reference.
   */
  public List<Qualifier> getQualifiers() {
    return qualifiers;
  }

  /**
   * Set the qualifiers associated with this source reference.
   *
   * @param qualifiers qualifiers to associate with this source reference.
   */
  public void setQualifiers( List<Qualifier> qualifiers ) {
    this.qualifiers = qualifiers;
  }
}
