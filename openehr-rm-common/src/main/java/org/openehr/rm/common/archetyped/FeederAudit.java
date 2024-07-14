package org.openehr.rm.common.archetyped;

import java.util.List;

import org.openehr.rm.data_types.encapsulated.DvEncapsulated;




public interface FeederAudit {



  List getOriginatingSystemItemIds();




  List getFeederSystemItemIds();




  DvEncapsulated getOriginalContent();




  FeederAuditDetails getOriginatingSystemAudit();




  FeederAuditDetails getFeederSystemAudit();
}
