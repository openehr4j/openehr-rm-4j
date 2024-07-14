package org.openehr.rm.ehr.ehr;

import java.lang.Object;
import java.lang.String;
import org.openehr.rm.common.archetyped.Locatable;

public interface EhrAccess extends Locatable {

  Object getSettings();

  String scheme();
}
