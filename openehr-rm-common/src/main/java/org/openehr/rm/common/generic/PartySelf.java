package org.openehr.rm.common.generic;

import org.openehr.rm_common.generic.PartyProxy;

/**
 * Party proxy representing the subject of the record. Used to indicate that the party is the owner of the record. May or may not have `_external_ref_` set.
 */
public interface PartySelf extends PartyProxy {
}
