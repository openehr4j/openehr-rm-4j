package io.github.openehr4j.rm.support.terminology;

import java.util.List;
import java.util.Map;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/support.html#_terminology_service_class">specifications.openehr.org</a>
 */
public interface TerminologyService extends OpenehrTerminologyGroupIdentifiers, OpenehrCodeSetIdentifiers {

  TerminologyAccess terminology(Object name);

  CodeSetAccess codeSet(Object name);

  CodeSetAccess codeSetForId(Object id);

  Boolean hasTerminology(Object name);

  Boolean hasCodeSet(Object name);

  List terminologyIdentifiers();

  Map openehrCodeSets();

  List codeSetIdentifiers();
}
