package io.github.openehr4j.rm.ehr.composition;

import java.lang.String;
import java.util.List;
import io.github.openehr4j.rm.common.archetyped.Pathable;
import io.github.openehr4j.rm.common.generic.PartyIdentified;
import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;
import io.github.openehr4j.rm.data_types.date_time.DvDateTime;
import io.github.openehr4j.rm.data_types.text.DvCodedText;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr.html#_event_context_class">specifications.openehr.org</a>
 */
public interface EventContext extends Pathable {

  DvDateTime getStartTime();

  DvDateTime getEndTime();

  String getLocation();

  DvCodedText getSetting();

  ItemStructure getOtherContext();

  PartyIdentified getHealthCareFacility();

  List getParticipations();
}
