package org.openehr.rm.ehr_extract.message;

import java.lang.Object;
import java.lang.String;
import org.openehr.rm.common.generic.AuditDetails;

public interface Message {

  AuditDetails getAudit();

  Object getContent();

  String getSignature();
}
