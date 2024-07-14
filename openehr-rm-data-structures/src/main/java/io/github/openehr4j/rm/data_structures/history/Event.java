package io.github.openehr4j.rm.data_structures.history;

import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;
import io.github.openehr4j.rm.data_types.date_time.DvDateTime;
import io.github.openehr4j.rm.data_types.date_time.DvDuration;

public interface Event {
// FIXME public interface Event extends Locatable {

  DvDateTime getTime();

  ItemStructure getState();

  Object getData();

  DvDuration offset();
}
