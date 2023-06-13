package org.openehr.rm.common.resource;

import java.util.List;
import java.util.Map;

import org.openehr.rm.data_types.text.CodePhrase;

/**
 * Language-specific detail of resource description. When a resource is translated for use in another language environment, each `RESOURCE_DESCRIPTION_ITEM` needs to be copied and translated into the new language.
 */
public interface ResourceDescriptionItem {
  /**
   * The localised language in which the items in this description item are written. Coded from openEHR code set `languages`.
   */
  CodePhrase getLanguage();

  /**
   * Purpose of the resource.
   */
  String getPurpose();

  /**
   * Keywords which characterise this resource, used e.g. for indexing and searching.
   */
  List getKeywords();

  /**
   * Description of the uses of the resource, i.e. contexts in which it could be used.
   */
  String getUse();

  /**
   * Description of any misuses of the resource, i.e. contexts in which it should not be used.
   */
  String getMisuse();

  /**
   * Optional copyright statement for the resource as a knowledge resource.
   */
  String getCopyright();

  /**
   * URIs of original clinical document(s) or description of which resource is a formalisation, in the language of this description item; keyed by meaning.
   */
  Map getOriginalResourceUri();

  /**
   * Additional language-senstive resource metadata, as a list of name/value pairs.
   */
  Map getOtherDetails();
}
