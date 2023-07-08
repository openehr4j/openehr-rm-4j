package org.openehr.rm.data_types.date_time;

import org.openehr.base.foundation_types.time_types.Iso8601Duration;
import org.openehr.rm.data_types.quantity.DvAmount;

/**
 * Represents a period of time with respect to a notional point in time, which is not specified. A sign may be used to indicate the duration is  backwards  in time rather than forwards.
 *
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_duration_class">specifications.openehr.org</a>
 */
public interface DvDuration extends DvAmount, Iso8601Duration {
  /**
   * ISO8601 duration string, including described deviations to support negative values and weeks.
   */
  String getValue();

  /**
   * Sum of this Duration and `_other_`.
   */
  DvDuration add(DvDuration other);

  /**
   * Difference of this Duration and `_other_`.
   */
  DvDuration subtract(DvDuration other);

  /**
   * Product of this Duration and `_factor_`.
   */
  DvDuration multiply(DvDuration factor);

  /**
   * True if `_other_` is less than this Quantified object. Based on comparison of `_magnitude_`.
   */
  Boolean lessThan(DvDuration other);

  /**
   * True, for any two Durations.
   */
  Boolean isStrictlyComparableTo(DvDuration other);

  /**
   * Negated version of current duration.
   */
  DvDuration negative();

  /**
   * Numeric value of the duration as a number of seconds. Computed using the method `_to_seconds()_` inherited from `Iso8601_duration`.
   */
  Double magnitude();
}
