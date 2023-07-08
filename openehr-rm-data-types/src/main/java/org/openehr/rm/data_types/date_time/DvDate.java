package org.openehr.rm.data_types.date_time;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import org.openehr.base.foundation_types.primitive_types.Integer;
import org.openehr.base.foundation_types.time_types.Iso8601Date;

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
  Integer magnitude();

  /**
   * Return True if this `DV_QUANTIFIED` is considered equal to `_other_`.
   */
  Boolean isEqual(Object other);

  /**
   * Addition of a Duration to this Date.
   */
  DvDate add(DvDate aDiff);

  /**
   * Subtract a Duration from this Date.
   */
  DvDate subtract(DvDate aDiff);

  /**
   * Difference between this Date and `_other_`.
   */
  DvDuration diff(Object other);

  /**
   * True if `_other_` is less than this Quantified object. Based on comparison of `_magnitude_`.
   */
  Boolean lessThan(Object other);

  /**
   * True, for any two Dates.
   */
  Boolean isStrictlyComparableTo(Object other);
}
