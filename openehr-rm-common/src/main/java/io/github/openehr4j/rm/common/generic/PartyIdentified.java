package io.github.openehr4j.rm.common.generic;

import java.util.List;

public interface PartyIdentified extends PartyProxy {

  String getName();

  List getIdentifiers();
}
