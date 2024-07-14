package io.github.openehr4j.rm.ehr_extract.common;

import java.lang.Boolean;
import java.util.List;
import io.github.openehr4j.rm.data_types.date_time.DvDuration;
import io.github.openehr4j.rm.data_types.text.CodePhrase;

public interface ExtractUpdateSpec {

  Boolean getPersistInServer();

  DvDuration getRepeatPeriod();

  List getTriggerEvents();

  CodePhrase getUpdateMethod();
}
