package io.github.openehr4j.rm.data_types.time_specification;

import io.github.openehr4j.rm.data_types.date_time.DvDuration;

public interface DvPeriodicTimeSpecification extends DvTimeSpecification {

  DvDuration period();

  String calendarAlignment();

  String eventAlignment();

  Boolean institutionSpecified();
}
