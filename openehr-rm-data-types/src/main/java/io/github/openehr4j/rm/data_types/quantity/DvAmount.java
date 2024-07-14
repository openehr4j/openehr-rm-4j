package io.github.openehr4j.rm.data_types.quantity;

import org.openehr.base.foundation_types.primitive_types.Real;


/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_amount_class">specifications.openehr.org</a>
 */
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
