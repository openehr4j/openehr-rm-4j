package io.github.openehr4j.rm.ehr_extract.common;

import java.util.List;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr_extract.html#_extract_folder_class">specifications.openehr.org</a>
 */
public interface ExtractFolder extends ExtractItem {

  List getItems();
}
