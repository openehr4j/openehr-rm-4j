package org.openehr.rm.common.generic;

import java.util.List;

import org.openehr.rm.data_types.encapsulated.DvMultimedia;
import org.openehr.rm.data_types.text.DvText;
import org.openehr.rm.data_types.uri.DvEhrUri;

public interface Attestation extends AuditDetails {

  DvMultimedia getAttestedView();

  String getProof();

  List<DvEhrUri> getItems();

  DvText getReason();

  Boolean getIsPending();
}
