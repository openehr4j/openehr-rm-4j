package org.openehr.rm.ehr.entry;

import java.util.List;

import org.openehr.rm.data_types.date_time.DvDateTime;
import org.openehr.rm.data_types.encapsulated.DvParsable;
import org.openehr.rm.data_types.text.DvText;




public interface Instruction extends CareEntry {



  DvText getNarrative();




  DvDateTime getExpiryTime();




  DvParsable getWfDefinition();




  List getActivities();
}
