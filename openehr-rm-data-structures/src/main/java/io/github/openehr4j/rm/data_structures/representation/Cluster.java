package io.github.openehr4j.rm.data_structures.representation;

import java.util.List;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_structures.html#_cluster_class">specifications.openehr.org</a>
 */
public interface Cluster extends Item {

  List getItems();
}
