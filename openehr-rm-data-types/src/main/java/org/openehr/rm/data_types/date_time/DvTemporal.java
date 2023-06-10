package org.openehr.rm.data_types.date_time;

import org.openehr.rm_data_types.date_time.DvDuration;
import org.openehr.rm_data_types.quantity.DvAbsoluteQuantity;

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
  org.openehr.rm_data_types.date_time.DvTemporal add(Object aDiff);

  /**
   * Subtract a Duration from this temporal entity.
   */
  org.openehr.rm_data_types.date_time.DvTemporal subtract(Object aDiff);

  /**
   * Difference between this temporal entity and `_other_`.
   */
  DvDuration diff(Object other);
}
