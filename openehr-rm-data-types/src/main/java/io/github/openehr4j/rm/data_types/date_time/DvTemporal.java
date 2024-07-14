package io.github.openehr4j.rm.data_types.date_time;

import io.github.openehr4j.rm.data_types.quantity.DvAbsoluteQuantity;

public interface DvTemporal extends DvAbsoluteQuantity {

  DvDuration getAccuracy();

  DvTemporal add(DvTemporal aDiff);

  DvTemporal subtract(DvTemporal aDiff);

  DvDuration diff(DvTemporal other);
}
