package io.github.openehr4j.rm.data_types.time_specification;

import io.github.openehr4j.rm.data_types.basic.DataValue;
import io.github.openehr4j.rm.data_types.encapsulated.DvParsable;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_time_specification_class">specifications.openehr.org</a>
 */
public interface DvTimeSpecification extends DataValue {

  DvParsable getValue();

  String calendarAlignment();

  String eventAlignment();

  Boolean institutionSpecified();
}
