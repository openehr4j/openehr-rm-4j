package io.github.openehr4j.rm.data_types.quantity;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_quantified_class">specifications.openehr.org</a>
 */
public interface DvQuantified extends DvOrdered {

  String getMagnitudeStatus();

  Object getAccuracy();

  Boolean validMagnitudeStatus();

  Object magnitude();

  Boolean accuracyUnknown();

  Boolean isEqual(Object other);

  Boolean lessThan(Object other);
}
