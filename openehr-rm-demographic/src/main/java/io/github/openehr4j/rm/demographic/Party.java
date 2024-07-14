package io.github.openehr4j.rm.demographic;

import java.util.List;

import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;
import io.github.openehr4j.rm.data_types.text.DvText;

public interface Party {
// FIXME public interface Party extends Locatable {

  List getIdentities();

  List getContacts();

  ItemStructure getDetails();

  List getReverseRelationships();

  List getRelationships();

  DvText type();
}
