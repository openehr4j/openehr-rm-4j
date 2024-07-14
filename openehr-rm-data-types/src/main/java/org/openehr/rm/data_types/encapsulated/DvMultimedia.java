package org.openehr.rm.data_types.encapsulated;

import java.util.List;

import org.openehr.rm.data_types.text.CodePhrase;
import org.openehr.rm.data_types.uri.DvUri;




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
