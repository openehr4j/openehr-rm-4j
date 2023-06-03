package org.openehr.rm.ehr.entry;

/**
 * Defines a single activity within an Instruction, such as a medication administration.
 */
public interface Activity extends Locatable {
  /**
   * Timing of the activity, in the form of a parsable string. If used, the preferred syntax is ISO8601 'R' format, but other formats may be used including HL7 GTS.
   */
  DvParsable getTiming();

  /**
   * Perl-compliant regular expression pattern, enclosed in  '//' delimiters, indicating the valid identifiers of archetypes for Actions corresponding to this Activity specification.
   */
  String getActionArchetypeId();

  /**
   * Description of the activity, in the form of an archetyped structure.
   */
  ItemStructure getDescription();
}
