package org.openehr.rm.common.directory;

/**
 * The concept of a named folder.
 */
public interface Folder extends Locatable {
  /**
   * The list of references to other (usually) versioned objects logically in this folder.
   */
  List<OBJECTREF> getItems();

  /**
   * Sub-folders of this `FOLDER`.
   */
  List<FOLDER> getFolders();

  /**
   * Archetypable meta-data for `FOLDER`.
   */
  ItemStructure getDetails();
}
