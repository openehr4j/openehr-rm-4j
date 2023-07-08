package org.openehr.rm.ehr.entry;

import java.util.List;

import org.openehr.base.base_types.identification.ObjectRef;
import org.openehr.rm.common.generic.PartyProxy;
import org.openehr.rm.data_types.text.CodePhrase;
import org.openehr.rm.ehr.content.ContentItem;

/**
 * The abstract parent of all `ENTRY` subtypes. An `ENTRY` is the root of a logical item of  hard  clinical information created in the  clinical statement  context, within a clinical session. There can be numerous such contexts in a clinical session. Observations and other Entry types only ever document information captured/created in the event documented by the enclosing Composition.
 */
public interface Entry extends ContentItem {
  /**
   * Mandatory indicator of the localised language in which this Entry is written. Coded from openEHR Code Set  languages .
   */
  CodePhrase getLanguage();

  /**
   * Name of character set in which text values in this Entry are encoded. Coded from openEHR Code Set  character sets.
   */
  CodePhrase getEncoding();

  /**
   * Other participations at `ENTRY` level.
   */
  List getOtherParticipations();

  /**
   * Identifier of externally held workflow engine data for this workflow execution, for this subject of care.
   */
  ObjectRef getWorkflowId();

  /**
   * Id of human subject of this `ENTRY`, e.g.:
   */
  PartyProxy getSubject();

  /**
   * Optional identification of provider of the information in this `ENTRY`, which might be:
   */
  PartyProxy getProvider();

  /**
   * Returns True if this Entry is about the subject of the EHR, in which case the subject attribute is of type PARTY_SELF.
   */
  Boolean subjectIsSelf();
}
