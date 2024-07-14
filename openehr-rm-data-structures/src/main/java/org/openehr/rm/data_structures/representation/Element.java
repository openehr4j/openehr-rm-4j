package org.openehr.rm.data_structures.representation;

import org.openehr.rm.data_types.basic.DataValue;
import org.openehr.rm.data_types.text.DvCodedText;
import org.openehr.rm.data_types.text.DvText;




public interface Element extends Item {



  DvCodedText getNullFlavour();




  DataValue getValue();




  DvText getNullReason();




  Boolean isNull();
}
