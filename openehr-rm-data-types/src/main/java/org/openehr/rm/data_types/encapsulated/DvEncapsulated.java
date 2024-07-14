package org.openehr.rm.data_types.encapsulated;

import org.openehr.rm.data_types.basic.DataValue;
import org.openehr.rm.data_types.text.CodePhrase;

public interface DvEncapsulated extends DataValue {

  CodePhrase getCharset();

  CodePhrase getLanguage();
}
