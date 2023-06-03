package org.openehr.rm.ehr_extract.openehr_extract;

/**
 * Version control abstraction, defining semantics for versioning one complex object.
 */
public interface VersionedObject {
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
  void version_count();

  /**
   * Return a list of ids of all versions in this object.
   */
  void all_version_ids();

  /**
   * Return a list of all versions in this object.
   */
  void all_versions();

  /**
   * True if a version for time  `_a_time_` exists.
   */
  void has_version_at_time();

  /**
   * True if a version with `_a_version_uid_` exists.
   */
  void has_version_id();

  /**
   * Return the version with `_uid_` =  `_a_version_uid_`.
   */
  void version_with_id();

  /**
   * True if version with `_a_version_uid_` is an `ORIGINAL_VERSION`.
   */
  void is_original_version();

  /**
   * Return the version for time  `_a_time_`.
   */
  void version_at_time();

  /**
   * History of all audits and attestations in this versioned repository.
   */
  void revision_history();

  /**
   * Return the most recently added version (i.e. on trunk or any branch).
   */
  void latest_version();

  /**
   * Return the most recently added trunk version.
   */
  void latest_trunk_version();

  /**
   * Return the lifecycle state from the latest trunk version. Useful for determining if the version container is logically deleted.
   */
  void trunk_lifecycle_state();

  /**
   * Add a new original version.
   */
  void commit_original_version();

  /**
   * Add a new original merged version. This commit function adds a parameter containing the ids of other versions merged into the current one.
   */
  void commit_original_merged_version();

  /**
   * Add a new imported version. Details of version id etc come from the `ORIGINAL_VERSION` being committed.
   */
  void commit_imported_version();

  /**
   * Add a new attestation to a specified original version. Attestations can only be added to Original versions.
   */
  void commit_attestation();
}
