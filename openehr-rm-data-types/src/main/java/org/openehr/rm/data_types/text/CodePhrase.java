package org.openehr.rm.data_types.text;

import java.lang.String;
import org.openehr.base.base_types.identification.TerminologyId;

public interface CodePhrase {

  TerminologyId getTerminologyId();

  String getCodeString();

  String getPreferredTerm();
}
