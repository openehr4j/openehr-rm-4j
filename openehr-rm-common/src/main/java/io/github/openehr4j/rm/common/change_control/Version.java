package io.github.openehr4j.rm.common.change_control;

import org.openehr.base.base_types.identification.HierObjectId;
import org.openehr.base.base_types.identification.ObjectRef;
import org.openehr.base.base_types.identification.ObjectVersionId;
import io.github.openehr4j.rm.common.generic.AuditDetails;
import io.github.openehr4j.rm.data_types.text.DvCodedText;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/common.html#_version_class">specifications.openehr.org</a>
 */
public interface Version<T> {

  ObjectRef getContribution();

  String getSignature();

  AuditDetails getCommitAudit();

  ObjectVersionId uid();

  ObjectVersionId precedingVersionUid();

  T data();

  DvCodedText lifecycleState();

  String canonicalForm();

  HierObjectId ownerId();

  Boolean isBranch();
}
