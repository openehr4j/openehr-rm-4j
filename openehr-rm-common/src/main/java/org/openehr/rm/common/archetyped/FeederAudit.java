package org.openehr.rm.common.archetyped;

/**
 * The `FEEDER_AUDIT` class defines the semantics of an audit trail which is constructed to describe the origin of data that have been transformed into openEHR form and committed to the system.
 */
public interface FeederAudit {
  /**
   * Identifiers used for the item in the originating system, e.g. filler and placer ids.
   */
  List<DVIDENTIFIER> getOriginatingSystemItemIds();

  /**
   * Identifiers used for the item in the feeder system, where the feeder system is distinct from the originating system.
   */
  List<DVIDENTIFIER> getFeederSystemItemIds();

  /**
   * Optional inline inclusion of or reference to original content corresponding to the openEHR content at this node. Typically a URI reference to a document or message in a persistent store associated with the EHR.
   */
  DvEncapsulated getOriginalContent();

  /**
   * Any audit information for the information item from the originating system.
   */
  FeederAuditDetails getOriginatingSystemAudit();

  /**
   * Any audit information for the information item from the feeder system, if different from the originating system.
   */
  FeederAuditDetails getFeederSystemAudit();
}
