package io.github.openehr4j.rm.ehr.ehr;

import java.lang.Boolean;
import io.github.openehr4j.rm.common.archetyped.Locatable;
import io.github.openehr4j.rm.common.generic.PartySelf;
import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;

public interface EhrStatus extends Locatable {

  PartySelf getSubject();

  Boolean getIsQueryable();

  Boolean getIsModifiable();

  ItemStructure getOtherDetails();
}
