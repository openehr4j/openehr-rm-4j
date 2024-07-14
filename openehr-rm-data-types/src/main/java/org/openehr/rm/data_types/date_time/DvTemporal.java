package org.openehr.rm.data_types.date_time;

import org.openehr.rm.data_types.quantity.DvAbsoluteQuantity;

public interface DvTemporal extends DvAbsoluteQuantity {

  DvDuration getAccuracy();

  DvTemporal add(DvTemporal aDiff);

  DvTemporal subtract(DvTemporal aDiff);

  DvDuration diff(DvTemporal other);
}
