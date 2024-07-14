package org.openehr.rm.common.generic;

import org.openehr.rm.data_types.text.DvCodedText;

public interface PartyRelated extends PartyIdentified {

  DvCodedText getRelationship();
}
