package io.github.openehr4j.rm.data_types.text;

import java.util.List;

import io.github.openehr4j.rm.data_types.basic.DataValue;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_paragraph_class">specifications.openehr.org</a>
 */
public interface DvParagraph extends DataValue {

  List getItems();
}
