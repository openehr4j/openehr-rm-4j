package org.openehr.rm.common.generic;

import java.util.List;

import org.openehr.rm.data_types.encapsulated.DvMultimedia;
import org.openehr.rm.data_types.text.DvText;
import org.openehr.rm.data_types.uri.DvEhrUri;

/**
 * Record an attestation of a party (the committer) to item(s) of record content. An attestation is an explicit signing by one healthcare agent of particular content for various particular purposes, including:
 */
public interface Attestation extends AuditDetails {
  /**
   * Optional visual representation of content attested e.g. screen image.
   */
  DvMultimedia getAttestedView();

  /**
   * Proof of attestation.
   */
  String getProof();

  /**
   * Items attested, expressed as fully qualified runtime paths to the items in question. Although not recommended, these may include fine-grained items which have been attested in some other system. Otherwise it is assumed to be for the entire VERSION with which it is associated.
   */
  List<DvEhrUri> getItems();

  /**
   * Reason of this attestation. Optionally coded by the openEHR Terminology group  attestation reason ; includes values like  authorisation ,  witness  etc.
   */
  DvText getReason();

  /**
   * True if this attestation is outstanding; False means it has been completed.
   */
  Boolean getIsPending();
}
