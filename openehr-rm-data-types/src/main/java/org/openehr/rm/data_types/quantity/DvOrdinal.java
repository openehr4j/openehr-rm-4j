package org.openehr.rm.data_types.quantity;

/**
 * A data type that represents integral score values, e.g. pain, Apgar values, etc, where there is:
 */
public interface DvOrdinal extends DvOrdered {
  /**
   * Coded textual representation of this value in the enumeration, which may be strings made from  +  symbols, or other enumerations of terms such as  `mild`, `moderate`, `severe`, or even the same number series as the values, e.g. 1, 2, 3.
   */
  DvCodedText getSymbol();

  /**
   * Value in ordered enumeration of values. Any integer value can be used.
   */
  Integer getValue();

  /**
   * True if this Ordinal value is less than `_other_`.
   */
  void less_than();

  /**
   * Test if this Ordinal is strictly comparable to `_other_`.
   */
  void is_strictly_comparable_to();
}
