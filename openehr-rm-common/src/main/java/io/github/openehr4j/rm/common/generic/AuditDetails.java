package io.github.openehr4j.rm.common.generic;

import io.github.openehr4j.rm.data_types.date_time.DvDateTime;
import io.github.openehr4j.rm.data_types.text.DvCodedText;
import io.github.openehr4j.rm.data_types.text.DvText;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/common.html#_audit_details_class">specifications.openehr.org</a>
 */
public interface AuditDetails {

  String getSystemId();

  DvDateTime getTimeCommitted();

  DvCodedText getChangeType();

  DvText getDescription();

  PartyProxy getCommitter();
}
