package org.openehr.rm.data_types.date_time;

/**
 * Represents a period of time with respect to a notional point in time, which is not specified. A sign may be used to indicate the duration is  backwards  in time rather than forwards.
 */
public interface DvDuration extends DvAmount, Iso8601Duration {
  /**
   * ISO8601 duration string, including described deviations to support negative values and weeks.
   */
  String getValue();

  /**
   * Sum of this Duration and `_other_`.
   */
  void add();

  /**
   * Difference of this Duration and `_other_`.
   */
  void subtract();

  /**
   * Product of this Duration and `_factor_`.
   */
  void multiply();

  /**
   * True if this duration object is less than `_other_`, based on comparison of `_magnitude()_`.
   */
  void less_than();

  /**
   * True, for any two Durations.
   */
  void is_strictly_comparable_to();

  /**
   * Negated version of current duration.
   */
  void negative();

  /**
   * Numeric value of the duration as a number of seconds. Computed using the method `_to_seconds()_` inherited from `Iso8601_duration`.
   */
  void magnitude();
}
