package org.openehr.rm.common.resource;

import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * Defines the descriptive meta-data of a resource.
 */
public interface ResourceDescription {
  /**
   * Original author of this resource, with all relevant details, including organisation.
   */
  Map getOriginalAuthor();

  /**
   * Other contributors to the resource, probably listed in  `'name <email>'`  form.
   */
  List getOtherContributors();

  /**
   * Lifecycle state of the resource, typically including states such as: `initial &#124; submitted &#124; experimental &#124; awaiting_approval &#124; approved &#124; superseded &#124; obsolete`.
   */
  String getLifecycleState();

  /**
   * URI of package to which this resource belongs.
   */
  String getResourcePackageUri();

  /**
   * Additional non language-senstive resource meta-data, as a list of name/value pairs.
   */
  Map getOtherDetails();

  /**
   * Details of all parts of resource description that are natural language-dependent, keyed by language code.
   */
  Map getDetails();
}
