package io.github.openehr4j.rm.ehr.ehr;

import java.lang.Boolean;
import io.github.openehr4j.rm.common.change_control.VersionedObject;

public interface VersionedComposition extends VersionedObject {

  Boolean isPersistent();
}
