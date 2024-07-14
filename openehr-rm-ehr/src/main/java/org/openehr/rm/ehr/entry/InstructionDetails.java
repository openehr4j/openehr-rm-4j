package org.openehr.rm.ehr.entry;

import org.openehr.base.base_types.identification.LocatableRef;
import org.openehr.rm.common.archetyped.Pathable;
import org.openehr.rm.data_structures.item_structure.ItemStructure;

public interface InstructionDetails extends Pathable {

  LocatableRef getInstructionId();

  String getActivityId();

  ItemStructure getWfDetails();
}
