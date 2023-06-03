package org.openehr.rm.common.change_control;

/**
 * Versions whose content is an `ORIGINAL_VERSION` copied from another location; this class inherits `_commit_audit_` and `_contribution_` from `VERSION<T>`, providing imported versions with their own audit trail and Contribution, distinct from those of the imported `ORIGINAL_VERSION`.
 */
public interface ImportedVersion extends Version {
  /**
   * The `ORIGINAL_VERSION` object that was imported.
   */
  OriginalVersion getItem();

  /**
   * Computed version of inheritance precursor, derived as `_item.uid_`.
   */
  void uid();

  /**
   * Computed version of inheritance precursor, derived as `_item.preceding_version_uid_`.
   */
  void preceding_version_uid();

  /**
   * Lifecycle state of the content item in wrapped `ORIGINAL_VERSION`, derived as `_item.lifecycle_state_`; coded by openEHR vocabulary `version lifecycle state`.
   */
  void lifecycle_state();

  /**
   * Original content of this Version.
   */
  void data();
}
