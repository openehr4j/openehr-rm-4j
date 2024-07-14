package io.github.openehr4j.rm.common.directory;

import java.util.List;

import io.github.openehr4j.rm.common.archetyped.Locatable;
import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;

public interface Folder extends Locatable {

  List getItems();

  List getFolders();

  ItemStructure getDetails();
}
