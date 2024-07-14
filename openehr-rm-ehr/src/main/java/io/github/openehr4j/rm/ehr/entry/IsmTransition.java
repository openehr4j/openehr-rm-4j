package io.github.openehr4j.rm.ehr.entry;

import java.util.List;

import io.github.openehr4j.rm.common.archetyped.Pathable;
import io.github.openehr4j.rm.data_types.text.DvCodedText;

public interface IsmTransition extends Pathable {

  DvCodedText getCurrentState();

  DvCodedText getTransition();

  DvCodedText getCareflowStep();

  List getReason();
}
