package org.openehr.rm.data_types.time_specification;

import org.openehr.rm.data_types.date_time.DvDuration;

public interface DvPeriodicTimeSpecification extends DvTimeSpecification {

  DvDuration period();

  String calendarAlignment();

  String eventAlignment();

  Boolean institutionSpecified();
}
