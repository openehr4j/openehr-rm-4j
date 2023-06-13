package org.openehr.rm.ehr_extract.common;

import java.util.List;
import org.openehr.rm.common.archetyped.Locatable;

/**
 * One content chapter of an Extract; contains information relating to only one entity.
 */
public interface ExtractChapter extends Locatable {
  /**
   * The information content of this chapter.
   */
  List getItems();
}
