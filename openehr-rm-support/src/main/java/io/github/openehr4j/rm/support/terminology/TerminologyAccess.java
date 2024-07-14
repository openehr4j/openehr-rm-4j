package io.github.openehr4j.rm.support.terminology;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import io.github.openehr4j.rm.data_types.text.CodePhrase;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/support.html#_terminology_access_class">specifications.openehr.org</a>
 */
public interface TerminologyAccess {

  String id();

  CodePhrase allCodes();

  List codesForGroupId(Object aGroupId);

  List codesForGroupName(Object aLang, Object aName);

  Boolean hasCodeForGroupId();

  String rubricForCode(Object aCode);
}
