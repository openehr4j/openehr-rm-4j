package org.openehr.rm.data_types.quantity;

import org.openehr.base.foundation_types.primitive_types.Real;
import org.openehr.rm.data_types.text.DvCodedText;




public interface DvScale extends DvOrdered {



  DvCodedText getSymbol();




  Real getValue();




  Boolean isStrictlyComparableTo(Object other);




  Boolean lessThan(Object other);
}
