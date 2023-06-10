package org.openehr.rm.data_types.basic;

import org.openehr.base_foundation_types.primitive_types.Boolean;
import org.openehr.rm_data_types.basic.DataValue;
import org.openehr.rm_data_types.text.DvCodedText;

/**
 * For representing state values which obey a defined state machine, such as a variable  representing the states of an instruction or care process.
 */
public interface DvState extends DataValue {
  /**
   * The state name. State names are determined by a state/event table defined in archetypes, and coded using openEHR Terminology or local archetype terms, as specified by the archetype.
   */
  DvCodedText getValue();

  /**
   * Indicates whether this state is a terminal state, such as  "aborted",  "completed" etc. from which no further transitions are possible.
   */
  Boolean getIsTerminal();
}
