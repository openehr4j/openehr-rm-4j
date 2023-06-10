package org.openehr.rm.data_types.date_time;

import org.openehr.base_foundation_types.primitive_types.Boolean;
import org.openehr.base_foundation_types.primitive_types.Double;
import org.openehr.base_foundation_types.primitive_types.String;
import org.openehr.base_foundation_types.time_types.Iso8601Duration;
import org.openehr.rm_data_types.quantity.DvAmount;

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
  org.openehr.rm_data_types.date_time.DvDuration add(Object other);

  /**
   * Difference of this Duration and `_other_`.
   */
  org.openehr.rm_data_types.date_time.DvDuration subtract(Object other);

  /**
   * Product of this Duration and `_factor_`.
   */
  org.openehr.rm_data_types.date_time.DvDuration multiply(Object factor);

  /**
   * True if this duration object is less than `_other_`, based on comparison of `_magnitude()_`.
   */
  Boolean lessThan(Object other);

  /**
   * True, for any two Durations.
   */
  Boolean isStrictlyComparableTo(Object other);

  /**
   * Negated version of current duration.
   */
  org.openehr.rm_data_types.date_time.DvDuration negative();

  /**
   * Numeric value of the duration as a number of seconds. Computed using the method `_to_seconds()_` inherited from `Iso8601_duration`.
   */
  Double magnitude();
}
