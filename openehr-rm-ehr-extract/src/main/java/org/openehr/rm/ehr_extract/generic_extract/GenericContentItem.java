package org.openehr.rm.ehr_extract.generic_extract;

import org.openehr.base_foundation_types.primitive_types.String;
import org.openehr.base_foundation_types.time_types.Iso8601DateTime;
import org.openehr.rm_common.archetyped.Locatable;
import org.openehr.rm_data_types.text.DvCodedText;
import org.openehr.rm_ehr_extract.common.ExtractContentItem;

/**
 * Single item in generic extract, designed for 13606 and CDA data.
 */
public interface GenericContentItem extends ExtractContentItem {
  /**
   * Identifier of model or schema used to create the content.
   */
  DvCodedText getItemType();

  /**
   * Version of model or schema used to create the content item.
   */
  String getItemTypeVersion();

  /**
   * Reference to a demographic entity elsewhere in this Extract representing the author of the item version. The reference should be a UID corresponding to the UID of a `GENERIC_CONTENT_ITEM` containing the demographic information.
   */
  String getAuthor();

  /**
   * Time of creation of this item version on the original system. This may be an earlier commit time, or it may be the time at which the item was created during the Extract generation process.
   */
  Iso8601DateTime getCreationTime();

  /**
   * Reference to a demographic entity elsewhere in this Extract representing an authoriser of the item version, if relevant. The reference should be a UID corresponding to the UID of a `GENERIC_CONTENT_ITEM` containing the demographic information.
   */
  String getAuthoriser();

  /**
   * Time of authorisation of this item version on the original system where relevant.
   */
  Iso8601DateTime getAuthorisationTime();

  /**
   * Coded lifecycle status of the item.
   */
  DvCodedText getItemStatus();

  /**
   * Version id of this item in original system.
   */
  String getVersionId();

  /**
   * Version set id of this item in original system, where applicable.
   */
  String getVersionSetId();

  /**
   * Identifier of EMR or other system from which the item was created / extracted. Typically in the form of a domain name.
   */
  String getSystemId();

  /**
   * Other details about the content item.
   */
  Hash<String,String> getOtherDetails();

  /**
   * Content object.
   */
  Locatable getItem();
}
