package io.github.openehr4j.rm.demographic;

import io.github.openehr4j.rm.common.archetyped.Locatable;
import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/demographic.html#_capability_class">specifications.openehr.org</a>
 */
public interface Capability extends Locatable {

  ItemStructure getCredentials();

  Object getTimeValidity();
}
