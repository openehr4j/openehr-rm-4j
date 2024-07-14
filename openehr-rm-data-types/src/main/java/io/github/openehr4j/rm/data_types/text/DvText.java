package io.github.openehr4j.rm.data_types.text;

import java.util.List;

import io.github.openehr4j.rm.data_types.basic.DataValue;
import io.github.openehr4j.rm.data_types.uri.DvUri;

public interface DvText extends DataValue {

  String getValue();

  DvUri getHyperlink();

  String getFormatting();

  List<TermMapping> getMappings();

  CodePhrase getLanguage();

  CodePhrase getEncoding();
}
