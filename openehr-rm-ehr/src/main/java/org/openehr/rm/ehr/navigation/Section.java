package org.openehr.rm.ehr.navigation;

/**
 * Represents a heading in a heading structure, or  section tree.  Created according to archetyped structures for typical headings such as SOAP,  physical examination, but also pathology result heading structures.  Should not be used instead of `ENTRY` hierarchical structures.
 */
public interface Section extends ContentItem {
  /**
   * Ordered list of content items under this section, which may include:
   */
  List<CONTENTITEM> getItems();
}
