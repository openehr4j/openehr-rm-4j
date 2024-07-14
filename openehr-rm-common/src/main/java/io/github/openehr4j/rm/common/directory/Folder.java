package io.github.openehr4j.rm.common.directory;

import java.util.List;

import io.github.openehr4j.rm.common.archetyped.Locatable;
import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/common.html#_folder_class">specifications.openehr.org</a>
 */
public interface Folder extends Locatable {

  List getItems();

  List getFolders();

  ItemStructure getDetails();
}
