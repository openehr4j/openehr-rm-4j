package org.openehr.rm.demographic;

import java.util.List;

import org.openehr.rm.data_types.text.DvText;

public interface Contact {
// FIXME public interface Contact extends Locatable {

  List getAddresses();

  Object getTimeValidity();

  DvText purpose();
}
