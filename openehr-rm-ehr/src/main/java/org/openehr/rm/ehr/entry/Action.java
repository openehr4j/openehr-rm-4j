package org.openehr.rm.ehr.entry;

import org.openehr.rm.data_structures.item_structure.ItemStructure;
import org.openehr.rm.data_types.date_time.DvDateTime;

/**
 * Used to record a clinical action that has been performed, which may have been ad hoc, or due to the execution of an Activity in an Instruction workflow. Every Action corresponds to a careflow step of some kind or another.
 */
public interface Action extends CareEntry {
  /**
   * Point in time at which this action completed.
   */
  DvDateTime getTime();

  /**
   * Details of transition in the Instruction state machine caused by this Action.
   */
  IsmTransition getIsmTransition();

  /**
   * Details of the Instruction that caused this Action to be performed, if there was one.
   */
  InstructionDetails getInstructionDetails();

  /**
   * Description of the action that has been performed, in the form of an archetyped structure.
   */
  ItemStructure getDescription();
}
