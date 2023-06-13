package org.openehr.rm.support.terminology;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;

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
  List allCodes();

  /**
   * True if code set knows about 'a_lang' .
   */
  Boolean hasLang(Object aLang);

  /**
   * True if code set knows about  'a_code'.
   */
  Boolean hasCode(Object aCode);
}
