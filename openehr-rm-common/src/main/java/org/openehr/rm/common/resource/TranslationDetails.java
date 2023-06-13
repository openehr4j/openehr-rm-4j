package org.openehr.rm.common.resource;

import java.util.Map;

import org.openehr.rm.data_types.text.CodePhrase;

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
  Map getAuthor();

  /**
   * Accreditation of translator, usually a national translator's registration or association membership id.
   */
  String getAccreditaton();

  /**
   * Any other meta-data.
   */
  Map getOtherDetails();
}
