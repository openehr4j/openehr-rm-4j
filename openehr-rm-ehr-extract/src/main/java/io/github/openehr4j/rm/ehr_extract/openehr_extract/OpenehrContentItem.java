package io.github.openehr4j.rm.ehr_extract.openehr_extract;

import io.github.openehr4j.rm.ehr_extract.common.ExtractContentItem;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr_extract.html#_openehr_content_item_class">specifications.openehr.org</a>
 */
public interface OpenehrContentItem extends ExtractContentItem {

  XVersionedObject getItem();
}
