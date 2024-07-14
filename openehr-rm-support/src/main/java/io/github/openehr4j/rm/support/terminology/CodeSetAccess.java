package io.github.openehr4j.rm.support.terminology;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/support.html#_code_set_access_class">specifications.openehr.org</a>
 */
public interface CodeSetAccess {

  String id();

  List allCodes();

  Boolean hasLang(Object aLang);

  Boolean hasCode(Object aCode);
}
