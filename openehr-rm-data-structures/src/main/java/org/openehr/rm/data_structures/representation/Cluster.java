package org.openehr.rm.data_structures.representation;

import org.openehr.rm_data_structures.representation.Item;

/**
 * The grouping variant of `ITEM`, which may contain further instances of `ITEM`, in an ordered list.
 */
public interface Cluster extends Item {
  /**
   * Ordered list of items - `CLUSTER` or `ELEMENT` objects - under this `CLUSTER`.
   */
  List<Item> getItems();
}
