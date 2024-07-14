package io.github.openehr4j.rm.ehr_extract.common;

import java.lang.String;
import java.util.List;

public interface ExtractEntityManifest {

  String getExtractIdKey();

  String getEhrId();

  String getSubjectId();

  List getOtherIds();

  List getItemList();
}
