package org.openehr.rm.data_types.date_time;

import org.openehr.rm.data_types.quantity.DvAbsoluteQuantity;

/**
 * Specialised temporal variant of `DV_ABSOLUTE_QUANTITY` whose diff type is `DV_DURATION`.
 */
public interface DvTemporal extends DvAbsoluteQuantity {
  /**
   * Time accuracy, expressed as a duration.
   */
  DvDuration getAccuracy();

  /**
   * Addition of a Duration to this temporal entity.
   */
  DvTemporal add(DvTemporal aDiff);

  /**
   * Subtract a Duration from this temporal entity.
   */
  DvTemporal subtract(DvTemporal aDiff);

  /**
   * Difference between this temporal entity and `_other_`.
   */
  DvDuration diff(DvTemporal other);
}
