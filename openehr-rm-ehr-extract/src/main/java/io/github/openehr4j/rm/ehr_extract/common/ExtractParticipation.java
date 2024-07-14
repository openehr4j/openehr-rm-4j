package io.github.openehr4j.rm.ehr_extract.common;

import java.lang.Object;
import java.lang.String;
import io.github.openehr4j.rm.data_types.text.DvCodedText;
import io.github.openehr4j.rm.data_types.text.DvText;

public interface ExtractParticipation {

  Object getTime();

  DvText getFunction();

  DvCodedText getMode();

  String getPerformer();
}
