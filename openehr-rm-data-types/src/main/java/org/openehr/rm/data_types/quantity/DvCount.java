package org.openehr.rm.data_types.quantity;

/**
 * Countable quantities. Used for countable types such as pregnancies and steps (taken by a physiotherapy patient), number of cigarettes smoked in a day.
 */
public interface DvCount extends DvAmount {
  Integer64 getMagnitude();

  /**
   * Optional normal range.
   */
  DvINTERVAL<DVCOUNT> getNormalRange();

  /**
   * Optional tagged other reference ranges for this value in its particular measurement context.
   */
  List<REFERENCERANGE<DVCount getOtherReferenceRanges();

  /**
   * Sum of this `DV_COUNT` and `_other_`.
   */
  void add();

  /**
   * Difference of this `DV_COUNT` and `_other_`.
   */
  void subtract();

  /**
   * Product of this `DV_COUNT` and `_factor_`.
   */
  void multiply();

  /**
   * True if this Quantified object is less than `_other_`, based on comparison of `_magnitude_`.
   */
  void less_than();

  /**
   * Return True.
   */
  void is_strictly_comparable_to();
}
