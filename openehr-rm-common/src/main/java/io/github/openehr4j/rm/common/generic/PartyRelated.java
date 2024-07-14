package io.github.openehr4j.rm.common.generic;

import io.github.openehr4j.rm.data_types.text.DvCodedText;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/common.html#_party_related_class">specifications.openehr.org</a>
 */
public interface PartyRelated extends PartyIdentified {

  DvCodedText getRelationship();
}
