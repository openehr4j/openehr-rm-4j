package org.openehr.rm.data_types.quantity;

import org.openehr.base.foundation_types.interval.Interval;
import org.openehr.rm.data_types.basic.DataValue;

/**
 * Generic class defining an interval (i.e. range) of a comparable type. An interval is a contiguous subrange of a comparable base type. Used to define intervals of dates, times, quantities (whose units match) and so on. The type parameter, `T`, must be a descendant of the type `DV_ORDERED`, which is necessary (but not sufficient) for instances to be compared (`_strictly_comparable_` is also needed).
 */
public interface DvInterval extends DataValue, Interval {
}
