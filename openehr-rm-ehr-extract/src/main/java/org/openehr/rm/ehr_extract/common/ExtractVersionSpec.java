package org.openehr.rm.ehr_extract.common;

import java.lang.Boolean;
import java.lang.Object;

public interface ExtractVersionSpec {

  Boolean getIncludeAllVersions();

  Object getCommitTimeInterval();

  Boolean getIncludeRevisionHistory();

  Boolean getIncludeData();
}
