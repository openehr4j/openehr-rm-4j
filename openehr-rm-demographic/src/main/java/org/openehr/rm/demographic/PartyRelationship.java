package org.openehr.rm.demographic;

import org.openehr.base_base_types.identification.PartyRef;
import org.openehr.rm.data_structures.item_structure.ItemStructure;
import org.openehr.rm.data_types.text.DvText;

/**
 * Generic description of a relationship between parties.
 */
public interface PartyRelationship {
// FIXME public interface PartyRelationship extends Locatable {
  /**
   * The detailed description of the relationship.
   */
  ItemStructure getDetails();

  /**
   * Target of relationship.
   */
  PartyRef getTarget();

  /**
   * Valid time interval for this relationship.
   */
  Object getTimeValidity();

  /**
   * Source of relationship.
   */
  PartyRef getSource();

  /**
   * Type of relationship, such as  employment,  authority,  health provision
   */
  DvText type();
}
