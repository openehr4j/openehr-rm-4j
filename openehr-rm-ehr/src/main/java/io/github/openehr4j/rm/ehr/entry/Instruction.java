package io.github.openehr4j.rm.ehr.entry;

import java.util.List;

import io.github.openehr4j.rm.data_types.date_time.DvDateTime;
import io.github.openehr4j.rm.data_types.encapsulated.DvParsable;
import io.github.openehr4j.rm.data_types.text.DvText;

public interface Instruction extends CareEntry {

  DvText getNarrative();

  DvDateTime getExpiryTime();

  DvParsable getWfDefinition();

  List getActivities();
}
