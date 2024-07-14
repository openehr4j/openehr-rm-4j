package io.github.openehr4j.rm.ehr_extract.common;

public interface ExtractContentItem extends ExtractItem {

  Boolean getIsPrimary();

  Boolean getIsChanged();

  Boolean getIsMasked();

  Object getItem();
}
