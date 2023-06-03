package org.openehr.rm.data_types.quantity;

/**
 * Quantitified type representing  scientific  quantities, i.e. quantities expressed as a magnitude and units. Units are expressed in the UCUM syntax (http://unitsofmeasure.org/ucum.html[Unified Code for Units of Measure (UCUM)], by Gunther Schadow and Clement J. McDonald of The Regenstrief Institute)  (case-sensitive form) by default, or another system if `_units_system_` is set.
 */
public interface DvQuantity extends DvAmount {
  /**
   * Numeric magnitude of the quantity.
   */
  Real getMagnitude();

  /**
   * Precision to which the value of the quantity is expressed, in terms of number of decimal places. The value 0 implies an integral quantity.
   */
  Integer getPrecision();

  /**
   * Quantity units, expressed as a code or syntax string from either UCUM (the default) or the units system specified in `_units_system_`, when set.
   */
  String getUnits();

  /**
   * Optional field used to specify a units system from which codes in `_units_` are defined. Value is a URI identifying a terminology containing units concepts from the  (https://www.hl7.org/fhir/terminologies-systems.html[HL7 FHIR terminologies list]).
   */
  String getUnitsSystem();

  /**
   * Optional field containing the displayable form of the `_units_` field, e.g. `'°C'`.
   */
  String getUnitsDisplayName();

  /**
   * Optional normal range.
   */
  DvINTERVAL<DVQUANTITY> getNormalRange();

  /**
   * Optional tagged other reference ranges for this value in its particular measurement context.
   */
  List<REFERENCERANGE<DVQuantity getOtherReferenceRanges();

  /**
   * Sum of this `DV_QUANTITY` and `_other_`.
   */
  void add();

  /**
   * Difference of this `DV_QUANTITY` and `_other_`.
   */
  void subtract();

  /**
   * Product of this `DV_QUANTITY` and `_factor_`.
   */
  void multiply();

  /**
   * True if this Quantity object is less than `_other_`, based on comparison of `_magnitude_`. Only valid if `_is_strictly_comparable_to()_` is True.
   */
  void less_than();

  /**
   * True if `_precision_` = 0, meaning that the `_magnitude_` is a whole number.
   */
  void is_integral();

  /**
   * True if this quantity and `_other_` have the same `_units_` and also `_units_system_` if it exists.
   */
  void is_strictly_comparable_to();
}
