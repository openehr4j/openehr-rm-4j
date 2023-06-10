package org.openehr.rm.common.directory;

import org.openehr.rm_common.archetyped.Locatable;
import org.openehr.rm_data_structures.item_structure.ItemStructure;

/**
 * The concept of a named folder.
 */
public interface Folder extends Locatable {
  /**
   * The list of references to other (usually) versioned objects logically in this folder.
   */
  List<ObjectRef> getItems();

  /**
   * Sub-folders of this `FOLDER`.
   */
  List<Folder> getFolders();

  /**
   * Archetypable meta-data for `FOLDER`.
   */
  ItemStructure getDetails();
}
