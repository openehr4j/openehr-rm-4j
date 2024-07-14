package org.openehr.rm.ehr_extract.common;

import java.lang.Object;
import java.lang.String;
import org.openehr.rm.data_types.text.DvCodedText;
import org.openehr.rm.data_types.text.DvText;




public interface ExtractParticipation {



  Object getTime();




  DvText getFunction();




  DvCodedText getMode();




  String getPerformer();
}
