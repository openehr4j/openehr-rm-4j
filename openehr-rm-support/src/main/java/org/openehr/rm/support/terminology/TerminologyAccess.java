package org.openehr.rm.support.terminology;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import org.openehr.rm.data_types.text.CodePhrase;

/**
 * Defines an object providing proxy access to a terminology.
 */
public interface TerminologyAccess {
  /**
   * Identification of this Terminology.
   */
  String id();

  /**
   * Return all codes known in this terminology.
   */
  CodePhrase allCodes();

  /**
   * Return all codes under grouper 'a_group_id' from this terminology.
   */
  List codesForGroupId(Object aGroupId);

  /**
   * Return all codes under grouper whose name in 'a_lang' is 'a_name' from this terminology.
   */
  List codesForGroupName(Object aLang, Object aName);

  /**
   * True if  a_code' is known in group  group_id' in the openEHR terminology.
   */
  Boolean hasCodeForGroupId();

  /**
   * Return all rubric of code  code' in language  lang'.
   */
  String rubricForCode(Object aCode);
}
