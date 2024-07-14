package org.openehr.rm.ehr_extract.sync_extract;

import java.lang.Boolean;
import java.util.List;
import org.openehr.rm.data_types.date_time.DvDateTime;




public interface SyncExtractSpec {



  Boolean getIncludesVersions();




  List getContributionList();




  DvDateTime getContributionsSince();




  Boolean getAllContributions();
}
