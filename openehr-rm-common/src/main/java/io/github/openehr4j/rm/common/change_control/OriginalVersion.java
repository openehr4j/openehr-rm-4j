package io.github.openehr4j.rm.common.change_control;

import java.util.List;

import org.openehr.base.base_types.identification.ObjectVersionId;
import io.github.openehr4j.rm.common.generic.Attestation;
import io.github.openehr4j.rm.data_types.text.DvCodedText;

public interface OriginalVersion<T> extends Version<T> {

  ObjectVersionId getUid();

  ObjectVersionId getPrecedingVersionUid();

  List<ObjectVersionId> getOtherInputVersionUids();

  DvCodedText getLifecycleState();

  List<Attestation> getAttestations();

  T getData();

  Boolean isMerged();
}
