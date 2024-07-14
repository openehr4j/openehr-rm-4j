package io.github.openehr4j.rm.common.generic;

import org.openehr.base.base_types.identification.PartyRef;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/common.html#_party_proxy_class">specifications.openehr.org</a>
 */
public interface PartyProxy {

  PartyRef getExternalRef();
}
