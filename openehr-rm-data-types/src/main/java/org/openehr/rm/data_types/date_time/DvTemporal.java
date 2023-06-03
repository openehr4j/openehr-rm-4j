package org.openehr.rm.data_types.date_time;

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
  void add();

  /**
   * Subtract a Duration from this temporal entity.
   */
  void subtract();

  /**
   * Difference between this temporal entity and `_other_`.
   */
  void diff();
}
