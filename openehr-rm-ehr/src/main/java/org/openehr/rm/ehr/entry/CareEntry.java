package org.openehr.rm.ehr.entry;

import org.openehr.base.base_types.identification.ObjectRef;
import org.openehr.rm.data_structures.item_structure.ItemStructure;




public interface CareEntry extends Entry {



  ItemStructure getProtocol();




  ObjectRef getGuidelineId();
}
