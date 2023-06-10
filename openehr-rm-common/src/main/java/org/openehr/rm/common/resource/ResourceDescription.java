package org.openehr.rm.common.resource;

import org.openehr.base_foundation_types.primitive_types.String;

/**
 * Defines the descriptive meta-data of a resource.
 */
public interface ResourceDescription {
  /**
   * Original author of this resource, with all relevant details, including organisation.
   */
  Hash<String,String> getOriginalAuthor();

  /**
   * Other contributors to the resource, probably listed in  `'name <email>'`  form.
   */
  List<String> getOtherContributors();

  /**
   * Lifecycle state of the resource, typically including states such as: `initial &#124; submitted &#124; experimental &#124; awaiting_approval &#124; approved &#124; superseded &#124; obsolete`.
   */
  String getLifecycleState();

  /**
   * URI of package to which this resource belongs.
   */
  String getResourcePackageUri();

  /**
   * Additional non language-sensitive resource meta-data, as a list of name/value pairs.
   */
  Hash<String,String> getOtherDetails();

  /**
   * Details of all parts of resource description that are natural language-dependent, keyed by language code.
   */
  Hash<String,ResourceDescriptionItem> getDetails();
}
