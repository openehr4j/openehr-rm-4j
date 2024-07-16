package io.github.openehr4j.rm.data_structures;

import io.github.openehr4j.rm.data_structures.representation.Item;

import com.sun.jdi.Locatable;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_structures.html#_data_structure_class">specifications.openehr.org</a>
 */
public interface DataStructure extends Locatable {

  Item asHierarchy();
}
