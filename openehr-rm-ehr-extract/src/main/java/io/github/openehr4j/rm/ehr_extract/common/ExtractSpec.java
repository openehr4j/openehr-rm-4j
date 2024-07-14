package io.github.openehr4j.rm.ehr_extract.common;

import java.util.List;

import io.github.openehr4j.rm.data_structures.item_structure.ItemStructure;
import io.github.openehr4j.rm.data_types.text.DvCodedText;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr_extract.html#_extract_spec_class">specifications.openehr.org</a>
 */
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
