package org.openehr.rm.data_structures.representation;

import java.util.List;

/**
 * The grouping variant of `ITEM`, which may contain further instances of `ITEM`, in an ordered list.
 */
public interface Cluster extends Item {
  /**
   * Ordered list of items - `CLUSTER` or `ELEMENT` objects - under this `CLUSTER`.
   */
  List getItems();
}
