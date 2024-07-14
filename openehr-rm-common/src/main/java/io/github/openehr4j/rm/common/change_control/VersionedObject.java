package io.github.openehr4j.rm.common.change_control;

import java.util.List;

import org.openehr.base.base_types.identification.HierObjectId;
import org.openehr.base.base_types.identification.ObjectRef;
import org.openehr.base.base_types.identification.ObjectVersionId;
import io.github.openehr4j.rm.common.generic.Attestation;
import io.github.openehr4j.rm.common.generic.AuditDetails;
import io.github.openehr4j.rm.common.generic.RevisionHistory;
import io.github.openehr4j.rm.data_types.date_time.DvDateTime;
import io.github.openehr4j.rm.data_types.text.DvCodedText;


/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/common.html#_versioned_object_class">specifications.openehr.org</a>
 */
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
