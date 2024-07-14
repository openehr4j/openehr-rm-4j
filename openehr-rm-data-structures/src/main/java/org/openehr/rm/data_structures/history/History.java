package org.openehr.rm.data_structures.history;

import java.util.List;

import org.openehr.rm.data_structures.DataStructure;
import org.openehr.rm.data_structures.item_structure.ItemStructure;
import org.openehr.rm.data_types.date_time.DvDateTime;
import org.openehr.rm.data_types.date_time.DvDuration;

public interface History extends DataStructure {

  DvDateTime getOrigin();

  DvDuration getPeriod();

  DvDuration getDuration();

  ItemStructure getSummary();

  List getEvents();

  Boolean isPeriodic();
}
