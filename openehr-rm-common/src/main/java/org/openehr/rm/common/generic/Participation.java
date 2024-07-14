package org.openehr.rm.common.generic;

import org.openehr.rm.data_types.text.DvCodedText;
import org.openehr.rm.data_types.text.DvText;




public interface Participation {



  DvText getFunction();




  DvCodedText getMode();




  PartyProxy getPerformer();




  Object getTime();
}
