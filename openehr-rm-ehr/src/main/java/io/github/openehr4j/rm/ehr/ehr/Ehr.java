package io.github.openehr4j.rm.ehr.ehr;

import java.util.List;
import org.openehr.base.base_types.identification.HierObjectId;
import org.openehr.base.base_types.identification.ObjectRef;
import io.github.openehr4j.rm.data_types.date_time.DvDateTime;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr.html#_ehr_class">specifications.openehr.org</a>
 */
public interface Ehr {

  HierObjectId getSystemId();

  HierObjectId getEhrId();

  List getContributions();

  ObjectRef getEhrStatus();

  ObjectRef getEhrAccess();

  List getCompositions();

  ObjectRef getDirectory();

  DvDateTime getTimeCreated();

  List getFolders();
}
