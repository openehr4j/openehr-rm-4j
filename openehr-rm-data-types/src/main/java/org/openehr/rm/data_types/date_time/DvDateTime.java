package org.openehr.rm.data_types.date_time;

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
  void magnitude();

  /**
   * Addition of a Duration to this Date/time.
   */
  void add();

  /**
   * Subtract a Duration from this Date/time.
   */
  void subtract();

  /**
   * Difference between this Date/time and `_other_`.
   */
  void diff();

  /**
   * True if this date-time object is less than `_other_`, based on comparison of `_magnitude()_`.
   */
  void less_than();

  /**
   * True, for any two Date/times.
   */
  void is_strictly_comparable_to();
}
