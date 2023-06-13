package org.openehr.rm.common.generic;

import org.openehr.rm.data_types.date_time.DvDateTime;
import org.openehr.rm.data_types.text.DvCodedText;
import org.openehr.rm.data_types.text.DvText;

/**
 * The set of attributes required to document the committal of an information item to a repository.
 */
public interface AuditDetails {
  /**
   * Identifier of the logical EHR system where the change was committed. This is almost always owned by the organisation legally responsible for the EHR, and is distinct from any application, or any hosting infrastructure.
   */
  String getSystemId();

  /**
   * Time of committal of the item.
   */
  DvDateTime getTimeCommitted();

  /**
   * Type of change. Coded using the openEHR Terminology  audit change type  group.
   */
  DvCodedText getChangeType();

  /**
   * Reason for committal. This may be used to qualify the value in the `_change_type_` field. For example, if the change affects only the EHR directory, this field might be used to indicate 'Folder "episode 2018-02-16" added' or similar.
   */
  DvText getDescription();

  /**
   * Identity and optional reference into identity management service, of user who committed the item.
   */
  PartyProxy getCommitter();
}
