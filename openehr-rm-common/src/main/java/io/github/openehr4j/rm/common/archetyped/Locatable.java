package io.github.openehr4j.rm.common.archetyped;

import java.util.List;

import org.openehr.base.base_types.identification.UidBasedId;
import io.github.openehr4j.rm.data_types.text.DvText;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/common.html#_locatable_class">specifications.openehr.org</a>
 */
public interface Locatable extends Pathable {

  DvText getName();

  String getArchetypeNodeId();

  UidBasedId getUid();

  List getLinks();

  Archetyped getArchetypeDetails();

  FeederAudit getFeederAudit();

  DvText concept();

  Boolean isArchetypeRoot();
}
