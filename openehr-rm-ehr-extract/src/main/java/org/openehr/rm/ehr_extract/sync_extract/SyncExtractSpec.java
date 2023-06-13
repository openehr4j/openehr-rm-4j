package org.openehr.rm.ehr_extract.sync_extract;

import java.lang.Boolean;
import java.util.List;
import org.openehr.rm.data_types.date_time.DvDateTime;

/**
 * Details of specification of Extract, used in a request to specify an Extract, or in a response, to describe what is actually in the Extract.
 */
public interface SyncExtractSpec {
  /**
   * True if the Versions from the Contribution are included; False if just the Contribution and its Audit are included.
   */
  Boolean getIncludesVersions();

  /**
   * List of Contributions to include / that are included in the Extract.
   */
  List getContributionList();

  /**
   * Specify Contributions included in Extract by threshold date.
   */
  DvDateTime getContributionsSince();

  /**
   * True if all Contributions in the record are included.
   */
  Boolean getAllContributions();
}
