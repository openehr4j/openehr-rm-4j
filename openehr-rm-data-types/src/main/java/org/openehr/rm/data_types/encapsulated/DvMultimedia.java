package org.openehr.rm.data_types.encapsulated;

import java.util.List;

import org.openehr.base_foundation_types.primitive_types.Integer;
import org.openehr.rm.data_types.text.CodePhrase;
import org.openehr.rm.data_types.uri.DvUri;

/**
 * A specialisation of `DV_ENCAPSULATED` for audiovisual and bio-signal types. Includes further metadata relating to multimedia types which are not applicable to other subtypes of `DV_ENCAPSULATED`.
 */
public interface DvMultimedia extends DvEncapsulated {
  /**
   * Text to display in lieu of multimedia display/replay.
   */
  String getAlternateText();

  /**
   * URI reference to electronic information stored outside the record as a file, database entry etc, if supplied as a reference.
   */
  DvUri getUri();

  /**
   * The actual data found at `_uri_`, if supplied inline.
   */
  List getData();

  /**
   * Data media type coded from openEHR code set  media types  (interface for the IANA MIME types code set).
   */
  CodePhrase getMediaType();

  /**
   * Compression type, a coded value from the openEHR Integrity check code set. Void means no compression.
   */
  CodePhrase getCompressionAlgorithm();

  /**
   * Binary cryptographic integrity checksum.
   */
  List getIntegrityCheck();

  /**
   * Type of integrity check, a coded value from the openEHR `Integrity check` code set.
   */
  CodePhrase getIntegrityCheckAlgorithm();

  /**
   * The thumbnail for this item, if one exists; mainly for graphics formats.
   */
  DvMultimedia getThumbnail();

  /**
   * Original size in bytes of unencoded encapsulated data. I.e. encodings such as base64, hexadecimal etc do not change the value of this attribute.
   */
  Integer getSize();

  /**
   * Computed from the value of the `_uri_` attribute: True if  the data is stored externally to the record, as indicated by `_uri_`. A copy may also be stored internally, in which case `_is_expanded_` is also true.
   */
  Boolean isExternal();

  /**
   * Computed from the value of the data attribute. True if  the  data is stored  in  expanded  form, ie within the EHR itself.
   */
  Boolean isInline();

  /**
   * Computed from the value of the `_compression_algorithm_` attribute: True if  the  data is stored in compressed form.
   */
  Boolean isCompressed();

  /**
   * Computed from the value of the `_integrity_check_algorithm_` attribute: True if an integrity check has been computed.
   */
  Boolean hasIntegrityCheck();
}
