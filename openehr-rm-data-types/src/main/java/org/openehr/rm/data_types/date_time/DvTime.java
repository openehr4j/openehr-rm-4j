package org.openehr.rm.data_types.date_time;

import org.openehr.base_foundation_types.primitive_types.Boolean;
import org.openehr.base_foundation_types.primitive_types.Real;
import org.openehr.base_foundation_types.primitive_types.String;
import org.openehr.base_foundation_types.time_types.Iso8601Time;
import org.openehr.rm_data_types.date_time.DvDuration;
import org.openehr.rm_data_types.date_time.DvTemporal;

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
  org.openehr.rm_data_types.date_time.DvTime add(Object aDiff);

  /**
   * Subtract a Duration from this Time.
   */
  org.openehr.rm_data_types.date_time.DvTime subtract(Object aDiff);

  /**
   * Difference between this Time and `_other_`.
   */
  DvDuration diff(Object other);

  /**
   * True if this time object is less than `_other_`, based on comparison of `_magnitude()_`.
   */
  Boolean lessThan(Object other);

  /**
   * True, for any two Times.
   */
  Boolean isStrictlyComparableTo(Object other);
}
