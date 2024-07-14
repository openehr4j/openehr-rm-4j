package org.openehr.rm.data_types.quantity;

public interface DvAbsoluteQuantity extends DvQuantified {
  DvAmount getAccuracy();

  DvAbsoluteQuantity add(DvAbsoluteQuantity aDiff);

  DvAbsoluteQuantity subtract(DvAbsoluteQuantity aDiff);

  DvAmount diff(DvAbsoluteQuantity other);
}
