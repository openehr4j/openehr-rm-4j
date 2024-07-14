package org.openehr.rm.ehr_extract.common;

import java.lang.Boolean;
import java.util.List;
import org.openehr.rm.data_types.date_time.DvDuration;
import org.openehr.rm.data_types.text.CodePhrase;




public interface ExtractUpdateSpec {



  Boolean getPersistInServer();




  DvDuration getRepeatPeriod();




  List getTriggerEvents();




  CodePhrase getUpdateMethod();
}
