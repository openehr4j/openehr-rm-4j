package org.openehr.rm.demographic;

import org.openehr.rm.data_structures.item_structure.ItemStructure;
import org.openehr.rm.data_types.text.DvText;

public interface Address {
// FIXME public interface Address extends Locatable {

  ItemStructure getDetails();

  DvText type();
}
