package org.openehr.rm.data_types.date_time;

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
  void magnitude();

  /**
   * Addition of a Duration to this Time.
   */
  void add();

  /**
   * Subtract a Duration from this Time.
   */
  void subtract();

  /**
   * Difference between this Time and `_other_`.
   */
  void diff();

  /**
   * True if this time object is less than `_other_`, based on comparison of `_magnitude()_`.
   */
  void less_than();

  /**
   * True, for any two Times.
   */
  void is_strictly_comparable_to();
}
