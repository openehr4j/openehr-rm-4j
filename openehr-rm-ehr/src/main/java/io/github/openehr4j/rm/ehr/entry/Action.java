package io.github.openehr4j.rm.ehr.entry;

import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;
import io.github.openehr4j.rm.data_types.date_time.DvDateTime;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr.html#_action_class">specifications.openehr.org</a>
 */
public interface Action extends CareEntry {

  DvDateTime getTime();

  IsmTransition getIsmTransition();

  InstructionDetails getInstructionDetails();

  ItemStructure getDescription();
}
