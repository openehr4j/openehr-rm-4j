package io.github.openehr4j.rm.support.measurement;

import java.lang.Boolean;
import java.lang.Object;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/support.html#_measurement_service_class">specifications.openehr.org</a>
 */
public interface MeasurementService {

  Boolean isValidUnitsString(Object units);

  Boolean unitsEquivalent(Object units1, Object units2);
}
