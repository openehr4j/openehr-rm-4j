package org.openehr.rm.ehr.entry;

import org.openehr.rm.data_structures.item_structure.ItemStructure;
import org.openehr.rm.data_types.encapsulated.DvParsable;




public interface Activity {
// FIXME public interface Activity extends Locatable {



  DvParsable getTiming();




  String getActionArchetypeId();




  ItemStructure getDescription();
}
