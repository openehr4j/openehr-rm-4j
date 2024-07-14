package io.github.openehr4j.rm.ehr.composition;

import java.lang.String;
import java.util.List;
import io.github.openehr4j.rm.common.archetyped.Pathable;
import io.github.openehr4j.rm.common.generic.PartyIdentified;
import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;
import io.github.openehr4j.rm.data_types.date_time.DvDateTime;
import io.github.openehr4j.rm.data_types.text.DvCodedText;

public interface EventContext extends Pathable {

  DvDateTime getStartTime();

  DvDateTime getEndTime();

  String getLocation();

  DvCodedText getSetting();

  ItemStructure getOtherContext();

  PartyIdentified getHealthCareFacility();

  List getParticipations();
}
