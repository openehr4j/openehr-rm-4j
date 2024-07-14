package org.openehr.rm.support.measurement;

import java.lang.Boolean;
import java.lang.Object;

public interface MeasurementService {

  Boolean isValidUnitsString(Object units);

  Boolean unitsEquivalent(Object units1, Object units2);
}
