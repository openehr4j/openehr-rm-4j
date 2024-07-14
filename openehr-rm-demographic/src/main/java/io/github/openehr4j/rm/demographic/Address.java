package io.github.openehr4j.rm.demographic;

import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;
import io.github.openehr4j.rm.data_types.text.DvText;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/demographic.html#_address_class">specifications.openehr.org</a>
 */
public interface Address {

// FIXME public interface Address extends Locatable

  ItemStructure getDetails();

  DvText type();
}
