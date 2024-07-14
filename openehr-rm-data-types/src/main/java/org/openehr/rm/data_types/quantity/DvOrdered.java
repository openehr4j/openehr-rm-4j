package org.openehr.rm.data_types.quantity;

import java.util.List;

import org.openehr.base.foundation_types.primitive_types.Ordered;
import org.openehr.rm.data_types.basic.DataValue;
import org.openehr.rm.data_types.text.CodePhrase;

public interface DvOrdered extends DataValue, Ordered {

  CodePhrase getNormalStatus();

  Object getNormalRange();

  List getOtherReferenceRanges();

  Boolean isStrictlyComparableTo(Object other);

  Boolean isSimple();

  Boolean isNormal();

  Boolean lessThan(Object other);
}
