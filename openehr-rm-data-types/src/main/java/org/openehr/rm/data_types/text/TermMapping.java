package org.openehr.rm.data_types.text;

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
  void narrower();

  /**
   * The mapping is to a broader term.
   */
  void broader();

  /**
   * The mapping is to an equivalent term.
   */
  void equivalent();

  /**
   * The kind of mapping is unknown.
   */
  void unknown();

  /**
   * True if match valid.
   */
  void is_valid_match_code();
}
