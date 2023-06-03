package org.openehr.rm.ehr_extract.common;

/**
 * Type of chapter that contains information relating to a single demographic entity.
 */
public interface ExtractEntityChapter extends ExtractChapter {
  /**
   * Reference to entity, usually a demographic entity such as a patient that the content of this chapter relates to.
   */
  String getExtractIdKey();
}
