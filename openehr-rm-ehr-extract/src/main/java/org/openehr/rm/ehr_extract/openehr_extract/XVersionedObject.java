package org.openehr.rm.ehr_extract.openehr_extract;

import java.util.List;
import org.openehr.base_base_types.identification.HierObjectId;
import org.openehr.base_base_types.identification.ObjectRef;
import org.openehr.base_foundation_types.primitive_types.Integer;
import org.openehr.rm.common.generic.RevisionHistory;
import org.openehr.rm.data_types.date_time.DvDateTime;

/**
 * Variety of Extract content that consists is a sharable data-oriented version of `VERSIONED_OBJECT<T>`.
 */
public interface XVersionedObject {
  /**
   * Uid of original `VERSIONED_OBJECT`.
   */
  HierObjectId getUid();

  /**
   * Owner_id from original `VERSIONED_OBJECT`, which identifies source EHR.
   */
  ObjectRef getOwnerId();

  /**
   * Creation time of original `VERSIONED_OBJECT`.
   */
  DvDateTime getTimeCreated();

  /**
   * Total number of versions in original `VERSIONED_OBJECT` at time of creation of this `X_VERSIONED_OBJECT`.
   */
  Integer getTotalVersionCount();

  /**
   * The number of Versions in this extract for this Versioned object, i.e. the count of items in the versions attribute. May be 0 if only revision history is requested.
   */
  Integer getExtractVersionCount();

  /**
   * Optional revision history of the original `VERSIONED_OBJECT`. If included, it is the complete revision history.
   */
  RevisionHistory getRevisionHistory();

  /**
   * 0 or more Versions from the original `VERSIONED_OBJECT`, according to the Extract specification.
   */
  List getVersions();
}
