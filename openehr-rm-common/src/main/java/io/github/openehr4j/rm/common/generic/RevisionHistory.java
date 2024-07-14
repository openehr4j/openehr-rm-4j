package io.github.openehr4j.rm.common.generic;

import java.lang.String;
import java.util.List;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/common.html#_revision_history_class">specifications.openehr.org</a>
 */
public interface RevisionHistory {

  List<RevisionHistoryItem> getItems();

  String mostRecentVersion();

  String mostRecentVersionTimeCommitted();
}
