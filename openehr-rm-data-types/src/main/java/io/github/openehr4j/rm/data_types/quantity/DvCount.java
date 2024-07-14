package io.github.openehr4j.rm.data_types.quantity;

import java.lang.Boolean;
import java.lang.Object;
import java.util.List;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_count_class">specifications.openehr.org</a>
 */
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
