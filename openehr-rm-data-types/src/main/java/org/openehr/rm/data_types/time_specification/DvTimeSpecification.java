package org.openehr.rm.data_types.time_specification;

import org.openehr.rm.data_types.basic.DataValue;
import org.openehr.rm.data_types.encapsulated.DvParsable;




public interface DvTimeSpecification extends DataValue {



  DvParsable getValue();




  String calendarAlignment();




  String eventAlignment();




  Boolean institutionSpecified();
}
