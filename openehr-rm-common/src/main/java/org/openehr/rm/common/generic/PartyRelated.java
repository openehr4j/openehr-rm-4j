package org.openehr.rm.common.generic;

import org.openehr.rm.data_types.text.DvCodedText;

/**
 * Proxy type for identifying a party and its relationship to the subject of the record. Use where the relationship between the party and the subject of the record must be known.
 */
public interface PartyRelated extends PartyIdentified {
  /**
   * Relationship of subject of this ENTRY to the subject of the record. May be coded. If it is the patient, coded as  self.
   */
  DvCodedText getRelationship();
}
