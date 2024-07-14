package io.github.openehr4j.rm.ehr_extract.sync_extract;

import java.lang.Boolean;
import java.util.List;
import io.github.openehr4j.rm.data_types.date_time.DvDateTime;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr_extract.html#_sync_extract_spec_class">specifications.openehr.org</a>
 */
public interface SyncExtractSpec {

  Boolean getIncludesVersions();

  List getContributionList();

  DvDateTime getContributionsSince();

  Boolean getAllContributions();
}
