package org.openehr.rm.data_types.quantity;

/**
 * Abstract class defining the concept of quantified entities whose values are absolute with respect to an origin. Dates and Times are the main example.
 */
public interface DvAbsoluteQuantity extends DvQuantified {
  DvAmount getAccuracy();

  /**
   * Addition of a differential amount to this quantity.
   */
  DvAbsoluteQuantity add(DvAbsoluteQuantity aDiff);

  /**
   * Result of subtracting a differential amount from this quantity.
   */
  DvAbsoluteQuantity subtract(DvAbsoluteQuantity aDiff);

  /**
   * Difference of two quantities.
   */
  DvAmount diff(DvAbsoluteQuantity other);
}
