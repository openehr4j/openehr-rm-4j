package org.openehr.rm.demographic;

/**
 * Description of a means of contact of a Party. Actual structure is archetyped.
 */
public interface Contact extends Locatable {
  /**
   * A set of address alternatives for this contact purpose and time validity combination.
   */
  List<ADDRESS> getAddresses();

  /**
   * Valid time interval for this contact descriptor.
   */
  Interval<Iso8601Date> getTimeValidity();

  /**
   * Purpose for which this contact is used, e.g. mail,  daytime phone, etc. Taken from value of inherited `_name_` attribute.
   */
  void purpose();
}
