package org.openehr.rm.ehr.entry;

import org.openehr.base.base_types.identification.LocatableRef;
import org.openehr.rm.common.archetyped.Pathable;
import org.openehr.rm.data_structures.item_structure.ItemStructure;

/**
 * Used to record details of the Instruction causing an Action.
 */
public interface InstructionDetails extends Pathable {
  /**
   * Reference to causing Instruction.
   */
  LocatableRef getInstructionId();

  /**
   * Identifier of Activity within Instruction, in the form of its archetype path.
   */
  String getActivityId();

  /**
   * Various workflow engine state details, potentially including such things as:
   */
  ItemStructure getWfDetails();
}
