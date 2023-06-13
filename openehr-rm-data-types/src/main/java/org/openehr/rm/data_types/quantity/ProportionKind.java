package org.openehr.rm.data_types.quantity;

import java.lang.Boolean;
import java.lang.Object;

/**
 * Class of enumeration constants defining types of proportion for the `DV_PROPORTION` class.
 */
public interface ProportionKind {
  /**
   * True if n is one of the defined types.
   */
  Boolean validProportionKind(Object nq);
}
