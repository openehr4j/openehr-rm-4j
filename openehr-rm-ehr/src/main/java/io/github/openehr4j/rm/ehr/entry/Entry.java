package io.github.openehr4j.rm.ehr.entry;

import java.util.List;

import org.openehr.base.base_types.identification.ObjectRef;
import io.github.openehr4j.rm.common.generic.PartyProxy;
import io.github.openehr4j.rm.data_types.text.CodePhrase;
import io.github.openehr4j.rm.ehr.content.ContentItem;

public interface Entry extends ContentItem {

  CodePhrase getLanguage();

  CodePhrase getEncoding();

  List getOtherParticipations();

  ObjectRef getWorkflowId();

  PartyProxy getSubject();

  PartyProxy getProvider();

  Boolean subjectIsSelf();
}
