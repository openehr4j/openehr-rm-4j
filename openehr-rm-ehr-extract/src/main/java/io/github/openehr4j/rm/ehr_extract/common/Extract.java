package io.github.openehr4j.rm.ehr_extract.common;

import java.util.List;

import org.openehr.base.base_types.identification.HierObjectId;
import io.github.openehr4j.rm.common.archetyped.Locatable;
import io.github.openehr4j.rm.data_types.date_time.DvDateTime;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr_extract.html#_extract_class">specifications.openehr.org</a>
 */
public interface Extract extends Locatable {

  List getChapters();

  ExtractSpec getSpecification();

  HierObjectId getRequestId();

  DvDateTime getTimeCreated();

  HierObjectId getSystemId();

  Integer getSequenceNr();

  List getParticipations();
}
