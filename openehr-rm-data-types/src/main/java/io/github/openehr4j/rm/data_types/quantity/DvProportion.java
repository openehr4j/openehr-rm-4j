package io.github.openehr4j.rm.data_types.quantity;

import java.lang.Boolean;
import java.lang.Object;
import java.util.List;
import org.openehr.base.foundation_types.primitive_types.Real;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_proportion_class">specifications.openehr.org</a>
 */
public interface DvProportion extends ProportionKind, DvAmount {

  Real getNumerator();

  Real getDenominator();

  Integer getType();

  Integer getPrecision();

  Object getNormalRange();

  List getOtherReferenceRanges();

  Real magnitude();

  Boolean isIntegral();

  DvProportion add(Object other);

  DvProportion subtract(Object other);

  Boolean isEqual(Object other);

  DvProportion multiply(Object factor);

  Boolean lessThan(Object other);

  Boolean isStrictlyComparableTo(Object other);
}
