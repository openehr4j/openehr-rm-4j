package io.github.openehr4j.rm.ehr_extract.common;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr_extract.html#_extract_content_item_class">specifications.openehr.org</a>
 */
public interface ExtractContentItem extends ExtractItem {

  Boolean getIsPrimary();

  Boolean getIsChanged();

  Boolean getIsMasked();

  Object getItem();
}
