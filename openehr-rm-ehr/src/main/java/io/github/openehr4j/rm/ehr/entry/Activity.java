package io.github.openehr4j.rm.ehr.entry;

import io.github.openehr4j.rm.common.archetyped.Locatable;
import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;
import io.github.openehr4j.rm.data_types.encapsulated.DvParsable;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr.html#_activity_class">specifications.openehr.org</a>
 */
public interface Activity extends Locatable {

  DvParsable getTiming();

  String getActionArchetypeId();

  ItemStructure getDescription();
}
