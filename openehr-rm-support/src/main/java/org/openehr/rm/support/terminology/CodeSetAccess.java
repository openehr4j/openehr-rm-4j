package org.openehr.rm.support.terminology;

/**
 * Defines an object providing proxy access to a code_set.
 */
public interface CodeSetAccess {
  /**
   * External identifier of this code set.
   */
  void id();

  /**
   * Return all codes known in this code set.
   */
  void all_codes();

  /**
   * True if code set knows about 'a_lang' .
   */
  void has_lang();

  /**
   * True if code set knows about  'a_code'.
   */
  void has_code();
}
