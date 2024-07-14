package io.github.openehr4j.rm.common.generic;

import io.github.openehr4j.rm.data_types.text.DvCodedText;

public interface PartyRelated extends PartyIdentified {

  DvCodedText getRelationship();
}
