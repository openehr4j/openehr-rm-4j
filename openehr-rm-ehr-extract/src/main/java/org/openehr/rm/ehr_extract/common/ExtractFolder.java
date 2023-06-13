package org.openehr.rm.ehr_extract.common;

import java.util.List;

/**
 * Folder in local Folder structure in an Extract. Empty Folders are allowed.
 */
public interface ExtractFolder extends ExtractItem {
  /**
   * List of Folders and content items in this Folder.
   */
  List getItems();
}
