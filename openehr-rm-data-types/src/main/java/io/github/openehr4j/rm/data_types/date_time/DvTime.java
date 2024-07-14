package io.github.openehr4j.rm.data_types.date_time;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import org.openehr.base.foundation_types.primitive_types.Real;
import org.openehr.base.foundation_types.time_types.Iso8601Time;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_time_class">specifications.openehr.org</a>
 */
public interface DvTime extends DvTemporal, Iso8601Time {

  String getValue();

  Real magnitude();

  DvTime add(DvTime aDiff);

  DvTime subtract(DvTime aDiff);

  DvDuration diff(Object other);

  Boolean lessThan(Object other);

  Boolean isStrictlyComparableTo(Object other);
}
