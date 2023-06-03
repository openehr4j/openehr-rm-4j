package org.openehr.rm.ehr_extract.openehr_extract;

/**
 * Form of `EHR EXTRACT_ITEM` containing openEHR serialised `VERSIONED_OBJECTs`.
 */
public interface OpenehrContentItem extends ExtractContentItem {
  /**
   * Content object.
   */
  XVersionedObject getItem();
}
