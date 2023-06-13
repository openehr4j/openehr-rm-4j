package org.openehr.rm.support.measurement;

import java.lang.Boolean;
import java.lang.Object;

/**
 * Defines an object providing proxy access to a measurement information service.
 */
public interface MeasurementService {
  /**
   * True if the units string  units' is a valid string according to the HL7 UCUM specification.
   */
  Boolean isValidUnitsString(Object units);

  /**
   * True if two units strings correspond to the same measured property.
   */
  Boolean unitsEquivalent(Object units1, Object units2);
}
