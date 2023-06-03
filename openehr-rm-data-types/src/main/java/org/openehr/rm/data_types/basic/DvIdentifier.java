package org.openehr.rm.data_types.basic;

/**
 * Type for representing identifiers of real-world entities. Typical identifiers include drivers licence number, social security number, veterans affairs number, prescription id, order id, and so on.
 */
public interface DvIdentifier extends DataValue {
  /**
   * Optional authority which issues the kind of id used in the id field of this object.
   */
  String getIssuer();

  /**
   * Optional organisation that assigned the id to the item being identified.
   */
  String getAssigner();

  /**
   * The identifier value. Often structured, according to the definition of the issuing authority's rules.
   */
  String getId();

  /**
   * Optional identifier type, such as  prescription , or  Social Security Number . One day a controlled vocabulary might be possible for this.
   */
  String getType();
}
