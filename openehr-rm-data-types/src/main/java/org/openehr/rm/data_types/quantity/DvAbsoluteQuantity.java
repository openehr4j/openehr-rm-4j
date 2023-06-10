package org.openehr.rm.data_types.quantity;

import org.openehr.rm_data_types.quantity.DvAmount;
import org.openehr.rm_data_types.quantity.DvQuantified;

/**
 * Abstract class defining the concept of quantified entities whose values are absolute with respect to an origin. Dates and Times are the main example.
 */
public interface DvAbsoluteQuantity extends DvQuantified {
  DvAmount getAccuracy();

  /**
   * Addition of a differential amount to this quantity.
   */
  org.openehr.rm_data_types.quantity.DvAbsoluteQuantity add(Object aDiff);

  /**
   * Result of subtracting a differential amount from this quantity.
   */
  org.openehr.rm_data_types.quantity.DvAbsoluteQuantity subtract(Object aDiff);

  /**
   * Difference of two quantities.
   */
  DvAmount diff(Object other);
}
