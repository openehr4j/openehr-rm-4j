package io.github.openehr4j.rm.ehr.navigation;

import java.util.List;

import io.github.openehr4j.rm.ehr.content.ContentItem;

public interface Section extends ContentItem {

  List getItems();
}
