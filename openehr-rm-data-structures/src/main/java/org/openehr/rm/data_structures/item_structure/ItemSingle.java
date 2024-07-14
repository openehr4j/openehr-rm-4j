package org.openehr.rm.data_structures.item_structure;

import org.openehr.rm.data_structures.representation.Element;

public interface ItemSingle extends ItemStructure {
  Element getItem();

  Element asHierarchy();
}
