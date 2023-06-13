package org.openehr.rm.ehr_extract.common;

import org.openehr.base_base_types.identification.HierObjectId;
import org.openehr.base_base_types.identification.ObjectRef;
import org.openehr.rm.common.archetyped.Locatable;
import org.openehr.rm.data_types.text.DvCodedText;

/**
 * Generic model of a Request for an Extract, containing an Extract specification.
 */
public interface ExtractActionRequest extends Locatable {
  /**
   * Identifier of previous `EXTRACT_REQUEST`.
   */
  ObjectRef getRequestId();

  /**
   * Requested action: `cancel &#124; resend &#124; send new`. Coded by openEHR Terminology group `'extract action type'`.
   */
  DvCodedText getAction();

  HierObjectId getUid();
}
