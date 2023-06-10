package org.openehr.rm.ehr_extract.openehr_extract;

import org.openehr.rm_ehr_extract.common.ExtractContentItem;
import org.openehr.rm_ehr_extract.openehr_extract.XVersionedObject;

/**
 * Form of `EHR EXTRACT_ITEM` containing openEHR serialised `VERSIONED_OBJECTs`.
 */
public interface OpenehrContentItem extends ExtractContentItem {
  /**
   * Content object.
   */
  XVersionedObject getItem();
}
