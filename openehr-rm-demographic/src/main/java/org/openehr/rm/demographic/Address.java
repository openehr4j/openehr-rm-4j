package org.openehr.rm.demographic;

/**
 * Address of contact, which may be electronic or geographic.
 */
public interface Address extends Locatable {
  /**
   * Archetypable structured address.
   */
  Cluster getDescription();

  /**
   * Type of address, e.g. electronic, locality. Taken from value of inherited `_name_` attribute.
   */
  void type();
}
