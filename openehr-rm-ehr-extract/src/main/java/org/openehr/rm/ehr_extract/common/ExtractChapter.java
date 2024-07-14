package org.openehr.rm.ehr_extract.common;

import java.util.List;
import org.openehr.rm.common.archetyped.Locatable;

public interface ExtractChapter extends Locatable {

  List getItems();
}
