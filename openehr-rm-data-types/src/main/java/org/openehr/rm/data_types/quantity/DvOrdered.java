package org.openehr.rm.data_types.quantity;

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
  DvInterval getNormalRange();

  /**
   * Optional tagged other reference ranges for this value in its particular measurement context.
   */
  List<REFERENCERANGE> getOtherReferenceRanges();

  /**
   * Test if two instances are strictly comparable. Effected in descendants.
   */
  void is_strictly_comparable_to();

  /**
   * True if this quantity has no reference ranges.
   */
  void is_simple();

  /**
   * Value is in the normal range, determined by comparison of the value to `_normal_range_` if present, or by the `_normal_status_` marker if present.
   */
  void is_normal();

  /**
   * True if this Ordered object is less than `_other_`. Redefined in descendants.
   */
  void less_than();
}
