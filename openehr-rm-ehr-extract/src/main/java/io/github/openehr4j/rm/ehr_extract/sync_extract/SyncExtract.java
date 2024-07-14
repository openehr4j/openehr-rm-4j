package io.github.openehr4j.rm.ehr_extract.sync_extract;

import java.util.List;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr_extract.html#_sync_extract_class">specifications.openehr.org</a>
 */
public interface SyncExtract {

  SyncExtractSpec getSpecification();

  List getItems();
}
