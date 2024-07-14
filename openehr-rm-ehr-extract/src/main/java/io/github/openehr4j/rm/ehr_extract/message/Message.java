package io.github.openehr4j.rm.ehr_extract.message;

import java.lang.Object;
import java.lang.String;
import io.github.openehr4j.rm.common.generic.AuditDetails;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr_extract.html#_message_class">specifications.openehr.org</a>
 */
public interface Message {

  AuditDetails getAudit();

  Object getContent();

  String getSignature();
}
