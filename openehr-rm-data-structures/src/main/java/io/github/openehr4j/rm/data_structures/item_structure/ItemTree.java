package io.github.openehr4j.rm.data_structures.item_structure;

import java.util.List;

import io.github.openehr4j.rm.data_structures.representation.Cluster;
import io.github.openehr4j.rm.data_structures.representation.Element;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_structures.html#_item_tree_class">specifications.openehr.org</a>
 */
public interface ItemTree extends ItemStructure {

  List getItems();

  Boolean hasElementPath(Object aPath);

  Element elementAtPath(Object aPath);

  Cluster asHierarchy();
}
