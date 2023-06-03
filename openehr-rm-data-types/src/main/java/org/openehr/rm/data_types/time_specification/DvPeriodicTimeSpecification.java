package org.openehr.rm.data_types.time_specification;

/**
 * Specifies periodic points in time, linked to the calendar (phase-linked), or a real world repeating event, such as  breakfast  (event-linked). Based on the HL7v3 data types `PIVL<T>` and `EIVL<T>`.
 */
public interface DvPeriodicTimeSpecification extends DvTimeSpecification {
  /**
   * The period of the repetition, computationally derived from the syntax representation. Extracted from the  value' attribute.
   */
  void period();

  /**
   * Calendar alignment extracted from value.
   */
  void calendar_alignment();

  /**
   * Event alignment extracted from value.
   */
  void event_alignment();

  /**
   * Extracted from value.
   */
  void institution_specified();
}
