package org.openehr.rm.data_structures.item_structure;

/**
 * Logical single value data structure. Used to represent any data which is logically a single value, such as a person's height or weight.
 */
public interface ItemSingle extends ItemStructure {
  Element getItem();

  /**
   * Generate a CEN EN13606-compatible hierarchy consisting of a single `ELEMENT`.
   */
  void as_hierarchy();
}
