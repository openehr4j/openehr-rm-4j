package org.openehr.rm.common.archetyped;

import org.openehr.base_base_types.identification.ArchetypeId;
import org.openehr.base_base_types.identification.TemplateId;
import org.openehr.base_foundation_types.primitive_types.String;

/**
 * Archetypes act as the configuration basis for the particular structures of instances defined by the reference model. To enable archetypes to be used to create valid data, key classes in the reference model act as  root  points for archetyping; accordingly, these classes have the `_archetype_details_` attribute set.
 */
public interface Archetyped {
  /**
   * Globally unique archetype identifier.
   */
  ArchetypeId getArchetypeId();

  /**
   * Globally unique template identifier, if a template was active at this point in the structure. Normally, a template would only be used at the top of a top-level structure, but the possibility exists for templates at lower levels.
   */
  TemplateId getTemplateId();

  /**
   * Version of the openEHR reference model used to create this object. Expressed in terms of the release version string, e.g.  1.0 ,  1.2.4 .
   */
  String getRmVersion();
}
