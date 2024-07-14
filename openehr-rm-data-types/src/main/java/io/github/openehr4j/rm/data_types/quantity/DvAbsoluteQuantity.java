package io.github.openehr4j.rm.data_types.quantity;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_absolute_quantity_class">specifications.openehr.org</a>
 */
public interface DvAbsoluteQuantity extends DvQuantified {
  DvAmount getAccuracy();

  DvAbsoluteQuantity add(DvAbsoluteQuantity aDiff);

  DvAbsoluteQuantity subtract(DvAbsoluteQuantity aDiff);

  DvAmount diff(DvAbsoluteQuantity other);
}
