package org.openehr.rm.ehr.composition;

import org.openehr.base_foundation_types.primitive_types.String;
import org.openehr.rm_common.archetyped.Pathable;
import org.openehr.rm_common.generic.PartyIdentified;
import org.openehr.rm_data_structures.item_structure.ItemStructure;
import org.openehr.rm_data_types.date_time.DvDateTime;
import org.openehr.rm_data_types.text.DvCodedText;

/**
 * Documents the context information of a healthcare event involving the subject of care and the health system. The context information recorded here are independent of the attributes recorded in the version audit, which document the  system interaction  context, i.e. the context of a user interacting with the health record system. Healthcare events include patient contacts, and any other business activity, such as pathology investigations which take place on behalf of the patient.
 */
public interface EventContext extends Pathable {
  /**
   * Start time of the clinical session or other kind of event during which a provider performs a service of any kind for the patient.
   */
  DvDateTime getStartTime();

  /**
   * Optional end time of the clinical session.
   */
  DvDateTime getEndTime();

  /**
   * The actual location where the session occurred, e.g. 'microbiology lab 2', 'home', 'ward A3'  and so on.
   */
  String getLocation();

  /**
   * The setting in which the clinical session took place. Coded using the openEHR Terminology,  setting  group.
   */
  DvCodedText getSetting();

  /**
   * Other optional context which will be archetyped.
   */
  ItemStructure getOtherContext();

  /**
   * The health care facility under whose care the event took place. This is the most specific workgroup or delivery unit within a care delivery enterprise that has an official identifier in the health system, and can be used to ensure medico-legal accountability.
   */
  PartyIdentified getHealthCareFacility();

  /**
   * Parties involved in the healthcare event. These would normally include the physician(s) and often the patient (but not the latter if the clinical session is a pathology test for example).
   */
  List<Participation> getParticipations();
}
