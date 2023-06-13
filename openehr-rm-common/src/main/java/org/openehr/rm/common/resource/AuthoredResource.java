package org.openehr.rm.common.resource;

import java.util.List;
import java.util.Map;

import org.openehr.rm.common.generic.RevisionHistory;
import org.openehr.rm.data_types.text.CodePhrase;

/**
 * Abstract idea of an online resource created by a human author.
 */
public interface AuthoredResource {
  /**
   * Language in which this resource was initially authored. Although there is no language primacy of resources overall, the language of original authoring is required to ensure natural language translations can preserve quality. Language is relevant in both the description and ontology sections.
   */
  CodePhrase getOriginalLanguage();

  /**
   * True if this resource is under any kind of change control (even file copying), in which case revision history is created.
   */
  Boolean getIsControlled();

  /**
   * List of details for each natural-language translation made of this resource, keyed by language. For each translation listed here, there must be corresponding sections in all language-dependent parts of the resource. The `_original_language_` does not appear in this list.
   */
  Map getTranslations();

  /**
   * Description and lifecycle information of the resource.
   */
  ResourceDescription getDescription();

  /**
   * The revision history of the resource. Only required if `_is_controlled_ = True` (avoids large revision histories for informal or private editing situations).
   */
  RevisionHistory getRevisionHistory();

  /**
   * Most recent revision in `_revision_history_` if `_is_controlled_` else  (uncontrolled) .
   */
  String currentRevision();

  /**
   * Total list of languages available in this resource, derived from `_original_language_` and `_translations_`.
   */
  List languagesAvailable();
}
