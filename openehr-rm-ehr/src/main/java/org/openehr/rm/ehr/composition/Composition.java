package org.openehr.rm.ehr.composition;

import java.util.List;

import org.openehr.rm.common.archetyped.Locatable;
import org.openehr.rm.common.generic.PartyProxy;
import org.openehr.rm.data_types.text.CodePhrase;
import org.openehr.rm.data_types.text.DvCodedText;

public interface Composition extends Locatable {

  CodePhrase getLanguage();

  CodePhrase getTerritory();

  DvCodedText getCategory();

  EventContext getContext();

  PartyProxy getComposer();

  List getContent();

  Boolean isPersistent();
}
