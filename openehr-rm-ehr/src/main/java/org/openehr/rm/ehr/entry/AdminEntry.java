package org.openehr.rm.ehr.entry;

import org.openehr.rm_data_structures.item_structure.ItemStructure;
import org.openehr.rm_ehr.entry.Entry;

/**
 * Entry subtype for administrative information, i.e. information about setting up the clinical process, but not itself clinically relevant. Archetypes will define contained information.
 */
public interface AdminEntry extends Entry {
  /**
   * Content of the Admin Entry.
   */
  ItemStructure getData();
}
