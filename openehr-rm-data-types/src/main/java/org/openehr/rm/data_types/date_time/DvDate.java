package org.openehr.rm.data_types.date_time;

import org.openehr.base_foundation_types.primitive_types.Boolean;
import org.openehr.base_foundation_types.primitive_types.Integer;
import org.openehr.base_foundation_types.primitive_types.String;
import org.openehr.base_foundation_types.time_types.Iso8601Date;
import org.openehr.rm_data_types.date_time.DvDuration;
import org.openehr.rm_data_types.date_time.DvTemporal;

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
  org.openehr.rm_data_types.date_time.DvDate add(Object aDiff);

  /**
   * Subtract a Duration from this Date.
   */
  org.openehr.rm_data_types.date_time.DvDate subtract(Object aDiff);

  /**
   * Difference between this Date and `_other_`.
   */
  DvDuration diff(Object other);

  /**
   * True if this date object is less than `_other_`, based on comparison of `_magnitude()_`.
   */
  Boolean lessThan(Object other);

  /**
   * True, for any two Dates.
   */
  Boolean isStrictlyComparableTo(Object other);
}
