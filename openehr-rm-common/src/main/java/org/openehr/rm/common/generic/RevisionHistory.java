package org.openehr.rm.common.generic;

import org.openehr.base_foundation_types.primitive_types.String;

/**
 * Purpose Defines the notion of a revision history of audit items, each associated with the version for which that audit was committed. The list is in most-recent-first order.
 */
public interface RevisionHistory {
  /**
   * The items in this history in most-recent-last order.
   */
  List<RevisionHistoryItem> getItems();

  /**
   * The version id of the most recent item, as a String.
   */
  String mostRecentVersion();

  /**
   * The commit date/time of the most recent item, as a String.
   */
  String mostRecentVersionTimeCommitted();
}
