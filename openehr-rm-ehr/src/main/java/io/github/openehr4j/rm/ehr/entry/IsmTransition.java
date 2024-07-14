package io.github.openehr4j.rm.ehr.entry;

import java.util.List;

import io.github.openehr4j.rm.common.archetyped.Pathable;
import io.github.openehr4j.rm.data_types.text.DvCodedText;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr.html#_ism_transition_class">specifications.openehr.org</a>
 */
public interface IsmTransition extends Pathable {

  DvCodedText getCurrentState();

  DvCodedText getTransition();

  DvCodedText getCareflowStep();

  List getReason();
}
