package io.github.openehr4j.rm.common.archetyped;

import io.github.openehr4j.rm.data_types.text.DvText;
import io.github.openehr4j.rm.data_types.uri.DvEhrUri;

public interface Link {

  DvText getMeaning();

  DvText getType();

  DvEhrUri getTarget();
}
