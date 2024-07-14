package io.github.openehr4j.rm.data_structures;

import io.github.openehr4j.rm.data_structures.representation.Item;

import com.sun.jdi.Locatable;

public interface DataStructure extends Locatable {

  Item asHierarchy();
}
