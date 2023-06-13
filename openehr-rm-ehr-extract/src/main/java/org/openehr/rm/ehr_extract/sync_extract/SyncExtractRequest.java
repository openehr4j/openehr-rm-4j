package org.openehr.rm.ehr_extract.sync_extract;

/**
 * Type of request designed for synchronisation of Contributions between openEHR servers.
 */
public interface SyncExtractRequest {
  /**
   * Details of specification of synchronisation request.
   */
  SyncExtractSpec getSpecification();
}
