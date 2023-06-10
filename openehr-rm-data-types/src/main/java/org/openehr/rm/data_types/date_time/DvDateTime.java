package org.openehr.rm.data_types.date_time;

import org.openehr.base_foundation_types.primitive_types.Boolean;
import org.openehr.base_foundation_types.primitive_types.Double;
import org.openehr.base_foundation_types.primitive_types.String;
import org.openehr.base_foundation_types.time_types.Iso8601DateTime;
import org.openehr.rm_data_types.date_time.DvDuration;
import org.openehr.rm_data_types.date_time.DvTemporal;

/**
 * Represents an absolute point in time, specified to the second. Semantics defined by ISO 8601.
 */
public interface DvDateTime extends DvTemporal, Iso8601DateTime {
  /**
   * ISO8601 date/time string.
   */
  String getValue();

  /**
   * Numeric value of the date/time as seconds since the calendar origin date/time `0001-01-01T00:00:00Z`.
   */
  Double magnitude();

  /**
   * Addition of a Duration to this Date/time.
   */
  org.openehr.rm_data_types.date_time.DvDateTime add(Object aDiff);

  /**
   * Subtract a Duration from this Date/time.
   */
  org.openehr.rm_data_types.date_time.DvDateTime subtract(Object aDiff);

  /**
   * Difference between this Date/time and `_other_`.
   */
  DvDuration diff(Object other);

  /**
   * True if this date-time object is less than `_other_`, based on comparison of `_magnitude()_`.
   */
  Boolean lessThan(Object other);

  /**
   * True, for any two Date/times.
   */
  Boolean isStrictlyComparableTo(Object other);
}
