package org.openehr.rm.data_structures.history;

import org.openehr.rm.data_types.date_time.DvDateTime;
import org.openehr.rm.data_types.date_time.DvDuration;
import org.openehr.rm.data_types.text.DvCodedText;

public interface IntervalEvent extends Event {

  DvDuration getWidth();

  Integer getSampleCount();

  DvCodedText getMathFunction();

  DvDateTime intervalStartTime();
}
