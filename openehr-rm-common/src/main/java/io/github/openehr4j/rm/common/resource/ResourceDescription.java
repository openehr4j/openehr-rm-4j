package io.github.openehr4j.rm.common.resource;

import java.lang.String;
import java.util.List;
import java.util.Map;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/common.html#_resource_description_class">specifications.openehr.org</a>
 */
public interface ResourceDescription {

  Map getOriginalAuthor();

  List getOtherContributors();

  String getLifecycleState();

  String getResourcePackageUri();

  Map getOtherDetails();

  Map getDetails();
}
