package org.openehr.rm.data_types.quantity;

/**
 * A data type that represents scale values, where there is:
 */
public interface DvScale extends DvOrdered {
  /**
   * Coded textual representation of this value in the scale range, which may be strings made from symbols or other enumerations of terms such as  `no breathlessness`, `very very slight`, `slight breathlessness`. Codes come from archetypes.
   */
  DvCodedText getSymbol();

  /**
   * Real number value of Scale item.
   */
  Real getValue();

  /**
   * Test if this Scale value is strictly comparable to `_other_`.
   */
  void is_strictly_comparable_to();

  /**
   * True if this Scale value is less than `_other_`.
   */
  void less_than();
}
