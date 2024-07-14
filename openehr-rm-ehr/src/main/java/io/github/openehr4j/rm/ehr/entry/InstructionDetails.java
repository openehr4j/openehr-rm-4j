package io.github.openehr4j.rm.ehr.entry;

import org.openehr.base.base_types.identification.LocatableRef;
import io.github.openehr4j.rm.common.archetyped.Pathable;
import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr.html#_instruction_details_class">specifications.openehr.org</a>
 */
public interface InstructionDetails extends Pathable {

  LocatableRef getInstructionId();

  String getActivityId();

  ItemStructure getWfDetails();
}
