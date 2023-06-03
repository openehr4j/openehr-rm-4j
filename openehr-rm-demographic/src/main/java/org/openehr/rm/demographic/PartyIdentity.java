package org.openehr.rm.demographic;

/**
 * An identity  of a Social entity, such as a person name or company name, and which is used by the party to identify itself. Actual structure is archetyped.
 */
public interface PartyIdentity extends Locatable {
  /**
   * The value of the identity. This will usually take the form of a small structure of strings.
   */
  Cluster getDescription();

  /**
   * Purpose of identity, e.g. legal ,  stage name,  nickname,  tribal name,  trading name. Taken from value of inherited `_name_` attribute.
   */
  void purpose();
}
