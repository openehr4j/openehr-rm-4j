package org.openehr.rm.demographic;

import org.openehr.base_foundation_types.terminology.TerminologyTerm;
import org.openehr.rm_common.archetyped.Locatable;
import org.openehr.rm_data_structures.representation.Cluster;

/**
 * Address of contact, which may be electronic or geographic.
 */
public interface Address extends Locatable {
  /**
   * Archetypable structured address.
   */
  Cluster getDescription();

  /**
   * Type of address, e.g. electronic, locality. Taken from value of inherited `_name_` attribute.
   */
  TerminologyTerm type();
}
