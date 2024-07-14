package io.github.openehr4j.rm.demographic;

import org.openehr.base.base_types.identification.PartyRef;
import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;
import io.github.openehr4j.rm.data_types.text.DvText;

public interface PartyRelationship {
// FIXME public interface PartyRelationship extends Locatable {

  ItemStructure getDetails();

  PartyRef getTarget();

  Object getTimeValidity();

  PartyRef getSource();

  DvText type();
}
