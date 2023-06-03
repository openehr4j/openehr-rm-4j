package org.openehr.rm.support.terminology;

/**
 * Defines an object providing proxy access to a terminology.
 */
public interface TerminologyAccess {
  /**
   * Identification of this Terminology.
   */
  void id();

  /**
   * Return all codes known in this terminology.
   */
  void all_codes();

  /**
   * Return all codes under grouper 'a_group_id' from this terminology.
   */
  void codes_for_group_id();

  /**
   * Return all codes under grouper whose name in 'a_lang' is 'a_name' from this terminology.
   */
  void codes_for_group_name();

  /**
   * True if  a_code' is known in group  group_id' in the openEHR terminology.
   */
  void has_code_for_group_id();

  /**
   * Return all rubric of code  code' in language  lang'.
   */
  void rubric_for_code();
}
