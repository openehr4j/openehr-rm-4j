package io.github.openehr4j.rm.data_types.quantity;

import io.github.openehr4j.rm.data_types.text.DvCodedText;

public interface DvOrdinal extends DvOrdered {

  DvCodedText getSymbol();

  Integer getValue();

  Boolean lessThan(Object other);

  Boolean isStrictlyComparableTo(Object other);
}
