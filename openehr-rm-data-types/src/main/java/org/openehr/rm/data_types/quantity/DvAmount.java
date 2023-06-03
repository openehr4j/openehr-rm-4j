package org.openehr.rm.data_types.quantity;

/**
 * Abstract class defining the concept of relative quantified  'amounts'. For relative quantities, the  `+` and  `-` operators are defined (unlike descendants of `DV_ABSOLUTE_QUANTITY`, such as the date/time types).
 */
public interface DvAmount extends DvQuantified {
  /**
   * If `True`, indicates that when this object was created, `_accuracy_` was recorded as a percent value; if `False`, as an absolute quantity value.
   */
  Boolean getAccuracyIsPercent();

  /**
   * Accuracy of measurement, expressed either as a half-range percent value (`_accuracy_is_percent_` = `True`) or a half-range quantity. A value of `0` means that accuracy is 100%, i.e. no error.
   */
  Real getAccuracy();

  /**
   * Test whether a number is a valid percentage, i.e. between 0 and 100.
   */
  void valid_percentage();

  /**
   * Sum of this amount and another. The value of accuracy in the result is either:
   */
  void add();

  /**
   * Difference of this amount and another. The value of `_accuracy_` in the result is either:
   */
  void subtract();

  /**
   * Return True if this `DV_AMOUNT` is considered equal to `_other_`.
   */
  void is_equal();

  /**
   * Product of this Amount and `_factor_`.
   */
  void multiply();

  /**
   * Negated version of current object, such as used for representing a difference, e.g. a weight loss.
   */
  void negative();

  /**
   * True if this object is less than `_other_`. Based on comparison of `_magnitude_`.
   */
  void less_than();
}
