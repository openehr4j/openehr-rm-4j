package io.github.openehr4j.rm.support.terminology;

import java.lang.Boolean;
import java.lang.Object;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/support.html#_openehr_terminology_group_identifiers_class">specifications.openehr.org</a>
 */
public interface OpenehrTerminologyGroupIdentifiers {

  Boolean validTerminologyGroupId(Object anId);
}
