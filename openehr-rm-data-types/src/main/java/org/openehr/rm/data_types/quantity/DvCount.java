package org.openehr.rm.data_types.quantity;

import java.lang.Boolean;
import java.lang.Object;
import java.util.List;

/**
 * Countable quantities. Used for countable types such as pregnancies and steps (taken by a physiotherapy patient), number of cigarettes smoked in a day.
 */
public interface DvCount extends DvAmount {
  Object getMagnitude();

  /**
   * Optional normal range.
   */
  Object getNormalRange();

  /**
   * Optional tagged other reference ranges for this value in its particular measurement context.
   */
  List getOtherReferenceRanges();

  /**
   * Sum of this `DV_COUNT` and `_other_`.
   */
  DvCount add(Object other);

  /**
   * Difference of this `DV_COUNT` and `_other_`.
   */
  DvCount subtract(Object other);

  /**
   * Product of this `DV_COUNT` and `_factor_`.
   */
  DvCount multiply(Object factor);

  /**
   * True if `_other_` is less than this Quantified object. Based on comparison of `_magnitude_`.
   */
  Boolean lessThan(Object other);

  /**
   * Return True.
   */
  Boolean isStrictlyComparableTo(Object other);
}
