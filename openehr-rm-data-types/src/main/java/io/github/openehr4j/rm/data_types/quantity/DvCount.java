package io.github.openehr4j.rm.data_types.quantity;

import java.lang.Boolean;
import java.lang.Object;
import java.util.List;

public interface DvCount extends DvAmount {
  Object getMagnitude();

  Object getNormalRange();

  List getOtherReferenceRanges();

  DvCount add(Object other);

  DvCount subtract(Object other);

  DvCount multiply(Object factor);

  Boolean lessThan(Object other);

  Boolean isStrictlyComparableTo(Object other);
}
