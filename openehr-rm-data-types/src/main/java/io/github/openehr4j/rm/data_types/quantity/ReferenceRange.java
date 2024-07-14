package io.github.openehr4j.rm.data_types.quantity;

import io.github.openehr4j.rm.data_types.text.DvText;

public interface ReferenceRange {

  DvText getMeaning();

  DvInterval getRange();

  Boolean isInRange(Object v);
}
