package io.github.openehr4j.rm.common.resource;

import java.util.Map;

import io.github.openehr4j.rm.data_types.text.CodePhrase;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/common.html#_translation_details_class">specifications.openehr.org</a>
 */
public interface TranslationDetails {

  CodePhrase getLanguage();

  Map getAuthor();

  String getAccreditaton();

  Map getOtherDetails();
}
