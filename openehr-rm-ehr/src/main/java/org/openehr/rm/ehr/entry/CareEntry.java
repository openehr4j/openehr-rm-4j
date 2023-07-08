package org.openehr.rm.ehr.entry;

import org.openehr.base.base_types.identification.ObjectRef;
import org.openehr.rm.data_structures.item_structure.ItemStructure;

/**
 * The abstract parent of all clinical `ENTRY` subtypes. A `CARE_ENTRY` defines protocol and guideline attributes for all clinical Entry subtypes.
 */
public interface CareEntry extends Entry {
  /**
   * Description of the method (i.e. how) the information in this entry was arrived at. For `OBSERVATIONs`, this is a description of the method or instrument used. For `EVALUATIONs`, how the evaluation was arrived at. For `INSTRUCTIONs`, how to execute the Instruction. This may take the form of references to guidelines, including manually followed and executable; knowledge references such as a paper in Medline; clinical reasons within a larger care process.
   */
  ItemStructure getProtocol();

  /**
   * Optional external identifier of guideline creating this Entry if relevant.
   */
  ObjectRef getGuidelineId();
}
