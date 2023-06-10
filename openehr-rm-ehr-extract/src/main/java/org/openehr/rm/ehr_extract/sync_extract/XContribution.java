package org.openehr.rm.ehr_extract.sync_extract;

import org.openehr.base_base_types.identification.HierObjectId;
import org.openehr.rm_common.generic.AuditDetails;

/**
 * Serialised form of Contribution for an Extract.
 */
public interface XContribution {
  /**
   * Uid of Contribution in source system.
   */
  HierObjectId getUid();

  /**
   * Audit of Contribution in source system.
   */
  AuditDetails getAudit();

  /**
   * Serialised Versions from Contribution in source system.
   */
  List<Version> getVersions();
}
