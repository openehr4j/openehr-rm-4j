package io.github.openehr4j.rm.common.archetyped;

import java.util.List;

import io.github.openehr4j.rm.data_types.encapsulated.DvEncapsulated;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/common.html#_feeder_audit_class">specifications.openehr.org</a>
 */
public interface FeederAudit {

  List getOriginatingSystemItemIds();

  List getFeederSystemItemIds();

  DvEncapsulated getOriginalContent();

  FeederAuditDetails getOriginatingSystemAudit();

  FeederAuditDetails getFeederSystemAudit();
}
