package org.openehr.rm.data_types.encapsulated;

import org.openehr.rm.data_types.basic.DataValue;
import org.openehr.rm.data_types.text.CodePhrase;

/**
 * Abstract class defining the common meta-data of all types of encapsulated data.
 */
public interface DvEncapsulated extends DataValue {
  /**
   * Name of character encoding scheme in which this value is encoded. Coded from openEHR Code Set  character sets . Unicode is the default assumption in openEHR, with UTF-8 being the assumed encoding. This attribute allows for variations from these assumptions.
   */
  CodePhrase getCharset();

  /**
   * Optional indicator of the localised language in which the data is written, if relevant. Coded from openEHR Code Set `languages`.
   */
  CodePhrase getLanguage();
}
