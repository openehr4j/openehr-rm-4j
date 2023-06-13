package org.openehr.rm.data_types.time_specification;

import org.openehr.rm.data_types.date_time.DvDuration;

/**
 * Specifies periodic points in time, linked to the calendar (phase-linked), or a real world repeating event, such as  breakfast  (event-linked). Based on the HL7v3 data types `PIVL<T>` and `EIVL<T>`.
 */
public interface DvPeriodicTimeSpecification extends DvTimeSpecification {
  /**
   * The period of the repetition, computationally derived from the syntax representation. Extracted from the  value' attribute.
   */
  DvDuration period();

  /**
   * Calendar alignment extracted from value.
   */
  String calendarAlignment();

  /**
   * Event alignment extracted from value.
   */
  String eventAlignment();

  /**
   * Extracted from value.
   */
  Boolean institutionSpecified();
}
