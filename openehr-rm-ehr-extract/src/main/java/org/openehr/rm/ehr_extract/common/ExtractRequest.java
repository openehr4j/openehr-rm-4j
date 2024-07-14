package org.openehr.rm.ehr_extract.common;

import org.openehr.base.base_types.identification.HierObjectId;
import org.openehr.rm.common.archetyped.Locatable;

public interface ExtractRequest extends Locatable {

  ExtractSpec getExtractSpec();

  ExtractUpdateSpec getUpdateSpec();

  HierObjectId getUid();
}
