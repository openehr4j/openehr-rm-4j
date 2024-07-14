package org.openehr.rm.ehr.ehr;

import java.lang.Boolean;
import org.openehr.rm.common.archetyped.Locatable;
import org.openehr.rm.common.generic.PartySelf;
import org.openehr.rm.data_structures.item_structure.ItemStructure;




public interface EhrStatus extends Locatable {



  PartySelf getSubject();




  Boolean getIsQueryable();




  Boolean getIsModifiable();




  ItemStructure getOtherDetails();
}
