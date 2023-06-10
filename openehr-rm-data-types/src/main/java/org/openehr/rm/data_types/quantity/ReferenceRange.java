package org.openehr.rm.data_types.quantity;

import org.openehr.base_foundation_types.primitive_types.Boolean;
import org.openehr.rm_data_types.quantity.DvInterval;
import org.openehr.rm_data_types.text.DvText;

/**
 * Defines a named range to be associated with any `DV_ORDERED` datum. Each such range is particular to the patient and context, e.g. sex, age, and any other factor which affects ranges. May be used to represent normal, therapeutic, dangerous, critical etc ranges.
 */
public interface ReferenceRange {
  /**
   * Term whose value indicates the meaning of this range, e.g.  normal,  critical,  therapeutic  etc.
   */
  DvText getMeaning();

  /**
   * The data range for this meaning, e.g. critical  etc.
   */
  DvInterval getRange();

  /**
   * Indicates if the value  `_v_` is inside the range.
   */
  Boolean isInRange(Object v);
}
