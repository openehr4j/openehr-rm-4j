package io.github.openehr4j.rm.data_types.quantity;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import org.openehr.base.foundation_types.primitive_types.Real;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_quantity_class">specifications.openehr.org</a>
 */
public interface DvQuantity extends DvAmount {

  Real getMagnitude();

  Integer getPrecision();

  String getUnits();

  String getUnitsSystem();

  String getUnitsDisplayName();

  Object getNormalRange();

  List getOtherReferenceRanges();

  DvQuantity add(Object other);

  DvQuantity subtract(Object other);

  DvQuantity multiply(Object factor);

  Boolean lessThan(Object other);

  Boolean isIntegral();

  Boolean isStrictlyComparableTo(Object other);
}
