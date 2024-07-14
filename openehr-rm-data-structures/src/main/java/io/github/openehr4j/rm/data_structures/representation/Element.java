package io.github.openehr4j.rm.data_structures.representation;

import io.github.openehr4j.rm.data_types.basic.DataValue;
import io.github.openehr4j.rm.data_types.text.DvCodedText;
import io.github.openehr4j.rm.data_types.text.DvText;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_structures.html#_element_class">specifications.openehr.org</a>
 */
public interface Element extends Item {

  DvCodedText getNullFlavour();

  DataValue getValue();

  DvText getNullReason();

  Boolean isNull();
}
