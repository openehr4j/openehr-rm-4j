package io.github.openehr4j.rm.ehr.entry;

import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;
import io.github.openehr4j.rm.data_types.date_time.DvDateTime;

public interface Action extends CareEntry {

  DvDateTime getTime();

  IsmTransition getIsmTransition();

  InstructionDetails getInstructionDetails();

  ItemStructure getDescription();
}
