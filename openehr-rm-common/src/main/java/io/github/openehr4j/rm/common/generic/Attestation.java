package io.github.openehr4j.rm.common.generic;

import java.util.List;

import io.github.openehr4j.rm.data_types.encapsulated.DvMultimedia;
import io.github.openehr4j.rm.data_types.text.DvText;
import io.github.openehr4j.rm.data_types.uri.DvEhrUri;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/common.html#_attestation_class">specifications.openehr.org</a>
 */
public interface Attestation extends AuditDetails {

  DvMultimedia getAttestedView();

  String getProof();

  List<DvEhrUri> getItems();

  DvText getReason();

  Boolean getIsPending();
}
