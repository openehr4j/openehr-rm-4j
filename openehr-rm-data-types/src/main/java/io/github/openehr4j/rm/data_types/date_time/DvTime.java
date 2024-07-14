package io.github.openehr4j.rm.data_types.date_time;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import org.openehr.base.foundation_types.primitive_types.Real;
import org.openehr.base.foundation_types.time_types.Iso8601Time;

public interface DvTime extends DvTemporal, Iso8601Time {

  String getValue();

  Real magnitude();

  DvTime add(DvTime aDiff);

  DvTime subtract(DvTime aDiff);

  DvDuration diff(Object other);

  Boolean lessThan(Object other);

  Boolean isStrictlyComparableTo(Object other);
}
