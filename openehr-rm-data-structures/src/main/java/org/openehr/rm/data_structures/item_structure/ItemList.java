package org.openehr.rm.data_structures.item_structure;

import java.util.List;

import org.openehr.rm.data_structures.representation.Cluster;
import org.openehr.rm.data_structures.representation.Element;




public interface ItemList extends ItemStructure {



  List getItems();




  Integer itemCount();




  List names();




  Element namedItem(Object aName);




  Element ithItem(Object i);




  Cluster asHierarchy();
}
