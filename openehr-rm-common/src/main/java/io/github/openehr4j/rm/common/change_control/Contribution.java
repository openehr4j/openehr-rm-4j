package io.github.openehr4j.rm.common.change_control;

import java.util.List;

import org.openehr.base.base_types.identification.HierObjectId;
import org.openehr.base.base_types.identification.ObjectRef;
import io.github.openehr4j.rm.common.generic.AuditDetails;

public interface Contribution {

  HierObjectId getUid();

  List<ObjectRef> getVersions();

  AuditDetails getAudit();
}
