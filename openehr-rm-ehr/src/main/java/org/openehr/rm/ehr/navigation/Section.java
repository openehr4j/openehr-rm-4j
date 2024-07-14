package org.openehr.rm.ehr.navigation;

import java.util.List;

import org.openehr.rm.ehr.content.ContentItem;

public interface Section extends ContentItem {

  List getItems();
}
