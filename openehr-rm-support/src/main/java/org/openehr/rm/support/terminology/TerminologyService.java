package org.openehr.rm.support.terminology;

import java.util.List;
import java.util.Map;

/**
 * Defines an object providing proxy access to a terminology service.
 */
public interface TerminologyService extends OpenehrTerminologyGroupIdentifiers, OpenehrCodeSetIdentifiers {
  /**
   * Return an interface to the terminology named name. Allowable names include:-
   */
  TerminologyAccess terminology(Object name);

  /**
   * Return an interface to the code_set identified by the external identifier name (e.g.  ISO_639-1).
   */
  CodeSetAccess codeSet(Object name);

  /**
   * Return an interface to the code_set identified internally in openEHR by id.
   */
  CodeSetAccess codeSetForId(Object id);

  /**
   * True if terminology named name known by this service. Allowable names include:-
   */
  Boolean hasTerminology(Object name);

  /**
   * True if code_set linked to internal name (e.g. languages ) is available.
   */
  Boolean hasCodeSet(Object name);

  /**
   * Set of all terminology identifiers known in the terminology service. Values from the US NLM UMLS meta-data list at:- http://www.nlm.nih.gov/research/umls/metaa1.html
   */
  List terminologyIdentifiers();

  /**
   * Set of all code set identifiers known in the terminology service.
   */
  Map openehrCodeSets();

  /**
   * Set of all code sets identifiers for which there is an internal openEHR name; returned as a Map of ids keyed by internal name.
   */
  List codeSetIdentifiers();
}
