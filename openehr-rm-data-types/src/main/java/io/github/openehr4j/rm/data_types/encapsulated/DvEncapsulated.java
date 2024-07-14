package io.github.openehr4j.rm.data_types.encapsulated;

import io.github.openehr4j.rm.data_types.basic.DataValue;
import io.github.openehr4j.rm.data_types.text.CodePhrase;

public interface DvEncapsulated extends DataValue {

  CodePhrase getCharset();

  CodePhrase getLanguage();
}
