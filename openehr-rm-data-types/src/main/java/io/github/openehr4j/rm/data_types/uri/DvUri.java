package io.github.openehr4j.rm.data_types.uri;

import io.github.openehr4j.rm.data_types.basic.DataValue;

/**
 * @see <a href="https://specifications.openehr.org/releases/RM/Release-1.1.0/data_types.html#_dv_uri_class">specifications.openehr.org</a>
 */
public interface DvUri extends DataValue {

  String getValue();

  String scheme();

  String path();

  String fragmentId();

  String query();
}
