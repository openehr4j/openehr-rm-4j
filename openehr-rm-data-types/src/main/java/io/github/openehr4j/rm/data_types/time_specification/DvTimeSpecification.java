package io.github.openehr4j.rm.data_types.time_specification;

import io.github.openehr4j.rm.data_types.basic.DataValue;
import io.github.openehr4j.rm.data_types.encapsulated.DvParsable;

public interface DvTimeSpecification extends DataValue {

  DvParsable getValue();

  String calendarAlignment();

  String eventAlignment();

  Boolean institutionSpecified();
}
