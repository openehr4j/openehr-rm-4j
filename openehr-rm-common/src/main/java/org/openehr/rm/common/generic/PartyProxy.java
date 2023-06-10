package org.openehr.rm.common.generic;

import org.openehr.base_base_types.identification.PartyRef;

/**
 * Abstract concept of a proxy description of a party, including an optional link to data for this party in a demographic or other identity management system. Sub- typed into `PARTY_IDENTIFIED` and `PARTY_SELF`.
 */
public interface PartyProxy {
  /**
   * Optional reference to more detailed demographic or identification information for this party, in an external system.
   */
  PartyRef getExternalRef();
}
