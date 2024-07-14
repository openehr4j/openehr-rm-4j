package io.github.openehr4j.rm.common.resource;

import java.lang.String;
import java.util.List;
import java.util.Map;

public interface ResourceDescription {

  Map getOriginalAuthor();

  List getOtherContributors();

  String getLifecycleState();

  String getResourcePackageUri();

  Map getOtherDetails();

  Map getDetails();
}
