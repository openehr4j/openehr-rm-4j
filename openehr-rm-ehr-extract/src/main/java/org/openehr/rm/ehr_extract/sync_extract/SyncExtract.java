package org.openehr.rm.ehr_extract.sync_extract;

import org.openehr.rm_ehr_extract.sync_extract.SyncExtractSpec;

public interface SyncExtract extends MessageContent {
  /**
   * Details of specification of this Extract.
   */
  SyncExtractSpec getSpecification();

  /**
   * Content, in the form of a serialised Contributions.
   */
  List<XContribution> getItems();
}
