package io.github.openehr4j.rm.data_types.date_time;

import org.openehr.base.foundation_types.time_types.Iso8601DateTime;


/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_date_time_class">specifications.openehr.org</a>
 */
public interface DvDateTime extends DvTemporal, Iso8601DateTime {

  String getValue();

  Double magnitude();

  DvDateTime add(DvDateTime aDiff);

  DvDateTime subtract(DvDateTime aDiff);

  DvDuration diff(DvDateTime other);

  Boolean lessThan(DvDateTime other);

  Boolean isStrictlyComparableTo(DvDateTime other);
}
