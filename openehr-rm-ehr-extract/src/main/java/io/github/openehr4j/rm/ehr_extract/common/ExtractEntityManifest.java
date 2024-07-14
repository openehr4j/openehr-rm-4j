package io.github.openehr4j.rm.ehr_extract.common;

import java.lang.String;
import java.util.List;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr_extract.html#_extract_entity_manifest_class">specifications.openehr.org</a>
 */
public interface ExtractEntityManifest {

  String getExtractIdKey();

  String getEhrId();

  String getSubjectId();

  List getOtherIds();

  List getItemList();
}
