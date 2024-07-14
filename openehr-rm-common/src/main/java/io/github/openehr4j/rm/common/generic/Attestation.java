package io.github.openehr4j.rm.common.generic;

import java.util.List;

import io.github.openehr4j.rm.data_types.encapsulated.DvMultimedia;
import io.github.openehr4j.rm.data_types.text.DvText;
import io.github.openehr4j.rm.data_types.uri.DvEhrUri;

public interface Attestation extends AuditDetails {

  DvMultimedia getAttestedView();

  String getProof();

  List<DvEhrUri> getItems();

  DvText getReason();

  Boolean getIsPending();
}
