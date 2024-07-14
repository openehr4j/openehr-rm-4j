package io.github.openehr4j.rm.data_types.basic;

import io.github.openehr4j.rm.data_types.text.DvCodedText;

public interface DvState extends DataValue {

  DvCodedText getValue();

  Boolean getIsTerminal();
}
