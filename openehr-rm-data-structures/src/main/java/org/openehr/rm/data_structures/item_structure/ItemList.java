package org.openehr.rm.data_structures.item_structure;

import java.util.List;

import org.openehr.rm.data_structures.representation.Cluster;
import org.openehr.rm.data_structures.representation.Element;

/**
 * Logical list data structure, where each item has a value and can be referred to by a name and a positional index in the list. The list may be empty.
 */
public interface ItemList extends ItemStructure {
  /**
   * Physical representation of the list.
   */
  List getItems();

  /**
   * Count of all items.
   */
  Integer itemCount();

  /**
   * Retrieve the names of all items.
   */
  List names();

  /**
   * Retrieve the item with name ‘a_name’.
   */
  Element namedItem(Object aName);

  /**
   * Retrieve the i-th item with name.
   */
  Element ithItem(Object i);

  /**
   * Generate a CEN EN13606-compatible hierarchy consisting of a single `CLUSTER` containing the `ELEMENTs` of this list.
   */
  Cluster asHierarchy();
}
