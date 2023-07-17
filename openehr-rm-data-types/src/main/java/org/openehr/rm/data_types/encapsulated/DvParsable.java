package org.openehr.rm.data_types.encapsulated;

/**
 * Encapsulated data expressed as a parsable String. The internal model of the data item is not described in the openEHR model in common with other encapsulated types, but in this case, the form of the data is assumed to be plaintext, rather than compressed or other types of large binary data.
 */
public interface DvParsable extends DvEncapsulated {
  /**
   * The string, which may validly be empty in some syntaxes.
   */
  String getValue();

  /**
   * Name of the formalism, e.g.  GLIF 1.0 ,  Proforma  etc.
   */
  String getFormalism();

  /**
   * Size in bytes of value.
   */
  Integer size();
}
