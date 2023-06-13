package org.openehr.rm.ehr.entry;

import java.util.List;

import org.openehr.rm.data_types.date_time.DvDateTime;
import org.openehr.rm.data_types.encapsulated.DvParsable;
import org.openehr.rm.data_types.text.DvText;

/**
 * Used to specify actions in the future. Enables simple and complex specifications to be expressed, including in a fully-computable workflow form. Used for any actionable statement such as medication and therapeutic orders, monitoring, recall and review. Enough details must be provided for the specification to be directly executed by an actor, either human or machine.
 */
public interface Instruction extends CareEntry {
  /**
   * Mandatory human-readable version of what the Instruction is about.
   */
  DvText getNarrative();

  /**
   * Optional expiry date/time to assist determination of when an Instruction can be assumed to have expired. This helps prevent false listing of Instructions as Active when they clearly must have been terminated in some way or other.
   */
  DvDateTime getExpiryTime();

  /**
   * Optional workflow engine executable expression of the Instruction.
   */
  DvParsable getWfDefinition();

  /**
   * List of all activities in Instruction.
   */
  List getActivities();
}
