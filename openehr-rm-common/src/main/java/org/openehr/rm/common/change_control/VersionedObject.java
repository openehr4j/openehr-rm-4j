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

/**
 * Version control abstraction, defining semantics for versioning one complex object.
 *
 * @see <a href="https://specifications.openehr.org/releases/RM/latest/common.html#_versioned_object_class">VERSIONED_OBJECT Class</a>
 */
public interface VersionedObject<T> {
  /**
   * Unique identifier of this version container in the form of a UID with no extension. This id will be the same in all instances of the same container in a distributed environment, meaning that it can be understood as the uid of the  virtual version tree.
   */
  HierObjectId getUid();

  /**
   * Reference to object to which this version container belongs, e.g. the id of the containing EHR or other relevant owning entity.
   */
  ObjectRef getOwnerId();

  /**
   * Time of initial creation of this versioned object.
   */
  DvDateTime getTimeCreated();

  /**
   * Return the total number of versions in this object.
   */
  Integer versionCount();

  /**
   * Return a list of ids of all versions in this object.
   */
  List<ObjectVersionId> allVersionIds();

  /**
   * Return a list of all versions in this object.
   */
  List<Version<T>> allVersions();

  /**
   * True if a version for time  `_a_time_` exists.
   */
  Boolean hasVersionAtTime(DvDateTime aTime);

  /**
   * True if a version with `_a_version_uid_` exists.
   */
  Boolean hasVersionId(ObjectVersionId aVersionUid);

  /**
   * Return the version with `_uid_` =  `_a_version_uid_`.
   */
  Version<T> versionWithId(ObjectVersionId aVersionUid);

  /**
   * True if version with `_a_version_uid_` is an `ORIGINAL_VERSION`.
   */
  Boolean isOriginalVersion(ObjectVersionId aVersionUid);

  /**
   * Return the version for time  `_a_time_`.
   */
  Version<T> versionAtTime(DvDateTime aTime);

  /**
   * History of all audits and attestations in this versioned repository.
   */
  RevisionHistory revisionHistory();

  /**
   * Return the most recently added version (i.e. on trunk or any branch).
   */
  Version<T> latestVersion();

  /**
   * Return the most recently added trunk version.
   */
  Version<T> latestTrunkVersion();

  /**
   * Return the lifecycle state from the latest trunk version. Useful for determining if the version container is logically deleted.
   */
  DvCodedText trunkLifecycleState();

  /**
   * Add a new original version.
   */
  void commitOriginalVersion(ObjectRef aContribution, ObjectVersionId aNewVersionUid,
                             ObjectVersionId aPrecedingVersionId, AuditDetails anAudit, DvCodedText aLifecycleState, T aData,
                             String signingKey);

  /**
   * Add a new original merged version. This commit function adds a parameter containing the ids of other versions merged into the current one.
   */
  void commitOriginalMergedVersion(ObjectRef aContribution, ObjectVersionId aNewVersionUid,
                                   ObjectVersionId aPrecedingVersionId, AuditDetails anAudit, DvCodedText aLifecycleState, T aData,
      List<ObjectVersionId> anOtherInputUids, String signingKey);

  /**
   * Add a new imported version. Details of version id etc come from the `ORIGINAL_VERSION` being committed.
   */
  void commitImportedVersion(ObjectRef aContribution, AuditDetails anAudit, OriginalVersion<T> aVersion);

  /**
   * Add a new attestation to a specified original version. Attestations can only be added to Original versions.
   */
  void commitAttestation(Attestation anAttestation, ObjectVersionId aVerId, String signingKey);
}
