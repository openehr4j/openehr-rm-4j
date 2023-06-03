package org.openehr.rm.data_types.quantity;

/**
 * Abstract class defining the concept of true quantified values, i.e. values which are not only ordered, but which have a precise magnitude.
 */
public interface DvQuantified extends DvOrdered {
  /**
   * Optional status of magnitude with values:
   */
  String getMagnitudeStatus();

  /**
   * Accuracy of measurement. Exact form of expression determined in descendants.
   */
  Any getAccuracy();

  /**
   * Test whether a string value is one of the valid values for the magnitude_status attribute.
   */
  void valid_magnitude_status();

  void magnitude();

  /**
   * True if accuracy is not known, e.g. due to not being recorded or discernable.
   */
  void accuracy_unknown();

  /**
   * Return True if this `DV_QUANTIFIED` is considered equal to `_other_`.
   */
  void is_equal();

  /**
   * True if this Quantified object is less than `_other_`, based on comparison of `_magnitude_`.
   */
  void less_than();
}
