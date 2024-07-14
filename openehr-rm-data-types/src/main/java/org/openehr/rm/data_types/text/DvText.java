package org.openehr.rm.data_types.text;

import java.util.List;

import org.openehr.rm.data_types.basic.DataValue;
import org.openehr.rm.data_types.uri.DvUri;

public interface DvText extends DataValue {

  String getValue();

  DvUri getHyperlink();

  String getFormatting();

  List<TermMapping> getMappings();

  CodePhrase getLanguage();

  CodePhrase getEncoding();
}
