package io.github.openehr4j.rm.data_types.quantity;

import io.github.openehr4j.rm.data_types.text.DvText;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_reference_range_class">specifications.openehr.org</a>
 */
public interface ReferenceRange {

  DvText getMeaning();

  DvInterval getRange();

  Boolean isInRange(Object v);
}
