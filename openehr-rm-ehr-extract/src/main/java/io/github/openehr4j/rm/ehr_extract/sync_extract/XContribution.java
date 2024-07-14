package io.github.openehr4j.rm.ehr_extract.sync_extract;

import java.util.List;
import org.openehr.base.base_types.identification.HierObjectId;
import io.github.openehr4j.rm.common.generic.AuditDetails;

public interface XContribution {

  HierObjectId getUid();

  AuditDetails getAudit();

  List getVersions();
}
