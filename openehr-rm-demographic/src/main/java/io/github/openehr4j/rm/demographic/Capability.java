package io.github.openehr4j.rm.demographic;

import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;

public interface Capability {
// FIXME public interface Capability extends Locatable {

  ItemStructure getCredentials();

  Object getTimeValidity();
}
