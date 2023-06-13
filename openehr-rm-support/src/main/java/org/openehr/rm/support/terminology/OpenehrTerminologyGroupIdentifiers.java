package org.openehr.rm.support.terminology;

import java.lang.Boolean;
import java.lang.Object;

/**
 * List of identifiers for groups in the openEHR terminology.
 */
public interface OpenehrTerminologyGroupIdentifiers {
  /**
   * Validity function to test if an identifier is in the set defined by this class.
   */
  Boolean validTerminologyGroupId(Object anId);
}
