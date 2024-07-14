package io.github.openehr4j.rm.ehr_extract.common;

import java.util.List;
import io.github.openehr4j.rm.common.archetyped.Locatable;

public interface ExtractChapter extends Locatable {

  List getItems();
}
