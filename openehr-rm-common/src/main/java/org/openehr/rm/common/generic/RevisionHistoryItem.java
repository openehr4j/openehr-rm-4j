package org.openehr.rm.common.generic;

import java.util.List;
import org.openehr.base.base_types.identification.ObjectVersionId;

/**
 * An entry in a revision history, corresponding to a version from a versioned container. Consists of `AUDIT_DETAILS` instances with revision identifier of the revision to which the `AUDIT_DETAILS` instance belongs.
 */
public interface RevisionHistoryItem {
  /**
   * Version identifier for this revision.
   */
  ObjectVersionId getVersionId();

  /**
   * The audits for this revision; there will always be at least one commit audit (which may itself be an `ATTESTATION`), there may also be further attestations.
   */
  List getAudits();
}
