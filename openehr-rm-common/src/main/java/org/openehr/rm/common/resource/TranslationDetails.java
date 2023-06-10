package org.openehr.rm.common.resource;

import org.openehr.base_foundation_types.primitive_types.String;
import org.openehr.rm_data_types.text.CodePhrase;

/**
 * Class providing details of a natural language translation.
 */
public interface TranslationDetails {
  /**
   * Language of the translation.
   */
  CodePhrase getLanguage();

  /**
   * Translator name and other demographic details.
   */
  Hash<String,String> getAuthor();

  /**
   * Accreditation of translator, usually a national translator's registration or association membership id.
   */
  String getAccreditaton();

  /**
   * Any other meta-data.
   */
  Hash<String,String> getOtherDetails();
}
