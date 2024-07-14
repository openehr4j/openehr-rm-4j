package org.openehr.rm.common.change_control;

import java.util.List;

import org.openehr.base.base_types.identification.HierObjectId;
import org.openehr.base.base_types.identification.ObjectRef;
import org.openehr.base.base_types.identification.ObjectVersionId;
import org.openehr.rm.common.generic.Attestation;
import org.openehr.rm.common.generic.AuditDetails;
import org.openehr.rm.common.generic.RevisionHistory;
import org.openehr.rm.data_types.date_time.DvDateTime;
import org.openehr.rm.data_types.text.DvCodedText;


public interface VersionedObject<T> {

  HierObjectId getUid();

  ObjectRef getOwnerId();

  DvDateTime getTimeCreated();

  Integer versionCount();

  List<ObjectVersionId> allVersionIds();

  List<Version<T>> allVersions();

  Boolean hasVersionAtTime(DvDateTime aTime);

  Boolean hasVersionId(ObjectVersionId aVersionUid);

  Version<T> versionWithId(ObjectVersionId aVersionUid);

  Boolean isOriginalVersion(ObjectVersionId aVersionUid);

  Version<T> versionAtTime(DvDateTime aTime);

  RevisionHistory revisionHistory();

  Version<T> latestVersion();

  Version<T> latestTrunkVersion();

  DvCodedText trunkLifecycleState();

  void commitOriginalVersion(ObjectRef aContribution, ObjectVersionId aNewVersionUid,
                             ObjectVersionId aPrecedingVersionId, AuditDetails anAudit, DvCodedText aLifecycleState, T aData,
                             String signingKey);

  void commitOriginalMergedVersion(ObjectRef aContribution, ObjectVersionId aNewVersionUid,
                                   ObjectVersionId aPrecedingVersionId, AuditDetails anAudit, DvCodedText aLifecycleState, T aData,
      List<ObjectVersionId> anOtherInputUids, String signingKey);

  void commitImportedVersion(ObjectRef aContribution, AuditDetails anAudit, OriginalVersion<T> aVersion);

  void commitAttestation(Attestation anAttestation, ObjectVersionId aVerId, String signingKey);
}
