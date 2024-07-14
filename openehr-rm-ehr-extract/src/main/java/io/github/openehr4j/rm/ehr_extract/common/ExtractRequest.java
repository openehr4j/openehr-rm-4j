package io.github.openehr4j.rm.ehr_extract.common;

import org.openehr.base.base_types.identification.HierObjectId;
import io.github.openehr4j.rm.common.archetyped.Locatable;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr_extract.html#_extract_request_class">specifications.openehr.org</a>
 */
public interface ExtractRequest extends Locatable {

  ExtractSpec getExtractSpec();

  ExtractUpdateSpec getUpdateSpec();

  HierObjectId getUid();
}
