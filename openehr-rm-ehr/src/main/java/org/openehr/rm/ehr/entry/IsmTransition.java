package org.openehr.rm.ehr.entry;

import java.util.List;

import org.openehr.rm.common.archetyped.Pathable;
import org.openehr.rm.data_types.text.DvCodedText;

public interface IsmTransition extends Pathable {

  DvCodedText getCurrentState();

  DvCodedText getTransition();

  DvCodedText getCareflowStep();

  List getReason();
}
