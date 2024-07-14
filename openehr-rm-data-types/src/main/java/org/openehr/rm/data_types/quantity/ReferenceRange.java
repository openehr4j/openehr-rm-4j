package org.openehr.rm.data_types.quantity;

import org.openehr.rm.data_types.text.DvText;

public interface ReferenceRange {

  DvText getMeaning();

  DvInterval getRange();

  Boolean isInRange(Object v);
}
