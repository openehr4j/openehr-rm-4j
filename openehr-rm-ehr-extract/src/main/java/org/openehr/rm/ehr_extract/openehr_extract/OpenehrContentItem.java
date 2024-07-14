package org.openehr.rm.ehr_extract.openehr_extract;

import org.openehr.rm.ehr_extract.common.ExtractContentItem;




public interface OpenehrContentItem extends ExtractContentItem {



  XVersionedObject getItem();
}
