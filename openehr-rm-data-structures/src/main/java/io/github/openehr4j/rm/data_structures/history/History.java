package io.github.openehr4j.rm.data_structures.history;

import java.util.List;

import io.github.openehr4j.rm.data_structures.DataStructure;
import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;
import io.github.openehr4j.rm.data_types.date_time.DvDateTime;
import io.github.openehr4j.rm.data_types.date_time.DvDuration;

public interface History extends DataStructure {

  DvDateTime getOrigin();

  DvDuration getPeriod();

  DvDuration getDuration();

  ItemStructure getSummary();

  List getEvents();

  Boolean isPeriodic();
}
