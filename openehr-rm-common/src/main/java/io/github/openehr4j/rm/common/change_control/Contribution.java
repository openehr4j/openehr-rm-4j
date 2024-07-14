package io.github.openehr4j.rm.common.change_control;

import java.util.List;

import org.openehr.base.base_types.identification.HierObjectId;
import org.openehr.base.base_types.identification.ObjectRef;
import io.github.openehr4j.rm.common.generic.AuditDetails;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/common.html#_contribution_class">specifications.openehr.org</a>
 */
public interface Contribution {

  HierObjectId getUid();

  List<ObjectRef> getVersions();

  AuditDetails getAudit();
}
