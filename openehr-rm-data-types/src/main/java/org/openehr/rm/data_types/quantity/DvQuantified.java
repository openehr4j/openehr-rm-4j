package org.openehr.rm.data_types.quantity;

import org.openehr.base_foundation_types.primitive_types.Boolean;
import org.openehr.base_foundation_types.primitive_types.OrderedNumeric;
import org.openehr.base_foundation_types.primitive_types.String;
import org.openehr.rm_data_types.quantity.DvOrdered;

/**
 * Abstract class defining the concept of true quantified values, i.e. values which are not only ordered, but which have a precise magnitude.
 */
public interface DvQuantified extends DvOrdered {
  /**
   * Optional status of magnitude with values:
   */
  String getMagnitudeStatus();

  /**
   * Accuracy of measurement. Exact form of expression determined in descendants.
   */
  Any getAccuracy();

  /**
   * Test whether a string value is one of the valid values for the magnitude_status attribute.
   */
  Boolean validMagnitudeStatus();

  OrderedNumeric magnitude();

  /**
   * True if accuracy is not known, e.g. due to not being recorded or discernable.
   */
  Boolean accuracyUnknown();

  /**
   * Return True if this `DV_QUANTIFIED` is considered equal to `_other_`.
   */
  Boolean isEqual(Object other);

  /**
   * True if this Quantified object is less than `_other_`, based on comparison of `_magnitude_`.
   */
  Boolean lessThan(Object other);
}
