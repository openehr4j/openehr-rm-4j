package org.openehr.rm.data_types.text;

import org.openehr.base_foundation_types.primitive_types.Boolean;
import org.openehr.base_foundation_types.primitive_types.Character;
import org.openehr.rm_data_types.text.CodePhrase;
import org.openehr.rm_data_types.text.DvCodedText;

/**
 * Represents a coded term mapped to a `DV_TEXT`, and the relative match of the target term with respect to the mapped item. Plain or coded text items may appear in the EHR for which one or mappings in alternative terminologies are required. Mappings are only used to enable computer processing, so they can only be instances of `DV_CODED_TEXT`.
 */
public interface TermMapping {
  /**
   * The relative match of the target term with respect to the mapped text item. Result meanings:
   */
  Character getMatch();

  /**
   * Purpose of the mapping e.g. 'automated data mining', 'billing', 'interoperability'.
   */
  DvCodedText getPurpose();

  /**
   * The target term of the mapping.
   */
  CodePhrase getTarget();

  /**
   * The mapping is to a narrower term.
   */
  Boolean narrower();

  /**
   * The mapping is to a broader term.
   */
  Boolean broader();

  /**
   * The mapping is to an equivalent term.
   */
  Boolean equivalent();

  /**
   * The kind of mapping is unknown.
   */
  Boolean unknown();

  /**
   * True if match valid.
   */
  Boolean isValidMatchCode(Object c);
}
