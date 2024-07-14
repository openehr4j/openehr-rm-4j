package io.github.openehr4j.rm.common.archetyped;

import io.github.openehr4j.rm.data_types.text.DvText;
import io.github.openehr4j.rm.data_types.uri.DvEhrUri;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/common.html#_link_class">specifications.openehr.org</a>
 */
public interface Link {

  DvText getMeaning();

  DvText getType();

  DvEhrUri getTarget();
}
