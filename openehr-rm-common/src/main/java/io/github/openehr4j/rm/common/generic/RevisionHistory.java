package io.github.openehr4j.rm.common.generic;

import java.lang.String;
import java.util.List;

public interface RevisionHistory {

  List<RevisionHistoryItem> getItems();

  String mostRecentVersion();

  String mostRecentVersionTimeCommitted();
}
