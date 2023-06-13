package org.openehr.rm.demographic;

import java.util.List;

import org.openehr.rm.data_types.text.DvText;

/**
 * Description of a means of contact of a Party. Actual structure is archetyped.
 */
public interface Contact {
// FIXME public interface Contact extends Locatable {
  /**
   * A set of address alternatives for this contact purpose and time validity combination.
   */
  List getAddresses();

  /**
   * Valid time interval for this contact descriptor.
   */
  Object getTimeValidity();

  /**
   * Purpose for which this contact is used, e.g. mail,  daytime phone, etc. Taken from value of inherited `_name_` attribute.
   */
  DvText purpose();
}
