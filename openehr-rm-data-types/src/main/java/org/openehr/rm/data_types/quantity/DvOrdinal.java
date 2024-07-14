package org.openehr.rm.data_types.quantity;

import org.openehr.rm.data_types.text.DvCodedText;




public interface DvOrdinal extends DvOrdered {



  DvCodedText getSymbol();




  Integer getValue();




  Boolean lessThan(Object other);




  Boolean isStrictlyComparableTo(Object other);
}
