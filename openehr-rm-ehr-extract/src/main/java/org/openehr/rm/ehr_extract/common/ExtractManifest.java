package org.openehr.rm.ehr_extract.common;

/**
 * Specification of the candidate entities and optionally top-level items (e.g. Compositions) to be included in the Extract.
 */
public interface ExtractManifest {
  /**
   * List of entity manifests uids of items included in the Extract; for openEHR data, these are uids identifying the version containers.
   */
  List<EXTRACTEntityMANIFEST> getEntities();
}
