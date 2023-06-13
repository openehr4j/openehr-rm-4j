package org.openehr.rm.data_structures.item_structure;

import org.openehr.rm.data_structures.representation.Element;

/**
 * Logical single value data structure. Used to represent any data which is logically a single value, such as a person's height or weight.
 */
public interface ItemSingle extends ItemStructure {
  Element getItem();

  /**
   * Generate a CEN EN13606-compatible hierarchy consisting of a single `ELEMENT`.
   */
  Element asHierarchy();
}
