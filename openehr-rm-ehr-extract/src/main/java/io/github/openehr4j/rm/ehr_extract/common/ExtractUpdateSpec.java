package io.github.openehr4j.rm.ehr_extract.common;

import java.lang.Boolean;
import java.util.List;
import io.github.openehr4j.rm.data_types.date_time.DvDuration;
import io.github.openehr4j.rm.data_types.text.CodePhrase;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr_extract.html#_extract_update_spec_class">specifications.openehr.org</a>
 */
public interface ExtractUpdateSpec {

  Boolean getPersistInServer();

  DvDuration getRepeatPeriod();

  List getTriggerEvents();

  CodePhrase getUpdateMethod();
}
