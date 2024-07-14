package io.github.openehr4j.rm.ehr_extract.sync_extract;

import java.util.List;
import org.openehr.base.base_types.identification.HierObjectId;
import io.github.openehr4j.rm.common.generic.AuditDetails;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr_extract.html#_x_contribution_class">specifications.openehr.org</a>
 */
public interface XContribution {

  HierObjectId getUid();

  AuditDetails getAudit();

  List getVersions();
}
