package org.openehr.rm.common.directory;

import java.util.List;

import org.openehr.rm.common.archetyped.Locatable;
import org.openehr.rm.data_structures.item_structure.ItemStructure;

/**
 * The concept of a named folder.
 */
public interface Folder extends Locatable {
  /**
   * The list of references to other (usually) versioned objects logically in this folder.
   */
  List getItems();

  /**
   * Sub-folders of this `FOLDER`.
   */
  List getFolders();

  /**
   * Archetypable meta-data for `FOLDER`.
   */
  ItemStructure getDetails();
}
