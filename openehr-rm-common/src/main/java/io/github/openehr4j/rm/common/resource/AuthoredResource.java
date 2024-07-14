package io.github.openehr4j.rm.common.resource;

import java.util.List;
import java.util.Map;

import io.github.openehr4j.rm.common.generic.RevisionHistory;
import io.github.openehr4j.rm.data_types.text.CodePhrase;

public interface AuthoredResource {

  CodePhrase getOriginalLanguage();

  Boolean getIsControlled();

  Map getTranslations();

  ResourceDescription getDescription();

  RevisionHistory getRevisionHistory();

  String currentRevision();

  List languagesAvailable();
}
