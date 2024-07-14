package io.github.openehr4j.rm.data_types.text;

import java.util.List;

import io.github.openehr4j.rm.data_types.basic.DataValue;
import io.github.openehr4j.rm.data_types.uri.DvUri;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_text_class">specifications.openehr.org</a>
 */
public interface DvText extends DataValue {

  String getValue();

  DvUri getHyperlink();

  String getFormatting();

  List<TermMapping> getMappings();

  CodePhrase getLanguage();

  CodePhrase getEncoding();
}
