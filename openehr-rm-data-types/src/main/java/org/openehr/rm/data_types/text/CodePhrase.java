package org.openehr.rm.data_types.text;

import java.lang.String;
import org.openehr.base.base_types.identification.TerminologyId;

/**
 * A fully coordinated (i.e. all coordination has been performed) term from a terminology service (as distinct from a particular terminology).
 */
public interface CodePhrase {
  /**
   * Identifier of the distinct terminology from which the code_string (or its elements) was extracted.
   */
  TerminologyId getTerminologyId();

  /**
   * The key used by the terminology service to identify a concept or coordination of concepts. This string is most likely parsable inside the terminology service, but nothing can be assumed about its syntax outside that context.
   */
  String getCodeString();

  /**
   * Optional attribute to carry preferred term corresponding to the code or expression in `_code_string_`. Typical use in integration situations which create mappings, and representing data for which both a (non-preferred) actual term and a preferred term are both required.
   */
  String getPreferredTerm();
}
