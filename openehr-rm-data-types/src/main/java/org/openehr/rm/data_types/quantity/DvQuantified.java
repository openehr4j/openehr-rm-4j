package org.openehr.rm.data_types.quantity;




public interface DvQuantified extends DvOrdered {



  String getMagnitudeStatus();




  Object getAccuracy();




  Boolean validMagnitudeStatus();

  Object magnitude();




  Boolean accuracyUnknown();




  Boolean isEqual(Object other);




  Boolean lessThan(Object other);
}
