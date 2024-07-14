package io.github.openehr4j.rm.common.archetyped;

import io.github.openehr4j.rm.common.generic.PartyIdentified;
import io.github.openehr4j.rm.common.generic.PartyProxy;
import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;
import io.github.openehr4j.rm.data_types.date_time.DvDateTime;

public interface FeederAuditDetails {

  String getSystemId();

  PartyIdentified getLocation();

  PartyProxy getSubject();

  PartyIdentified getProvider();

  DvDateTime getTime();

  String getVersionId();

  ItemStructure getOtherDetails();
}
