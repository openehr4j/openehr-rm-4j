package io.github.openehr4j.rm.data_types.date_time;

import org.openehr.base.foundation_types.time_types.Iso8601Duration;
import io.github.openehr4j.rm.data_types.quantity.DvAmount;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_duration_class">specifications.openehr.org</a>
 */
public interface DvDuration extends DvAmount, Iso8601Duration {

  String getValue();

  DvDuration add(DvDuration other);

  DvDuration subtract(DvDuration other);

  DvDuration multiply(DvDuration factor);

  Boolean lessThan(DvDuration other);

  Boolean isStrictlyComparableTo(DvDuration other);

  DvDuration negative();

  Double magnitude();
}
