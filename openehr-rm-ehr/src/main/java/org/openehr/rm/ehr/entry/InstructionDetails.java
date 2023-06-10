package org.openehr.rm.ehr.entry;

import org.openehr.base_base_types.identification.LocatableRef;
import org.openehr.base_foundation_types.primitive_types.String;
import org.openehr.rm_common.archetyped.Pathable;
import org.openehr.rm_data_structures.item_structure.ItemStructure;

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
