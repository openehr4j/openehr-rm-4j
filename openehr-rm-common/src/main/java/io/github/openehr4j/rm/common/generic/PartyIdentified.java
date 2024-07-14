package io.github.openehr4j.rm.common.generic;

import java.util.List;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/common.html#_party_identified_class">specifications.openehr.org</a>
 */
public interface PartyIdentified extends PartyProxy {

  String getName();

  List getIdentifiers();
}
