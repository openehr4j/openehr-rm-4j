package org.openehr.rm.data_types.quantity;

import org.openehr.base_foundation_types.primitive_types.Boolean;
import org.openehr.base_foundation_types.primitive_types.Real;
import org.openehr.rm_data_types.quantity.DvOrdered;
import org.openehr.rm_data_types.text.DvCodedText;

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
  Boolean isStrictlyComparableTo(Object other);

  /**
   * True if this Scale value is less than `_other_`.
   */
  Boolean lessThan(Object other);
}
