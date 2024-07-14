package io.github.openehr4j.rm.data_types.time_specification;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_general_time_specification_class">specifications.openehr.org</a>
 */
public interface DvGeneralTimeSpecification extends DvTimeSpecification {

  String calendarAlignment();

  String eventAlignment();

  Boolean institutionSpecified();
}
