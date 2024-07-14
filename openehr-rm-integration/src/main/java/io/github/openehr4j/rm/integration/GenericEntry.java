package io.github.openehr4j.rm.integration;

import io.github.openehr4j.rm.data_structures.item_structure.ItemTree;
import io.github.openehr4j.rm.ehr.content.ContentItem;

public interface GenericEntry extends ContentItem {

  ItemTree getData();
}
