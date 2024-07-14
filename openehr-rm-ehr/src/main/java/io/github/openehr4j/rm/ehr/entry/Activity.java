package io.github.openehr4j.rm.ehr.entry;

import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;
import io.github.openehr4j.rm.data_types.encapsulated.DvParsable;

public interface Activity {
// FIXME public interface Activity extends Locatable {

  DvParsable getTiming();

  String getActionArchetypeId();

  ItemStructure getDescription();
}
