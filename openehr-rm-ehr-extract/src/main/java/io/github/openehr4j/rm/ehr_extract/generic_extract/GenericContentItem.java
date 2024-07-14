package io.github.openehr4j.rm.ehr_extract.generic_extract;

import java.util.Map;

import org.openehr.base.foundation_types.time_types.Iso8601DateTime;
import io.github.openehr4j.rm.common.archetyped.Locatable;
import io.github.openehr4j.rm.data_types.text.DvCodedText;
import io.github.openehr4j.rm.ehr_extract.common.ExtractContentItem;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/ehr_extract.html#_generic_content_item_class">specifications.openehr.org</a>
 */
public interface GenericContentItem extends ExtractContentItem {

  DvCodedText getItemType();

  String getItemTypeVersion();

  String getAuthor();

  Iso8601DateTime getCreationTime();

  String getAuthoriser();

  Iso8601DateTime getAuthorisationTime();

  DvCodedText getItemStatus();

  String getVersionId();

  String getVersionSetId();

  String getSystemId();

  Map getOtherDetails();

  Locatable getItem();
}
