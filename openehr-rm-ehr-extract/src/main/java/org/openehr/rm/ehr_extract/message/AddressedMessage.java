package org.openehr.rm.ehr_extract.message;

import java.util.List;




public interface AddressedMessage {



  String getSender();




  String getSenderReference();




  List getAddressees();




  Integer getUrgency();




  Message getMessage();
}
