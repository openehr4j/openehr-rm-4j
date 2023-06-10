package org.openehr.rm.support.terminology;

import org.openehr.base_foundation_types.primitive_types.Boolean;

/**
 * List of identifiers for groups in the openEHR terminology.
 */
public interface OpenehrTerminologyGroupIdentifiers {
  /**
   * Validity function to test if an identifier is in the set defined by this class.
   */
  Boolean validTerminologyGroupId(Object anId);
}
