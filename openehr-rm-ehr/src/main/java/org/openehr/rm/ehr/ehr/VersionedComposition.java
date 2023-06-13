package org.openehr.rm.ehr.ehr;

import java.lang.Boolean;
import org.openehr.rm.common.change_control.VersionedObject;

/**
 * Version-controlled composition abstraction, defined by inheriting `VERSIONED_OBJECT<COMPOSITION>`.
 */
public interface VersionedComposition extends VersionedObject {
  /**
   * Indicates whether this composition set is persistent; derived from first version.
   */
  Boolean isPersistent();
}
