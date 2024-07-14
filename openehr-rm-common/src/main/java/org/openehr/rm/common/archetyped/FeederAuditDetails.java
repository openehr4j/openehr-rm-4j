package org.openehr.rm.common.archetyped;

import org.openehr.rm.common.generic.PartyIdentified;
import org.openehr.rm.common.generic.PartyProxy;
import org.openehr.rm.data_structures.item_structure.ItemStructure;
import org.openehr.rm.data_types.date_time.DvDateTime;




public interface FeederAuditDetails {



  String getSystemId();




  PartyIdentified getLocation();




  PartyProxy getSubject();




  PartyIdentified getProvider();




  DvDateTime getTime();




  String getVersionId();




  ItemStructure getOtherDetails();
}
