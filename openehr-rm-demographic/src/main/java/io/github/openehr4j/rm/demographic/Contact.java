package io.github.openehr4j.rm.demographic;

import java.util.List;

import io.github.openehr4j.rm.data_types.text.DvText;

public interface Contact {
// FIXME public interface Contact extends Locatable {

  List getAddresses();

  Object getTimeValidity();

  DvText purpose();
}
