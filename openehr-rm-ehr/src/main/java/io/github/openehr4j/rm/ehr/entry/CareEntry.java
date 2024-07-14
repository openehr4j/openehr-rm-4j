package io.github.openehr4j.rm.ehr.entry;

import org.openehr.base.base_types.identification.ObjectRef;
import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr.html#_care_entry_class">specifications.openehr.org</a>
 */
public interface CareEntry extends Entry {

  ItemStructure getProtocol();

  ObjectRef getGuidelineId();
}
