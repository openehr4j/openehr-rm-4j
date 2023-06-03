package org.openehr.rm.common.change_control;

/**
 * A Version containing locally created content and optional attestations.
 */
public interface OriginalVersion extends Version {
  /**
   * Stored version of inheritance precursor.
   */
  ObjectVersionId getUid();

  /**
   * Stored version of inheritance precursor.
   */
  ObjectVersionId getPrecedingVersionUid();

  /**
   * Identifiers of other versions whose content was merged into this version, if any.
   */
  List<OBJECTVersionID> getOtherInputVersionUids();

  /**
   * Lifecycle state of the content item in this version; coded by openEHR vocabulary `version lifecycle state`.
   */
  DvCodedText getLifecycleState();

  /**
   * Set of attestations relating to this version.
   */
  List<ATTESTATION> getAttestations();

  /**
   * Data content of this Version.
   */
  T getData();

  /**
   * True if this Version was created from more than just the preceding (checked out) version.
   */
  void is_merged();
}
