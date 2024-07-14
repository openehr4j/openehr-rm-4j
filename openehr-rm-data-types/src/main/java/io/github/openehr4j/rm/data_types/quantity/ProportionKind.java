package io.github.openehr4j.rm.data_types.quantity;

import java.lang.Boolean;
import java.lang.Object;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_proportion_kind_class">specifications.openehr.org</a>
 */
public interface ProportionKind {

  Boolean validProportionKind(Object nq);
}
