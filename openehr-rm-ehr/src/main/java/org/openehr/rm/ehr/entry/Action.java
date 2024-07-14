package org.openehr.rm.ehr.entry;

import org.openehr.rm.data_structures.item_structure.ItemStructure;
import org.openehr.rm.data_types.date_time.DvDateTime;

public interface Action extends CareEntry {

  DvDateTime getTime();

  IsmTransition getIsmTransition();

  InstructionDetails getInstructionDetails();

  ItemStructure getDescription();
}
