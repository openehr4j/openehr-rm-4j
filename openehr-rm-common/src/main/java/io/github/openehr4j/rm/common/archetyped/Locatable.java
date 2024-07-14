package io.github.openehr4j.rm.common.archetyped;

import java.util.List;

import org.openehr.base.base_types.identification.UidBasedId;
import io.github.openehr4j.rm.data_types.text.DvText;

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
