package io.github.openehr4j.rm.common.resource;

import java.util.Map;

import io.github.openehr4j.rm.data_types.text.CodePhrase;

public interface TranslationDetails {

  CodePhrase getLanguage();

  Map getAuthor();

  String getAccreditaton();

  Map getOtherDetails();
}
