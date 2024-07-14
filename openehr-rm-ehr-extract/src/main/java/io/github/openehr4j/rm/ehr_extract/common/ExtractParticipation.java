package io.github.openehr4j.rm.ehr_extract.common;

import java.lang.Object;
import java.lang.String;
import io.github.openehr4j.rm.data_types.text.DvCodedText;
import io.github.openehr4j.rm.data_types.text.DvText;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr_extract.html#_extract_participation_class">specifications.openehr.org</a>
 */
public interface ExtractParticipation {

  Object getTime();

  DvText getFunction();

  DvCodedText getMode();

  String getPerformer();
}
