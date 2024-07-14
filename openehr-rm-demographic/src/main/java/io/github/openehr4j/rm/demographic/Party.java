package io.github.openehr4j.rm.demographic;

import java.util.List;

import io.github.openehr4j.rm.common.archetyped.Locatable;
import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;
import io.github.openehr4j.rm.data_types.text.DvText;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/demographic.html#_party_class">specifications.openehr.org</a>
 */
public interface Party extends Locatable {

  List getIdentities();

  List getContacts();

  ItemStructure getDetails();

  List getReverseRelationships();

  List getRelationships();

  DvText type();
}
