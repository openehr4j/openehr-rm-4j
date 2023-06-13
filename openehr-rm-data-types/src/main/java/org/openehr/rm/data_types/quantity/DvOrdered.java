package org.openehr.rm.data_types.quantity;

import java.util.List;

import org.openehr.base_foundation_types.primitive_types.Ordered;
import org.openehr.rm.data_types.basic.DataValue;
import org.openehr.rm.data_types.text.CodePhrase;

/**
 * Abstract class defining the concept of ordered values, which includes ordinals as well as true quantities. It defines the functions  `<` and `_is_strictly_comparable_to()_`, the latter of which must evaluate to `True` for instances being compared with the  `<` function, or used as limits in the `DV_INTERVAL<T>` class.
 */
public interface DvOrdered extends DataValue, Ordered {
  /**
   * Optional normal status indicator of value with respect to normal range for this value. Often included by lab, even if the normal range itself is not included. Coded by ordinals in series HHH, HH, H, (nothing), L, LL, LLL; see openEHR terminology group  `normal_status`.
   */
  CodePhrase getNormalStatus();

  /**
   * Optional normal range.
   */
  Object getNormalRange();

  /**
   * Optional tagged other reference ranges for this value in its particular measurement context.
   */
  List getOtherReferenceRanges();

  /**
   * Test if two instances are strictly comparable. Effected in descendants.
   */
  Boolean isStrictlyComparableTo(Object other);

  /**
   * True if this quantity has no reference ranges.
   */
  Boolean isSimple();

  /**
   * Value is in the normal range, determined by comparison of the value to `_normal_range_` if present, or by the `_normal_status_` marker if present.
   */
  Boolean isNormal();

  /**
   * True if this Ordered object is less than `_other_`. Redefined in descendants.
   */
  Boolean lessThan(Object other);
}
