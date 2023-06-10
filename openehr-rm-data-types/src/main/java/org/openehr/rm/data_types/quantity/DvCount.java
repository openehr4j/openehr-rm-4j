package org.openehr.rm.data_types.quantity;

import org.openehr.base_foundation_types.primitive_types.Boolean;
import org.openehr.rm_data_types.quantity.DvAmount;

/**
 * Countable quantities. Used for countable types such as pregnancies and steps (taken by a physiotherapy patient), number of cigarettes smoked in a day.
 */
public interface DvCount extends DvAmount {
  Integer64 getMagnitude();

  /**
   * Optional normal range.
   */
  DvInterval<DvCount> getNormalRange();

  /**
   * Optional tagged other reference ranges for this value in its particular measurement context.
   */
  List<ReferenceRange<DvCount>> getOtherReferenceRanges();

  /**
   * Sum of this `DV_COUNT` and `_other_`.
   */
  org.openehr.rm_data_types.quantity.DvCount add(Object other);

  /**
   * Difference of this `DV_COUNT` and `_other_`.
   */
  org.openehr.rm_data_types.quantity.DvCount subtract(Object other);

  /**
   * Product of this `DV_COUNT` and `_factor_`.
   */
  org.openehr.rm_data_types.quantity.DvCount multiply(Object factor);

  /**
   * True if this Quantified object is less than `_other_`, based on comparison of `_magnitude_`.
   */
  Boolean lessThan(Object other);

  /**
   * Return True.
   */
  Boolean isStrictlyComparableTo(Object other);
}
