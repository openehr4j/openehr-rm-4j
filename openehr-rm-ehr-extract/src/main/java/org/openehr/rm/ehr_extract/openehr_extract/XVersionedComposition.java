package org.openehr.rm.ehr_extract.openehr_extract;

import org.openehr.base_foundation_types.primitive_types.Boolean;
import org.openehr.rm_common.archetyped.Locatable;
import org.openehr.rm_common.generic.PartyProxy;
import org.openehr.rm_data_types.text.CodePhrase;
import org.openehr.rm_data_types.text.DvCodedText;
import org.openehr.rm_ehr.composition.EventContext;

/**
 * Content of one version in a `VERSIONED_COMPOSITION`. A Composition is considered the unit of modification of the record, the unit of transmission in record Extracts, and the unit of attestation by authorising clinicians. In this latter sense, it may be considered equivalent to a signed document.
 */
public interface Composition extends Locatable {
  /**
   * Mandatory indicator of the localised language in which this Composition is written. Coded from openEHR Code Set  `languages`. The language of an Entry if different from the Composition is indicated in `ENTRY._language_`.
   */
  CodePhrase getLanguage();

  /**
   * Name of territory in which this Composition was written. Coded from openEHR  countries  code set, which is an expression of the ISO 3166 standard.
   */
  CodePhrase getTerritory();

  /**
   * Temporal category of this Composition, i.e.
   */
  DvCodedText getCategory();

  /**
   * The clinical session context of this Composition, i.e. the contextual attributes of the clinical session.
   */
  EventContext getContext();

  /**
   * The person primarily responsible for the content of the Composition (but not necessarily its committal into the EHR system). This is the identifier which should appear on the screen. It may or may not be the person who entered the data. When it is the patient, the special self  instance of `PARTY_PROXY` will be used.
   */
  PartyProxy getComposer();

  /**
   * The content of this Composition.
   */
  List<ContentItem> getContent();

  /**
   * True if category is `431&#124;persistent&#124;`, False otherwise. Useful for finding Compositions in an EHR which are guaranteed to be of interest to most users.
   */
  Boolean isPersistent();
}
