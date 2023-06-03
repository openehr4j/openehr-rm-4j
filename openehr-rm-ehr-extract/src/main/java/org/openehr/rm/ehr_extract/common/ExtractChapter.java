package org.openehr.rm.ehr_extract.common;

/**
 * One content chapter of an Extract; contains information relating to only one entity.
 */
public interface ExtractChapter extends Locatable {
  /**
   * The information content of this chapter.
   */
  List<EXTRACTITEM> getItems();
}
