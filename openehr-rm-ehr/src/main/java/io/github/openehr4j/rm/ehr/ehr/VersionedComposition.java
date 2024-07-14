package io.github.openehr4j.rm.ehr.ehr;

import java.lang.Boolean;
import io.github.openehr4j.rm.common.change_control.VersionedObject;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr.html#_versioned_composition_class">specifications.openehr.org</a>
 */
public interface VersionedComposition extends VersionedObject {

  Boolean isPersistent();
}
