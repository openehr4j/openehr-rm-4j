package org.openehr.rm.ehr_extract.sync_extract;

import java.util.List;

public interface SyncExtract {
  /**
   * Details of specification of this Extract.
   */
  SyncExtractSpec getSpecification();

  /**
   * Content, in the form of a serialised Contributions.
   */
  List getItems();
}
