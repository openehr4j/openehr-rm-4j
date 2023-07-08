package org.openehr.rm.data_structures.history;

import org.openehr.base.foundation_types.primitive_types.Integer;
import org.openehr.rm.data_types.date_time.DvDateTime;
import org.openehr.rm.data_types.date_time.DvDuration;
import org.openehr.rm.data_types.text.DvCodedText;

/**
 * Defines a single interval event in a series.
 */
public interface IntervalEvent extends Event {
  /**
   * Duration of the time interval during which the values recorded under `data` are true and, if set, the values recorded under `state` are true. Void if an instantaneous event.
   */
  DvDuration getWidth();

  /**
   * Optional count of original samples to which this event corresponds.
   */
  Integer getSampleCount();

  /**
   * Mathematical function of the data of this event, e.g.  maximum, mean etc. Coded using https://github.com/openEHR/terminology/blob/master/openEHR_RM/en/openehr_terminology.xml[openEHR vocabulary `event math function`]. Default value `640&#124;actual&#124;`, meaning 'actual value'.
   */
  DvCodedText getMathFunction();

  /**
   * Start time of the interval of this event.
   */
  DvDateTime intervalStartTime();
}
