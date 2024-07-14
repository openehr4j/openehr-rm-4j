package org.openehr.rm.common.resource;

import java.util.List;
import java.util.Map;

import org.openehr.rm.common.generic.RevisionHistory;
import org.openehr.rm.data_types.text.CodePhrase;




public interface AuthoredResource {



  CodePhrase getOriginalLanguage();




  Boolean getIsControlled();




  Map getTranslations();




  ResourceDescription getDescription();




  RevisionHistory getRevisionHistory();




  String currentRevision();




  List languagesAvailable();
}
