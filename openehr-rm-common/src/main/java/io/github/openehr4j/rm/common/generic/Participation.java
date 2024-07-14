package io.github.openehr4j.rm.common.generic;

import io.github.openehr4j.rm.data_types.text.DvCodedText;
import io.github.openehr4j.rm.data_types.text.DvText;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/common.html#_participation_class">specifications.openehr.org</a>
 */
public interface Participation {

  DvText getFunction();

  DvCodedText getMode();

  PartyProxy getPerformer();

  Object getTime();
}
