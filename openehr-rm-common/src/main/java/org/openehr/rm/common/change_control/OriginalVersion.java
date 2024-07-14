package org.openehr.rm.common.change_control;

import java.util.List;

import org.openehr.base.base_types.identification.ObjectVersionId;
import org.openehr.rm.common.generic.Attestation;
import org.openehr.rm.data_types.text.DvCodedText;




public interface OriginalVersion<T> extends Version<T> {



  ObjectVersionId getUid();




  ObjectVersionId getPrecedingVersionUid();




  List<ObjectVersionId> getOtherInputVersionUids();




  DvCodedText getLifecycleState();




  List<Attestation> getAttestations();




  T getData();




  Boolean isMerged();
}
