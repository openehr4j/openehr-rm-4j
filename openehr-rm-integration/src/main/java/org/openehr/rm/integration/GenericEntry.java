package org.openehr.rm.integration;

import org.openehr.rm.data_structures.item_structure.ItemTree;
import org.openehr.rm.ehr.content.ContentItem;




public interface GenericEntry extends ContentItem {



  ItemTree getData();
}
