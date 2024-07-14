package io.github.openehr4j.rm.ehr_extract.openehr_extract;

import java.util.List;
import org.openehr.base.base_types.identification.HierObjectId;
import org.openehr.base.base_types.identification.ObjectRef;
import io.github.openehr4j.rm.common.generic.RevisionHistory;
import io.github.openehr4j.rm.data_types.date_time.DvDateTime;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr_extract.html#_x_versioned_object_class">specifications.openehr.org</a>
 */
public interface XVersionedObject {

  HierObjectId getUid();

  ObjectRef getOwnerId();

  DvDateTime getTimeCreated();

  Integer getTotalVersionCount();

  Integer getExtractVersionCount();

  RevisionHistory getRevisionHistory();

  List getVersions();
}
