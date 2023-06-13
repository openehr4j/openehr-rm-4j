package org.openehr.rm.demographic;

import org.openehr.rm.data_structures.item_structure.ItemStructure;
import org.openehr.rm.data_types.text.DvText;

/**
 * Address of contact, which may be electronic or geographic.
 */
public interface Address {
// FIXME public interface Address extends Locatable {
  /**
   * Archetypable structured address.
   */
  ItemStructure getDetails();

  /**
   * Type of address, e.g. electronic,  locality. Taken from value of inherited `_name_` attribute.
   */
  DvText type();
}
