package org.openehr.rm.common.resource;

import java.util.List;
import java.util.Map;

import org.openehr.rm.data_types.text.CodePhrase;

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
