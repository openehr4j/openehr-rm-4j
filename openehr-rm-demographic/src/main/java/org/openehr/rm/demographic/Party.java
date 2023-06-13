package org.openehr.rm.demographic;

import java.util.List;

import org.openehr.rm.data_structures.item_structure.ItemStructure;
import org.openehr.rm.data_types.text.DvText;

/**
 * Ancestor of all Party types, including real world entities and their roles. A Party is any entity which can participate in an activity. The `_name_` attribute inherited from `LOCATABLE` is used to indicate the actual type of party (note that the actual names, i.e. identities of parties are indicated in the `_identities_` attribute, not the `_name_` attribute).
 */
public interface Party {
// FIXME public interface Party extends Locatable {
  /**
   * Identities used by the party to identify itself, such as legal name, stage names, aliases, nicknames and so on.
   */
  List getIdentities();

  /**
   * Contacts for this party.
   */
  List getContacts();

  /**
   * All other details for this Party.
   */
  ItemStructure getDetails();

  /**
   * References to relationships in which this Party takes part as target.
   */
  List getReverseRelationships();

  /**
   * Relationships in which this Party takes part as source.
   */
  List getRelationships();

  /**
   * Type of party, such as  `PERSON`,  `ORGANISATION`, etc. Role name, e.g.  general practitioner ,  nurse ,  private citizen . Taken from inherited `_name_` attribute.
   */
  DvText type();
}
