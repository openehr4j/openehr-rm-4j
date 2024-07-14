package io.github.openehr4j.rm.data_types.basic;

import io.github.openehr4j.rm.data_types.text.DvCodedText;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_state_class">specifications.openehr.org</a>
 */
public interface DvState extends DataValue {

  DvCodedText getValue();

  Boolean getIsTerminal();
}
