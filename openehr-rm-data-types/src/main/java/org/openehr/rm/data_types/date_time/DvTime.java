package org.openehr.rm.data_types.date_time;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import org.openehr.base.foundation_types.primitive_types.Real;
import org.openehr.base.foundation_types.time_types.Iso8601Time;

/**
 * Represents an absolute point in time from an origin usually interpreted as meaning the start of the current day, specified to a fraction of a second. Semantics defined by ISO 8601.
 */
public interface DvTime extends DvTemporal, Iso8601Time {
  /**
   * ISO8601 time string
   */
  String getValue();

  /**
   * Numeric value of the time as seconds since the start of day, i.e. `00:00:00`.
   */
  Real magnitude();

  /**
   * Addition of a Duration to this Time.
   */
  DvTime add(DvTime aDiff);

  /**
   * Subtract a Duration from this Time.
   */
  DvTime subtract(DvTime aDiff);

  /**
   * Difference between this Time and `_other_`.
   */
  DvDuration diff(Object other);

  /**
   * True if `_other_` is less than this Quantified object. Based on comparison of `_magnitude_`.
   */
  Boolean lessThan(Object other);

  /**
   * True, for any two Times.
   */
  Boolean isStrictlyComparableTo(Object other);
}
