package org.openehr.rm.ehr.ehr;

import java.lang.Object;
import java.lang.String;
import org.openehr.rm.common.archetyped.Locatable;

/**
 * EHR-wide access control object. All access decisions to data in the EHR must be made in accordance with the policies and rules in this object.
 */
public interface EhrAccess extends Locatable {
  /**
   * Access control settings for the EHR. Instance is a subtype of the type `ACCESS_CONTROL_SETTINGS`, allowing for the use of different access control schemes.
   */
  Object getSettings();

  /**
   * The name of the access control scheme in use; corresponds to the concrete instance of the settings attribute.
   */
  String scheme();
}
