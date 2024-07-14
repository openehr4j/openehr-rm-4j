package io.github.openehr4j.rm.demographic;

import java.util.List;

import io.github.openehr4j.rm.common.archetyped.Locatable;
import io.github.openehr4j.rm.data_types.text.DvText;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/demographic.html#_contact_class">specifications.openehr.org</a>
 */
public interface Contact extends Locatable {

  List getAddresses();

  Object getTimeValidity();

  DvText purpose();
}
