package org.openehr.rm.common.change_control;

import org.openehr.base.base_types.identification.HierObjectId;
import org.openehr.base.base_types.identification.ObjectRef;
import org.openehr.base.base_types.identification.ObjectVersionId;
import org.openehr.rm.common.generic.AuditDetails;
import org.openehr.rm.data_types.text.DvCodedText;




public interface Version<T> {



  ObjectRef getContribution();




  String getSignature();




  AuditDetails getCommitAudit();




  ObjectVersionId uid();




  ObjectVersionId precedingVersionUid();




  T data();




  DvCodedText lifecycleState();




  String canonicalForm();




  HierObjectId ownerId();




  Boolean isBranch();
}
