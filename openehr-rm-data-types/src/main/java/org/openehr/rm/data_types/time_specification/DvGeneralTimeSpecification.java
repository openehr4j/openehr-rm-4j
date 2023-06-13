package org.openehr.rm.data_types.time_specification;

/**
 * Specifies points in time in a general syntax. Based on the HL7v3 GTS data type.
 */
public interface DvGeneralTimeSpecification extends DvTimeSpecification {
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
