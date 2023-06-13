package org.openehr.rm.common.generic;

import java.util.List;

/**
 * Proxy data for an identified party other than the subject of the record, minimally consisting of human-readable identifier(s), such as name, formal (and possibly computable) identifiers such as NHS number, and an optional link to external data. There must be at least one of name, identifier or external_ref present.
 */
public interface PartyIdentified extends PartyProxy {
  /**
   * Optional human-readable name (in String form).
   */
  String getName();

  /**
   * One or more formal identifiers (possibly computable).
   */
  List getIdentifiers();
}
