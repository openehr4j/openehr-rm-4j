package org.openehr.rm.data_types.date_time;

/**
 * Represents an absolute point in time, as measured on the Gregorian calendar, and specified only to the day. Semantics defined by ISO 8601. Used for recording dates in real world time. The partial form is used for approximate birth dates, dates of death, etc.
 */
public interface DvDate extends DvTemporal, Iso8601Date {
  /**
   * ISO8601 date string.
   */
  String getValue();

  /**
   * Numeric value of the date as days since the calendar origin date `0001-01-01`.
   */
  void magnitude();

  /**
   * Return True if this `DV_QUANTIFIED` is considered equal to `_other_`.
   */
  void is_equal();

  /**
   * Addition of a Duration to this Date.
   */
  void add();

  /**
   * Subtract a Duration from this Date.
   */
  void subtract();

  /**
   * Difference between this Date and `_other_`.
   */
  void diff();

  /**
   * True if this date object is less than `_other_`, based on comparison of `_magnitude()_`.
   */
  void less_than();

  /**
   * True, for any two Dates.
   */
  void is_strictly_comparable_to();
}
