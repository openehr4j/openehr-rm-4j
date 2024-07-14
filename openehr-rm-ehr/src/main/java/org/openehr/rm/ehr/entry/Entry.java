package org.openehr.rm.ehr.entry;

import java.util.List;

import org.openehr.base.base_types.identification.ObjectRef;
import org.openehr.rm.common.generic.PartyProxy;
import org.openehr.rm.data_types.text.CodePhrase;
import org.openehr.rm.ehr.content.ContentItem;

public interface Entry extends ContentItem {

  CodePhrase getLanguage();

  CodePhrase getEncoding();

  List getOtherParticipations();

  ObjectRef getWorkflowId();

  PartyProxy getSubject();

  PartyProxy getProvider();

  Boolean subjectIsSelf();
}
