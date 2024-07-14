package io.github.openehr4j.rm.data_structures.item_structure;

import java.util.List;

import io.github.openehr4j.rm.data_structures.representation.Cluster;
import io.github.openehr4j.rm.data_structures.representation.Element;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_structures.html#_item_list_class">specifications.openehr.org</a>
 */
public interface ItemList extends ItemStructure {

  List getItems();

  Integer itemCount();

  List names();

  Element namedItem(Object aName);

  Element ithItem(Object i);

  Cluster asHierarchy();
}
