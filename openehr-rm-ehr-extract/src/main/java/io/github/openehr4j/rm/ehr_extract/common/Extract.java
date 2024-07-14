package io.github.openehr4j.rm.ehr_extract.common;

import java.util.List;

import org.openehr.base.base_types.identification.HierObjectId;
import io.github.openehr4j.rm.common.archetyped.Locatable;
import io.github.openehr4j.rm.data_types.date_time.DvDateTime;

public interface Extract extends Locatable {

  List getChapters();

  ExtractSpec getSpecification();

  HierObjectId getRequestId();

  DvDateTime getTimeCreated();

  HierObjectId getSystemId();

  Integer getSequenceNr();

  List getParticipations();
}
