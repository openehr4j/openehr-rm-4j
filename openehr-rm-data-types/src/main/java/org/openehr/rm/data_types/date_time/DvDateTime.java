package org.openehr.rm.data_types.date_time;

import org.openehr.base_foundation_types.primitive_types.Double;
import org.openehr.base_foundation_types.time_types.Iso8601DateTime;

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
  DvDateTime add(DvDateTime aDiff);

  /**
   * Subtract a Duration from this Date/time.
   */
  DvDateTime subtract(DvDateTime aDiff);

  /**
   * Difference between this Date/time and `_other_`.
   */
  DvDuration diff(DvDateTime other);

  /**
   * True if `_other_` is less than this Quantified object. Based on comparison of `_magnitude_`.
   */
  Boolean lessThan(DvDateTime other);

  /**
   * True, for any two Date/times.
   */
  Boolean isStrictlyComparableTo(DvDateTime other);
}
