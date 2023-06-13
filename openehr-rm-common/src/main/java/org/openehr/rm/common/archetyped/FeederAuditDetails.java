package org.openehr.rm.common.archetyped;

import org.openehr.rm.common.generic.PartyIdentified;
import org.openehr.rm.common.generic.PartyProxy;
import org.openehr.rm.data_structures.item_structure.ItemStructure;
import org.openehr.rm.data_types.date_time.DvDateTime;

/**
 * Audit details for any system in a feeder system chain. Audit details here means the general notion of who/where/when the information item to which the audit is attached was created. None of the attributes is defined as mandatory, however, in different scenarios, various combinations of attributes will usually be mandatory. This can be controlled by specifying feeder audit details in legacy archetypes.
 */
public interface FeederAuditDetails {
  /**
   * Identifier of the system which handled the information item. This is the IT system owned by the organisation legally responsible for handling the data, and at which the data were previously created or passed by an earlier system.
   */
  String getSystemId();

  /**
   * Identifier of the particular site/facility within an organisation which handled the item. For computability, this identifier needs to be e.g. a PKI identifier which can be included in the identifier list of the `PARTY_IDENTIFIED` object.
   */
  PartyIdentified getLocation();

  /**
   * Identifiers for subject of the received information item.
   */
  PartyProxy getSubject();

  /**
   * Optional provider(s) who created, committed, forwarded or otherwise handled the item.
   */
  PartyIdentified getProvider();

  /**
   * Time of handling the item. For an originating system, this will be time of creation, for an intermediate feeder system, this will be a time of accession or other time of handling, where available.
   */
  DvDateTime getTime();

  /**
   * Any identifier used in the system such as  "interim" ,  "final" , or numeric versions if available.
   */
  String getVersionId();

  /**
   * Optional attribute to carry any custom meta-data. May be archetyped.
   */
  ItemStructure getOtherDetails();
}
