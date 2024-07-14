package io.github.openehr4j.rm.data_types.quantity;

import java.util.List;

import org.openehr.base.foundation_types.primitive_types.Ordered;
import io.github.openehr4j.rm.data_types.basic.DataValue;
import io.github.openehr4j.rm.data_types.text.CodePhrase;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_ordered_class">specifications.openehr.org</a>
 */
public interface DvOrdered extends DataValue, Ordered {

  CodePhrase getNormalStatus();

  Object getNormalRange();

  List getOtherReferenceRanges();

  Boolean isStrictlyComparableTo(Object other);

  Boolean isSimple();

  Boolean isNormal();

  Boolean lessThan(Object other);
}
