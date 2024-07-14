package org.openehr.rm.common.generic;

import java.util.List;
import org.openehr.base.base_types.identification.ObjectVersionId;

public interface RevisionHistoryItem {

  ObjectVersionId getVersionId();

  List<AuditDetails> getAudits();
}
