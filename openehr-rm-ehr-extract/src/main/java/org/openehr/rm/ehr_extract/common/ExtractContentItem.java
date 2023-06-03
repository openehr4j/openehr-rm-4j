package org.openehr.rm.ehr_extract.common;

/**
 * Abstract model of a wrapper for one content item in an Extract, containing various meta-data. Indicates whether it was part of the primary set and what its original path was. Intended to be subtyped for wrappers of specific types of content.
 */
public interface ExtractContentItem extends ExtractItem {
  /**
   * True if the content item carried in this container was part of the primary set for the Extract, i.e. not added due to link-following.
   */
  Boolean getIsPrimary();

  /**
   * True if the content item carried in this container is any kind of change since last send, in repeat sending situations.
   */
  Boolean getIsChanged();

  /**
   * True if the content of this item has not been included due to insufficient access rights of requestor.
   */
  Boolean getIsMasked();

  /**
   * Content object.
   */
  Any getItem();
}
