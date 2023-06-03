package org.openehr.rm.ehr.entry;

/**
 * Used to record a clinical action that has been performed, which may have been ad hoc, or due to the execution of an Activity in an Instruction workflow. Every Action corresponds to a careflow step of some kind or another.
 */
public interface Action extends CareEntry {
  /**
   * Point in time at which this action completed. To indicate an unknown time, use a `DV_DATE_TIME` instance with `_value_` set to the time of creation (or some other known time before which the Action is known to have occurred, e.g. data accession timestamp from integration engine), and `_magnitude_status_` set to `<`.
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
