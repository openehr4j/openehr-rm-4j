package io.github.openehr4j.rm.ehr_extract.common;

import org.openehr.base.base_types.identification.HierObjectId;
import org.openehr.base.base_types.identification.ObjectRef;
import io.github.openehr4j.rm.common.archetyped.Locatable;
import io.github.openehr4j.rm.data_types.text.DvCodedText;

public interface ExtractActionRequest extends Locatable {

  ObjectRef getRequestId();

  DvCodedText getAction();

  HierObjectId getUid();
}
