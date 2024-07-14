package io.github.openehr4j.rm.ehr.ehr;

import java.lang.Object;
import java.lang.String;
import io.github.openehr4j.rm.common.archetyped.Locatable;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr.html#_ehr_access_class">specifications.openehr.org</a>
 */
public interface EhrAccess extends Locatable {

  Object getSettings();

  String scheme();
}
