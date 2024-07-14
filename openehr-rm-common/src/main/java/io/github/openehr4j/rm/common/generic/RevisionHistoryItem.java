package io.github.openehr4j.rm.common.generic;

import java.util.List;
import org.openehr.base.base_types.identification.ObjectVersionId;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/common.html#_revision_history_item_class">specifications.openehr.org</a>
 */
public interface RevisionHistoryItem {

  ObjectVersionId getVersionId();

  List<AuditDetails> getAudits();
}
