package io.github.openehr4j.rm.data_structures.item_structure;

import java.util.List;

import io.github.openehr4j.rm.data_structures.representation.Cluster;
import io.github.openehr4j.rm.data_structures.representation.Element;

public interface ItemList extends ItemStructure {

  List getItems();

  Integer itemCount();

  List names();

  Element namedItem(Object aName);

  Element ithItem(Object i);

  Cluster asHierarchy();
}
