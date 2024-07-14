package io.github.openehr4j.rm.data_structures.representation;

import io.github.openehr4j.rm.data_types.basic.DataValue;
import io.github.openehr4j.rm.data_types.text.DvCodedText;
import io.github.openehr4j.rm.data_types.text.DvText;

public interface Element extends Item {

  DvCodedText getNullFlavour();

  DataValue getValue();

  DvText getNullReason();

  Boolean isNull();
}
