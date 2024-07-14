package org.openehr.rm.ehr_extract.common;

import org.openehr.base.base_types.identification.HierObjectId;
import org.openehr.base.base_types.identification.ObjectRef;
import org.openehr.rm.common.archetyped.Locatable;
import org.openehr.rm.data_types.text.DvCodedText;

public interface ExtractActionRequest extends Locatable {

  ObjectRef getRequestId();

  DvCodedText getAction();

  HierObjectId getUid();
}
