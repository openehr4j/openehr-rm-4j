package io.github.openehr4j.rm.ehr.ehr;

import java.lang.Object;
import java.lang.String;
import io.github.openehr4j.rm.common.archetyped.Locatable;

public interface EhrAccess extends Locatable {

  Object getSettings();

  String scheme();
}
