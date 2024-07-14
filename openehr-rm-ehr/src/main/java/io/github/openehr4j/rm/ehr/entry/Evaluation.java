package io.github.openehr4j.rm.ehr.entry;

import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr.html#_evaluation_class">specifications.openehr.org</a>
 */
public interface Evaluation extends CareEntry {

  ItemStructure getData();
}
