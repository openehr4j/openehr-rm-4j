package io.github.openehr4j.rm.data_structures.item_structure;

import io.github.openehr4j.rm.data_structures.representation.Element;

public interface ItemSingle extends ItemStructure {
  Element getItem();

  Element asHierarchy();
}
