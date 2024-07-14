package org.openehr.rm.ehr.composition;

import java.lang.String;
import java.util.List;
import org.openehr.rm.common.archetyped.Pathable;
import org.openehr.rm.common.generic.PartyIdentified;
import org.openehr.rm.data_structures.item_structure.ItemStructure;
import org.openehr.rm.data_types.date_time.DvDateTime;
import org.openehr.rm.data_types.text.DvCodedText;

public interface EventContext extends Pathable {

  DvDateTime getStartTime();

  DvDateTime getEndTime();

  String getLocation();

  DvCodedText getSetting();

  ItemStructure getOtherContext();

  PartyIdentified getHealthCareFacility();

  List getParticipations();
}
