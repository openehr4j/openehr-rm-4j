package io.github.openehr4j.rm.data_structures.history;

import io.github.openehr4j.rm.data_types.date_time.DvDateTime;
import io.github.openehr4j.rm.data_types.date_time.DvDuration;
import io.github.openehr4j.rm.data_types.text.DvCodedText;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_structures.html#_interval_event_class">specifications.openehr.org</a>
 */
public interface IntervalEvent extends Event {

  DvDuration getWidth();

  Integer getSampleCount();

  DvCodedText getMathFunction();

  DvDateTime intervalStartTime();
}
