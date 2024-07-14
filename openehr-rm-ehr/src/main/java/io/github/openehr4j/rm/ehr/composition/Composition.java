package io.github.openehr4j.rm.ehr.composition;

import java.util.List;

import io.github.openehr4j.rm.common.archetyped.Locatable;
import io.github.openehr4j.rm.common.generic.PartyProxy;
import io.github.openehr4j.rm.data_types.text.CodePhrase;
import io.github.openehr4j.rm.data_types.text.DvCodedText;

public interface Composition extends Locatable {

  CodePhrase getLanguage();

  CodePhrase getTerritory();

  DvCodedText getCategory();

  EventContext getContext();

  PartyProxy getComposer();

  List getContent();

  Boolean isPersistent();
}
