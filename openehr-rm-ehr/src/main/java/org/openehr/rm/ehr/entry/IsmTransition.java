package org.openehr.rm.ehr.entry;

/**
 * Model of a transition in the Instruction State Machine, caused by a careflow step. The attributes document the careflow step as well as the ISM transition.
 */
public interface IsmTransition extends Pathable {
  /**
   * The ISM current state. Coded by openEHR terminology group Instruction states.
   */
  DvCodedText getCurrentState();

  /**
   * The ISM transition which occurred to arrive in the current_state. Coded by openEHR terminology group  Instruction transitions.
   */
  DvCodedText getTransition();

  /**
   * The step in the careflow process which occurred as part of generating this action, e.g.  dispense ,  start_administration. This attribute represents the clinical  label for the activity, as  opposed to current_state which represents  the state machine (ISM)  computable form. Defined in archetype.
   */
  DvCodedText getCareflowStep();

  /**
   * Optional possibility of adding one or more reasons for this careflow step having been taken. Multiple reasons may occur in medication management for example.
   */
  List<DVTEXT> getReason();
}
