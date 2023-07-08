package org.openehr.rm.data_types.quantity;

import java.lang.Boolean;
import java.lang.Object;
import java.util.List;
import org.openehr.base.foundation_types.primitive_types.Integer;
import org.openehr.base.foundation_types.primitive_types.Real;

/**
 * Models a ratio of values, i.e. where the numerator and denominator are both pure numbers. The `_valid_proportion_kind_` property of the `PROPORTION_KIND` class is used to control the type attribute to be one of a defined set.
 */
public interface DvProportion extends ProportionKind, DvAmount {
  /**
   * Numerator of ratio
   */
  Real getNumerator();

  /**
   * Denominator of ratio.
   */
  Real getDenominator();

  /**
   * Indicates semantic type of proportion, including percent, unitary etc.
   */
  Integer getType();

  /**
   * Precision  to  which  the  `_numerator_` and `_denominator_` values of  the  proportion are expressed, in terms of number  of decimal places. The value 0 implies an integral quantity. The value -1 implies no limit, i.e. any number of decimal places.
   */
  Integer getPrecision();

  /**
   * Optional normal range.
   */
  Object getNormalRange();

  /**
   * Optional tagged other reference ranges for this value in its particular measurement context.
   */
  List getOtherReferenceRanges();

  /**
   * Effective magnitude represented by ratio.
   */
  Real magnitude();

  /**
   * True if the `_numerator_` and `_denominator_` values are integers, i.e. if `_precision_` is 0.
   */
  Boolean isIntegral();

  /**
   * Sum of two strictly comparable proportions.
   */
  DvProportion add(Object other);

  /**
   * Difference between two strictly comparable proportions.
   */
  DvProportion subtract(Object other);

  /**
   * Return True if this `DV_AMOUNT` is considered equal to `_other_`.
   */
  Boolean isEqual(Object other);

  /**
   * Product of this Proportion and `_factor_`.
   */
  DvProportion multiply(Object factor);

  /**
   * True if this Proportion is less than  `_other_`. Only valid if `_is_strictly_comparable_to()_` is True.
   */
  Boolean lessThan(Object other);

  /**
   * Return True if the `_type_` of this proportion is the same as the `_type_` of `_other_`.
   */
  Boolean isStrictlyComparableTo(Object other);
}
