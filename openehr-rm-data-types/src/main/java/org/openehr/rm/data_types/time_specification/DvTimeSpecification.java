package org.openehr.rm.data_types.time_specification;

/**
 * This is an abstract class of which all timing specifications are specialisations. Specifies points in time, possibly linked to the calendar, or a real world repeating event, such as  breakfast.
 */
public interface DvTimeSpecification extends DataValue {
  /**
   * The specification, in the HL7v3 syntax for `PIVL` or `EIVL` types.
   */
  DvParsable getValue();

  /**
   * Indicates what prototypical point in the calendar the specification is aligned to, e.g.  5th of the month . Empty if not aligned. Extracted from the  value' attribute.
   */
  void calendar_alignment();

  /**
   * Indicates what real-world event the specification is aligned to if any. Extracted from the  value' attribute.
   */
  void event_alignment();

  /**
   * Indicates if the specification is aligned with institution schedules, e.g. a hospital nursing changeover or meal serving times. Extracted from the  value' attribute.
   */
  void institution_specified();
}
