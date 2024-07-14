package io.github.openehr4j.rm.common.resource;

import java.util.List;
import java.util.Map;

import io.github.openehr4j.rm.data_types.text.CodePhrase;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/common.html#_resource_description_item_class">specifications.openehr.org</a>
 */
public interface ResourceDescriptionItem {

  CodePhrase getLanguage();

  String getPurpose();

  List getKeywords();

  String getUse();

  String getMisuse();

  String getCopyright();

  Map getOriginalResourceUri();

  Map getOtherDetails();
}
