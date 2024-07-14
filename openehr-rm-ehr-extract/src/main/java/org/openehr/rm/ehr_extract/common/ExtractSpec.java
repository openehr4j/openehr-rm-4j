package org.openehr.rm.ehr_extract.common;

import java.util.List;

import org.openehr.rm.data_structures.item_structure.ItemStructure;
import org.openehr.rm.data_types.text.DvCodedText;

public interface ExtractSpec {

  ExtractVersionSpec getVersionSpec();

  ExtractManifest getManifest();

  DvCodedText getExtractType();

  Boolean getIncludeMultimedia();

  Integer getPriority();

  Integer getLinkDepth();

  List getCriteria();

  ItemStructure getOtherDetails();
}
