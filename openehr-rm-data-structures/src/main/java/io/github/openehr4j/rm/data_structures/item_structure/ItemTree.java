package io.github.openehr4j.rm.data_structures.item_structure;

import java.util.List;

import io.github.openehr4j.rm.data_structures.representation.Cluster;
import io.github.openehr4j.rm.data_structures.representation.Element;

public interface ItemTree extends ItemStructure {

  List getItems();

  Boolean hasElementPath(Object aPath);

  Element elementAtPath(Object aPath);

  Cluster asHierarchy();
}
