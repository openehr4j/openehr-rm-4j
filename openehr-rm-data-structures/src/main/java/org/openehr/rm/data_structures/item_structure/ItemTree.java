package org.openehr.rm.data_structures.item_structure;

import java.util.List;

import org.openehr.rm.data_structures.representation.Cluster;
import org.openehr.rm.data_structures.representation.Element;

public interface ItemTree extends ItemStructure {

  List getItems();

  Boolean hasElementPath(Object aPath);

  Element elementAtPath(Object aPath);

  Cluster asHierarchy();
}
