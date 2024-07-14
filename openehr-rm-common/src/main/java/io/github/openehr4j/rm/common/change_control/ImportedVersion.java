package io.github.openehr4j.rm.common.change_control;

import org.openehr.base.base_types.identification.ObjectVersionId;
import io.github.openehr4j.rm.data_types.text.DvCodedText;

public interface ImportedVersion<T> extends Version<T> {

  OriginalVersion<T> getItem();

  ObjectVersionId uid();

  ObjectVersionId precedingVersionUid();

  DvCodedText lifecycleState();

  T data();
}
