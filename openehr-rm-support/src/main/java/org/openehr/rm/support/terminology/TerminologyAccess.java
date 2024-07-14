package org.openehr.rm.support.terminology;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import org.openehr.rm.data_types.text.CodePhrase;

public interface TerminologyAccess {

  String id();

  CodePhrase allCodes();

  List codesForGroupId(Object aGroupId);

  List codesForGroupName(Object aLang, Object aName);

  Boolean hasCodeForGroupId();

  String rubricForCode(Object aCode);
}
