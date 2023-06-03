package org.openehr.rm.data_structures.item_structure;

/**
 * Logical list data structure, where each item has a value and can be referred to by a name and a positional index in the list. The list may be empty.
 */
public interface ItemList extends ItemStructure {
  /**
   * Physical representation of the list.
   */
  List<ELEMENT> getItems();

  /**
   * Count of all items.
   */
  void item_count();

  /**
   * Retrieve the names of all items.
   */
  void names();

  /**
   * Retrieve the item with name ‘a_name’.
   */
  void named_item();

  /**
   * Retrieve the i-th item with name.
   */
  void ith_item();

  /**
   * Generate a CEN EN13606-compatible hierarchy consisting of a single `CLUSTER` containing the `ELEMENTs` of this list.
   */
  void as_hierarchy();
}
