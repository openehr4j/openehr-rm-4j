package io.github.openehr4j.rm.common.change_control;

import org.openehr.base.base_types.identification.ObjectVersionId;
import io.github.openehr4j.rm.data_types.text.DvCodedText;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/common.html#_imported_version_class">specifications.openehr.org</a>
 */
public interface ImportedVersion<T> extends Version<T> {

  OriginalVersion<T> getItem();

  ObjectVersionId uid();

  ObjectVersionId precedingVersionUid();

  DvCodedText lifecycleState();

  T data();
}
