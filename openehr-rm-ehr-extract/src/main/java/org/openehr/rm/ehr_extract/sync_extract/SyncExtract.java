package org.openehr.rm.ehr_extract.sync_extract;

import java.util.List;

public interface SyncExtract {

  SyncExtractSpec getSpecification();

  List getItems();
}
