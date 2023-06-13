package org.openehr.rm.common.generic;

import java.lang.String;
import java.util.List;

/**
 * Purpose Defines the notion of a revision history of audit items, each associated with the version for which that audit was committed. The list is in most-recent-first order.
 */
public interface RevisionHistory {
  /**
   * The items in this history in most-recent-last order.
   */
  List getItems();

  /**
   * The version id of the most recent item, as a String.
   */
  String mostRecentVersion();

  /**
   * The commit date/time of the most recent item, as a String.
   */
  String mostRecentVersionTimeCommitted();
}
