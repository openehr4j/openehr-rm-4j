package org.openehr.rm.common.change_control;

/**
 * Documents a Contribution (change set) of one or more versions added to a change-controlled repository.
 */
public interface Contribution {
  /**
   * Unique identifier for this Contribution.
   */
  HierObjectId getUid();

  /**
   * Set of references to Versions causing changes to this EHR. Each contribution contains a list of versions, which may include paths pointing to any number of versionable items, i.e. items of types such as `COMPOSITION` and `FOLDER`.
   */
  List<OBJECTREF> getVersions();

  /**
   * Audit trail corresponding to the committal of this Contribution.
   */
  AuditDetails getAudit();
}
