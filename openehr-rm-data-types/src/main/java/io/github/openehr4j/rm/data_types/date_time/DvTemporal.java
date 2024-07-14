package io.github.openehr4j.rm.data_types.date_time;

import io.github.openehr4j.rm.data_types.quantity.DvAbsoluteQuantity;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_temporal_class">specifications.openehr.org</a>
 */
public interface DvTemporal extends DvAbsoluteQuantity {

  DvDuration getAccuracy();

  DvTemporal add(DvTemporal aDiff);

  DvTemporal subtract(DvTemporal aDiff);

  DvDuration diff(DvTemporal other);
}
