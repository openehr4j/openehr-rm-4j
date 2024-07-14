package org.openehr.rm.common.resource;

import java.util.Map;

import org.openehr.rm.data_types.text.CodePhrase;




public interface TranslationDetails {



  CodePhrase getLanguage();




  Map getAuthor();




  String getAccreditaton();




  Map getOtherDetails();
}
