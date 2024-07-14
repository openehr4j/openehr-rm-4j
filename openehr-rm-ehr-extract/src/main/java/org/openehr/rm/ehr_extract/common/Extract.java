package org.openehr.rm.ehr_extract.common;

import java.util.List;

import org.openehr.base.base_types.identification.HierObjectId;
import org.openehr.rm.common.archetyped.Locatable;
import org.openehr.rm.data_types.date_time.DvDateTime;




public interface Extract extends Locatable {



  List getChapters();




  ExtractSpec getSpecification();




  HierObjectId getRequestId();




  DvDateTime getTimeCreated();




  HierObjectId getSystemId();




  Integer getSequenceNr();




  List getParticipations();
}
