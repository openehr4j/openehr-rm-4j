package io.github.openehr4j.rm.ehr_extract.common;

import org.openehr.base.base_types.identification.HierObjectId;
import org.openehr.base.base_types.identification.ObjectRef;
import io.github.openehr4j.rm.common.archetyped.Locatable;
import io.github.openehr4j.rm.data_types.text.DvCodedText;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr_extract.html#_extract_action_request_class">specifications.openehr.org</a>
 */
public interface ExtractActionRequest extends Locatable {

  ObjectRef getRequestId();

  DvCodedText getAction();

  HierObjectId getUid();
}
