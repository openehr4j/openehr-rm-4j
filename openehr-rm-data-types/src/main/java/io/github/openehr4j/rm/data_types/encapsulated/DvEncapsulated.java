package io.github.openehr4j.rm.data_types.encapsulated;

import io.github.openehr4j.rm.data_types.basic.DataValue;
import io.github.openehr4j.rm.data_types.text.CodePhrase;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_encapsulated_class">specifications.openehr.org</a>
 */
public interface DvEncapsulated extends DataValue {

  CodePhrase getCharset();

  CodePhrase getLanguage();
}
