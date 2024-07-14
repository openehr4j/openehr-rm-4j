package io.github.openehr4j.rm.common.generic;

import io.github.openehr4j.rm.data_types.text.DvCodedText;
import io.github.openehr4j.rm.data_types.text.DvText;

public interface Participation {

  DvText getFunction();

  DvCodedText getMode();

  PartyProxy getPerformer();

  Object getTime();
}
