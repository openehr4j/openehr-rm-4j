package org.openehr.rm.demographic;


import org.openehr.rm.data_structures.item_structure.ItemStructure;
import org.openehr.rm.data_types.text.DvText;

/**
 * An identity  owned  by a Party, such as a person name or company name, and which is used by the Party to identify itself. Actual structure is archetyped.
 */
public interface PartyIdentity {
// FIXME public interface PartyIdentity extends Locatable {
  /**
   * The value of the identity. This will often taken the form of a parseable string or a small structure of strings.
   */
  ItemStructure getDetails();

  /**
   * Purpose of identity, e.g. legal ,  stagename,  nickname,  tribal name,  trading name. Taken from value of inherited `_name_` attribute.
   */
  DvText purpose();
}
