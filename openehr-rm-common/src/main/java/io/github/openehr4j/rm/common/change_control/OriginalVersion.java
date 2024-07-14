package io.github.openehr4j.rm.common.change_control;

import java.util.List;

import org.openehr.base.base_types.identification.ObjectVersionId;
import io.github.openehr4j.rm.common.generic.Attestation;
import io.github.openehr4j.rm.data_types.text.DvCodedText;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/common.html#_original_version_class">specifications.openehr.org</a>
 */
public interface OriginalVersion<T> extends Version<T> {

  ObjectVersionId getUid();

  ObjectVersionId getPrecedingVersionUid();

  List<ObjectVersionId> getOtherInputVersionUids();

  DvCodedText getLifecycleState();

  List<Attestation> getAttestations();

  T getData();

  Boolean isMerged();
}
