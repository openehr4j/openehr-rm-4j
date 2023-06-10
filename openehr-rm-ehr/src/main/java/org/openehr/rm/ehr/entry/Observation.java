package org.openehr.rm.ehr.entry;

import org.openehr.rm_ehr.entry.CareEntry;

/**
 * Entry subtype for all clinical data in the past or present, i.e. which (by the time it is recorded) has already occurred. `OBSERVATION` data is expressed using the class `HISTORY<T>`, which guarantees that it is situated in time. `OBSERVATION` is used for all notionally objective (i.e. measured in some way) observations of phenomena, and patient-reported phenomena, e.g. pain.
 */
public interface Observation extends CareEntry {
  /**
   * The data of this observation, in the form of a history of values which may be of any complexity.
   */
  History<ItemStructure> getData();

  /**
   * Optional recording of the state of subject of this observation during the observation process, in the form of a separate history of values which may be of any complexity. State may also be recorded within the History of the data attribute.
   */
  History<ItemStructure> getState();
}
