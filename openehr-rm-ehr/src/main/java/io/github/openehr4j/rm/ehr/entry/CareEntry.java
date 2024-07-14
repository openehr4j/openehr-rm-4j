package io.github.openehr4j.rm.ehr.entry;

import org.openehr.base.base_types.identification.ObjectRef;
import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;

public interface CareEntry extends Entry {

  ItemStructure getProtocol();

  ObjectRef getGuidelineId();
}
