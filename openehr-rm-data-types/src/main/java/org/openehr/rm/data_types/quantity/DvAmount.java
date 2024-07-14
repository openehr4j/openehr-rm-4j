package org.openehr.rm.data_types.quantity;

import org.openehr.base.foundation_types.primitive_types.Real;


public interface DvAmount extends DvQuantified {

  Boolean getAccuracyIsPercent();

  Real getAccuracy();

  Boolean validPercentage(Object number);

  DvAmount add(DvAmount other);

  DvAmount subtract(DvAmount other);

  Boolean isEqual(DvAmount other);

  DvAmount multiply(DvAmount factor);

  DvAmount negative();

  Boolean lessThan(DvAmount other);
}
