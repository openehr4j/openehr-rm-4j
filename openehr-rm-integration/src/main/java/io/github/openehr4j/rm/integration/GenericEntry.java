package io.github.openehr4j.rm.integration;

import io.github.openehr4j.rm.data_structures.item_structure.ItemTree;
import io.github.openehr4j.rm.ehr.content.ContentItem;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/integration.html#_generic_entry_class">specifications.openehr.org</a>
 */
public interface GenericEntry extends ContentItem {

  ItemTree getData();
}
