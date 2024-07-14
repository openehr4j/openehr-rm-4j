package io.github.openehr4j.rm.common.resource;

import java.util.List;
import java.util.Map;

import io.github.openehr4j.rm.common.generic.RevisionHistory;
import io.github.openehr4j.rm.data_types.text.CodePhrase;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/common.html#_authored_resource_class">specifications.openehr.org</a>
 */
public interface AuthoredResource {

  CodePhrase getOriginalLanguage();

  Boolean getIsControlled();

  Map getTranslations();

  ResourceDescription getDescription();

  RevisionHistory getRevisionHistory();

  String currentRevision();

  List languagesAvailable();
}
