package org.openehr.rm.data_structures.item_structure;

import org.openehr.base_foundation_types.primitive_types.Boolean;
import org.openehr.rm_data_structures.item_structure.ItemStructure;
import org.openehr.rm_data_structures.representation.Cluster;
import org.openehr.rm_data_structures.representation.Element;

/**
 * Logical tree data structure. The tree may be empty. Used for representing data which are logically a tree such as audiology results, microbiology results, biochemistry results.
 */
public interface ItemTree extends ItemStructure {
  /**
   * The items comprising the `ITEM_TREE`. Can include 0 or more `CLUSTERs` and/or 0 or more individual `ELEMENTs`.
   */
  List<Item> getItems();

  /**
   * True if path  a_path' is a valid leaf path.
   */
  Boolean hasElementPath(Object aPath);

  /**
   * Return the leaf element at the path  a_path'.
   */
  Element elementAtPath(Object aPath);

  /**
   * Generate a CEN EN13606-compatible hierarchy, which is the same as the tree's physical representation.
   */
  Cluster asHierarchy();
}
