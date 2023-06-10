package org.openehr.rm.support.terminology;

import org.openehr.base_foundation_types.primitive_types.Boolean;
import org.openehr.base_foundation_types.primitive_types.String;

/**
 * Defines an object providing proxy access to a code_set.
 */
public interface CodeSetAccess {
  /**
   * External identifier of this code set.
   */
  String id();

  /**
   * Return all codes known in this code set.
   */
  List<CodePhrase> allCodes();

  /**
   * True if code set knows about 'a_lang' .
   */
  Boolean hasLang(Object aLang);

  /**
   * True if code set knows about  'a_code'.
   */
  Boolean hasCode(Object aCode);
}
