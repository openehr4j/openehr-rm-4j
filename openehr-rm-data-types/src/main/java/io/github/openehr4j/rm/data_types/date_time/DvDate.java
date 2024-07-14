package io.github.openehr4j.rm.data_types.date_time;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import org.openehr.base.foundation_types.time_types.Iso8601Date;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_date_class">specifications.openehr.org</a>
 */
public interface DvDate extends DvTemporal, Iso8601Date {

  String getValue();

  Integer magnitude();

  Boolean isEqual(Object other);

  DvDate add(DvDate aDiff);

  DvDate subtract(DvDate aDiff);

  DvDuration diff(Object other);

  Boolean lessThan(Object other);

  Boolean isStrictlyComparableTo(Object other);
}
