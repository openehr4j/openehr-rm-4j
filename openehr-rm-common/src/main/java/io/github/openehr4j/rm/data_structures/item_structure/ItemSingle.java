package io.github.openehr4j.rm.data_structures.item_structure;

import io.github.openehr4j.rm.data_structures.representation.Element;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_structures.html#_item_single_class">specifications.openehr.org</a>
 */
public interface ItemSingle extends ItemStructure {
  Element getItem();

  Element asHierarchy();
}
