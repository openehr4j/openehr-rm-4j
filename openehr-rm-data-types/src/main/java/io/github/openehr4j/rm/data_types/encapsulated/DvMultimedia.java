package io.github.openehr4j.rm.data_types.encapsulated;

import java.util.List;

import io.github.openehr4j.rm.data_types.text.CodePhrase;
import io.github.openehr4j.rm.data_types.uri.DvUri;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_multimedia_class">specifications.openehr.org</a>
 */
public interface DvMultimedia extends DvEncapsulated {

  String getAlternateText();

  DvUri getUri();

  List<Byte> getData();

  CodePhrase getMediaType();

  CodePhrase getCompressionAlgorithm();

  List<Byte> getIntegrityCheck();

  CodePhrase getIntegrityCheckAlgorithm();

  DvMultimedia getThumbnail();

  Integer getSize();

  Boolean isExternal();

  Boolean isInline();

  Boolean isCompressed();

  Boolean hasIntegrityCheck();
}
