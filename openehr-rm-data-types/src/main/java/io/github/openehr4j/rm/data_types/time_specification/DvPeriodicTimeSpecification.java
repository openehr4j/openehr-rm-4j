package io.github.openehr4j.rm.data_types.time_specification;

import io.github.openehr4j.rm.data_types.date_time.DvDuration;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_periodic_time_specification_class">specifications.openehr.org</a>
 */
public interface DvPeriodicTimeSpecification extends DvTimeSpecification {

  DvDuration period();

  String calendarAlignment();

  String eventAlignment();

  Boolean institutionSpecified();
}
