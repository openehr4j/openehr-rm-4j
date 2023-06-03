package org.openehr.rm.data_structures.item_structure;

/**
 * Logical tree data structure. The tree may be empty. Used for representing data which are logically a tree such as audiology results, microbiology results, biochemistry results.
 */
public interface ItemTree extends ItemStructure {
  /**
   * The items comprising the `ITEM_TREE`. Can include 0 or more `CLUSTERs` and/or 0 or more individual `ELEMENTs`.
   */
  List<ITEM> getItems();

  /**
   * True if path  a_path' is a valid leaf path.
   */
  void has_element_path();

  /**
   * Return the leaf element at the path  a_path'.
   */
  void element_at_path();

  /**
   * Generate a CEN EN13606-compatible hierarchy, which is the same as the tree's physical representation.
   */
  void as_hierarchy();
}
