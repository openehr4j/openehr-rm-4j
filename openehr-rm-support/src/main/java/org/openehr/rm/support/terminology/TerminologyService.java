package org.openehr.rm.support.terminology;

import java.util.List;
import java.util.Map;

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
