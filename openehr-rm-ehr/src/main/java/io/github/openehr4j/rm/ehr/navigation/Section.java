package io.github.openehr4j.rm.ehr.navigation;

import java.util.List;

import io.github.openehr4j.rm.ehr.content.ContentItem;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr.html#_section_class">specifications.openehr.org</a>
 */
public interface Section extends ContentItem {

  List getItems();
}
