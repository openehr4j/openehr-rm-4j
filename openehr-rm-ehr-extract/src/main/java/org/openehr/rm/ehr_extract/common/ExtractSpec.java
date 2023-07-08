package org.openehr.rm.ehr_extract.common;

import java.util.List;

import org.openehr.base.foundation_types.primitive_types.Integer;
import org.openehr.rm.data_structures.item_structure.ItemStructure;
import org.openehr.rm.data_types.text.DvCodedText;

/**
 * Specification of an Extract's contents. Subtypes can be used to add details specific to the type of Extract. The specification consists of attributes specifying the directory, and two further groups of attributes in their own classes, namely a version specfication (which versions of information items are to be included) and a manifest (which entities are to be included in the extract).
 */
public interface ExtractSpec {
  /**
   * Specification of which versions of information items to include in the Extract. If Void, the default is latest versions only (which is reasonable for non-versioning systems as well).
   */
  ExtractVersionSpec getVersionSpec();

  /**
   * Specification of entities (e.g. records) to include in the Extract.
   */
  ExtractManifest getManifest();

  /**
   * Coded term indicating the type of content required, e.g.
   */
  DvCodedText getExtractType();

  /**
   * Indicates whether in-line instances of `DV_MULTIMEDIA` in the source data are included or not.
   */
  Boolean getIncludeMultimedia();

  /**
   * Requested priority of this request to be handled by server. Priority schemes are likely to be local, and use values agreed by both ends.
   */
  Integer getPriority();

  /**
   * Degree of links to follow emanating from content items specified for inclusion. The kind of links to follow is dependent on the type of Extract.
   */
  Integer getLinkDepth();

  /**
   * Queries specifying the contents of this Extract.
   */
  List getCriteria();

  /**
   * Other specification items. Archetypable.
   */
  ItemStructure getOtherDetails();
}
