package org.openehr.rm.common.change_control;

import org.openehr.base_base_types.identification.HierObjectId;
import org.openehr.base_base_types.identification.ObjectRef;
import org.openehr.base_base_types.identification.ObjectVersionId;
import org.openehr.rm.common.generic.AuditDetails;
import org.openehr.rm.data_types.text.DvCodedText;

/**
 * Abstract model of one Version within a Version container, containing data, commit audit trail, and the identifier of its Contribution.
 */
public interface Version {
  /**
   * Contribution in which this version was added.
   */
  ObjectRef getContribution();

  /**
   * OpenPGP digital signature or digest of content committed in this Version.
   */
  String getSignature();

  /**
   * Audit trail corresponding to the committal of this version to the `VERSIONED_OBJECT`.
   */
  AuditDetails getCommitAudit();

  /**
   * Unique identifier of this `VERSION`, in the form of an `{object_id, a version_tree_id, creating_system_id}` triple, where the `_object_id_` has the same value as the containing `VERSIONED_OBJECT _uid_`.
   */
  ObjectVersionId uid();

  /**
   * Unique identifier of the version of which this version is a modification; Void if this is the first version.
   */
  ObjectVersionId precedingVersionUid();

  /**
   * The data of this Version.
   */
  Object data();

  /**
   * Lifecycle state of this version; coded by openEHR vocabulary `version lifecycle state`.
   */
  DvCodedText lifecycleState();

  /**
   * A canonical serial form of this Version, suitable for generating reliable hashes and signatures.
   */
  String canonicalForm();

  /**
   * Copy of the owning `VERSIONED_OBJECT._uid_` value; extracted from the local `_uid_` property's `_object_id_`.
   */
  HierObjectId ownerId();

  /**
   * True if this Version represents a branch. Derived from `_uid_` attribute.
   */
  Boolean isBranch();
}
