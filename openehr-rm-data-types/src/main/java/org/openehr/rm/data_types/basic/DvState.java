package org.openehr.rm.data_types.basic;

import org.openehr.rm.data_types.text.DvCodedText;




public interface DvState extends DataValue {



  DvCodedText getValue();




  Boolean getIsTerminal();
}
