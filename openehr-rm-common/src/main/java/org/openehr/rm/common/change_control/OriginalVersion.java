package org.openehr.rm.common.change_control;

import org.openehr.base_base_types.identification.ObjectVersionId;
import org.openehr.base_foundation_types.primitive_types.Boolean;
import org.openehr.rm_common.change_control.Version;
import org.openehr.rm_data_types.text.DvCodedText;

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
  List<ObjectVersionId> getOtherInputVersionUids();

  /**
   * Lifecycle state of the content item in this version; coded by openEHR vocabulary `version lifecycle state`.
   */
  DvCodedText getLifecycleState();

  /**
   * Set of attestations relating to this version.
   */
  List<Attestation> getAttestations();

  /**
   * Data content of this Version.
   */
  T getData();

  /**
   * True if this Version was created from more than just the preceding (checked out) version.
   */
  Boolean isMerged();
}
