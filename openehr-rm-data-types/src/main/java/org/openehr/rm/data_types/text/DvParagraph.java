package org.openehr.rm.data_types.text;

/**
 * DEPRECATED: use markdown formatted `DV_TEXT` instead.
 */
public interface DvParagraph extends DataValue {
  /**
   * Items making up the paragraph, each of which is a text item (which may have its own formatting, and/or have hyperlinks).
   */
  List<DVTEXT> getItems();
}
