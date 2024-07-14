package io.github.openehr4j.rm.ehr_extract.message;

import java.lang.Object;
import java.lang.String;
import io.github.openehr4j.rm.common.generic.AuditDetails;

public interface Message {

  AuditDetails getAudit();

  Object getContent();

  String getSignature();
}
