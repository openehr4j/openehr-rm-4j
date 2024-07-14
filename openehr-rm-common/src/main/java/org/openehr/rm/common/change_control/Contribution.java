package org.openehr.rm.common.change_control;

import java.util.List;

import org.openehr.base.base_types.identification.HierObjectId;
import org.openehr.base.base_types.identification.ObjectRef;
import org.openehr.rm.common.generic.AuditDetails;




public interface Contribution {



  HierObjectId getUid();




  List<ObjectRef> getVersions();




  AuditDetails getAudit();
}
