package org.openehr.rm.data_types.text;

import org.openehr.rm_data_types.text.CodePhrase;
import org.openehr.rm_data_types.text.DvText;

/**
 * A text item whose value must be the rubric from a controlled terminology, the key (i.e. the 'code') of which is the `_defining_code_` attribute. In other words: a `DV_CODED_TEXT` is a combination of a `CODE_PHRASE` (effectively a code) and the rubric of that term, from a terminology service, in the language in which the data were authored.
 */
public interface DvCodedText extends DvText {
  /**
   * The term of which the  `_value_` attribute is the textual rendition (i.e. rubric).
   */
  CodePhrase getDefiningCode();
}
