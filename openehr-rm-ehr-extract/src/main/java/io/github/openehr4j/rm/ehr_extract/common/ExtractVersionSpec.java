package io.github.openehr4j.rm.ehr_extract.common;

import java.lang.Boolean;
import java.lang.Object;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr_extract.html#_extract_version_spec_class">specifications.openehr.org</a>
 */
public interface ExtractVersionSpec {

  Boolean getIncludeAllVersions();

  Object getCommitTimeInterval();

  Boolean getIncludeRevisionHistory();

  Boolean getIncludeData();
}
