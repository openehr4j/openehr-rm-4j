package io.github.openehr4j.rm.data_types.quantity;

import io.github.openehr4j.rm.data_types.text.DvCodedText;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_ordinal_class">specifications.openehr.org</a>
 */
public interface DvOrdinal extends DvOrdered {

  DvCodedText getSymbol();

  Integer getValue();

  Boolean lessThan(Object other);

  Boolean isStrictlyComparableTo(Object other);
}
