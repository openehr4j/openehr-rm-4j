package org.openehr.rm.demographic;

import org.openehr.rm.data_structures.item_structure.ItemStructure;
import org.openehr.rm.data_types.text.DvText;

public interface PartyIdentity {
// FIXME public interface PartyIdentity extends Locatable {

  ItemStructure getDetails();

  DvText purpose();
}
