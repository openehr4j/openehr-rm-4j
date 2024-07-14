package io.github.openehr4j.rm.demographic;

import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;
import io.github.openehr4j.rm.data_types.text.DvText;

public interface PartyIdentity {
// FIXME public interface PartyIdentity extends Locatable {

  ItemStructure getDetails();

  DvText purpose();
}
