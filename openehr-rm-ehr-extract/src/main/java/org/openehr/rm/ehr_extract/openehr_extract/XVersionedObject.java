package org.openehr.rm.ehr_extract.openehr_extract;

import java.util.List;
import org.openehr.base.base_types.identification.HierObjectId;
import org.openehr.base.base_types.identification.ObjectRef;
import org.openehr.rm.common.generic.RevisionHistory;
import org.openehr.rm.data_types.date_time.DvDateTime;

public interface XVersionedObject {

  HierObjectId getUid();

  ObjectRef getOwnerId();

  DvDateTime getTimeCreated();

  Integer getTotalVersionCount();

  Integer getExtractVersionCount();

  RevisionHistory getRevisionHistory();

  List getVersions();
}
