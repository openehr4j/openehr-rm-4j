package org.openehr.rm.common.generic;

import org.openehr.rm.data_types.date_time.DvDateTime;
import org.openehr.rm.data_types.text.DvCodedText;
import org.openehr.rm.data_types.text.DvText;




public interface AuditDetails {



  String getSystemId();




  DvDateTime getTimeCommitted();




  DvCodedText getChangeType();




  DvText getDescription();




  PartyProxy getCommitter();
}
