package io.github.openehr4j.rm.common.generic;

import io.github.openehr4j.rm.data_types.date_time.DvDateTime;
import io.github.openehr4j.rm.data_types.text.DvCodedText;
import io.github.openehr4j.rm.data_types.text.DvText;

public interface AuditDetails {

  String getSystemId();

  DvDateTime getTimeCommitted();

  DvCodedText getChangeType();

  DvText getDescription();

  PartyProxy getCommitter();
}
