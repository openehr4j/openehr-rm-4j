package org.openehr.rm.data_types.text;

import java.util.List;

import org.openehr.rm.data_types.basic.DataValue;
import org.openehr.rm.data_types.uri.DvUri;

/**
 * A text item, which may contain any amount of legal characters arranged as e.g. words, sentences etc (i.e. one `DV_TEXT` may be more than one word). Visual formatting and hyperlinks may be included via markdown.
 */
public interface DvText extends DataValue {
  /**
   * Displayable rendition of the item, regardless of its underlying structure. For `DV_CODED_TEXT`, this is the rubric of the complete term as provided by the terminology service.
   */
  String getValue();

  /**
   * DEPRECATED: this field is deprecated; use markdown link/text in the `_value_` attribute, and `"markdown"` as the value of the `_formatting_` field.
   */
  DvUri getHyperlink();

  /**
   * If set, contains one of the following values:
   */
  String getFormatting();

  /**
   * Terms from other terminologies most closely matching this term, typically used where the originator (e.g. pathology lab) of information uses a local terminology but also supplies one or more equivalents from well known terminologies (e.g. LOINC).
   */
  List<TermMapping> getMappings();

  /**
   * Optional indicator of the localised language in which the value is written. Coded from openEHR Code Set  languages . Only used when either the text object is in a different language from the enclosing `ENTRY`, or else the text object is being used outside of an `ENTRY` or other enclosing structure which indicates the language.
   */
  CodePhrase getLanguage();

  /**
   * Name of character encoding scheme in which this value is encoded. Coded from openEHR Code Set  character sets . Unicode is the default assumption in openEHR, with UTF-8 being the assumed encoding. This attribute allows for variations from these assumptions.
   */
  CodePhrase getEncoding();
}
