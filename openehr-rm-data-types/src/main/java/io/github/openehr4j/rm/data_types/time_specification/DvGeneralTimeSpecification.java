package io.github.openehr4j.rm.data_types.time_specification;

public interface DvGeneralTimeSpecification extends DvTimeSpecification {

  String calendarAlignment();

  String eventAlignment();

  Boolean institutionSpecified();
}
