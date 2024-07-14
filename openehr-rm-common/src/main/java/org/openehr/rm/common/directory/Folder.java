package org.openehr.rm.common.directory;

import java.util.List;

import org.openehr.rm.common.archetyped.Locatable;
import org.openehr.rm.data_structures.item_structure.ItemStructure;




public interface Folder extends Locatable {



  List getItems();




  List getFolders();




  ItemStructure getDetails();
}
