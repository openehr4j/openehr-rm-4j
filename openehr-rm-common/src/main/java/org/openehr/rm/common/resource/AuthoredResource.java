package org.openehr.rm.common.resource;

import org.openehr.rm_data_structures.representation.Cluster;

/**
 * A description of how to use one or more real Entities for a purpose within the context of some work process.
 */
public interface Resource extends ResourceItem {
  /**
   * Detailed description of this resource.
   */
  Cluster getDescription();
}
