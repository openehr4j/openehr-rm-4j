package org.openehr.rm.common.generic;

/**
 * Purpose Defines the notion of a revision history of audit items, each associated with the version for which that audit was committed. The list is in most-recent-first order.
 */
public interface RevisionHistory {
  /**
   * The items in this history in most-recent-last order.
   */
  List<REVISIONHistoryITEM> getItems();

  /**
   * The version id of the most recent item, as a String.
   */
  void most_recent_version();

  /**
   * The commit date/time of the most recent item, as a String.
   */
  void most_recent_version_time_committed();
}
