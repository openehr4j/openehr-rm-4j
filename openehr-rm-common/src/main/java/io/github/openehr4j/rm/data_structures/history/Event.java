package io.github.openehr4j.rm.data_structures.history;

import io.github.openehr4j.rm.common.archetyped.Locatable;
import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;
import io.github.openehr4j.rm.data_types.date_time.DvDateTime;
import io.github.openehr4j.rm.data_types.date_time.DvDuration;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_structures.html#_event_class">specifications.openehr.org</a>
 */
public interface Event extends Locatable {

  DvDateTime getTime();

  ItemStructure getState();

  Object getData();

  DvDuration offset();
}
