package io.github.openehr4j.rm.common.archetyped;

import io.github.openehr4j.rm.common.generic.PartyIdentified;
import io.github.openehr4j.rm.common.generic.PartyProxy;
import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;
import io.github.openehr4j.rm.data_types.date_time.DvDateTime;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/common.html#_feeder_audit_details_class">specifications.openehr.org</a>
 */
public interface FeederAuditDetails {

  String getSystemId();

  PartyIdentified getLocation();

  PartyProxy getSubject();

  PartyIdentified getProvider();

  DvDateTime getTime();

  String getVersionId();

  ItemStructure getOtherDetails();
}
