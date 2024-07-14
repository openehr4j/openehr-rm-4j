package io.github.openehr4j.rm.ehr_extract.openehr_extract;

import io.github.openehr4j.rm.ehr_extract.common.ExtractContentItem;

public interface OpenehrContentItem extends ExtractContentItem {

  XVersionedObject getItem();
}
