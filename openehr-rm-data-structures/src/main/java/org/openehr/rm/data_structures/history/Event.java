package org.openehr.rm.data_structures.history;

import org.openehr.rm.data_structures.item_structure.ItemStructure;
import org.openehr.rm.data_types.date_time.DvDateTime;
import org.openehr.rm.data_types.date_time.DvDuration;

public interface Event {
// FIXME public interface Event extends Locatable {

  DvDateTime getTime();

  ItemStructure getState();

  Object getData();

  DvDuration offset();
}
