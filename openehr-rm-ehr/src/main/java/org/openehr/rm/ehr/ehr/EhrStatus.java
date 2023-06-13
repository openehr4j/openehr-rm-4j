package org.openehr.rm.ehr.ehr;

import java.lang.Boolean;
import org.openehr.rm.common.archetyped.Locatable;
import org.openehr.rm.common.generic.PartySelf;
import org.openehr.rm.data_structures.item_structure.ItemStructure;

/**
 * Single object per EHR containing various EHR-wide status flags and settings, including whether this EHR can be queried, modified etc. This object is always modifiable, in order to change the status of the EHR as a whole.
 */
public interface EhrStatus extends Locatable {
  /**
   * The subject of this EHR. The `_external_ref_` attribute can be used to contain a direct reference to the subject in a demographic or identity service. Alternatively, the association between patients and their records may be done elsewhere for security reasons.
   */
  PartySelf getSubject();

  /**
   * True if this EHR should be included in population queries, i.e. if this EHR is considered active in the population.
   */
  Boolean getIsQueryable();

  /**
   * True if the EHR, other than the `EHR_STATUS` object, is allowed to be written to. The `EHR_STATUS` object itself can always be written to.
   */
  Boolean getIsModifiable();

  /**
   * Any other details of the EHR summary object, in the form of an archetyped `ITEM_STRUCTURE`.
   */
  ItemStructure getOtherDetails();
}
