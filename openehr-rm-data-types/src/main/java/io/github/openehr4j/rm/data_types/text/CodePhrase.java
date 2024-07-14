package io.github.openehr4j.rm.data_types.text;

import java.lang.String;
import org.openehr.base.base_types.identification.TerminologyId;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_code_phrase_class">specifications.openehr.org</a>
 */
public interface CodePhrase {

  TerminologyId getTerminologyId();

  String getCodeString();

  String getPreferredTerm();
}
