package org.openehr.rm.data_structures;

import org.openehr.rm.data_structures.representation.Item;

import com.sun.jdi.Locatable;

public interface DataStructure extends Locatable {

  Item asHierarchy();
}
