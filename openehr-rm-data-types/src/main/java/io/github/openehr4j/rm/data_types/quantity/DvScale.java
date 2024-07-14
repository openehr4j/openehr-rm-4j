package io.github.openehr4j.rm.data_types.quantity;

import org.openehr.base.foundation_types.primitive_types.Real;
import io.github.openehr4j.rm.data_types.text.DvCodedText;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_scale_class">specifications.openehr.org</a>
 */
public interface DvScale extends DvOrdered {

  DvCodedText getSymbol();

  Real getValue();

  Boolean isStrictlyComparableTo(Object other);

  Boolean lessThan(Object other);
}
