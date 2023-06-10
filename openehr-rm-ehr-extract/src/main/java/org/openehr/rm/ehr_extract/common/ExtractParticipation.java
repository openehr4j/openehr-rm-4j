package org.openehr.rm.ehr_extract.common;

import org.openehr.rm_common.generic.PartyProxy;
import org.openehr.rm_data_types.text.DvCodedText;
import org.openehr.rm_data_types.text.DvText;

/**
 * Model of a participation of a Party (any Actor or Role) in an activity.  Used to represent any participation of a Party in some activity, which is not  explicitly in the model, e.g. assisting nurse. Can be used to record past or  future participations.
 */
public interface Participation {
  /**
   * The function of the Party in this participation (note that a given party might participate in more than one way in a particular activity). This attribute should be coded, but cannot be limited to the HL7v3:ParticipationFunction vocabulary, since it is too limited and hospital-oriented.
   */
  DvText getFunction();

  /**
   * Optional field for recording the 'mode' of the performer / activity interaction, e.g. present, by telephone, by email etc.
   */
  DvCodedText getMode();

  /**
   * The id and possibly demographic system link of the party participating in the activity.
   */
  PartyProxy getPerformer();

  /**
   * The time interval during which the participation took place, if it is used in an observational context (i.e. recording facts about the past); or the intended time interval of the participation when used in future contexts, such as EHR Instructions.
   */
  DvInterval<DvDateTime> getTime();
}
