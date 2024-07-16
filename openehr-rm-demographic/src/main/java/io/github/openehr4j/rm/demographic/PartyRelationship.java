package io.github.openehr4j.rm.demographic;

import org.openehr.base.base_types.identification.PartyRef;

import io.github.openehr4j.rm.common.archetyped.Locatable;
import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;
import io.github.openehr4j.rm.data_types.text.DvText;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/demographic.html#_party_relationship_class">specifications.openehr.org</a>
 */
public interface PartyRelationship extends Locatable {

  ItemStructure getDetails();

  PartyRef getTarget();

  Object getTimeValidity();

  PartyRef getSource();

  DvText type();
}
