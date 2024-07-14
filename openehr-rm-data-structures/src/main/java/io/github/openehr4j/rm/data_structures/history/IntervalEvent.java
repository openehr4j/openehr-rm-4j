package io.github.openehr4j.rm.data_structures.history;

import io.github.openehr4j.rm.data_types.date_time.DvDateTime;
import io.github.openehr4j.rm.data_types.date_time.DvDuration;
import io.github.openehr4j.rm.data_types.text.DvCodedText;

public interface IntervalEvent extends Event {

  DvDuration getWidth();

  Integer getSampleCount();

  DvCodedText getMathFunction();

  DvDateTime intervalStartTime();
}
